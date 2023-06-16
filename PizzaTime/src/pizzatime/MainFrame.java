/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pizzatime;

import java.io.FileOutputStream;
import java.io.IOException;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
/**
 *
 * @author FCbar
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

   // boutton quitter, event mouth release
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtquantite = new javax.swing.JSpinner();
        txtJunior = new javax.swing.JRadioButton();
        txtSenior = new javax.swing.JRadioButton();
        txtGrande = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCommand = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzatime/PizzaLogo.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzatime/PizzaLogo.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PIZZATIME");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 880, -1));

        jPanel3.setBackground(new java.awt.Color(250, 239, 10));

        jLabel3.setBackground(new java.awt.Color(204, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("QUITTER");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(537, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 640));

        jLabel5.setBackground(new java.awt.Color(250, 239, 10));
        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Choisir votre Pizza");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 210, 30));

        txtquantite.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtquantite.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(txtquantite, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 130, -1));

        txtJunior.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(txtJunior);
        txtJunior.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtJunior.setForeground(new java.awt.Color(0, 0, 0));
        txtJunior.setText("Junior");
        txtJunior.setOpaque(true);
        txtJunior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJuniorActionPerformed(evt);
            }
        });
        jPanel1.add(txtJunior, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 150, -1));

        txtSenior.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(txtSenior);
        txtSenior.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtSenior.setForeground(new java.awt.Color(0, 0, 0));
        txtSenior.setText("Senior");
        txtSenior.setOpaque(true);
        txtSenior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeniorActionPerformed(evt);
            }
        });
        jPanel1.add(txtSenior, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        txtGrande.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(txtGrande);
        txtGrande.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtGrande.setForeground(new java.awt.Color(0, 0, 0));
        txtGrande.setText("Grande");
        txtGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrandeActionPerformed(evt);
            }
        });
        jPanel1.add(txtGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 204));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Quantité");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        txtCommand.setColumns(20);
        txtCommand.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtCommand.setRows(5);
        txtCommand.setOpaque(false);
        jScrollPane1.setViewportView(txtCommand);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 450, 410));

        jButton1.setBackground(new java.awt.Color(153, 153, 5));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("TO PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 130, 30));

        jButton2.setBackground(new java.awt.Color(204, 204, 0));
        jButton2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("AJOUTER");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 130, 30));

        jButton3.setBackground(new java.awt.Color(204, 204, 0));
        jButton3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("RESET");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1000, 583));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
        
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseReleased

    private void txtJuniorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJuniorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJuniorActionPerformed

    private void txtSeniorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeniorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeniorActionPerformed

    private void txtGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrandeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrandeActionPerformed

    
    // Ajout pizza junior
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
     
        
       double prixPizzaJunior = 7.80;
       double prixPizzaSenior = 15.50;
       double prixPizzaGrande = 25.25;
     
      double qte = Double.parseDouble(txtquantite.getValue().toString());
       
        if (txtJunior.isSelected()) {
            double resultJunior = prixPizzaJunior * qte;
            txtCommand.setText(txtCommand.getText()+ "\t     TICKET DE CAISSE \n ");
            txtCommand.setText(txtCommand.getText()+ "\t _______________________\n" );
            txtCommand.setText(txtCommand.getText()+ "\t \n" );
            txtCommand.setText(txtCommand.getText()+ "\t BIENVENU CHEZ PIZZATIME ! \n" );
            txtCommand.setText(txtCommand.getText()+ "\t "+ qte + " Pizza Junior *" +prixPizzaJunior +" = "+ resultJunior + " Euros\n" );
            txtCommand.setText(txtCommand.getText()+ "\t \n" );
            txtCommand.setText(txtCommand.getText()+ "\t MERCI ! \n" );
          
        }else if (txtSenior.isSelected()) {
            double resultSenior = prixPizzaSenior * qte;
            txtCommand.setText(txtCommand.getText()+ "\t     TICKET DE CAISSE \n ");
            txtCommand.setText(txtCommand.getText()+ "\t _______________________\n" );
            txtCommand.setText(txtCommand.getText()+ "\t \n" );
            txtCommand.setText(txtCommand.getText()+ "\t BIENVENU CHEZ PIZZATIME ! \n" );
            txtCommand.setText(txtCommand.getText()+ "\t "+ qte + " Pizza Senior *" +prixPizzaSenior +" = "+ resultSenior + " Euros\n" );
            txtCommand.setText(txtCommand.getText()+ "\t \n" );
            txtCommand.setText(txtCommand.getText()+ "\t MERCI ! \n" );
        } else if (txtGrande.isSelected()) {
            double resultGrande = prixPizzaGrande * qte;
            txtCommand.setText(txtCommand.getText()+ "\t     TICKET DE CAISSE \n ");
            txtCommand.setText(txtCommand.getText()+ "\t _______________________\n" );
            txtCommand.setText(txtCommand.getText()+ "\t \n" );
            txtCommand.setText(txtCommand.getText()+ "\t BIENVENU CHEZ PIZZATIME ! \n" );
            txtCommand.setText(txtCommand.getText()+ "\t "+ qte + " Pizza Grande *" +prixPizzaGrande +" = "+ resultGrande + " Euros\n" );
            txtCommand.setText(txtCommand.getText()+ "\t \n" );
            txtCommand.setText(txtCommand.getText()+ "\t MERCI ! \n" );
        } else {
             txtCommand.setText(txtCommand.getText()+ "\t     TICKET DE CAISSE \n ");
            txtCommand.setText(txtCommand.getText()+ "\t _______________________\n" );
            txtCommand.setText(txtCommand.getText()+ "\t \n" );
            txtCommand.setText(txtCommand.getText()+ "\t BIENVENU CHEZ PIZZATIME ! \n" );
            txtCommand.setText(txtCommand.getText()+ "\t Selectionner une pizza ! \n" );
            txtCommand.setText(txtCommand.getText()+ "\t MERCI ! \n" );
           
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    // Actualisation 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    txtCommand.setText(null);
    txtquantite.setValue(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    
    // Write PDF 
    
    public void toPDF(){
        Document document = new Document(PageSize.A4);
    try {
      PdfWriter.getInstance(document,
          new FileOutputStream("C:/Users/FCbar/Downloads/test.pdf"));
      document.open();
      document.add(new Paragraph(txtCommand.getText()));
    } catch (DocumentException de) {
      de.printStackTrace();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
    document.close();
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        toPDF();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtCommand;
    private javax.swing.JRadioButton txtGrande;
    private javax.swing.JRadioButton txtJunior;
    private javax.swing.JRadioButton txtSenior;
    private javax.swing.JSpinner txtquantite;
    // End of variables declaration//GEN-END:variables
}
