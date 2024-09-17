package PIAtividade5.telas;
import PIAtividade5.model.DocumentoUnico;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
* Classe que representa um JFrame para exibir informações do usuário em tela cheia.
* Inclui métodos para configurar os campos de texto e definir informações do usuário.
*/
public class TelaCheia extends javax.swing.JFrame
{
    private DocumentoUnico usuarioAtual = new DocumentoUnico();
    
    /**
    * A classe TelaCheia representa um JFrame para exibir informações do Documento Único em tela cheia.
    * Ela inclui métodos para configurar os campos de texto e definir informações do usuário.
    */
    public TelaCheia() 
    {
        initComponents();
    }

    /**
    * Construtor da classe TelaCheia com um parâmetro Documento Único.
    * Define o usuário atual com base no documento fornecido e inicializa os componentes da interface gráfica.
    * Configura os campos de texto para exibir informações do usuário.
    * @param u O documento único associado ao usuário atual
    */
    TelaCheia(DocumentoUnico u) 
    {
        this.usuarioAtual = u;
        initComponents();
        configurarTextFields(documentoUnicoTf, nomeTf1, dataTf); 
        
    }
    
    /**
    * Define o nome do usuário exibido na interface gráfica.
    * @param text O nome do usuário a ser exibido
    */
    public void setNome(String text)
    {
        nomeTf1.setText(text);
    }
    
    /**
    * Define a data do usuário exibida na interface gráfica.
    * @param text A data do usuário a ser exibida
    */
    public void setData(String text)
    {
        dataTf.setText(text);
    }
    
    /**
    * Define o número do Documento Único do usuário exibido na interface gráfica.
    * @param text O documento único do usuário a ser exibido
    */
    public void setDocumentoUnico(String text)
    {
        documentoUnicoTf.setText(text);
    }
    
    /**
    * Configura os campos de texto para serem transparentes.
    * @param campos Os campos de texto a serem configurados
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

        nomeTf1 = new javax.swing.JTextField();
        documentoUnicoTf = new javax.swing.JTextField();
        dataTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        mnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomeTf1.setBackground(new java.awt.Color(237, 237, 237));
        nomeTf1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        nomeTf1.setBorder(null);
        nomeTf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTf1ActionPerformed(evt);
            }
        });
        getContentPane().add(nomeTf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 640, 50));
        nomeTf1.setEditable(false);

        documentoUnicoTf.setBackground(new java.awt.Color(237, 237, 237));
        documentoUnicoTf.setFont(new java.awt.Font("Arial", 1, 56)); // NOI18N
        documentoUnicoTf.setBorder(null);
        documentoUnicoTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoUnicoTfActionPerformed(evt);
            }
        });
        documentoUnicoTf.setEditable(false); // Torna o JTextField não editável
        documentoUnicoTf.setFocusable(true);
        getContentPane().add(documentoUnicoTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 680, 110));

        dataTf.setBackground(new java.awt.Color(237, 237, 237));
        dataTf.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        dataTf.setBorder(null);
        dataTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataTfActionPerformed(evt);
            }
        });
        getContentPane().add(dataTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 210, 50));
        dataTf.setEditable(false);

        jLabel1.setBackground(new java.awt.Color(0, 51, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIAtividade5/img/Tela_3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 800));

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

    private void documentoUnicoTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoUnicoTfActionPerformed

    }//GEN-LAST:event_documentoUnicoTfActionPerformed

    private void nomeTf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTf1ActionPerformed

    private void dataTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataTfActionPerformed

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
            public void run() 
            {
                new TelaCheia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dataTf;
    private javax.swing.JTextField documentoUnicoTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JTextField nomeTf1;
    // End of variables declaration//GEN-END:variables
}
