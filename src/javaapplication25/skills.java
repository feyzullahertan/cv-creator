/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.io.FileWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Feyzullah Ertan
 */
public class skills extends javax.swing.JFrame {

    /**
     * Creates new form skills
     */
    public skills() {
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

        jLabel12 = new javax.swing.JLabel();
        talent = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        computer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        charity = new javax.swing.JTextField();
        skill_cancel = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lang = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(496, 520));
        setSize(new java.awt.Dimension(496, 518));
        getContentPane().setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Skills and Interests");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(143, 81, 173, 22);

        talent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talentActionPerformed(evt);
            }
        });
        getContentPane().add(talent);
        talent.setBounds(300, 200, 177, 24);

        jLabel1.setText("Do you have any particular talent ? :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 200, 190, 20);

        jLabel2.setText("Have you ever receive a price ? : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 230, 180, 20);

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        getContentPane().add(price);
        price.setBounds(300, 230, 177, 24);

        jLabel3.setText("Do you have any computer skill ? :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 260, 180, 20);

        computer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerActionPerformed(evt);
            }
        });
        getContentPane().add(computer);
        computer.setBounds(300, 260, 177, 24);

        jLabel4.setText("What are your passions ? :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 300, 150, 20);
        getContentPane().add(passion);
        passion.setBounds(300, 300, 177, 24);

        jLabel5.setText("Do you participe to any charity action ? :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 330, 200, 20);
        getContentPane().add(charity);
        charity.setBounds(300, 330, 177, 24);

        skill_cancel.setText("Cancel");
        skill_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skill_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(skill_cancel);
        skill_cancel.setBounds(282, 421, 69, 32);

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(373, 421, 58, 32);

        jLabel6.setText("How many languages do you speak");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 360, 190, 20);
        getContentPane().add(lang);
        lang.setBounds(300, 360, 177, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Doldurabilmemiz için bilding edildi.
    
    private void talentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_talentActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void computerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_computerActionPerformed

    private void skill_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skill_cancelActionPerformed
        // "Cancel" basıldığında pencere görünmez hale gelir.
        setVisible(false);
    }//GEN-LAST:event_skill_cancelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /* Try Catch yapılarını kullanmamızın sebebi eğer bu kaydedeceğimiz dosya yok ise program hala çalışmaya devam edicek
         ve hata vericekti */
        
        /* Örneğin eğer ben bir şey yazmasaydım program hata vericekti ama hala çalışacaktı. Bunun önüne geçildi.*/
        // beta.txt not defterine yazdırmak için tasarlandı.
        // write komutuyla not defterine getText komutuyla aldıklarımız yazıldı.
        
        String tal= talent.getText().toString();
        String prix=price.getText().toString();
        String comp=computer.getText().toString();
        String pass= passion.getText().toString();
        String chari= charity.getText().toString();
        String speak= lang.getText().toString();
        try {
             FileWriter writer = new FileWriter("beta.txt",true);
            
           writer.write(tal);
           writer.write(prix);
           writer.write(comp);
           writer.write(pass);
           writer.write(chari);
           writer.write(speak);
           
         
           JOptionPane.showMessageDialog(rootPane, "Success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
        // Yazılanları yukarda aynı şekilde .html dosyasına kaydeder.
         try {
             FileWriter writer = new FileWriter("ceta.html",true);
           writer.write("<div><h3>Skills and Interests</h3><p><ul>"+
                   "<li>"+tal+"</li>"+"<li>"+prix+"</li>"+"<li>"+comp+"</li>"+
                   "<li>"+pass+"</li>"+"<li>"+chari+"</li>"+"<li>"+speak+"</li>"+"</p></div>");
           
           writer.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
        
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(skills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(skills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(skills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(skills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new skills().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField charity;
    private javax.swing.JTextField computer;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField lang;
    private javax.swing.JTextField passion;
    private javax.swing.JTextField price;
    private javax.swing.JButton skill_cancel;
    private javax.swing.JTextField talent;
    // End of variables declaration//GEN-END:variables
}
