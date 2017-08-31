package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Rodrigo
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnEntrada = new javax.swing.JPanel();
        btRegistraEntrada = new javax.swing.JButton();
        lbEntrada = new javax.swing.JLabel();
        pnDadosEntrada = new javax.swing.JPanel();
        lbPlacaEntrada = new javax.swing.JLabel();
        txfPlacaEntrada = new javax.swing.JFormattedTextField();
        lbHoraEntrada = new javax.swing.JLabel();
        spHoraEntrada = new javax.swing.JSpinner();
        spMinutoEntrada = new javax.swing.JSpinner();
        lbParkingControl = new javax.swing.JLabel();
        pnSaida = new javax.swing.JPanel();
        btRegistrarSaida1 = new javax.swing.JButton();
        lbSaida = new javax.swing.JLabel();
        pnDadosSaida = new javax.swing.JPanel();
        lbPlacaSaida1 = new javax.swing.JLabel();
        txfPlacaSaida = new javax.swing.JFormattedTextField();
        lbHoraSaida1 = new javax.swing.JLabel();
        spHoraSaida1 = new javax.swing.JSpinner();
        spMinutoSaida1 = new javax.swing.JSpinner();
        pnCobranca = new javax.swing.JPanel();
        btCobrarSaida = new javax.swing.JButton();
        lbCobranca = new javax.swing.JLabel();
        pnDadosRegistro = new javax.swing.JPanel();
        lbPlacaLabel = new javax.swing.JLabel();
        lbPlacaRegistrada = new javax.swing.JLabel();
        lbEntradaLabel = new javax.swing.JLabel();
        lbEntradaRegistrada = new javax.swing.JLabel();
        lbSaidaLabel = new javax.swing.JLabel();
        lbSaidaRegistrada = new javax.swing.JLabel();
        lbValorLabel = new javax.swing.JLabel();
        lbValorACobrar = new javax.swing.JLabel();
        pnAtributosCobranca = new javax.swing.JPanel();
        lbPeriodoInicial = new javax.swing.JLabel();
        spPeriodoInicial = new javax.swing.JSpinner();
        lbTolerancia = new javax.swing.JLabel();
        spTolerancia = new javax.swing.JSpinner();
        lbPeriodoAdicional = new javax.swing.JLabel();
        spPeriodoAdicional = new javax.swing.JSpinner();
        lbValorInicial = new javax.swing.JLabel();
        txfValorInicial = new javax.swing.JFormattedTextField();
        lbValorAdicional = new javax.swing.JLabel();
        txfValorAdicional = new javax.swing.JFormattedTextField();
        pnGanhos = new javax.swing.JPanel();
        lbGanhos = new javax.swing.JLabel();
        txGanhos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ParkingControl");

        pnEntrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnEntrada.setLayout(new java.awt.BorderLayout(10, 10));

        btRegistraEntrada.setText("Registrar Entrada");
        pnEntrada.add(btRegistraEntrada, java.awt.BorderLayout.PAGE_END);

        lbEntrada.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbEntrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEntrada.setText("ENTRADA");
        lbEntrada.setToolTipText("");
        pnEntrada.add(lbEntrada, java.awt.BorderLayout.PAGE_START);

        pnDadosEntrada.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10);
        flowLayout1.setAlignOnBaseline(true);
        pnDadosEntrada.setLayout(flowLayout1);

        lbPlacaEntrada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbPlacaEntrada.setText("Placa:");
        pnDadosEntrada.add(lbPlacaEntrada);

        txfPlacaEntrada.setColumns(7);
        try {
            txfPlacaEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnDadosEntrada.add(txfPlacaEntrada);

        lbHoraEntrada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbHoraEntrada.setText("Hora");
        pnDadosEntrada.add(lbHoraEntrada);

        spHoraEntrada.setPreferredSize(new java.awt.Dimension(40, 20));
        pnDadosEntrada.add(spHoraEntrada);

        spMinutoEntrada.setPreferredSize(new java.awt.Dimension(40, 20));
        pnDadosEntrada.add(spMinutoEntrada);

        pnEntrada.add(pnDadosEntrada, java.awt.BorderLayout.CENTER);

        lbParkingControl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbParkingControl.setText("PARKING CONTROL");

        pnSaida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnSaida.setLayout(new java.awt.BorderLayout(10, 10));

        btRegistrarSaida1.setText("Registrar Saída");
        btRegistrarSaida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarSaida1ActionPerformed(evt);
            }
        });
        pnSaida.add(btRegistrarSaida1, java.awt.BorderLayout.PAGE_END);

        lbSaida.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbSaida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSaida.setText("SAÍDA");
        lbSaida.setToolTipText("");
        pnSaida.add(lbSaida, java.awt.BorderLayout.PAGE_START);

        pnDadosSaida.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        java.awt.FlowLayout flowLayout3 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10);
        flowLayout3.setAlignOnBaseline(true);
        pnDadosSaida.setLayout(flowLayout3);

        lbPlacaSaida1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbPlacaSaida1.setText("Placa:");
        pnDadosSaida.add(lbPlacaSaida1);

        txfPlacaSaida.setColumns(7);
        try {
            txfPlacaSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnDadosSaida.add(txfPlacaSaida);

        lbHoraSaida1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbHoraSaida1.setText("Hora");
        pnDadosSaida.add(lbHoraSaida1);

        spHoraSaida1.setPreferredSize(new java.awt.Dimension(40, 20));
        pnDadosSaida.add(spHoraSaida1);

        spMinutoSaida1.setPreferredSize(new java.awt.Dimension(40, 20));
        pnDadosSaida.add(spMinutoSaida1);

        pnSaida.add(pnDadosSaida, java.awt.BorderLayout.CENTER);

        pnCobranca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnCobranca.setLayout(new java.awt.BorderLayout(12, 10));

        btCobrarSaida.setText("Registrar Cobrança");
        btCobrarSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCobrarSaidaActionPerformed(evt);
            }
        });
        pnCobranca.add(btCobrarSaida, java.awt.BorderLayout.PAGE_END);

        lbCobranca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbCobranca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCobranca.setText("COBRANÇA");
        lbCobranca.setToolTipText("");
        pnCobranca.add(lbCobranca, java.awt.BorderLayout.PAGE_START);

        pnDadosRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnDadosRegistro.setMinimumSize(new java.awt.Dimension(90, 88));
        pnDadosRegistro.setPreferredSize(new java.awt.Dimension(90, 88));
        pnDadosRegistro.setLayout(new java.awt.GridLayout(4, 2, 10, 10));

        lbPlacaLabel.setText("Placa: ");
        pnDadosRegistro.add(lbPlacaLabel);

        lbPlacaRegistrada.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbPlacaRegistrada.setText("XXX-XXXX");
        pnDadosRegistro.add(lbPlacaRegistrada);

        lbEntradaLabel.setText("Entrada:");
        pnDadosRegistro.add(lbEntradaLabel);

        lbEntradaRegistrada.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbEntradaRegistrada.setText("HH:MM");
        pnDadosRegistro.add(lbEntradaRegistrada);

        lbSaidaLabel.setText("Saída");
        pnDadosRegistro.add(lbSaidaLabel);

        lbSaidaRegistrada.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbSaidaRegistrada.setText("HH:MM");
        pnDadosRegistro.add(lbSaidaRegistrada);

        lbValorLabel.setText("Valor(R$):");
        pnDadosRegistro.add(lbValorLabel);

        lbValorACobrar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbValorACobrar.setText("0,00");
        pnDadosRegistro.add(lbValorACobrar);

        pnCobranca.add(pnDadosRegistro, java.awt.BorderLayout.CENTER);

        pnAtributosCobranca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnAtributosCobranca.setLayout(new java.awt.GridLayout(5, 2, 5, 5));

        lbPeriodoInicial.setText("Período inicial:");
        lbPeriodoInicial.setToolTipText("Período em que será cobrado uma vez, passando dele, será adicionado ao custo o valor do \"Período Adicional\"");
        pnAtributosCobranca.add(lbPeriodoInicial);

        spPeriodoInicial.setModel(new javax.swing.SpinnerNumberModel(0, 0, 24, 1));
        spPeriodoInicial.setToolTipText("Horas");
        pnAtributosCobranca.add(spPeriodoInicial);

        lbTolerancia.setText("Tolerância:");
        lbTolerancia.setToolTipText("Permanência em que não será cobrado");
        pnAtributosCobranca.add(lbTolerancia);

        spTolerancia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1440, 1));
        spTolerancia.setToolTipText("Minutos");
        pnAtributosCobranca.add(spTolerancia);

        lbPeriodoAdicional.setText("Período adicional:");
        lbPeriodoAdicional.setToolTipText("Período em que será cobrado adicionalmente");
        pnAtributosCobranca.add(lbPeriodoAdicional);

        spPeriodoAdicional.setModel(new javax.swing.SpinnerNumberModel(0, 0, 24, 1));
        spPeriodoAdicional.setToolTipText("Horas");
        pnAtributosCobranca.add(spPeriodoAdicional);

        lbValorInicial.setText("Valor inicial:");
        lbValorInicial.setToolTipText("Valor cobrado pelo período inicial");
        pnAtributosCobranca.add(lbValorInicial);

        txfValorInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.##"))));
        txfValorInicial.setToolTipText("Valor cobrado pelo período inicial");
        txfValorInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfValorInicialActionPerformed(evt);
            }
        });
        pnAtributosCobranca.add(txfValorInicial);

        lbValorAdicional.setText("Valor adicional:");
        lbValorAdicional.setToolTipText("Valor cobrado pelo período adicional");
        pnAtributosCobranca.add(lbValorAdicional);

        txfValorAdicional.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.##"))));
        txfValorAdicional.setToolTipText("Valor cobrado pelo período adicional");
        pnAtributosCobranca.add(txfValorAdicional);

        pnCobranca.add(pnAtributosCobranca, java.awt.BorderLayout.LINE_START);

        lbGanhos.setText("Ganhos:");

        txGanhos.setEditable(false);
        txGanhos.setColumns(10);
        txGanhos.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txGanhos.setText("0,00");
        txGanhos.setToolTipText("Exibição dos rendimentos do estacionamento");
        txGanhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txGanhosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbGanhos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txGanhos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(pnSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnGanhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(lbParkingControl, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(pnCobranca, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnGanhos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbParkingControl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txGanhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbGanhos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnCobranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRegistrarSaida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarSaida1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btRegistrarSaida1ActionPerformed

    private void btCobrarSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCobrarSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCobrarSaidaActionPerformed

    private void txGanhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txGanhosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txGanhosActionPerformed

    private void txfValorInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfValorInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfValorInicialActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCobrarSaida;
    private javax.swing.JButton btRegistraEntrada;
    private javax.swing.JButton btRegistrarSaida1;
    private javax.swing.JLabel lbCobranca;
    private javax.swing.JLabel lbEntrada;
    private javax.swing.JLabel lbEntradaLabel;
    private javax.swing.JLabel lbEntradaRegistrada;
    private javax.swing.JLabel lbGanhos;
    private javax.swing.JLabel lbHoraEntrada;
    private javax.swing.JLabel lbHoraSaida1;
    private javax.swing.JLabel lbParkingControl;
    private javax.swing.JLabel lbPeriodoAdicional;
    private javax.swing.JLabel lbPeriodoInicial;
    private javax.swing.JLabel lbPlacaEntrada;
    private javax.swing.JLabel lbPlacaLabel;
    private javax.swing.JLabel lbPlacaRegistrada;
    private javax.swing.JLabel lbPlacaSaida1;
    private javax.swing.JLabel lbSaida;
    private javax.swing.JLabel lbSaidaLabel;
    private javax.swing.JLabel lbSaidaRegistrada;
    private javax.swing.JLabel lbTolerancia;
    private javax.swing.JLabel lbValorACobrar;
    private javax.swing.JLabel lbValorAdicional;
    private javax.swing.JLabel lbValorInicial;
    private javax.swing.JLabel lbValorLabel;
    private javax.swing.JPanel pnAtributosCobranca;
    private javax.swing.JPanel pnCobranca;
    private javax.swing.JPanel pnDadosEntrada;
    private javax.swing.JPanel pnDadosRegistro;
    private javax.swing.JPanel pnDadosSaida;
    private javax.swing.JPanel pnEntrada;
    private javax.swing.JPanel pnGanhos;
    private javax.swing.JPanel pnSaida;
    private javax.swing.JSpinner spHoraEntrada;
    private javax.swing.JSpinner spHoraSaida1;
    private javax.swing.JSpinner spMinutoEntrada;
    private javax.swing.JSpinner spMinutoSaida1;
    private javax.swing.JSpinner spPeriodoAdicional;
    private javax.swing.JSpinner spPeriodoInicial;
    private javax.swing.JSpinner spTolerancia;
    private javax.swing.JTextField txGanhos;
    private javax.swing.JFormattedTextField txfPlacaEntrada;
    private javax.swing.JFormattedTextField txfPlacaSaida;
    private javax.swing.JFormattedTextField txfValorAdicional;
    private javax.swing.JFormattedTextField txfValorInicial;
    // End of variables declaration//GEN-END:variables
}
