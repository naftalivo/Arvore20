/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seie.visao;

import seie.crud.AgenciaCRUD;
import seie.crud.Validacao;
import seie.crud.gerenteCRUD;
import seie.modelo.Agencia;
import seie.modelo.Gerente;

/**
 *
 * @author HelpDesk-Seie
 */
public class CadastroDeAgencias extends javax.swing.JFrame {

    /**
     * Creates new form CadastroDeCaixa
     */
    Validacao v = new Validacao();
    Gerente modGerente = new Gerente();
    AgenciaCRUD crudAgencia = new AgenciaCRUD();

    public CadastroDeAgencias(Gerente g) {
        initComponents();
        this.modGerente = g;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfNomeAgencia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taEndereco = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        ftfContacto = new javax.swing.JFormattedTextField();
        lbStatus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro das Agencias");
        setResizable(false);

        pnlPrincipal.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da Agencia", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome da Agencia:");

        tfNomeAgencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfNomeAgencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNomeAgenciaFocusGained(evt);
            }
        });
        tfNomeAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeAgenciaActionPerformed(evt);
            }
        });
        tfNomeAgencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNomeAgenciaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Endereço:");

        taEndereco.setColumns(20);
        taEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        taEndereco.setRows(5);
        taEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                taEnderecoFocusGained(evt);
            }
        });
        taEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                taEnderecoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(taEndereco);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Contaco:");

        try {
            ftfContacto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+ 258 - #########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfContacto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ftfContacto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ftfContactoFocusGained(evt);
            }
        });

        lbStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(255, 0, 0));
        lbStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbStatus.setText("Certifique se os dados Digitados estão Correctos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNomeAgencia)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(ftfContacto))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomeAgencia, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(ftfContacto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbStatus)
                .addContainerGap())
        );

        pnlPrincipal.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Opções", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Cancelar");

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pnlPrincipal.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(pnlPrincipal, java.awt.BorderLayout.LINE_END);

        setSize(new java.awt.Dimension(498, 393));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeAgenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeAgenciaKeyTyped
        v.valicaoNome(evt, tfNomeAgencia);
    }//GEN-LAST:event_tfNomeAgenciaKeyTyped

    private void taEnderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taEnderecoKeyTyped
        v.valicaoUtilizador(evt, taEndereco);
    }//GEN-LAST:event_taEnderecoKeyTyped

    private void tfNomeAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeAgenciaActionPerformed

    private void taEnderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_taEnderecoFocusGained
        lbStatus.setText("");
    }//GEN-LAST:event_taEnderecoFocusGained

    private void ftfContactoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftfContactoFocusGained
        lbStatus.setText("");
    }//GEN-LAST:event_ftfContactoFocusGained

    private void tfNomeAgenciaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeAgenciaFocusGained
        lbStatus.setText("");
    }//GEN-LAST:event_tfNomeAgenciaFocusGained

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        salvar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    public void salvar() {
        String nomeAg = tfNomeAgencia.getText();
        String contacto = ftfContacto.getText();
        String endereco = taEndereco.getText();

        if ((nomeAg.length() > 0) && (contacto.length() > 8) && (endereco.length() > 0)) {
            if (this.modGerente != null) {
                Agencia modAgencia = new Agencia(nomeAg, contacto, endereco,this.modGerente);
                if(crudAgencia.salvar(modAgencia)){
                    dispose();
                    new MenuGerente(modAgencia, this.modGerente).setVisible(true);
                }
            } else {
                lbStatus.setText("O Gerente ainda não foi cadastrado.. cadastre-o Primeiro");
            }
        } else {
            lbStatus.setText("Certifique se os dados Digitados estão Correctos");
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
            java.util.logging.Logger.getLogger(CadastroDeAgencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeAgencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeAgencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeAgencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeAgencias(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField ftfContacto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextArea taEndereco;
    private javax.swing.JTextField tfNomeAgencia;
    // End of variables declaration//GEN-END:variables
}