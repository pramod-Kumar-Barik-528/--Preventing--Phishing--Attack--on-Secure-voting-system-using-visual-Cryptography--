/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vote;


import java.io.ByteArrayOutputStream;
import java.io.*;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

  import java.net.ServerSocket;
import java.net.Socket;
import com.github.sarxos.webcam.Webcam;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.util.*;
import java.text.*;
/**
 *
 * @author SRIKANTA JENA
 */



public class vstarted extends javax.swing.JFrame  {

    /**
     * Creates new form vstarted
     */
    public vstarted() {
        initComponents();
       
          java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1160)/2, (screenSize.height-520)/2, 1160, 520);
        

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
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textcd1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textcd = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        i = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        back = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        label3 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 610, 420));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 280, 360));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("N E X T");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 120, 30));

        jButton2.setText("B R E A K");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 280, 50));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 120));

        textcd1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textcd1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(textcd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 210, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 210, 200));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 120));

        textcd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textcd.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(textcd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 210, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, 210));

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        i.setBackground(new java.awt.Color(0, 204, 204));
        i.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        i.setForeground(new java.awt.Color(0, 153, 153));
        i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vote/ABOUT1.png"))); // NOI18N
        i.setBorder(null);
        i.setContentAreaFilled(false);
        i.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iMouseExited(evt);
            }
        });
        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });
        jPanel7.add(i, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, 39));

        refresh.setBackground(new java.awt.Color(0, 204, 204));
        refresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        refresh.setForeground(new java.awt.Color(0, 153, 153));
        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vote/REFRESH.png"))); // NOI18N
        refresh.setBorder(null);
        refresh.setContentAreaFilled(false);
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshMouseExited(evt);
            }
        });
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel7.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, -1, 39));

        back.setBackground(new java.awt.Color(0, 204, 204));
        back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(0, 153, 153));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vote/BACK.png"))); // NOI18N
        back.setBorder(null);
        back.setContentAreaFilled(false);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel7.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, -1, 39));

        exit.setBackground(new java.awt.Color(0, 204, 204));
        exit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 153, 153));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vote/EXIT.png"))); // NOI18N
        exit.setBorder(null);
        exit.setContentAreaFilled(false);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel7.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, -1, 39));

        label3.setFont(new java.awt.Font("DotumChe", 0, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(204, 204, 0));
        label3.setText("SECURE VOTING SYSTEM");
        jPanel7.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 190, 30));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         Webcam webcam = Webcam.getDefault();
         webcam.close();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        audioclass ac = new audioclass();
        ac.stkntocam.play();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked


        Webcam webcam = Webcam.getDefault();
        audioclass ac = new audioclass();

        for (int a = 0; a < 3; a++) {
            ac.beep1.play();
            webcam.open();

            BufferedImage image = webcam.getImage();
            System.out.println("captured");
            DateFormat df = new SimpleDateFormat("mm:ss");
            Date dateobj = new Date();
            String content = ("C:\\SVS1.0\\data\\voter\\garbage\\SVS" + df.format(dateobj) + "QR.png");
            try {
                ImageIO.write(image, "PNG", new File(content));
                ImageIcon ic = new ImageIcon(image);
                jLabel2.setIcon(ic);

            } catch (IOException ex) {
                Logger.getLogger(vstarted.class.getName()).log(Level.SEVERE, null, ex);
            }
            textcd.setText("••••• NO DATA FOUND •••••");

            System.out.println("image captured");
            try {
                File file2 = new File(content);
                Result r = new MultiFormatReader().decode(new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(ImageIO.read(file2)))));
                textcd.setText(r.getText());
                ac.btncrf.play();
                System.out.println("Result found :  " + r);
                System.out.println("result printed");
                webcam.close();
                break;

            } catch (Exception e) {

                System.out.println("code dosn`t processed !!");

                ac.tknprocess.play();
            }

            webcam.close();
            System.out.println("camera closed");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void iMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iMouseEntered
        // TODO add your handling code here:
        i.setSize(38, 33);
    }//GEN-LAST:event_iMouseEntered

    private void iMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iMouseExited
        // TODO add your handling code here:
        i.setSize(30, 33);
    }//GEN-LAST:event_iMouseExited

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iActionPerformed

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
        // TODO add your handling code here:
        refresh.setSize(38, 33);
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        // TODO add your handling code here:
        refresh.setSize(30, 33);
    }//GEN-LAST:event_refreshMouseExited

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        Vreg vrg = new Vreg();
        vrg.setVisible(true);
        dispose();
    }//GEN-LAST:event_refreshActionPerformed

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        // TODO add your handling code here:
        back.setSize(38, 33);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        // TODO add your handling code here:
        back.setSize(30, 33);
    }//GEN-LAST:event_backMouseExited

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        admin ad = new admin();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered

        exit.setSize(38, 33);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        // TODO add your handling code here:
        exit.setSize(30, 33);
    }//GEN-LAST:event_exitMouseExited

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable() {
                                                      public void run() {
                                                       new vstarted().setVisible(true);
                                                          audioclass ac = new audioclass();
                                                         ac.stk.play();

                                                                          }
                                                         });
                                                                                        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton exit;
    private javax.swing.JButton i;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private java.awt.Label label3;
    private javax.swing.JButton refresh;
    private javax.swing.JLabel textcd;
    private javax.swing.JLabel textcd1;
    // End of variables declaration//GEN-END:variables
}