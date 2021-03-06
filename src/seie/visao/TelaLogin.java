/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seie.visao;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import seie.crud.AgenciaCRUD;
import seie.crud.ClienteCRUD;
import seie.crud.loginCRUD;
import seie.modelo.Agencia;
import seie.modelo.Cliente;
import seie.modelo.Login;

/**
 *
 * @author HelpDesk-Seie
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    static TelaLogin t = new TelaLogin();
    static List<Login> logins = new ArrayList<>();
    static List<Cliente> clientes = new ArrayList<>();
    List<Agencia> agencias = new ArrayList<>();
    static loginCRUD crudLogin = new loginCRUD();
    AgenciaCRUD crudAgencias = new AgenciaCRUD();
    ClienteCRUD crudCliente = new ClienteCRUD();

    public TelaLogin() {
        initComponents();

    }

    public TelaLogin(List<Login> logins) {
        initComponents();

        this.logins = logins;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        pfSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lbStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText(" Nome de Utilizador:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Senha:");

        tfNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNomeFocusGained(evt);
            }
        });
        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNomeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNomeKeyReleased(evt);
            }
        });

        pfSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pfSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pfSenhaFocusGained(evt);
            }
        });
        pfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pfSenhaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pfSenhaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pfSenhaKeyTyped(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lbStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(204, 51, 0));
        lbStatus.setText("Username ou Senha Inválidos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfNome)
                        .addComponent(pfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(484, 232));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void pfSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_pfSenhaKeyPressed

    private void tfNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyReleased
//        lbStatus.setText("");
    }//GEN-LAST:event_tfNomeKeyReleased

    private void tfNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_tfNomeKeyPressed

    private void tfNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeFocusGained
        lbStatus.setText("");
    }//GEN-LAST:event_tfNomeFocusGained

    private void pfSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfSenhaFocusGained
        lbStatus.setText("");
    }//GEN-LAST:event_pfSenhaFocusGained

    private void pfSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfSenhaKeyReleased

    }//GEN-LAST:event_pfSenhaKeyReleased

    private void pfSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfSenhaKeyTyped
//        lbStatus.setText("");
    }//GEN-LAST:event_pfSenhaKeyTyped

    public void login() {
        Cliente loginCli = autenticarCliente(tfNome.getText(), new String(pfSenha.getPassword()));
        clientes = crudCliente.clientes();
        
        boolean haAgencia = false;

        if (loginCli != null) { //Login do Cliente
            if(loginCli.getPinAcesso() == Integer.parseInt(new String(pfSenha.getPassword()))){
                dispose();
                new MenuCliente(loginCli).setVisible(true);
                
            } else {
                lbStatus.setText("Senha Inválida");
            }
        } else {

            Login login = autenticar(tfNome.getText(), new String(pfSenha.getPassword()),
                    lbStatus);
            if (login != null) {
                
                if (login.getCaixa() != null) { //Login Para Usuarios Caixa
                    dispose();
                    new MenuCaixa(login.getCaixa().getAgencia(), login.getCaixa()).setVisible(true);

                } else if (login.getGerente() != null) { //Login para usuários Gerentes
                    agencias = crudAgencias.agencias();
                    if (!agencias.isEmpty()) {
                        for (Agencia agencia : agencias) {
                            if (agencia.getGerente() == login.getGerente()) {
                                haAgencia = true;
                                break;
                            }
                        }
                    }

                    if (haAgencia) {
                        new MenuGerente().setVisible(true);
                    } else {
                        dispose();
                        JOptionPane.showMessageDialog(null, "Por Ser o Primeiro Login no Sistema,"
                                + " Cadastre a Agencia!", "Sem Agencias", JOptionPane.WARNING_MESSAGE);
                        new CadastroDeAgencias(login.getGerente()).setVisible(true);
                    }
                }
            }

        }

    }

    public Login autenticar(String nomeLogin, String senha, JLabel status) {

        if (logins.isEmpty()) {
            status.setText("User name ou Senha Inválidos");
            return null;
        } else {
            for (Login l : logins) {
                if (l.getNome().equals(nomeLogin) && l.getSenha().equals(senha)) {
                    return l;
                } else if (l.getNome().equals(nomeLogin)) {
                    status.setText("Senha Inválida");
                    return null;
                }
            }
            status.setText("User name ou Senha Inválidos");
            return null;
        }

    }

    public Cliente autenticarCliente(String nomeUtilizador, String pin) {

        if (clientes.isEmpty()) {
            return null;
        } else {
            for (Cliente cliente : clientes) {
                if (cliente.getUtilizador().equals(nomeUtilizador) && cliente.getPinAcesso() == Integer.parseInt(pin)) {
                    return cliente;
                } else if (cliente.getUtilizador().equals(nomeUtilizador)) {
                    return cliente;
                }
            }
            return null;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                t = new TelaLogin();
                t.setVisible(true);

                logins = crudLogin.logins();
                if (logins.isEmpty()) {
                    t.dispose();
                    new CadastroDeGerente().setVisible(true);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
