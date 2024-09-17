package PIAtividade5.telas;
import PIAtividade5.model.DocumentoUnico;
import PIAtividade5.model.DocumentoUnicoDAO;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import javax.swing.JOptionPane;
import java.nio.charset.StandardCharsets;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;
import javax.swing.JTextField;


/**
* Classe que representa um JFrame para criar novos registros de usuários.
* Inclui métodos para configurar campos de texto, gerar atalhos de acessibilidade e gerar um identificador de documento único para cada usuário.
*/
public class NovoCadastro extends javax.swing.JFrame
{
    private DocumentoUnico usuarioAtual = new DocumentoUnico();
    private String documentoUnico;
    private String emissao;
    
    /**
    * Construtor para a classe NovoCadastro.
    * Inicializa os componentes, desabilita determinados botões e configura campos de texto.
    */
    public NovoCadastro() 
    {
        initComponents();
        visualizarBtn.setEnabled(false);
        configurarTextFields(nomeTf, rgTf, cpfTf, tituloEleitorTf, celularTf, enderecoTf, nTf, bairroTf, cidadeTf, emailTf, confirmeEmailTf, senhaTf, confirmeSenhaTf, documentoUnicoTf, avisoTf, nomeTf1, dataTf);
        gerarAcessbilidade();
    }

    /**
    * Configura os campos de texto fornecidos para serem transparentes.
    * @param campos Campos de texto a serem configurados
    */
    private void configurarTextFields(JTextField... campos)  
    {
        for (JTextField campo : campos) 
        {
            campo.setOpaque(false);
            campo.setBackground(new Color(0,0,0,0));
        }
    }

    /**
    * Gera atalhos de acessibilidade.
    */
    public void gerarAcessbilidade() 
    {
        gerarDuBtn.setMnemonic(KeyEvent.VK_G);
    }
   
