package PIAtividade5.telas;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
* Classe que representa um JFrame para recuperar os registros de usuários.
* Inclui métodos para informar campos de texto e gera atalhos de acessibilidade.
*/
public class RecuperarCadastro extends javax.swing.JFrame
{
    private String email;
    
    /**
    * Construtor para a classe RecuperarCadastro.
    * Inicializa os componentes e configura campos de texto.
    */
    public RecuperarCadastro() 
    {
        initComponents();
        configurarTextFields(emailTf, confirmeEmailTf);
        gerarAcessbilidade();
    }

    /**
    * Gera atalhos de acessibilidade para os botões na interface gráfica.
    * Associa teclas de atalho aos botões para facilitar a interação do usuário.
    */
    public void gerarAcessbilidade() 
    {
        recuperarSenhaBtn.setMnemonic(KeyEvent.VK_R);
        voltarBtn.setMnemonic(KeyEvent.VK_V);
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Email = new javax.swing.JLabel();
        emailTf = new javax.swing.JTextField();
        campo11 = new javax.swing.JLabel();
        ConfirmeEmail = new javax.swing.JLabel();
        confirmeEmailTf = new javax.swing.JTextField();
        campo12 = new javax.swing.JLabel();
        recuperarSenhaBtn = new javax.swing.JButton();
        voltarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Email.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        Email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Email.setLabelFor(emailTf);
        Email.setText("Email:");
        Email.setToolTipText("Informe seu Email");
        Email.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Email.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, 30));

        emailTf.setBackground(new java.awt.Color(237, 237, 237));
        emailTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailTf.setToolTipText("Informe seu Email");
        emailTf.setBorder(null);
        emailTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTfActionPerformed(evt);
            }
        });
        getContentPane().add(emailTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 410, -1));

        campo11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campo11.setText("___________________________________________________________");
        campo11.setToolTipText("");
        campo11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(campo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 420, 10));

        ConfirmeEmail.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        ConfirmeEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ConfirmeEmail.setLabelFor(confirmeEmailTf);
        ConfirmeEmail.setText("Confirme seu Email:");
        ConfirmeEmail.setToolTipText("Confirme o seu Email");
        ConfirmeEmail.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ConfirmeEmail.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(ConfirmeEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 190, 30));

        confirmeEmailTf.setBackground(new java.awt.Color(237, 237, 237));
        confirmeEmailTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        confirmeEmailTf.setToolTipText("Confirme seu Email");
        confirmeEmailTf.setBorder(null);
        confirmeEmailTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmeEmailTfActionPerformed(evt);
            }
        });
        getContentPane().add(confirmeEmailTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 360, -1));

        campo12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campo12.setText("____________________________________________________");
        campo12.setToolTipText("");
        campo12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(campo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 370, 10));

        recuperarSenhaBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        recuperarSenhaBtn.setText("Recuperar Senha");
        recuperarSenhaBtn.setToolTipText("Pressione para enviar um email de recuperação de senha");
        recuperarSenhaBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        recuperarSenhaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuperarSenhaBtnActionPerformed(evt);
            }
        });
        getContentPane().add(recuperarSenhaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 170, 50));

        voltarBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        voltarBtn.setText("Voltar");
        voltarBtn.setToolTipText("Pressione para voltar a tela de Login");
        voltarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(voltarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 163, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIAtividade5/img/Tela_4.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTfActionPerformed

    private void confirmeEmailTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmeEmailTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmeEmailTfActionPerformed

    private void recuperarSenhaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuperarSenhaBtnActionPerformed
        if (!validFields()) 
        {   
            JOptionPane.showMessageDialog(rootPane, "Um Email foi encaminhado para " + email);
            emailTf.setText("");
            confirmeEmailTf.setText("");
        }
    }//GEN-LAST:event_recuperarSenhaBtnActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        TelaInicial telaLogin = new TelaInicial();
        // Torna a tela visível
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarBtnActionPerformed
    /**
    * Verifica se todos os campos do formulário estão preenchidos corretamente.
    * Exibe mensagens de erro para campos vazios ou preenchidos incorretamente.
    * @return true se todos os campos estiverem preenchidos corretamente, caso contrário, false
    */
    private boolean validFields()
    {
        boolean empty = true; 
        if (emailTf.getText().trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Email' não pode estar vazio.");
        } 
        else if (confirmeEmailTf.getText().trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane, "O campo 'Confirme seu Email' não pode estar vazio.");
        }
        else if (!confirmeEmail()) 
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
    * Verifica se o campo 'Email' é igual ao campo 'Confirme seu Email'.
    * Exibe uma mensagem de erro se não forem iguais.
    * @return true se os campos 'Email' e 'Confirme seu Email' forem iguais, caso contrário, false
    */
    private boolean confirmeEmail() 
    {
        email = emailTf.getText();
        String confirmeEmail = confirmeEmailTf.getText();

        if (!email.equals(confirmeEmail)) 
        {
            JOptionPane.showMessageDialog(rootPane, "Os campos 'Email' e 'Confirme seu Email' devem ser iguais.");
            return false;
        }
    return true;
    }
    
    /**
    * Método principal que inicia a aplicação.
    * Este método é o ponto de entrada da aplicação Java.
    * Ele cria uma nova thread de evento AWT/Swing e inicia a execução do programa dentro dessa thread.
    * @param args argumentos de linha de comando (não utilizados neste caso)
    */
    public static void main(String args[]) 
    {
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
    private javax.swing.JLabel ConfirmeEmail;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel campo11;
    private javax.swing.JLabel campo12;
    private javax.swing.JTextField confirmeEmailTf;
    private javax.swing.JTextField emailTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton recuperarSenhaBtn;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables

}
