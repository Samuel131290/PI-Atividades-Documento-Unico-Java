package PIAtividade5.model;

/**
* Classe que representa um Documento Único.
*/
public class DocumentoUnico
{
    private int id;
    private String nome;
    private String rg;
    private String cpf;
    private String titulo;
    private String celular;
    private String sexo;
    private String endereco;
    private String n;
    private String bairro;
    private String cidade;
    private String estado;
    private String email;    
    private String confirmarEmail;
    private String senha;
    private String confirmarSenha;
    private String data;
    private String documentoUnico;
    
    
    /**
    * Construtor padrão da classe Documento Único.
    */
    public DocumentoUnico() 
    {

    }

    /**
    * Construtor da classe DocumentoUnico com parâmetros.
    * 
    * @param id O ID do Documento Único.
    * @param nome O nome do usuário.
    * @param rg O RG do usuário.
    * @param cpf O CPF do usuário.
    * @param titulo O Titulo de Eleitor do usuário.
    * @param celular O número de celular do usuário.
    * @param sexo O genêro do usuário.
    * @param endereco O logradouro do usuário.
    * @param n O número da residência do usuário.
    * @param bairro O bairro do usuário.
    * @param cidade A cidade do usuário.
    * @param estado O estado do usuário.
    * @param email O email do usuário.
    * @param confirmarEmail A confirmação de email do usuário.
    * @param senha A senha do usuário.
    * @param confirmarSenha A confirmação de senha do usuário.
    * @param data A data de emissão do Documento Único.
    * @param documentoUnico O número do Documento Único.
    */
    public DocumentoUnico(int id, String nome, String rg, String cpf, String titulo, String celular, String sexo, String endereco, String n, String bairro, String cidade, String estado, String email, String confirmarEmail, String senha, String confirmarSenha, String data, String documentoUnico)
    {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.titulo = titulo;
        this.celular = celular;
        this.sexo = sexo;
        this.endereco = endereco;
        this.n = n;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.email = email;
        this.confirmarEmail = confirmarEmail;
        this.senha = senha;
        this.confirmarSenha = confirmarSenha;
        this.data = data;
        this.documentoUnico = documentoUnico;
    }

    /**
    * Obtém o ID do Documento Unico.
    * 
    * @return O ID do Documento Unico.
    */
    public int getId()
    {
        return id;
    }

    /**
    * Define o ID do Documento Único.
    * 
    * @param id O ID do Documento Único.
    */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
    * Obtém o nome do usuário.
    * 
    * @return O nome do usuário.
    */
    public String getNome() 
    {
        return nome;
    }

    /**
    * Define o nome do usuário.
    * 
    * @param nome O nome do usuário.
    */
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    
    /**
    * Obtém o RG do usuário.
    * 
    * @return O RG do usuário.
    */
    public String getRg() 
    {
        return rg;
    }

    /**
    * Define o RG do usuário.
    * 
    * @param rg O RG do usuário.
    */
    public void setRg(String rg) 
    {
        this.rg = rg;
    }

    /**
    * Obtém o CPF do usuário.
    * 
    * @return O CPF do usuário.
    */
    public String getCpf() 
    {
        return cpf;
    }