    /**
    * Gera o número do Documento Único e define sua data de emissão.
    */
    public void generateDocumentoUnico() 
    {
        
        StringBuilder du = new StringBuilder();

        Random random = new Random();
        LocalDate dataAtual = LocalDate.now();

        for (int i = 0; i < 22; i++) 
        {
            int digito = random.nextInt(10);
            du.append(digito);
        }

        documentoUnico = du.toString();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        emissao = dataAtual.format(formatter);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nome = new javax.swing.JLabel();
        nomeTf = new javax.swing.JTextField();
        campo1 = new javax.swing.JLabel();
        RG = new javax.swing.JLabel();
        rgTf = new javax.swing.JTextField();
        campo2 = new javax.swing.JLabel();
        cpfTf = new javax.swing.JTextField();
        CPF = new javax.swing.JLabel();
        campo3 = new javax.swing.JLabel();
        campo4 = new javax.swing.JLabel();
        TituloEleitor = new javax.swing.JLabel();
        tituloEleitorTf = new javax.swing.JTextField();
        celularTf = new javax.swing.JTextField();
        campo9 = new javax.swing.JLabel();
        Celular = new javax.swing.JLabel();
        Sexo = new javax.swing.JLabel();
        sexoDbx = new javax.swing.JComboBox<>();
        estadoDbx = new javax.swing.JComboBox<>();
        Estado = new javax.swing.JLabel();
        cidadeTf = new javax.swing.JTextField();
        campo8 = new javax.swing.JLabel();
        Cidade = new javax.swing.JLabel();
        bairroTf = new javax.swing.JTextField();
        campo7 = new javax.swing.JLabel();
        Bairro = new javax.swing.JLabel();
        nTf = new javax.swing.JTextField();
        campo6 = new javax.swing.JLabel();
        Nº = new javax.swing.JLabel();
        enderecoTf = new javax.swing.JTextField();
        campo5 = new javax.swing.JLabel();
        Endereco = new javax.swing.JLabel();
        campo12 = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        campo11 = new javax.swing.JLabel();
        ConfirmeEmail = new javax.swing.JLabel();
        emailTf = new javax.swing.JTextField();
        confirmeEmailTf = new javax.swing.JTextField();
        confirmeSenhaTf = new javax.swing.JPasswordField();
        campo13 = new javax.swing.JLabel();
        campo10 = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        ConfirmeSenha = new javax.swing.JLabel();
        senhaTf = new javax.swing.JPasswordField();
        gerarDuBtn = new javax.swing.JButton();
        visualizarBtn = new javax.swing.JButton();
        documentoUnicoTf = new javax.swing.JTextField();
        avisoTf = new javax.swing.JTextField();
        nomeTf1 = new javax.swing.JTextField();
        dataTf = new javax.swing.JTextField();
        Imagem = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        mnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nome.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        Nome.setLabelFor(nomeTf);
        Nome.setText("Nome:");
        Nome.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 56, -1));

        nomeTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomeTf.setToolTipText("Informe o seu nome");
        nomeTf.setBorder(null);
        nomeTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTfActionPerformed(evt);
            }
        });
        getContentPane().add(nomeTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 400, -1));

        campo1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campo1.setText("___________________________________________________________");
        campo1.setToolTipText("");
        campo1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(campo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 420, 10));

        RG.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        RG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RG.setText("RG:");
        RG.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        RG.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(RG, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 40, 30));

        rgTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rgTf.setToolTipText("Informe seu número de RG com 9 dígitos");
        rgTf.setBorder(null);
        rgTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgTfActionPerformed(evt);
            }
        });
        getContentPane().add(rgTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 100, -1));

        campo2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campo2.setText("______________");
        campo2.setToolTipText("");
        campo2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(campo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 110, 10));

        cpfTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cpfTf.setToolTipText("Informe seu número de CPF com 11 dígitos");
        cpfTf.setBorder(null);
        cpfTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfTfActionPerformed(evt);
            }
        });
        getContentPane().add(cpfTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 120, -1));

        CPF.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        CPF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CPF.setLabelFor(cpfTf);
        CPF.setText("CPF:");
        CPF.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        CPF.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 40, 30));

        campo3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campo3.setText("_________________");
        campo3.setToolTipText("");
        campo3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(campo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 130, 10));

        campo4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campo4.setText("____________________");
        campo4.setToolTipText("");
        campo4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(campo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, 10));

        TituloEleitor.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        TituloEleitor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TituloEleitor.setLabelFor(tituloEleitorTf);
        TituloEleitor.setText("Titulo de Eleitor:");
        TituloEleitor.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        TituloEleitor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(TituloEleitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 140, 30));

        tituloEleitorTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tituloEleitorTf.setToolTipText("Informe seu número do Titulo de Eleitor com 12 dígitos");
        tituloEleitorTf.setBorder(null);
        tituloEleitorTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloEleitorTfActionPerformed(evt);
            }
        });
        getContentPane().add(tituloEleitorTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 130, -1));

        celularTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        celularTf.setToolTipText("Informe seu número de Celular, com o DDD");
        celularTf.setBorder(null);
        celularTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularTfActionPerformed(evt);
            }
        });
        getContentPane().add(celularTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 130, -1));

        campo9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campo9.setText("___________________");
        campo9.setToolTipText("");
        campo9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(campo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 140, 10));

        Celular.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        Celular.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Celular.setLabelFor(celularTf);
        Celular.setText("Celular:");
        Celular.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Celular.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 70, 30));

        Sexo.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        Sexo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Sexo.setLabelFor(sexoDbx);
        Sexo.setText("Sexo:");
        Sexo.setToolTipText("Informe o seu Sexo");
        Sexo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Sexo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 140, 50, 30));

        sexoDbx.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sexoDbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Masculino", " Feminino" }));
        sexoDbx.setToolTipText("Informe seu genêro");
        sexoDbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoDbxActionPerformed(evt);
            }
        });
        getContentPane().add(sexoDbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 140, 130, 30));

        estadoDbx.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        estadoDbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        estadoDbx.setToolTipText("Informe seu Estado");
        estadoDbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoDbxActionPerformed(evt);
            }
        });
        getContentPane().add(estadoDbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 190, 70, 30));

        Estado.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        Estado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Estado.setLabelFor(estadoDbx);
        Estado.setText("Estado:");
        Estado.setToolTipText("Informe seu Estado");
        Estado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Estado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 190, 70, 30));

        cidadeTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cidadeTf.setToolTipText("Informe sua Cidade");
        cidadeTf.setBorder(null);
        cidadeTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeTfActionPerformed(evt);
            }
        });
        getContentPane().add(cidadeTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 160, -1));

        campo8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campo8.setText("_______________________");
        campo8.setToolTipText("");
        campo8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(campo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 190, 10));

        Cidade.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        Cidade.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Cidade.setLabelFor(cidadeTf);
        Cidade.setText("Cidade:");
        Cidade.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Cidade.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 70, 30));

        bairroTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bairroTf.setToolTipText("Informe o seu Bairro");
        bairroTf.setBorder(null);
        bairroTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroTfActionPerformed(evt);
            }
        });
        getContentPane().add(bairroTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 190, -1));

        campo7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campo7.setText("____________________________");
        campo7.setToolTipText("");
        campo7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(campo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 200, 10));

        Bairro.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        Bairro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Bairro.setLabelFor(bairroTf);
        Bairro.setText("Bairro:");
        Bairro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Bairro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 60, 30));

        nTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nTf.setToolTipText("Informe o número de sua residência");
        nTf.setBorder(null);
        nTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nTfActionPerformed(evt);
            }
        });
        getContentPane().add(nTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 60, -1));

        campo6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campo6.setText("__________");
        campo6.setToolTipText("");
        campo6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(campo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, 10));

        Nº.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        Nº.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Nº.setLabelFor(nTf);
        Nº.setText("Nº:");
        Nº.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Nº.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Nº, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 30, 30));

        enderecoTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        enderecoTf.setToolTipText("Informe o seu Logradouro");
        enderecoTf.setBorder(null);
        enderecoTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoTfActionPerformed(evt);
            }
        });
        getContentPane().add(enderecoTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 210, -1));

        campo5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campo5.setText("_______________________________");
        campo5.setToolTipText("");
        campo5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(campo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 230, 10));

        Endereco.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        Endereco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Endereco.setLabelFor(enderecoTf);
        Endereco.setText("Endereço:");
        Endereco.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Endereco.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 30));

        campo12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campo12.setText("________________________________________");
        campo12.setToolTipText("");
        campo12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(campo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, 10));

        Email.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        Email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Email.setLabelFor(emailTf);
        Email.setText("Email:");
        Email.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Email.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 60, 30));

        campo11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campo11.setText("________________________________________");
        campo11.setToolTipText("");
        campo11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(campo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, 10));

        ConfirmeEmail.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        ConfirmeEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ConfirmeEmail.setLabelFor(confirmeEmailTf);
        ConfirmeEmail.setText("Confirme seu Email:");
        ConfirmeEmail.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ConfirmeEmail.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(ConfirmeEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 170, 30));

        emailTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailTf.setToolTipText("Informe seu Email");
        emailTf.setBorder(null);
        emailTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTfActionPerformed(evt);
            }
        });
        getContentPane().add(emailTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 270, -1));

        confirmeEmailTf.setBackground(new java.awt.Color(237, 237, 237));
        confirmeEmailTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        confirmeEmailTf.setToolTipText("Confirme o seu Email");
        confirmeEmailTf.setBorder(null);
        confirmeEmailTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmeEmailTfActionPerformed(evt);
            }
        });
        getContentPane().add(confirmeEmailTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 270, -1));

        confirmeSenhaTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirmeSenhaTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        confirmeSenhaTf.setToolTipText("Confirme sua Senha");
        confirmeSenhaTf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(confirmeSenhaTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 130, 40));

        campo13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campo13.setText("___________________");
        campo13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(campo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 140, -1));

        campo10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campo10.setText("___________________");
        campo10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(campo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 140, -1));

        Senha.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        Senha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Senha.setLabelFor(senhaTf);
        Senha.setText("Senha:");
        Senha.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Senha.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 60, 30));

        ConfirmeSenha.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        ConfirmeSenha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ConfirmeSenha.setLabelFor(confirmeSenhaTf);
        ConfirmeSenha.setText("Confirme sua Senha:");
        ConfirmeSenha.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ConfirmeSenha.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(ConfirmeSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 180, 30));

        senhaTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        senhaTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        senhaTf.setToolTipText("Informe sua Senha (deve conter letras maiúsculas e caracteres especiais)");
        senhaTf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(senhaTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 130, 40));

        gerarDuBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gerarDuBtn.setText("GERAR DOCUMENTO ÚNICO");
        gerarDuBtn.setToolTipText("Pessione para gerar seu Documento Único");
        gerarDuBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        gerarDuBtn.setNextFocusableComponent(nomeTf);
        gerarDuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarDuBtnActionPerformed(evt);
            }
        });
        getContentPane().add(gerarDuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 286, 80));

        visualizarBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        visualizarBtn.setText("VISUALIZAR EM TELA CHEIA");
        visualizarBtn.setToolTipText("Pressione para visualizar o Documento Único em tela cheia");
        visualizarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        visualizarBtn.setNextFocusableComponent(nomeTf);
        visualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(visualizarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, 286, 80));

        documentoUnicoTf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        documentoUnicoTf.setBorder(null);
        documentoUnicoTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoUnicoTfActionPerformed(evt);
            }
        });
        getContentPane().add(documentoUnicoTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, 232, 26));
        documentoUnicoTf.setEditable(false); // Torna o JTextPane não editável

        avisoTf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        avisoTf.setToolTipText("");
        avisoTf.setBorder(null);
        avisoTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avisoTfActionPerformed(evt);
            }
        });
        getContentPane().add(avisoTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, 360, 40));
        documentoUnicoTf.setEditable(false); // Torna o JTextPane não editável

        nomeTf1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomeTf1.setBorder(null);
        nomeTf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTf1ActionPerformed(evt);
            }
        });
        getContentPane().add(nomeTf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 600, 310, 40));
        nomeTf1.setEditable(false);

        dataTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dataTf.setBorder(null);
        dataTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataTfActionPerformed(evt);
            }
        });
        getContentPane().add(dataTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 650, 160, 40));
        dataTf.setEditable(false);

        Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIAtividade5/img/Tela_2.png"))); // NOI18N
        getContentPane().add(Imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 780));

        jMenu.setText("File");

        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        jMenu.add(mnSair);

        jMenuBar.add(jMenu);

        setJMenuBar(jMenuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rgTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgTfActionPerformed

    private void nomeTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTfActionPerformed

    private void cpfTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfTfActionPerformed

    private void tituloEleitorTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloEleitorTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloEleitorTfActionPerformed

    private void sexoDbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoDbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoDbxActionPerformed

    private void enderecoTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoTfActionPerformed

    private void nTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nTfActionPerformed

    private void bairroTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroTfActionPerformed

    private void cidadeTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeTfActionPerformed

    private void estadoDbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoDbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoDbxActionPerformed

    private void celularTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celularTfActionPerformed

    private void emailTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTfActionPerformed

    private void confirmeEmailTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmeEmailTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmeEmailTfActionPerformed

    private void gerarDuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarDuBtnActionPerformed
    if (!validFields())
    {   
        try 
        {
            generateDocumentoUnico(); // Gerar o número do documento e a data de emissão primeiro.
            DocumentoUnico docUnico = new DocumentoUnico();
            
            // Define os atributos do documento único com os valores dos campos de texto.
            docUnico.setNome(nomeTf.getText());
            docUnico.setRg(rgTf.getText());
            docUnico.setCpf(cpfTf.getText());
            docUnico.setTitulo(tituloEleitorTf.getText());
            docUnico.setCelular(celularTf.getText());
            String sexo = (String) sexoDbx.getSelectedItem();
            docUnico.setSexo(sexo);
            docUnico.setEndereco(enderecoTf.getText());
            docUnico.setN(nTf.getText());
            docUnico.setBairro(bairroTf.getText());
            docUnico.setCidade(cidadeTf.getText());
            String estado = (String) estadoDbx.getSelectedItem();
            docUnico.setEstado(estado);
            docUnico.setEmail(emailTf.getText());
            docUnico.setConfirmarEmail(confirmeEmailTf.getText());
            docUnico.setSenha(senhaTf.getText());
            docUnico.setConfirmarSenha(confirmeSenhaTf.getText());
            docUnico.setData(emissao);
            docUnico.setDocumentoUnico(documentoUnico);
            
            
            DocumentoUnico usuarioCadastrado = DocumentoUnicoDAO.loginJaExiste(cpfTf.getText());
            if (usuarioCadastrado != null) 
            {
                String nomeDoUsuario = usuarioCadastrado.getNome();
                String data = usuarioCadastrado.getData();
    
                JOptionPane.showMessageDialog(null, "CPF " + cpfTf.getText() + " já cadastrado.");
                gerarDuBtn.setEnabled(false);
                visualizarBtn.setEnabled(false);
    
                nomeTf1.setText(nomeDoUsuario);
                dataTf.setText(data);
                avisoTf.setText("Efetue o login para visualizar seu Documento Único!");
            }
            else if(DocumentoUnicoDAO.cadastrar(docUnico)) 
            {
                
                this.usuarioAtual = docUnico;
                String nome = nomeTf.getText();
                File arquivo = new File("C:\\Users\\samue\\OneDrive\\Área de Trabalho\\Documento Único.txt");
  
                FileWriter fw = new FileWriter(arquivo, true);
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivo, true), StandardCharsets.UTF_8));
        
                bw.write("|----------------------------------------------------|\n" 
                       + "|                   DOCUMENTO ÚNICO                  |\n"
                       + "|               " + documentoUnico + "               |\n"
                       + "|----------------------------------------------------|\n"
                       + "|Nome: " + nome 
                       + "\n" + "|Data: " + emissao
                       + "\n|----------------------------------------------------|\n" + "\n" + "\n");
                bw.newLine();
                bw.close();
                fw.close();

                
                JOptionPane.showMessageDialog(this,"|-----------------------------------------------------------|\n" 
                                                 + "|                    DOCUMENTO ÚNICO                     |\n"
                                                 + "|             " + documentoUnico + "              |\n" 
                                                 + "|-----------------------------------------------------------|\n"
                                                 + "|Nome: " + nome 
                                                 + "\n" + "|Data: " + emissao 
                                                 + "\n|-----------------------------------------------------------|\n");
                nomeTf1.setText(nome);  
                documentoUnicoTf.setText(documentoUnico);
                dataTf.setText(emissao);
                gerarDuBtn.setEnabled(false);
                visualizarBtn.setEnabled(true);
                limparTextFields(nomeTf, rgTf, cpfTf, tituloEleitorTf, celularTf, enderecoTf, nTf, bairroTf, cidadeTf, emailTf, confirmeEmailTf, senhaTf, confirmeSenhaTf);
            }
        } 
        catch (IOException ex) 
        {
            JOptionPane.showMessageDialog(this, "Erro ao salvar dados: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(NovoCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_gerarDuBtnActionPerformed
    /**
    * Verifica se todos os campos do formulário estão preenchidos corretamente.
    * Exibe mensagens de erro para campos vazios ou preenchidos incorretamente.
    * @return true se todos os campos estiverem preenchidos corretamente, caso contrário, false
    */
    private boolean validFields()
    {
        boolean empty = true; 
              
        if (nomeTf.getText().trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Nome' não pode estar vazio.");
        } 
        else if (onlyCaracteres(nomeTf.getText()))
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Nome' não pode ser um valor numérico.");
        }
        else if(rgTf.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'RG' não pode estar vazio.");
        } 
        else if (!isValidRG(rgTf.getText())) 
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'RG' deve ter 9 dígitos.");
        }
        else if (!onlyNumbers(rgTf.getText())) 
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'RG' não deve haver letras.");
        }
        else if(cpfTf.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'CPF' não pode estar vazio.");
        } 
        else if (!isValidCPF(cpfTf.getText())) 
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'CPF' deve ter 11 dígitos.");
        }
        else if (!onlyNumbers(cpfTf.getText())) 
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'CPF' não deve haver letras.");
        }
        else if(tituloEleitorTf.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Titulo de Eleitor' não pode estar vazio.");
        } 
        else if (!isValidTitulo(tituloEleitorTf.getText())) 
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Titulo de Eleitor' deve ter 12 dígitos.");
        }
        else if (!onlyNumbers(tituloEleitorTf.getText())) 
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Titulo de Eleitor' não deve haver letras.");
        }
        else if(celularTf.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Celular' não pode estar vazio.");
        } 
        else if (!isValidCelular(celularTf.getText())) 
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Celular' deve ter 12 dígitos (DDD + número).");
        }
        else if (!onlyNumbers(celularTf.getText())) 
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Celular' não deve haver letras.");
        }
        else if(enderecoTf.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Endereço' não pode estar vazio.");
        } 
        else if (onlyCaracteres(enderecoTf.getText()))
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Endereço' não pode ser um valor numérico.");
        }
        else if(nTf.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Número' não pode estar vazio.");
        } 
        else if (bairroTf.getText().trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Bairro' não pode estar vazio.");
        } 
        else if (onlyCaracteres(bairroTf.getText()))
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Bairro' não pode ser um valor numérico.");
        }
        else if (cidadeTf.getText().trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Cidade' não pode estar vazio.");
        } 
        else if (onlyCaracteres(cidadeTf.getText()))
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Cidade' não pode ser um valor numérico.");
        }
        else if (emailTf.getText().trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Email' não pode estar vazio.");
        } 
        else if (confirmeEmailTf.getText().trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Confirme seu Email' não pode estar vazio.");
        }
        else if (senhaTf.getText().trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Senha' não pode estar vazio.");
        } 
        else if (!isValidSenha(senhaTf.getText())) 
        {
            JOptionPane.showMessageDialog(rootPane, "A senha deve conter caracteres especiais, letras minúsculas e maiúsculas");
        }
        else if (confirmeSenhaTf.getText().trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Confirme seu Senha' não pode estar vazio.");
        } 
        else if (!confirmeEmail()) 
        { 
            empty = true;
        }
        else if (!confirmeSenha()) 
        { 
            empty = true;
        }
        else
        {
            empty = false;
        }
        return empty;
    }
    
    /**
    * Verifica se a string contém apenas caracteres numéricos.
    * @param caracter A string a ser verificada
    * @return true se a string contém apenas caracteres numéricos, caso contrário, false
    */
    private boolean onlyCaracteres(String caracter) // Verifica se o campo contém números
    {
        return caracter.matches("\\d+");
    }
    
    /**
    * Verifica se a string contém apenas números.
    * @param numero A string a ser verificada
    * @return true se a string contém apenas números, caso contrário, false
    */
    private boolean onlyNumbers(String numero) // Verifica se o campo contém letras
    {
        return numero.matches("\\d*");
    }
    
    /**
    * Verifica se o RG possui 9 dígitos.
    * @param rg O RG a ser verificado
    * @return true se o RG possui 9 dígitos, caso contrário, false
    */
    private boolean isValidRG(String rg) 
    {
        return rg.matches("\\d{9}");
    }
    
    /**
    * Verifica se o CPF possui 11 dígitos.
    * @param cpf O CPF a ser verificado
    * @return true se o CPF possui 11 dígitos, caso contrário, false
    */
    private boolean isValidCPF(String cpf) 
    {
        return cpf.matches("\\d{11}");
    }
    
    /**
    * Verifica se o título de eleitor possui 12 dígitos.
    * @param titulo O título de eleitor a ser verificado
    * @return true se o título de eleitor possui 12 dígitos, caso contrário, false
    */
    private boolean isValidTitulo(String titulo) 
    {
        return titulo.matches("\\d{12}");
    }
    
    /**
    * Verifica se o número de celular possui 12 dígitos.
    * @param celular O número de celular a ser verificado
    * @return true se o número de celular possui 12 dígitos, caso contrário, false
    */
    private boolean isValidCelular(String celular) 
    {
        return celular.matches("\\d{12}");
    }
    
    /**
    * Verifica se a senha atende aos critérios de segurança (contém caracteres especiais,letras minúsculas e maiúsculas).
    * @param senha A senha a ser verificada
    * @return true se a senha atende aos critérios de segurança, caso contrário, false
    */
    private boolean isValidSenha(String senha) 
    {
        // Verifica se a senha tem ao menos um caracter especial
        boolean hasSpecialChar = senha.matches(".*[!@#$%^&*()-_=+{};:,<.>/?\\[\\]\\\\].*");

        // Verifica se a senha tem ao menos uma letra minúscula
        boolean hasLowercase = senha.matches(".*[a-z].*");

        // Verifica se a senha tem ao menos uma letra maiúscula
        boolean hasUppercase = senha.matches(".*[A-Z].*");

        // Retorna verdadeiro, se todas as condições forem aceitas
        return hasSpecialChar && hasLowercase && hasUppercase;
    }
    
    /**
    * Verifica se o campo 'Email' é igual ao campo 'Confirme seu Email'.
    * Exibe uma mensagem de erro se não forem iguais.
    * @return true se os campos 'Email' e 'Confirme seu Email' forem iguais, caso contrário, false
    */
    private boolean confirmeEmail() 
    {
        String email = emailTf.getText();
        String confirmeEmail = confirmeEmailTf.getText();

        if (!email.equals(confirmeEmail)) // Verifica se os campos 'Email' e 'Confirme seu Email' são iguais
        {
            JOptionPane.showMessageDialog(rootPane, "Os campos 'Email' e 'Confirme seu Email' devem ser iguais.");
            return false;
        }
    return true;
    }
    
    /**
    * Verifica se o campo 'Senha' é igual ao campo 'Confirme sua Senha'.
    * Exibe uma mensagem de erro se não forem iguais.
    * @return true se os campos 'Senha' e 'Confirme sua Senha' forem iguais, caso contrário, false
    */
    private boolean confirmeSenha() 
    {
        String senha = senhaTf.getText();
        String confirmeSenha = confirmeSenhaTf.getText();

        if (!senha.equals(confirmeSenha)) // Verifica se os campos 'Senha' e 'Confirme sua Senha' são iguais
        {
            JOptionPane.showMessageDialog(rootPane, "Os campos 'Senha' e 'Confirme sua Senha' devem ser iguais.");
            return false;
        }
        return true;
    }
    
    /**
    * Limpa os TextFields após o usuário clicar em Gerar Documento Único.
    */
    private void limparTextFields(JTextField... campos)
    {
        for (JTextField campo : campos) 
        {
            campo.setVisible(false);
        }
    }
    private void documentoUnicoTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoUnicoTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoUnicoTfActionPerformed

    private void dataTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataTfActionPerformed

    private void nomeTf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTf1ActionPerformed

    private void visualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarBtnActionPerformed
        DocumentoUnico usuarioEncontrado = new DocumentoUnico();
        usuarioEncontrado.setCpf(cpfTf.getText());
        usuarioEncontrado.setSenha(senhaTf.getText());
        usuarioEncontrado = DocumentoUnicoDAO.validarUsuarioSeguro(usuarioEncontrado);

        if (usuarioEncontrado != null) 
        {            
            String nomeDoUsuario = usuarioEncontrado.getNome();
            String data = usuarioEncontrado.getData();
            String docUnico = usuarioEncontrado.getDocumentoUnico();
        
            TelaCheia telaCheia = new TelaCheia(usuarioAtual);
            telaCheia.setVisible(true);   
            telaCheia.setNome(nomeDoUsuario);
            telaCheia.setData(data);
            telaCheia.setDocumentoUnico(docUnico);
            telaCheia.setDocumentoUnico(documentoUnico);
            dispose();
        } 
    }//GEN-LAST:event_visualizarBtnActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja mesmo sair do programa?");
        if(resposta == 0)//0- yes, 1- no, 2- cancel
        {
            TelaInicial telaInicial = new TelaInicial();
            // Torna a tela visível
            telaInicial.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_mnSairActionPerformed

    private void avisoTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avisoTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avisoTfActionPerformed
    /**
    * Método principal que inicia a aplicação.
    * Este método é o ponto de entrada da aplicação Java.
    * Ele cria uma nova thread de evento AWT/Swing e inicia a execução do programa dentro dessa thread.
    * @param args argumentos de linha de comando (não utilizados neste caso)
    */
    public static void main(String args[]) 
    {
        /**
        * Sobrescrita do método run() da interface Runnable.
        * Este método é chamado pela thread de evento AWT/Swing para iniciar a execução do programa.
        */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            /**
            * Sobrescrita do método run() da interface Runnable.
            * Este método é chamado pela thread de evento AWT/Swing para iniciar a execução do programa.
            */
            public void run() 
            {

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bairro;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Celular;
    private javax.swing.JLabel Cidade;
    private javax.swing.JLabel ConfirmeEmail;
    private javax.swing.JLabel ConfirmeSenha;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel Estado;
    private javax.swing.JLabel Imagem;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Nº;
    private javax.swing.JLabel RG;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel Sexo;
    private javax.swing.JLabel TituloEleitor;
    private javax.swing.JTextField avisoTf;
    private javax.swing.JTextField bairroTf;
    private javax.swing.JLabel campo1;
    private javax.swing.JLabel campo10;
    private javax.swing.JLabel campo11;
    private javax.swing.JLabel campo12;
    private javax.swing.JLabel campo13;
    private javax.swing.JLabel campo2;
    private javax.swing.JLabel campo3;
    private javax.swing.JLabel campo4;
    private javax.swing.JLabel campo5;
    private javax.swing.JLabel campo6;
    private javax.swing.JLabel campo7;
    private javax.swing.JLabel campo8;
    private javax.swing.JLabel campo9;
    private javax.swing.JTextField celularTf;
    private javax.swing.JTextField cidadeTf;
    private javax.swing.JTextField confirmeEmailTf;
    private javax.swing.JPasswordField confirmeSenhaTf;
    private javax.swing.JTextField cpfTf;
    private javax.swing.JTextField dataTf;
    private javax.swing.JTextField documentoUnicoTf;
    private javax.swing.JTextField emailTf;
    private javax.swing.JTextField enderecoTf;
    private javax.swing.JComboBox<String> estadoDbx;
    private javax.swing.JButton gerarDuBtn;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JTextField nTf;
    private javax.swing.JTextField nomeTf;
    private javax.swing.JTextField nomeTf1;
    private javax.swing.JTextField rgTf;
    private javax.swing.JPasswordField senhaTf;
    private javax.swing.JComboBox<String> sexoDbx;
    private javax.swing.JTextField tituloEleitorTf;
    private javax.swing.JButton visualizarBtn;
    // End of variables declaration//GEN-END:variables
}
