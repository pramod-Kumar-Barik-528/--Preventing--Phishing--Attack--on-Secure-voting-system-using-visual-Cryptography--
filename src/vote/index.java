/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vote;
import java.util.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
/**
 *
 * @author SRIKANTA JENA
 */
public class index extends javax.swing.JFrame {

    /**
     * Creates new form index
     */
    public index() {
        
        
        
        initComponents();
                java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-730)/2, (screenSize.height-370)/2, 730, 370);
        
        
        
        
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
        loadingbar = new javax.swing.JProgressBar();
        loadingnumber = new javax.swing.JLabel();
        titl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 200, 0, 0));
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loadingbar.setMinimumSize(new java.awt.Dimension(10, 8));
        loadingbar.setPreferredSize(new java.awt.Dimension(146, 8));
        jPanel1.add(loadingbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 294, 710, 10));

        loadingnumber.setForeground(new java.awt.Color(204, 204, 0));
        loadingnumber.setText("0%");
        jPanel1.add(loadingnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 40, -1));

        titl.setForeground(new java.awt.Color(255, 153, 0));
        titl.setText("LOADING INTERFACE...");
        jPanel1.add(titl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("INSTRUCTION :    This is a advance level voting machine whic is designed to prevent the phishing attack on our voting system. This software is ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 720, 40));

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("end to end encrypted. the user of this software can use it for poling purpose, so we suggest you to use it and take a advantages of this software. ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 720, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vote/voteNW.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 370));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-729)/2, (screenSize.height-370)/2, 729, 370);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>

        /*
         * Create and display the form
         */
   
 
        
            }
        
  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JProgressBar loadingbar;
    public javax.swing.JLabel loadingnumber;
    public javax.swing.JLabel titl;
    // End of variables declaration//GEN-END:variables


}
