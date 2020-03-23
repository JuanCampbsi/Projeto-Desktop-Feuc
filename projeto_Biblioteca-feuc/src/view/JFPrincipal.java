package view;

public class JFPrincipal extends javax.swing.JFrame {
   
    public JFPrincipal() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMCliente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMLivro = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMEmprestimo = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/imagens/antique-library-302930.jpg"))); // NOI18N

        jMenu2.setText("Cliente");

        jMCliente.setText("Editar Clientes");
        jMCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMCliente);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Livro");

        jMLivro.setText("Editar Livros");
        jMLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLivroActionPerformed(evt);
            }
        });
        jMenu3.add(jMLivro);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Empréstimo");

        jMEmprestimo.setText("Editar Emprestimos");
        jMEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEmprestimoActionPerformed(evt);
            }
        });
        jMenu6.add(jMEmprestimo);

        jMenuBar1.add(jMenu6);

        jMenu4.setText("Sair");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLivroActionPerformed
        // Abre a janela
        new JFLivro(this).setVisible(true);        
        this.setEnabled(false);
        
        
    }//GEN-LAST:event_jMLivroActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMClienteActionPerformed
         // Abre a janela
       // this(Esta janela) - Passa a instancia da tela atual como parâmetro p/ o contrutor
       new JFCliente(this).setVisible(true);       
       // Desativa funcionalidades da tabela principal
       this.setEnabled(false);
        
    }//GEN-LAST:event_jMClienteActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEmprestimoActionPerformed
        // Abre a janela
        new JFEmprestimo(this).setVisible(true);        
        this.setEnabled(false);
        
    }//GEN-LAST:event_jMEmprestimoActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMCliente;
    private javax.swing.JMenuItem jMEmprestimo;
    private javax.swing.JMenuItem jMLivro;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
