/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.principal;

import com.sun.security.ntlm.Client;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import problema2.Cliente;
import problema2.ClientePessoaFisica;
import problema2.ClientePessoaJuridica;
import problema2.ContaCorrente;

/**
 *
 * @author daniel
 */
public class Principal extends javax.swing.JFrame {
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_tipoPessoa = new javax.swing.ButtonGroup();
        tp_fastBank = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lb_nome = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ftt_telFixo = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        fft_telCelular = new javax.swing.JFormattedTextField();
        rb_CPF = new javax.swing.JRadioButton();
        rb_CNPJ = new javax.swing.JRadioButton();
        lb_cpf_cnpj = new javax.swing.JLabel();
        ftt_cpf_cnpj = new javax.swing.JFormattedTextField();
        bt_cadastrar = new javax.swing.JButton();
        ftt_servidor = new javax.swing.JFormattedTextField();
        lb_servidor = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cb_clientes = new javax.swing.JComboBox<>();
        lb_numero = new javax.swing.JLabel();
        lb_cliente = new javax.swing.JLabel();
        lb_agencia = new javax.swing.JLabel();
        bt_cadastrarConta = new javax.swing.JButton();
        ftt_numero = new javax.swing.JFormattedTextField();
        ftt_agencia = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        cb_contas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_nome.setText("Nome");

        jLabel2.setText("Telefone Fixo");

        try {
            ftt_telFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Telefone Celular");

        try {
            fft_telCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        bg_tipoPessoa.add(rb_CPF);
        rb_CPF.setSelected(true);
        rb_CPF.setText("Pessoa Fisica");
        rb_CPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_CPFMouseClicked(evt);
            }
        });

        bg_tipoPessoa.add(rb_CNPJ);
        rb_CNPJ.setText("Pessoa Juridica");
        rb_CNPJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_CNPJMouseClicked(evt);
            }
        });

        lb_cpf_cnpj.setText("CPF");

        try {
            ftt_cpf_cnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        bt_cadastrar.setText("Cadastrar");
        bt_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastrarActionPerformed(evt);
            }
        });

        ftt_servidor.setEditable(false);
        try {
            ftt_servidor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftt_servidor.setToolTipText("");

        lb_servidor.setText("Servidor JMS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_servidor)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lb_cpf_cnpj)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(85, 85, 85)
                            .addComponent(jLabel3))
                        .addComponent(lb_nome)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ftt_telFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(fft_telCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(rb_CPF)
                            .addGap(81, 81, 81)
                            .addComponent(rb_CNPJ))
                        .addComponent(tf_nome)
                        .addComponent(ftt_cpf_cnpj)
                        .addComponent(bt_cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ftt_servidor)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lb_nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_CPF)
                    .addComponent(rb_CNPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_cpf_cnpj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftt_cpf_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftt_telFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fft_telCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_servidor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ftt_servidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_cadastrar)
                .addGap(38, 38, 38))
        );

        tp_fastBank.addTab("Cliente", jPanel1);

        lb_numero.setText("Numero");

        lb_cliente.setText("Cliente");

        lb_agencia.setText("Agencia");

        bt_cadastrarConta.setText("Cadastrar Conta");
        bt_cadastrarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastrarContaActionPerformed(evt);
            }
        });

        try {
            ftt_numero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            ftt_agencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_agencia)
                    .addComponent(lb_numero)
                    .addComponent(lb_cliente)
                    .addComponent(cb_clientes, 0, 313, Short.MAX_VALUE)
                    .addComponent(ftt_numero)
                    .addComponent(ftt_agencia)
                    .addComponent(bt_cadastrarConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lb_numero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lb_agencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftt_agencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(bt_cadastrarConta)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        tp_fastBank.addTab("Conta Corrente", jPanel3);

        jLabel1.setText("Conta Corrente");

        jLabel4.setText("Tipo operação");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(cb_contas, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_contas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(275, Short.MAX_VALUE))
        );

        tp_fastBank.addTab("Acompanhamento", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp_fastBank)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp_fastBank)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_CPFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_CPFMouseClicked
        // TODO add your handling code here:
        try {
            ftt_cpf_cnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        lb_cpf_cnpj.setText("CPF");
        ftt_servidor.setEditable(false);
    }//GEN-LAST:event_rb_CPFMouseClicked

    private void rb_CNPJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_CNPJMouseClicked
        // TODO add your handling code here:
        try {
            ftt_cpf_cnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        lb_cpf_cnpj.setText("CNPJ");
        ftt_servidor.setEditable(true);
    }//GEN-LAST:event_rb_CNPJMouseClicked

    private void bt_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastrarActionPerformed
        // TODO add your handling code here:
        Cliente c;
        if (rb_CPF.isSelected()) {
            c = new ClientePessoaFisica(tf_nome.getText(), fft_telCelular.getText(), ftt_telFixo.getText(), ftt_cpf_cnpj.getText());
        } else {
            c = new ClientePessoaJuridica(tf_nome.getText(), fft_telCelular.getText(), ftt_telFixo.getText(), ftt_cpf_cnpj.getText(), ftt_servidor.getText());
        }
        cb_clientes.addItem(c);
        JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
    }//GEN-LAST:event_bt_cadastrarActionPerformed

    private void bt_cadastrarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastrarContaActionPerformed
        // TODO add your handling code here:
        ContaCorrente cc;
        cc = new ContaCorrente(Integer.parseInt(ftt_numero.getText()),Integer.parseInt(ftt_agencia.getText()));
        
        Cliente c = (Cliente) cb_clientes.getSelectedItem();
        c.addConta(cc);
        
        cb_contas.addItem(cc);
        JOptionPane.showMessageDialog(this, "Conta corrente cadastrada com sucesso!");
    }//GEN-LAST:event_bt_cadastrarContaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_tipoPessoa;
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JButton bt_cadastrarConta;
    private javax.swing.JComboBox<Cliente> cb_clientes;
    private javax.swing.JComboBox<ContaCorrente> cb_contas;
    private javax.swing.JFormattedTextField fft_telCelular;
    private javax.swing.JFormattedTextField ftt_agencia;
    private javax.swing.JFormattedTextField ftt_cpf_cnpj;
    private javax.swing.JFormattedTextField ftt_numero;
    private javax.swing.JFormattedTextField ftt_servidor;
    private javax.swing.JFormattedTextField ftt_telFixo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb_agencia;
    private javax.swing.JLabel lb_cliente;
    private javax.swing.JLabel lb_cpf_cnpj;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_numero;
    private javax.swing.JLabel lb_servidor;
    private javax.swing.JRadioButton rb_CNPJ;
    private javax.swing.JRadioButton rb_CPF;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTabbedPane tp_fastBank;
    // End of variables declaration//GEN-END:variables
}
