<<<<<<< HEAD
=======

>>>>>>> 52734018c72c2592bba192cdd7d0bbaae10d5d6b
package br.com.infox.telas;
import java.sql.*;
import br.com.infox.dal.ModuloConexao;

import java.sql.*;
import br.com.infox.dal.ModuloConexao;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Flavia
 */
public class TelaLogin extends javax.swing.JFrame {

<<<<<<< HEAD
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void logar() {
        String sql = "Select * from tbusuarios where login =? and senha =?";
        try {
            //preparando para consultar no bd em função do q foi digitado nas cxs de texto
            //O ? é substituido pelo conteúdo das variáveis.
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtUsuario.getText());
            String captura = new String(txtSenha.getPassword());
            pst.setString(2, captura);

            // executando a query
            rs = pst.executeQuery();

            //estrutura de decisão caso exista usuario e senha correspondente
            if (rs.next()) {

                // Verificando no bd se a pessoal tem perfil admin
                String perfil = rs.getString(6);
                //System.out.println(perfil);
                String usuario = rs.getString(2);

                //estrutura de decisão para ver se vai liberar as funcionalidades
                if (perfil.equals("admin")) {
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    TelaPrincipal.menRel.setEnabled(true);
                    TelaPrincipal.menCadUsu.setEnabled(true);
                    TelaPrincipal.lblUsuario.setText(usuario);
                    TelaPrincipal.lblUsuario.setForeground(Color.BLUE);

                    //fechando a tela q estava aberta
                    this.dispose();
                    // fechando a conexão
                    //conexao.close();

                } else {

                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    TelaPrincipal.lblUsuario.setText(usuario);
                    //fechando a tela q estava aberta
                    this.dispose();
                    // fechando a conexão
                    //conexao.close();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválido");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public TelaLogin() {
        initComponents();
        conexao = ModuloConexao.conector();
        if (conexao != null) {
            lblstatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/dbok.png")));

        } else {
            lblstatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/dberror.png")));

        }

=======
       Connection conexao = null;
        PreparedStatement pst=null;
        ResultSet rs = null;
        
    public TelaLogin() {
        initComponents();
        conexao = ModuloConexao.conector();
        if (conexao != null){
            lblstatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/dbok.png")));
            
        } else{
            lblstatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/dberror.png")));
            
        }    
                     
>>>>>>> 52734018c72c2592bba192cdd7d0bbaae10d5d6b
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
<<<<<<< HEAD
        txtSenha = new javax.swing.JPasswordField();
=======
        jPasswordField1 = new javax.swing.JPasswordField();
>>>>>>> 52734018c72c2592bba192cdd7d0bbaae10d5d6b
        lblstatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("X System - Login");
        setPreferredSize(new java.awt.Dimension(355, 165));
        setResizable(false);

        jLabel1.setText("Usuário");

        jLabel2.setText("Senha");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblstatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/dberror.png"))); // NOI18N

        lblstatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/dberror.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(btnLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(16, 16, 16)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario)
                            .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
<<<<<<< HEAD
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> 52734018c72c2592bba192cdd7d0bbaae10d5d6b
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogin)
                    .addComponent(lblstatus))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        //acionando o metodo logar
        logar();
    }//GEN-LAST:event_btnLoginActionPerformed

=======
>>>>>>> 52734018c72c2592bba192cdd7d0bbaae10d5d6b
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
<<<<<<< HEAD
    private javax.swing.JLabel lblstatus;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
=======
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblstatus;
>>>>>>> 52734018c72c2592bba192cdd7d0bbaae10d5d6b
    // End of variables declaration//GEN-END:variables
}
