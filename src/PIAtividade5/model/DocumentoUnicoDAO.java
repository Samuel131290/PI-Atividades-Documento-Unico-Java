package PIAtividade5.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe responsável por manipular os dados do Documento Único no banco de dados MySQL.
 */
public class DocumentoUnicoDAO
{
    /**
    * Metódo responsavel por cadastrar os dados do usuário no banco de dados.
    * @param documentoUnico O objeto Documento Único a ser cadastrado.
    * @return true se o Documento Único foi cadastrado com sucesso, false caso contrário.
    * @throws SQLException se ocorrer um erro durante a execução da operação SQL.
    */
    public static boolean cadastrar(DocumentoUnico documentoUnico) throws SQLException 
    {
        try
        {
            // Conexão com o banco.
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();

            // Instrução SQL que será executada.
            String sql = "INSERT INTO documentoUnico(Nome, Rg, Cpf, Titulo, Celular, Sexo, Endereco, Nº, Bairro, Cidade, Estado, Email, ConfirmarEmail, Senha, ConfirmarSenha, Data, DocumentoUnico) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            
            // Usar a string e transformar em SQL usando PreparedStatement.
            PreparedStatement query = conexao.getConexao().prepareStatement(sql);
            query.setString(1, documentoUnico.getNome());
            query.setString(2, documentoUnico.getRg());
            query.setString(3, documentoUnico.getCpf());
            query.setString(4, documentoUnico.getTitulo());
            query.setString(5, documentoUnico.getCelular());
            query.setString(6, documentoUnico.getSexo());
            query.setString(7, documentoUnico.getEndereco());
            query.setString(8, documentoUnico.getN());
            query.setString(9, documentoUnico.getBairro());
            query.setString(10, documentoUnico.getCidade());
            query.setString(11, documentoUnico.getEstado());
            query.setString(12, documentoUnico.getEmail());
            query.setString(13, documentoUnico.getConfirmarEmail());
            query.setString(14, documentoUnico.getSenha()); 
            query.setString(15, documentoUnico.getConfirmarSenha());
            query.setString(16, documentoUnico.getData());
            query.setString(17, documentoUnico.getDocumentoUnico()); 
            
            // Executar a instrução SQL.
            query.execute();

            // Desconectar do banco.
            conexao.desconectar();
            return true;
        } 
        catch (SQLException se) 
        {
            // Trata o erro cadastrar.
            System.out.println("Erro ao cadastrar registro no banco de dados!");
            return false;
        }
    }
    
    /**
    * Metódo responsavel por realizar o login do usuário, validando CPF e Senha no banco de dados.
    * @param docUnico O objeto a ser realizado o login.
    * @return true se o Documento Único o login foi realizado com sucesso, false caso contrário.
    */
    public static DocumentoUnico validarUsuarioSeguro(DocumentoUnico docUnico)
    {
        // Criando consulta parametrizada
        String sql = "SELECT * FROM documentoUnico WHERE cpf = ? AND senha = ?";
        DocumentoUnico usuarioEncontrado = null;
        
        try 
        {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://root@localhost/pi_atividades1","root","131290");
            PreparedStatement statement = conexao.prepareStatement(sql);

            // Atribuindo os valores na consulta
            statement.setString(1, docUnico.getCpf());
            statement.setString(2, docUnico.getSenha());
            ResultSet rs = statement.executeQuery();

            while (rs.next()) 
            {
                usuarioEncontrado = new DocumentoUnico();
                usuarioEncontrado.setId(rs.getInt("id"));
                usuarioEncontrado.setCpf(rs.getString("cpf"));
                usuarioEncontrado.setSenha(rs.getString("senha"));
                usuarioEncontrado.setNome(rs.getString("nome"));
                usuarioEncontrado.setData(rs.getString("data"));
                usuarioEncontrado.setDocumentoUnico(rs.getString("documentoUnico"));
            }  
        } 
        catch (SQLException ex) 
        {
            // Trata o erro cadastrar.
            System.out.println("Sintaxe de comando invalida");
        }
        return usuarioEncontrado;
    }
    
    /**
    * Metódo responsavel verificar se o CPF do usuário já consta no banco de dados.
    * @param cpf O objeto a ser verificado.
    * @return true se o CPF não consta, false caso contrário.
    */
    public static DocumentoUnico loginJaExiste(String cpf) 
    {
        // Criando consulta parametrizada
        String query = "SELECT nome, data, documentoUnico FROM documentoUnico WHERE cpf = ?";
    
        try 
        {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://root@localhost/pi_atividades1", "root", "131290");
            PreparedStatement stmt = conexao.prepareStatement(query);

            // Atribuindo os valores na consulta
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) 
            {
                String nome = rs.getString("nome");
                String data = rs.getString("data");
                String documentoUnico = rs.getString("documentoUnico");
            
                DocumentoUnico usuario = new DocumentoUnico(nome, data, documentoUnico);
                return usuario;
            }
            conexao.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return null;
    }
}
