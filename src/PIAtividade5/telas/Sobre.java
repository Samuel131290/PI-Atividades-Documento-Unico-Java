package PIAtividade5.telas;
import java.awt.event.KeyEvent;


/**
* Classe que representa um JFrame para exibir informações sobre o aplicativo.
* Inclui métodos para inicializar os componentes da interface gráfica e gerar acessibilidade.
*/
public class Sobre extends javax.swing.JFrame
{
    /**
    * Construtor da classe Sobre.
    * Inicializa os componentes da interface gráfica e gera acessibilidade.
    */
    public Sobre() 
    {
        initComponents();
        gerarAcessbilidade();
    }

    /**
    * Associa a tecla de atalho "Alt + V" ao botão de voltar.
    * Este método permite que o botão seja acionado pressionando a tecla de atalho especificada.
    */
    public void gerarAcessbilidade() 
    {
        voltarBtn.setMnemonic(KeyEvent.VK_V);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NovoCadastro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        voltarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txSobre = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        NovoCadastro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NovoCadastro.setText("DOCUMENTO ÚNICO");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("“Conheça o Documento Único: o único software capaz de unir todos seus documentos em um!“");

        voltarBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        voltarBtn.setText("Voltar");
        voltarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        txSobre.setBackground(new java.awt.Color(239, 239, 239));
        txSobre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txSobre.setText("___________________________________________________________________________________________________________\n\nO Documento Único é um software que tem como foco unir todos os documentos de uma pessoa \nfísica em um único ambiente, criando um novo documento virtual. \n\nAtualmente, para realizar um cadastro em um site de compras, criar uma conta bancaria, por exemplo,\nexige que você cadastre todos os principais documentos, endereço, além de um login e uma senha, \ndemandando muito tempo do usuário. Com Documento Único (DU), será possível fazer o mesmo tipo \nde cadastro em segundos, de forma segura e com apenas uma numeração.\n___________________________________________________________________________________________________________\n\nPara quem é destinado o DU?\n- O Documento Único é destinado para todos aqueles que querem realizar seus cadastros em qualquer\ntipo de site ou plataforma de forma menos burocrática, mais rápida e eficiente.\n___________________________________________________________________________________________________________\n\nRequisitos:\n•   Cadastramento de novos usuários;\n•   Inserção de dados de documentos;\n•   Criação de um número de documento único, com base nos dados informados.\n___________________________________________________________________________________________________________\n\nRequisitos (Não-Funcionais):\n•   Windows 7 ou superior (64-Requerido);\n•   Criptografia de dados e autenticação de duas etapas;\n•   O software deverá operar em qualquer plataforma Desktop;\n•   Conexão com internet.\n___________________________________________________________________________________________________________\n\nRegras de Negócios:\nO DU só será gerado se todas as informações inseridas estiverem corretas, bem como a confirmação\nde Email e Senha.\n___________________________________________________________________________________________________________\n\nTipo de Licença:\nFreeware.\n___________________________________________________________________________________________________________\n");
        jScrollPane1.setViewportView(txSobre);
        txSobre.setEditable(false); // Torna o texto não editavel ao usuário.

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(NovoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(NovoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        TelaInicial telaIicial = new TelaInicial();
        telaIicial.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarBtnActionPerformed
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

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NovoCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txSobre;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
