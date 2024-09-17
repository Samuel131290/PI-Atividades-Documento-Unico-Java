package PIAtividade5.telas;
import PIAtividade5.model.DocumentoUnico;
import PIAtividade5.model.DocumentoUnicoDAO;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JTextField;


/**
* Classe que representa um JFrame para exibir a tela Login da aplicação.
* Inclui métodos para configurar atalhos de acessibilidade para os botões na interface gráfica.
*/
public class TelaInicial extends javax.swing.JFrame 
{   
    private DocumentoUnico usuarioAtual = new DocumentoUnico();
    
    /**
    * Construtor padrão da classe TelaInicial.
    * Inicializa os componentes da interface gráfica e gera atalhos de acessibilidade.
    */
    public TelaInicial() 
    {
        initComponents();
        configurarTextFields(cpfTf, senhaTf);
        underlineBtn(novoUsuariorBtn, esqueciASenhaBtn);
        gerarAcessbilidade();
        setResizable(false); // Desativa a opção de redimensionar a janela
        setLocationRelativeTo(null); // Centraliza a janela na tela
    }
    
 
    /**
    * Configura os campos de texto fornecidos para serem transparentes.
    * @param campos Campos de texto a serem configurados.
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
    * Configura os campos de texto dos botões, para que eles fiquem sublinhados.
    * @param campos Campos de texto a serem configurados.
    */
    private void underlineBtn(JButton... botoes)
    {
        for (JButton botao : botoes) 
        {
            Font fonteAtual = botao.getFont();

            HashMap<TextAttribute, Object> atributos = new HashMap<>();
            atributos.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);

         Font fonteSublinhada = fonteAtual.deriveFont(atributos);
         botao.setFont(fonteSublinhada);
        }
    }
   
    /**
    * Gera atalhos de acessibilidade para os botões na interface gráfica.
    * Associa teclas de atalho aos botões para facilitar a interação do usuário.
    */
    public void gerarAcessbilidade()
    {
        entrarBtn.setMnemonic(KeyEvent.VK_E);   
        novoUsuariorBtn.setMnemonic(KeyEvent.VK_N);
        esqueciASenhaBtn.setMnemonic(KeyEvent.VK_S);    
    }
    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sobreBtn = new javax.swing.JButton();
        cpfTf = new javax.swing.JTextField();
        senhaTf = new javax.swing.JPasswordField();
        entrarBtn = new javax.swing.JButton();
        novoUsuariorBtn = new javax.swing.JButton();
        esqueciASenhaBtn = new javax.swing.JButton();
        campo1 = new javax.swing.JLabel();
        versao = new javax.swing.JLabel();
        Img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sobreBtn.setBackground(new java.awt.Color(181, 206, 255));
        sobreBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sobreBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIAtividade5/img/Information_icon.png"))); // NOI18N
        sobreBtn.setToolTipText("Pressione para ver informações sobre o sistema");
        sobreBtn.setBorderPainted(false);
        sobreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreBtnActionPerformed(evt);
            }
        });
        getContentPane().add(sobreBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 30, 30));

        cpfTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cpfTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cpfTf.setToolTipText("Digite seu CPF");
        cpfTf.setBorder(null);
        cpfTf.setMinimumSize(new java.awt.Dimension(62, 31));
        cpfTf.setNextFocusableComponent(senhaTf);
        cpfTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfTfActionPerformed(evt);
            }
        });
        getContentPane().add(cpfTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 370, 350, 30));

        senhaTf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        senhaTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        senhaTf.setToolTipText("Digite sua Senha");
        senhaTf.setBorder(null);
        senhaTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaTfActionPerformed(evt);
            }
        });
        getContentPane().add(senhaTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 350, 40));

        entrarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entrarBtn.setText("Entrar");
        entrarBtn.setToolTipText("Pressione para entrar no sistema");
        entrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(entrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 120, 39));

        novoUsuariorBtn.setBackground(new java.awt.Color(181, 206, 255));
        novoUsuariorBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        novoUsuariorBtn.setForeground(new java.awt.Color(51, 51, 255));
        novoUsuariorBtn.setText("Novo Usuário");
        novoUsuariorBtn.setToolTipText("Pressione para iniciar um novo cadastro");
        novoUsuariorBtn.setBorderPainted(false);
        novoUsuariorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoUsuariorBtnActionPerformed(evt);
            }
        });
        getContentPane().add(novoUsuariorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, 22));

        esqueciASenhaBtn.setBackground(new java.awt.Color(181, 206, 255));
        esqueciASenhaBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        esqueciASenhaBtn.setForeground(new java.awt.Color(51, 51, 255));
        esqueciASenhaBtn.setText("Esqueci a Senha");
        esqueciASenhaBtn.setToolTipText("Pressione para recuperar seu acesso");
        esqueciASenhaBtn.setBorderPainted(false);
        esqueciASenhaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esqueciASenhaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(esqueciASenhaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, -1, 22));

        campo1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        campo1.setForeground(new java.awt.Color(51, 51, 255));
        campo1.setText("|");
        getContentPane().add(campo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 10, 40));

        versao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        versao.setText("V1.1");
        getContentPane().add(versao, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, -1, -1));

        Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIAtividade5/img/Tela_1.png"))); // NOI18N
        getContentPane().add(Img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void novoUsuariorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoUsuariorBtnActionPerformed
        NovoCadastro telanCadastro = new NovoCadastro();
        telanCadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_novoUsuariorBtnActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void esqueciASenhaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esqueciASenhaBtnActionPerformed
        RecuperarCadastro recuperarCadastro = new RecuperarCadastro();
        recuperarCadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_esqueciASenhaBtnActionPerformed

    private void cpfTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfTfActionPerformed

    private void entrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarBtnActionPerformed
        DocumentoUnico usuarioEncontrado = new DocumentoUnico();
        usuarioEncontrado.setCpf(cpfTf.getText());
        usuarioEncontrado.setSenha(senhaTf.getText());
        usuarioEncontrado = DocumentoUnicoDAO.validarUsuarioSeguro(usuarioEncontrado);

        if (usuarioEncontrado != null) 
        {            
            String nomeDoUsuario = usuarioEncontrado.getNome();
            String data = usuarioEncontrado.getData();
            String documentoUnico = usuarioEncontrado.getDocumentoUnico();

            if (usuarioEncontrado.getCpf().equalsIgnoreCase(cpfTf.getText()) && usuarioEncontrado.getSenha().equalsIgnoreCase(senhaTf.getText()))
            {
                JOptionPane.showMessageDialog(null, "Olá, " + nomeDoUsuario + "!");
            } 
            TelaCheia telaCheia = new TelaCheia(usuarioAtual);
            telaCheia.setVisible(true);   
            telaCheia.setNome(nomeDoUsuario);
            telaCheia.setData(data);
            telaCheia.setDocumentoUnico(documentoUnico);
            dispose();
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado! Verifique se os dados estão corretos.");
            senhaTf.setText("");
        }
    }//GEN-LAST:event_entrarBtnActionPerformed

    private void sobreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreBtnActionPerformed
        Sobre sobre = new Sobre();
        sobre.setVisible(true);
        dispose();
    }//GEN-LAST:event_sobreBtnActionPerformed

    private void senhaTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaTfActionPerformed
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
            public void run() 
            {
                new TelaInicial().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Img;
    private javax.swing.JLabel campo1;
    private javax.swing.JTextField cpfTf;
    private javax.swing.JButton entrarBtn;
    private javax.swing.JButton esqueciASenhaBtn;
    private javax.swing.JButton novoUsuariorBtn;
    private javax.swing.JPasswordField senhaTf;
    private javax.swing.JButton sobreBtn;
    private javax.swing.JLabel versao;
    // End of variables declaration//GEN-END:variables
}              
