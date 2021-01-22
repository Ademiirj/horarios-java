package views;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HomeView extends javax.swing.JFrame {

    DateTimeFormatter FORMATO_HORAS = DateTimeFormatter.ofPattern("HH:mm").withResolverStyle(ResolverStyle.STRICT);

    public HomeView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMarcacoesFeitas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHoraExtra = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblAtraso = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnLimpaMarcacao = new javax.swing.JButton();
        btnLimpaHorario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHorarioDeTrabalho = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnMarcarHorario = new javax.swing.JButton();
        btnCadastraHorario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEntrada = new javax.swing.JFormattedTextField();
        txtSaida = new javax.swing.JFormattedTextField();
        lblHorasExtra = new javax.swing.JLabel();
        lblAtrasos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblMarcacoesFeitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Entrada", "Saida"
            }
        ));
        jScrollPane1.setViewportView(tblMarcacoesFeitas);

        jLabel2.setText("Marcações");

        tblHoraExtra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Horario 1", "Horario 2"
            }
        ));
        jScrollPane3.setViewportView(tblHoraExtra);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(56, 227, 15));
        jLabel5.setText("Positivas");

        tblAtraso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Horario 1", "Horario 2"
            }
        ));
        jScrollPane4.setViewportView(tblAtraso);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(232, 15, 15));
        jLabel6.setText("Negativas");

        btnLimpaMarcacao.setText("Limpar Marcações");
        btnLimpaMarcacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaMarcacaoActionPerformed(evt);
            }
        });

        btnLimpaHorario.setText("Limpar Horários");
        btnLimpaHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaHorarioActionPerformed(evt);
            }
        });

        tblHorarioDeTrabalho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Entrada", "Saida"
            }
        ));
        tblHorarioDeTrabalho.setEnabled(false);
        jScrollPane2.setViewportView(tblHorarioDeTrabalho);

        jLabel1.setText("Horarios de trabalho");

        btnMarcarHorario.setText("Marcar horário");
        btnMarcarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarHorarioActionPerformed(evt);
            }
        });

        btnCadastraHorario.setText("Cadastrar horário de trabalho");
        btnCadastraHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraHorarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Horario de entrada");

        jLabel4.setText("Horario de saida");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel7.setText("Horas em haver:");

        try {
            txtEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtEntrada.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        try {
            txtSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtSaida.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        lblHorasExtra.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblHorasExtra.setForeground(new java.awt.Color(56, 227, 15));
        lblHorasExtra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHorasExtra.setText("Positivas");

        lblAtrasos.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblAtrasos.setForeground(new java.awt.Color(232, 15, 15));
        lblAtrasos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAtrasos.setText("Negativas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(92, 92, 92)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(343, 343, 343)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastraHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabel7)
                                        .addGap(37, 37, 37))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblHorasExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblAtrasos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMarcarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpaHorario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpaMarcacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(jLabel4))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadastraHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btnLimpaHorario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpaMarcacao))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnMarcarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(lblHorasExtra)
                    .addComponent(lblAtrasos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastraHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraHorarioActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblHorarioDeTrabalho.getModel();
        try {
            String[] objHoras = new String[2];

            objHoras[0] = txtEntrada.getText();
            objHoras[1] = txtSaida.getText();

            LocalTime.parse(txtEntrada.getText(), FORMATO_HORAS);
            LocalTime.parse(txtSaida.getText(), FORMATO_HORAS);

            model.addRow(objHoras);
            comparaHorarios();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O valor digitado não esta no formato correto, utilize o padrão 'HH:mm' com horarios de 00 - 23");

        }

        txtEntrada.setText("");
        txtSaida.setText("");
    }//GEN-LAST:event_btnCadastraHorarioActionPerformed

    private void btnMarcarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarHorarioActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblMarcacoesFeitas.getModel();
        if (model.getRowCount() < 3) {
            try {
                String[] objHoras = new String[2];

                objHoras[0] = txtEntrada.getText();
                objHoras[1] = txtSaida.getText();

                LocalTime.parse(txtEntrada.getText(), FORMATO_HORAS);
                LocalTime.parse(txtSaida.getText(), FORMATO_HORAS);

                model.addRow(objHoras);
                comparaHorarios();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "O valor digitado não esta no formato correto, utilize o padrão 'HH:mm' com horarios de 00 - 23");

            }

            txtEntrada.setText("");
            txtSaida.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Não é possivel cadastrar mais de 3 horários!");
        }
    }//GEN-LAST:event_btnMarcarHorarioActionPerformed

    private void btnLimpaHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaHorarioActionPerformed
        limpaHorarios();
        limpaTabelaResultados();
    }//GEN-LAST:event_btnLimpaHorarioActionPerformed

    private void btnLimpaMarcacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaMarcacaoActionPerformed
        limpaMarcacoes();
        limpaTabelaResultados();
    }//GEN-LAST:event_btnLimpaMarcacaoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastraHorario;
    private javax.swing.JButton btnLimpaHorario;
    private javax.swing.JButton btnLimpaMarcacao;
    private javax.swing.JButton btnMarcarHorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblAtrasos;
    private javax.swing.JLabel lblHorasExtra;
    private javax.swing.JTable tblAtraso;
    private javax.swing.JTable tblHoraExtra;
    private javax.swing.JTable tblHorarioDeTrabalho;
    private javax.swing.JTable tblMarcacoesFeitas;
    private javax.swing.JFormattedTextField txtEntrada;
    private javax.swing.JFormattedTextField txtSaida;
    // End of variables declaration//GEN-END:variables
    private void comparaHorarios() {
        limpaTabelaResultados();
        try {
            DefaultTableModel tabelaMarcacoes = (DefaultTableModel) tblMarcacoesFeitas.getModel();
            DefaultTableModel tabelaHorarios = (DefaultTableModel) tblHorarioDeTrabalho.getModel();
            DefaultTableModel tabelaHoraExtra = (DefaultTableModel) tblHoraExtra.getModel();
            DefaultTableModel tabelaAtrasos = (DefaultTableModel) tblAtraso.getModel();

            if ((tabelaMarcacoes.getRowCount() > 0) && (tabelaHorarios.getRowCount() > 0)) {
                limpaTabelaResultados();
                String entradaTrabalhoString;
                String saidaTrabalhoString;
                String entradaMarcacaoString;
                String saidaMarcacaoString;

                for (int i = 0; i < tabelaMarcacoes.getRowCount(); i++) {
                    for (int j = 0; j < tabelaHorarios.getRowCount(); j++) {
                        entradaTrabalhoString = tblHorarioDeTrabalho.getValueAt(j, 0).toString();
                        saidaTrabalhoString = tblHorarioDeTrabalho.getValueAt(j, 1).toString();

                        LocalTime entradaTrabalho = LocalTime.parse(entradaTrabalhoString, FORMATO_HORAS);
                        LocalTime saidaTrabalho = LocalTime.parse(saidaTrabalhoString, FORMATO_HORAS);

                        entradaMarcacaoString = tabelaMarcacoes.getValueAt(i, 0).toString();
                        saidaMarcacaoString = tabelaMarcacoes.getValueAt(i, 1).toString();

                        LocalTime entradaMarcacao = LocalTime.parse(entradaMarcacaoString, FORMATO_HORAS);
                        LocalTime saidaMarcacao = LocalTime.parse(saidaMarcacaoString, FORMATO_HORAS);

                        if ((entradaMarcacao.isBefore(entradaTrabalho)) && (!entradaMarcacao.equals(entradaTrabalho))) {

                            String[] objHoras = new String[2];
                            objHoras[0] = entradaTrabalho.toString();
                            objHoras[1] = entradaMarcacao.toString();
                            tabelaHoraExtra.addRow(objHoras);
                        }
                        if ((entradaMarcacao.isAfter(entradaTrabalho)) && (!entradaMarcacao.equals(entradaTrabalho))) {

                            String[] objHoras = new String[2];
                            objHoras[0] = entradaMarcacao.toString();
                            objHoras[1] = entradaTrabalho.toString();
                            tabelaAtrasos.addRow(objHoras);
                        }
                        if ((saidaMarcacao.isAfter(saidaTrabalho)) && (!saidaMarcacao.equals(saidaTrabalho))) {
                            try {
                                String proximaEntradaString = tblHorarioDeTrabalho.getValueAt((j + 1), 0).toString();
                                LocalTime proximaEntrada = LocalTime.parse(proximaEntradaString, FORMATO_HORAS);
                                if (saidaMarcacao.isAfter(proximaEntrada)) {

                                    String[] objHoras = new String[2];
                                    objHoras[0] = saidaTrabalho.toString();
                                    objHoras[1] = proximaEntrada.toString();
                                    tabelaHoraExtra.addRow(objHoras);
                                } else {

                                    String[] objHoras = new String[2];
                                    objHoras[0] = saidaTrabalho.toString();
                                    objHoras[1] = saidaMarcacao.toString();
                                    tabelaHoraExtra.addRow(objHoras);
                                }

                            } catch (Exception e) {
                                System.out.println(e);

                                String[] objHoras = new String[2];
                                objHoras[0] = saidaTrabalho.toString();
                                objHoras[1] = saidaMarcacao.toString();
                                tabelaHoraExtra.addRow(objHoras);
                            }
                        }
                        if ((saidaMarcacao.isBefore(saidaTrabalho)) && (!saidaMarcacao.equals(saidaTrabalho))) {

                            String[] objHoras = new String[2];
                            objHoras[0] = saidaMarcacao.toString();
                            objHoras[1] = saidaTrabalho.toString();
                            tabelaAtrasos.addRow(objHoras);
                        }
                    }

                }

                DefaultTableModel model = (DefaultTableModel) tblHoraExtra.getModel();
                String valor1String;
                String valor2String;
                LocalTime valor1;
                LocalTime valor2;
                for (int i = 0; i < (tblHoraExtra.getRowCount()); i++) {
                    valor1String = tblHoraExtra.getValueAt(i, 0).toString();
                    valor2String = tblHoraExtra.getValueAt(i, 1).toString();

                    valor1 = LocalTime.parse(valor1String, FORMATO_HORAS);
                    valor2 = LocalTime.parse(valor2String, FORMATO_HORAS);

                    System.out.println(valor1 + " " + valor2 + " = " + valor1.compareTo(valor2));
                    if (valor1.compareTo(valor2) == 1) {
                        model.removeRow(i);
                    }

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado, por segurança, vamos limpar todas as tabelas");
            limpaTabelaResultados();
            limpaHorarios();
            limpaMarcacoes();
        }
        atualizaLabels();
    }

    private void limpaTabelaResultados() {
        DefaultTableModel model = (DefaultTableModel) tblHoraExtra.getModel();
        if (tblHoraExtra.getRowCount() > 0) {
            int i = 0;
            do {
                model.removeRow(i);
            } while (i < model.getRowCount());

        }

        DefaultTableModel model2 = (DefaultTableModel) tblAtraso.getModel();
        if (tblAtraso.getRowCount() > 0) {
            int j = 0;
            do {
                model2.removeRow(j);
            } while (j < model2.getRowCount());
        }
    }

    private void limpaMarcacoes() {
        DefaultTableModel model = (DefaultTableModel) tblMarcacoesFeitas.getModel();
        if (tblMarcacoesFeitas.getRowCount() > 0) {
            int i = 0;
            do {
                model.removeRow(i);
            } while (i < model.getRowCount());
        }
    }

    private void limpaHorarios() {
        DefaultTableModel model = (DefaultTableModel) tblHorarioDeTrabalho.getModel();
        if (tblHorarioDeTrabalho.getRowCount() > 0) {
            int i = 0;
            do {
                model.removeRow(i);
            } while (i < model.getRowCount());
        }
    }

    private void atualizaLabels() {
        DefaultTableModel model = (DefaultTableModel) tblHoraExtra.getModel();
        String valor1String;
        String valor2String;
        LocalTime valor1;
        LocalTime valor2;
        for (int i = 0; i < (tblHoraExtra.getRowCount()); i++) {
            valor1String = tblHoraExtra.getValueAt(i, 0).toString();
            valor2String = tblHoraExtra.getValueAt(i, 1).toString();

            valor1 = LocalTime.parse(valor1String, FORMATO_HORAS);
            valor2 = LocalTime.parse(valor2String, FORMATO_HORAS);
            

            System.out.println(valor1 + " " + valor2 + " = " + valor2.minusHours(valor1.getHour()).minusMinutes(valor1.getMinute()));
        }
    }
}
