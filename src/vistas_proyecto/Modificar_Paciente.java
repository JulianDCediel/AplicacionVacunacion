/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas_proyecto;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Modificar_Paciente extends javax.swing.JFrame {

    /**
     * Creates new form Modificar_Paciente
     */
    public Modificar_Paciente() {
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
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_corr = new javax.swing.JTextField();
        BtnRegresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_sang = new javax.swing.JTextField();
        bt_mod = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_nom = new javax.swing.JTextField();
        combox_td = new javax.swing.JComboBox<>();
        txt_fec = new javax.swing.JFormattedTextField();
        txt_doc = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_ape = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bt_eli = new javax.swing.JButton();
        txt_eps = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ComBox_RC3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1350, 730));

        jPanel1.setBackground(new java.awt.Color(56, 182, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Modificar datos del");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("paciente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(380, 380, 380))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(366, 366, 366))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(12, 12, 12))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("INGRESE LA FECHA DE NACIMIENTO:");

        txt_corr.setBackground(new java.awt.Color(204, 204, 204));
        txt_corr.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_corr.setText("secretariadesalud@gmail.com");
        txt_corr.setToolTipText("");
        txt_corr.setActionCommand("null");
        txt_corr.setAlignmentX(40.0F);
        txt_corr.setAlignmentY(40.0F);
        txt_corr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_corrActionPerformed(evt);
            }
        });

        BtnRegresar.setBackground(new java.awt.Color(56, 182, 255));
        BtnRegresar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        BtnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegresar.setText("REGRESAR");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("INGRESE EL CORREO:");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("INGRESE EL NUMERO DE DOCUMENTO:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("INGRESE EL TIPO DE DOCUMENTO:");

        txt_sang.setBackground(new java.awt.Color(204, 204, 204));
        txt_sang.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_sang.setText("A+");
        txt_sang.setToolTipText("");
        txt_sang.setActionCommand("null");
        txt_sang.setAlignmentX(40.0F);
        txt_sang.setAlignmentY(40.0F);
        txt_sang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sangActionPerformed(evt);
            }
        });

        bt_mod.setBackground(new java.awt.Color(51, 51, 255));
        bt_mod.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        bt_mod.setForeground(new java.awt.Color(255, 255, 255));
        bt_mod.setText("MODIFICAR");
        bt_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("INGRESE EL NOMBRE:");

        txt_nom.setBackground(new java.awt.Color(204, 204, 204));
        txt_nom.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_nom.setText("Maria");
        txt_nom.setToolTipText("");
        txt_nom.setActionCommand("null");
        txt_nom.setAlignmentX(40.0F);
        txt_nom.setAlignmentY(40.0F);
        txt_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomActionPerformed(evt);
            }
        });

        combox_td.setBackground(new java.awt.Color(204, 204, 204));
        combox_td.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "TI", "PP" }));

        txt_fec.setBackground(new java.awt.Color(204, 204, 204));
        txt_fec.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        txt_fec.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_fec.setText("10/05/2003");
        txt_fec.setToolTipText("");
        txt_fec.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txt_fec.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_fec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fecActionPerformed(evt);
            }
        });

        txt_doc.setBackground(new java.awt.Color(204, 204, 204));
        txt_doc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txt_doc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_doc.setText("43251");
        txt_doc.setToolTipText("");
        txt_doc.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_docActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("INGRESE EL TIPO DE SANGRE:");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("INGRESE LOS APELLIDOS:");

        txt_ape.setBackground(new java.awt.Color(204, 204, 204));
        txt_ape.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txt_ape.setText("Jiara Martins");
        txt_ape.setToolTipText("JOLLL");
        txt_ape.setActionCommand("null");
        txt_ape.setAlignmentX(40.0F);
        txt_ape.setAlignmentY(40.0F);
        txt_ape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("INGRESE EL REGIMEN CONTRIBUTIVO:");

        bt_eli.setBackground(new java.awt.Color(203, 32, 32));
        bt_eli.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        bt_eli.setForeground(new java.awt.Color(255, 255, 255));
        bt_eli.setText("ELIMINAR");
        bt_eli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliActionPerformed(evt);
            }
        });

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

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("INGRESE LA EPS:");

        ComBox_RC3.setBackground(new java.awt.Color(204, 204, 204));
        ComBox_RC3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Subsidiario", "Contributivo" }));
        ComBox_RC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComBox_RC3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txt_corr, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(combox_td, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txt_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txt_ape, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txt_fec, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(txt_sang, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComBox_RC3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(186, 186, 186))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(565, 565, 565)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_eps, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_eli, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(bt_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ape, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fec, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_corr, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(combox_td, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ComBox_RC3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sang, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txt_eps, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_eli, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_corrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_corrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_corrActionPerformed

    public JButton getBtnRegresar() {
        return BtnRegresar;
    }

    public void setBtnRegresar(JButton BtnRegresar) {
        this.BtnRegresar = BtnRegresar;
    }

    public JButton getBt_eli() {
        return bt_eli;
    }

    public void setBt_eli(JButton bt_eli) {
        this.bt_eli = bt_eli;
    }

    public JButton getBt_mod() {
        return bt_mod;
    }

    public void setBt_mod(JButton bt_mod) {
        this.bt_mod = bt_mod;
    }

    public JComboBox<String> getCombox_td() {
        return combox_td;
    }

    public void setCombox_td(JComboBox<String> combox_td) {
        this.combox_td = combox_td;
    }

    public JTextField getTxt_ape() {
        return txt_ape;
    }

    public void setTxt_ape(JTextField txt_ape) {
        this.txt_ape = txt_ape;
    }

    public JTextField getTxt_corr() {
        return txt_corr;
    }

    public void setTxt_corr(JTextField txt_corr) {
        this.txt_corr = txt_corr;
    }

    public JFormattedTextField getTxt_doc() {
        return txt_doc;
    }

    public void setTxt_doc(JFormattedTextField txt_doc) {
        this.txt_doc = txt_doc;
    }

    public JTextField getTxt_eps() {
        return txt_eps;
    }

    public void setTxt_eps(JTextField txt_eps) {
        this.txt_eps = txt_eps;
    }

    public JFormattedTextField getTxt_fec() {
        return txt_fec;
    }

    public void setTxt_fec(JFormattedTextField txt_fec) {
        this.txt_fec = txt_fec;
    }

    public JTextField getTxt_nom() {
        return txt_nom;
    }

    public void setTxt_nom(JTextField txt_nom) {
        this.txt_nom = txt_nom;
    }

    public JComboBox<String> getComBox_RC3() {
        return ComBox_RC3;
    }

    public void setComBox_RC3(JComboBox<String> ComBox_RC3) {
        this.ComBox_RC3 = ComBox_RC3;
    }

 

    public JTextField getTxt_sang() {
        return txt_sang;
    }

    public void setTxt_sang(JTextField txt_sang) {
        this.txt_sang = txt_sang;
    }

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed

    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void txt_sangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sangActionPerformed

    private void bt_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_modActionPerformed

    private void txt_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomActionPerformed

    private void txt_fecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fecActionPerformed

    private void txt_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_docActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_docActionPerformed

    private void txt_apeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apeActionPerformed

    private void bt_eliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_eliActionPerformed

    private void txt_epsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_epsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_epsActionPerformed

    private void ComBox_RC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComBox_RC3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComBox_RC3ActionPerformed

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
            java.util.logging.Logger.getLogger(Modificar_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JComboBox<String> ComBox_RC;
    private javax.swing.JComboBox<String> ComBox_RC1;
    private javax.swing.JComboBox<String> ComBox_RC2;
    private javax.swing.JComboBox<String> ComBox_RC3;
    private javax.swing.JButton bt_eli;
    private javax.swing.JButton bt_mod;
    private javax.swing.JComboBox<String> combox_td;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField txt_ape;
    private javax.swing.JTextField txt_corr;
    private javax.swing.JFormattedTextField txt_doc;
    private javax.swing.JTextField txt_eps;
    private javax.swing.JFormattedTextField txt_fec;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_sang;
    // End of variables declaration//GEN-END:variables
}
