/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Feyzullah Ertan
 */
public class education extends javax.swing.JFrame {

    /**
     * Creates new form education
     */
    public education() {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        prim = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sec = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        high = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        high_gra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        high_dip = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        univ = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        univ_gra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        univ_dip = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Education");

        jLabel1.setText("Primary school name :");

        prim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primActionPerformed(evt);
            }
        });

        jLabel2.setText("Secondary school name :");

        jLabel3.setText("High school name :");

        high.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highActionPerformed(evt);
            }
        });

        jLabel4.setText("The year of graduation ");

        high_gra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        high_gra.setText("DD/MM/YYYY");
        high_gra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                high_graMouseClicked(evt);
            }
        });
        high_gra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                high_graActionPerformed(evt);
            }
        });

        jLabel5.setText("Your high school diploma");

        high_dip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                high_dipActionPerformed(evt);
            }
        });

        jButton1.setText("Attach");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Your university name");

        univ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                univActionPerformed(evt);
            }
        });

        jLabel8.setText("Year of graduation ");

        univ_gra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        univ_gra.setText("DD/MM/YYYY");
        univ_gra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                univ_graMouseClicked(evt);
            }
        });
        univ_gra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                univ_graActionPerformed(evt);
            }
        });

        jLabel9.setText("University Diploma");

        jButton2.setText("Attach");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(prim)
                                .addComponent(sec)
                                .addComponent(high)
                                .addComponent(high_gra)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(high_dip, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton1))
                                .addComponent(univ)
                                .addComponent(univ_gra))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(univ_dip, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(prim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(high, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(high_gra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(high_dip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(univ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(univ_gra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(univ_dip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void highActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_highActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // FileChooser paleti ile istenilen lise diplomasını eklememizi sağlar.
        // Seçilen file getAbsolutePath ile yolunu gösterir.
        //setText komutu ile adı yazılır.
        JFileChooser choice= new JFileChooser();
        choice.showOpenDialog(null);
        File t= choice.getSelectedFile();
        String filename= t.getAbsolutePath();
        high_dip.setText(filename);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void univ_graActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_univ_graActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_univ_graActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // FileChooser paleti ile istenilen üniversite diploması eklememizi sağlar.
        // Seçilen file getAbsolutePath ile yolunu gösterir.
        //setText komutu ile adı yazılır.
         JFileChooser choice= new JFileChooser();
        choice.showOpenDialog(null);
        File d= choice.getSelectedFile();
        String filename= d.getAbsolutePath();
        univ_dip.setText(filename);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       // Cancel tuşuyla pencereyi görünmez hale getirir.
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        /* Try Catch yapılarını kullanmamızın sebebi eğer bu kaydedeceğimiz dosya yok ise program hala çalışmaya devam edicek
         ve hata vericekti */
        
        /* Örneğin eğer ben bir şey yazmasaydım program hata vericekti ama hala çalışacaktı. Bunun önüne geçildi.*/
        // beta.txt not defterine yazdırmak için tasarlandı.
        // write komutuyla not defterine getText komutuyla aldıklarımız yazıldı.
       
        String prim_school= prim.getText().toString();
        String sec_school= sec.getText().toString();
        String high_school= high.getText().toString();
        String hy_gra= high_gra.getText().toString();
        String hdip= high_dip.getText().toString();
        String university = univ.getText().toString();
        String uy_gra= univ_gra.getText().toString();
        String univ_dip=this.univ_dip.getText().toString();
        
        try {
             FileWriter writer = new FileWriter("beta.txt",true);
            
           writer.write(prim_school);
           writer.write(sec_school);
           writer.write(high_school);
           writer.write(hy_gra);
           writer.write(hdip);
           writer.write(university);
           writer.write(uy_gra);
           writer.write(univ_dip);
           writer.close();
           JOptionPane.showMessageDialog(rootPane, "Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
        // Yazılanları yukarda aynı şekilde .html dosyasına kaydeder.
         try {
             FileWriter writer = new FileWriter("ceta.html",true);
           writer.write("<div><h3>Education</h3><p><ul>"+
                   "<li>Primary school name : "+prim_school+"</li>"+"<li>Secondary school name : "+sec_school+"</li>"+"<li>High school name : "+high_school+"</li>"+
                   "<li>The year of graduation : "+hy_gra+"</li>"+"<li>Your high school diploma : "+hdip+"</li>"+"<li>Your university name : "+
                  university+"</li>"+"<li>Year of graduation  : "+uy_gra+"</li>"+
                   "<li>University Diploma : "+univ_dip+"</li>"+"</p></div>");
           
           writer.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
        
        
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed
  // MouseEvent ve Action bildingleyerek yazılmasını sağladım.
    private void primActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primActionPerformed

    private void high_graActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_high_graActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_high_graActionPerformed

    private void high_graMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_high_graMouseClicked
        // TODO add your handling code here:
        high_gra.setText("");
    }//GEN-LAST:event_high_graMouseClicked

    private void univ_graMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_univ_graMouseClicked
        // TODO add your handling code here:
        univ_gra.setText("");
    }//GEN-LAST:event_univ_graMouseClicked

    private void high_dipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_high_dipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_high_dipActionPerformed

    private void univActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_univActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_univActionPerformed

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
            java.util.logging.Logger.getLogger(education.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(education.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(education.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(education.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new education().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField high;
    private javax.swing.JTextField high_dip;
    private javax.swing.JTextField high_gra;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField prim;
    private javax.swing.JTextField sec;
    private javax.swing.JTextField univ;
    private javax.swing.JTextField univ_dip;
    private javax.swing.JTextField univ_gra;
    // End of variables declaration//GEN-END:variables
}
