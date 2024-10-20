/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas_proyecto;

import java.time.LocalDate;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Admin_Vacunas extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Vacunas
     */
    public Admin_Vacunas() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bt_regis = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ComB_tdP = new javax.swing.JComboBox<>();
        txt_dosis = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_marca = new javax.swing.JTextField();
        txt_docE = new javax.swing.JFormattedTextField();
        txt_fecha = new javax.swing.JFormattedTextField();
        txt_docP = new javax.swing.JFormattedTextField();
        txt_lote = new javax.swing.JFormattedTextField();
        ComB_tdE = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txt_eps = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1360, 730));

        jPanel1.setBackground(new java.awt.Color(56, 182, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Administrar Vacunas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("INGRESE DOCUMENTO DEL PACIENTE:");

        BtnRegresar.setBackground(new java.awt.Color(56, 182, 255));
        BtnRegresar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        BtnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("INGRESE DOCUMENTO DEL EMPLEADO:");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("INGRESE LA FECHA:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("INGRESE EL NUMERO DE LA DOSIS:");

        bt_regis.setBackground(new java.awt.Color(51, 51, 255));
        bt_regis.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        bt_regis.setForeground(new java.awt.Color(255, 255, 255));
        bt_regis.setText("Registrar");
        bt_regis.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas_proyecto/Icon_Aguja.png"))); // NOI18N
        bt_regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_regisActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("INGRESE TIPO DE DOCUMENTO DEL EMPLEADO:");

        ComB_tdP.setBackground(new java.awt.Color(204, 204, 204));
        ComB_tdP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "TI", "PP" }));

        txt_dosis.setBackground(new java.awt.Color(204, 204, 204));
        txt_dosis.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txt_dosis.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_dosis.setText("1");
        txt_dosis.setToolTipText("");
        txt_dosis.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_dosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dosisActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("INGRESE EL LOTE DE LA VACUNA");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("INGRESE TIPO DE DOCUMENTO DEL PACIENTE:");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("INGRESE LA MARCA DE LA VACUNA:");

        txt_marca.setBackground(new java.awt.Color(204, 204, 204));
        txt_marca.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_marca.setText("Pfizer");
        txt_marca.setToolTipText("");
        txt_marca.setActionCommand("null");
        txt_marca.setAlignmentX(40.0F);
        txt_marca.setAlignmentY(40.0F);
        txt_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_marcaActionPerformed(evt);
            }
        });

        txt_docE.setEditable(false);
        txt_docE.setBackground(new java.awt.Color(204, 204, 204));
        txt_docE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txt_docE.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_docE.setText("123445");
        txt_docE.setToolTipText("");
        txt_docE.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_docE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_docEActionPerformed(evt);
            }
        });

        txt_fecha.setEditable(false);
        txt_fecha.setBackground(new java.awt.Color(204, 204, 204));
        txt_fecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/dd"))));
        txt_fecha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_fecha.setText(String.valueOf(LocalDate.now()));
        txt_fecha.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txt_fecha.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_fecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_fechaMouseExited(evt);
            }
        });
        txt_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaActionPerformed(evt);
            }
        });

        txt_docP.setBackground(new java.awt.Color(204, 204, 204));
        txt_docP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txt_docP.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_docP.setText("1234432");
        txt_docP.setToolTipText("");
        txt_docP.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_docP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_docPActionPerformed(evt);
            }
        });

        txt_lote.setBackground(new java.awt.Color(204, 204, 204));
        txt_lote.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txt_lote.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_lote.setText("2001");
        txt_lote.setToolTipText("");
        txt_lote.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_lote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_loteActionPerformed(evt);
            }
        });

        ComB_tdE.setBackground(new java.awt.Color(204, 204, 204));
        ComB_tdE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "TI", "PP" }));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("INGRESE LA EPS");

        txt_eps.setBackground(new java.awt.Color(204, 204, 204));
        txt_eps.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_eps.setText("Sanitas");
        txt_eps.setToolTipText("");
        txt_eps.setActionCommand("null");
        txt_eps.setAlignmentX(40.0F);
        txt_eps.setAlignmentY(40.0F);
        txt_eps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_epsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(bt_regis, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addComponent(txt_dosis, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_docE, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(txt_docP, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lote, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(ComB_tdP, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11)
                    .addComponent(txt_eps, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(113, 113, 113)
                    .addComponent(ComB_tdE, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(658, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComB_tdP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_docE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_docP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dosis, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lote, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_regis, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_eps, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(ComB_tdE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(397, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed

    }//GEN-LAST:event_BtnRegresarActionPerformed

    public JButton getBtnRegresar() {
        return BtnRegresar;
    }

    public void setBtnRegresar(JButton BtnRegresar) {
        this.BtnRegresar = BtnRegresar;
    }

    public JComboBox<String> getComB_tdE() {
        return ComB_tdE;
    }

    public void setComB_tdE(JComboBox<String> ComB_tdE) {
        this.ComB_tdE = ComB_tdE;
    }

    public JComboBox<String> getComB_tdP() {
        return ComB_tdP;
    }

    public void setComB_tdP(JComboBox<String> ComB_tdP) {
        this.ComB_tdP = ComB_tdP;
    }

    public JButton getBt_regis() {
        return bt_regis;
    }

    public void setBt_regis(JButton bt_regis) {
        this.bt_regis = bt_regis;
    }

    public JFormattedTextField getTxt_docE() {
        return txt_docE;
    }

    public void setTxt_docE(JFormattedTextField txt_docE) {
        this.txt_docE = txt_docE;
    }

    public JFormattedTextField getTxt_docP() {
        return txt_docP;
    }

    public void setTxt_docP(JFormattedTextField txt_docP) {
        this.txt_docP = txt_docP;
    }

    public JFormattedTextField getTxt_dosis() {
        return txt_dosis;
    }

    public void setTxt_dosis(JFormattedTextField txt_dosis) {
        this.txt_dosis = txt_dosis;
    }

    public JFormattedTextField getTxt_fecha() {
        return txt_fecha;
    }

    public void setTxt_fecha(JFormattedTextField txt_fecha) {
        this.txt_fecha = txt_fecha;
    }

    public JFormattedTextField getTxt_lote() {
        return txt_lote;
    }

    public void setTxt_lote(JFormattedTextField txt_lote) {
        this.txt_lote = txt_lote;
    }

    public JTextField getTxt_marca() {
        return txt_marca;
    }

    public void setTxt_marca(JTextField txt_marca) {
        this.txt_marca = txt_marca;
    }

    private void bt_regisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_regisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_regisActionPerformed

    private void txt_dosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dosisActionPerformed

    private void txt_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_marcaActionPerformed

    private void txt_docEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_docEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_docEActionPerformed

    private void txt_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaActionPerformed

    private void txt_docPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_docPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_docPActionPerformed

    private void txt_loteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_loteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_loteActionPerformed

    private void txt_fechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_fechaMouseExited

    }//GEN-LAST:event_txt_fechaMouseExited

    private void txt_epsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_epsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_epsActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Vacunas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Admin_Vacunas().setVisible(true);
      
            }
        });
    }

    public JTextField getTxt_eps() {
        return txt_eps;
    }

    public void setTxt_eps(JTextField txt_eps) {
        this.txt_eps = txt_eps;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JComboBox<String> ComB_tdE;
    private javax.swing.JComboBox<String> ComB_tdP;
    private javax.swing.JButton bt_regis;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField txt_docE;
    private javax.swing.JFormattedTextField txt_docP;
    private javax.swing.JFormattedTextField txt_dosis;
    private javax.swing.JTextField txt_eps;
    private static javax.swing.JFormattedTextField txt_fecha;
    private javax.swing.JFormattedTextField txt_lote;
    private javax.swing.JTextField txt_marca;
    // End of variables declaration//GEN-END:variables
}