    /**
    * Define o CPF do usuário.
    * 
    * @param cpf O CPF do usuário.
    */
    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }
    
    /**
    * Obtém o Titulo de Eleitor do usuário.
    * 
    * @return O Titulo de Eleitor do usuário.
    */
    public String getTitulo() 
    {
        return titulo;
    }

    /**
    * Define o Titulo de Eleitor do usuário.
    * 
    * @param titulo O Titulo de Eleitor do usuário.
    */
    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }
 
    /**
    * Obtém o número de celular do usuário.
    * 
    * @return O número de celular do usuário.
    */
    public String getCelular() 
    {
        return celular;
    }

    /**
    * Define o número de celular do usuário.
    * 
    * @param celular O número de celular do usuário.
    */
    public void setCelular(String celular) 
    {
        this.celular = celular;
    }
    
    /**
    * Obtém o genêro do usuário.
    * 
    * @return O genêro do usuário.
    */
    public String getSexo() 
    {
        return sexo;
    }

    /**
    * Define o genêro do usuário.
    * 
    * @param sexo O genêro do usuário.
    */
    public void setSexo(String sexo) 
    {
        this.sexo = sexo;
    }
    
    /**
    * Obtém o logradouro do usuário.
    * 
    * @return O logradouro do usuário.
    */
    public String getEndereco() 
    {
        return endereco;
    }

    /**
    * Define o logradouro do usuário.
    * 
    * @param endereco O logradouro do usuário.
    */
    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }
    
    /**
    * Obtém o número da residência do usuário.
    * 
    * @return O número da residência do usuário.
    */
    public String getN() 
    {
        return n;
    }

    /**
    * Define o número da residência do usuário.
    * 
    * @param n O número da residência do usuário.
    */
    public void setN(String n) 
    {
        this.n = n;
    }
    
    /**
    * Obtém o bairro do usuário.
    * 
    * @return O bairro do usuário.
    */
    public String getBairro() 
    {
        return bairro;
    }

    /**
    * Define bairro do usuário.
    * 
    * @param bairro O bairro do usuário.
    */
    public void setBairro(String bairro) 
    {
        this.bairro = bairro;
    }
    
    /**
    * Obtém a cidade do usuário.
    * 
    * @return A cidade do usuário.
    */
    public String getCidade() 
    {
        return cidade;
    }

    /**
    * Define a cidade do usuário.
    * 
    * @param cidade A cidade do usuário.
    */
    public void setCidade(String cidade) 
    {
        this.cidade = cidade;
    }
    
    /**
    * Obtém o estado do usuário.
    * 
    * @return O estado do usuário.
    */
    public String getEstado() 
    {
        return estado;
    }

    /**
    * Define o estado do usuário.
    * 
    * @param estado O estado do usuário.
    */
    public void setEstado(String estado) 
    {
        this.estado = estado;
    }
    
    /**
    * Obtém o email do usuário.
    * 
    * @return O email do usuário.
    */
    public String getEmail() 
    {
        return email;
    }

    /**
    * Define o email do usuário.
    * 
    * @param email O email do usuário.
    */
    public void setEmail(String email) 
    {
        this.email = email;
    }
    
    /**
    * Obtém a confirmação de email do usuário.
    * 
    * @return A confirmação de email do usuário.
    */
    public String getConfirmarEmail() 
    {
        return confirmarEmail;
    }

    /**
    * Define a confirmação de email do usuário.
    * 
    * @param confirmarEmail A confirmação de email do usuário.
    */
    public void setConfirmarEmail(String confirmarEmail) 
    {
        this.confirmarEmail = confirmarEmail;
    }
    
    /**
    * Obtém a senha do usuário.
    * 
    * @return A senha do usuário.
    */
    public String getSenha() 
    {
        return senha;
    }

    /**
    * Define a senha do usuário.
    * 
    * @param senha A senha do usuário.
    */
    public void setSenha(String senha) 
    {
        this.senha = senha;
    }
    
    /**
    * Obtém a confirmação de senha do usuário.
    * 
    * @return A confirmação de senha do usuário.
    */
    public String getConfirmarSenha() 
    {
        return confirmarSenha;
    }

    /**
    * Define a confirmação de senha do usuário.
    * 
    * @param confirmarSenha A confirmação de senha do usuário.
    */
    public void setConfirmarSenha(String confirmarSenha) 
    {
        this.confirmarSenha = confirmarSenha;
    } 
    
    /**
    * Obtém a data de emissão do Documento Único.
    * 
    * @return A data de emissão do Documento Único.
    */
    public String getData() 
    {
        return data;
    }

    /**
    * Define a data de emissão do Documento Único.
    * 
    * @param data a data de emissão do Documento Único.
    */
    public void setData(String data) 
    {
        this.data = data;
    }
    
    /**
    * Obtém o número do Documento Único.
    * 
    * @return O número do Documento Único.
    */
    public String getDocumentoUnico() 
    {
        return documentoUnico;
    }

    /**
    * Define o número do Documento Único..
    * 
    * @param documentoUnico O número do Documento Único.
    */
    public void setDocumentoUnico(String documentoUnico) 
    {
        this.documentoUnico = documentoUnico;
    }
    
    /**
    * Construto para o metódo loginJaExiste.
    * 
    * @param nome O nome do´usuário.
    * @param data A data de emissão Documento Único.
    * @param documentoUnico O número do Documento Único.
    */
    public DocumentoUnico(String nome, String data, String documentoUnico)
    {
        this.nome = nome;
        this.data = data;
        this.documentoUnico = documentoUnico;
    }
}
