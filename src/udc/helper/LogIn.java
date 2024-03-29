
package udc.helper;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author carlos 
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    int xMouse;
    int yMouse;

    public LogIn() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        errorMessage.setVisible(false);
        accIcon.setVisible(false);
        passIcon.setVisible(false);
        accLabel.setVisible(false);
        errorLabel.setVisible(false);
    }
    
        void setPanelEnabled(JPanel panel, Boolean isEnabled) {
        panel.setEnabled(isEnabled);

        Component[] components = panel.getComponents();

        for (Component component : components) {
            if (component instanceof JPanel) {
                setPanelEnabled((JPanel) component, isEnabled);
            }
            component.setEnabled(isEnabled);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myOverlay = new udc.helper.Overlay();
        errorMessage = new javax.swing.JPanel();
        errorLabel = new javax.swing.JLabel();
        accLabel = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        accIcon = new javax.swing.JLabel();
        passIcon = new javax.swing.JLabel();
        exit = new javax.swing.JPanel();
        xButton = new javax.swing.JLabel();
        bar = new javax.swing.JPanel();
        min = new javax.swing.JPanel();
        minButton = new javax.swing.JLabel();
        appNameLeft = new javax.swing.JLabel();
        appNameRight = new javax.swing.JLabel();
        signInPanel = new javax.swing.JPanel();
        banner = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        noAccMes = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passField = new javax.swing.JPasswordField();
        userLabel = new javax.swing.JLabel();
        regiButton = new javax.swing.JLabel();
        logInButton = new javax.swing.JButton();
        logoLeft = new javax.swing.JLabel();
        logoRight = new javax.swing.JLabel();
        eclipseLeft = new javax.swing.JLabel();
        eclipseRight = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        myOverlay.setPreferredSize(new java.awt.Dimension(940, 520));
        myOverlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        errorMessage.setBackground(new java.awt.Color(255, 255, 255));
        errorMessage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        errorMessage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        errorLabel.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        errorLabel.setText("Incorrect Password!");
        errorMessage.add(errorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        accLabel.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        accLabel.setText("Couldn't find your account !");
        errorMessage.add(accLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        okButton.setBackground(new java.awt.Color(24, 127, 120));
        okButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        okButton.setForeground(new java.awt.Color(255, 255, 255));
        okButton.setText("OK");
        okButton.setBorder(null);
        okButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                okButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                okButtonMouseExited(evt);
            }
        });
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        errorMessage.add(okButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 80, 30));
        errorMessage.add(accIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 240, 100));
        errorMessage.add(passIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 240, 100));

        myOverlay.add(errorMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 440, 210));

        exit.setBackground(new java.awt.Color(255, 255, 255));

        xButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        xButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xButton.setText("X");
        xButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(xButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        myOverlay.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 40, 40));

        bar.setBackground(new java.awt.Color(255, 255, 255));
        bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barMouseDragged(evt);
            }
        });
        bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barMousePressed(evt);
            }
        });

        min.setBackground(new java.awt.Color(255, 255, 255));
        min.setPreferredSize(new java.awt.Dimension(40, 40));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minMouseExited(evt);
            }
        });

        minButton.setBackground(new java.awt.Color(255, 255, 255));
        minButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        minButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minButton.setText("-");

        javax.swing.GroupLayout minLayout = new javax.swing.GroupLayout(min);
        min.setLayout(minLayout);
        minLayout.setHorizontalGroup(
            minLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        minLayout.setVerticalGroup(
            minLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        appNameLeft.setBackground(new java.awt.Color(255, 255, 255));
        appNameLeft.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        appNameLeft.setForeground(new java.awt.Color(122, 137, 254));
        appNameLeft.setText("Homework");
        appNameLeft.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        appNameRight.setBackground(new java.awt.Color(255, 255, 255));
        appNameRight.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        appNameRight.setForeground(new java.awt.Color(145, 234, 228));
        appNameRight.setText("Helper");
        appNameRight.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(appNameLeft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appNameRight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(barLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appNameLeft)
                    .addComponent(appNameRight))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        myOverlay.add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 40));

        signInPanel.setBackground(new java.awt.Color(240,248,255));
        signInPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        signInPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/udc/helper/icons/Card_Header.jpg"))); // NOI18N
        banner.setText("header");
        signInPanel.add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 400, -1));

        passLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        passLabel.setForeground(new java.awt.Color(73, 80, 87));
        passLabel.setText("Password");
        signInPanel.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 100, 50));

        noAccMes.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        noAccMes.setText("Don't have an account?");
        signInPanel.add(noAccMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 150, 50));

        usernameField.setBackground(new java.awt.Color(73, 80, 87));
        usernameField.setForeground(new java.awt.Color(255, 255, 255));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        signInPanel.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 340, 30));

        passField.setBackground(new java.awt.Color(73, 80, 87));
        passField.setForeground(new java.awt.Color(255, 255, 255));
        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });
        signInPanel.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 340, 30));

        userLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        userLabel.setForeground(new java.awt.Color(73, 80, 87));
        userLabel.setText("Username");
        signInPanel.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, 50));

        regiButton.setForeground(new java.awt.Color(0, 153, 204));
        regiButton.setText("Register now.");
        regiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regiButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regiButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regiButtonMouseExited(evt);
            }
        });
        signInPanel.add(regiButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 80, 30));

        logInButton.setBackground(new java.awt.Color(85, 110, 230));
        logInButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        logInButton.setForeground(new java.awt.Color(255, 255, 255));
        logInButton.setText("Log In");
        logInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logInButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logInButtonMouseExited(evt);
            }
        });
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });
        signInPanel.add(logInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 340, 30));

        myOverlay.add(signInPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 400, 420));

        logoLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/udc/helper/icons/HH_icon_small.png"))); // NOI18N
        myOverlay.add(logoLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        logoRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/udc/helper/icons/HH_icon_small.png"))); // NOI18N
        myOverlay.add(logoRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, -1, -1));

        eclipseLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/udc/helper/icons/Ellipse 980.png"))); // NOI18N
        myOverlay.add(eclipseLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 250, 290, -1));

        eclipseRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/udc/helper/icons/Ellipse 979.png"))); // NOI18N
        myOverlay.add(eclipseRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myOverlay, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myOverlay, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void xButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_xButtonMouseClicked

    private void xButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xButtonMouseEntered
        exit.setBackground(Color.decode("#ff6961"));
    }//GEN-LAST:event_xButtonMouseEntered

    private void xButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xButtonMouseExited
        exit.setBackground(Color.white);
    }//GEN-LAST:event_xButtonMouseExited

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        this.setExtendedState(Main.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseEntered
        min.setBackground(Color.decode("#F2F2F2"));
    }//GEN-LAST:event_minMouseEntered

    private void minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseExited
        min.setBackground(Color.white);
    }//GEN-LAST:event_minMouseExited

    private void barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMouseDragged
        int x;
        int y;
        x = evt.getXOnScreen();
        y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barMouseDragged

    private void barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barMousePressed

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        String user = "";
        String pass = "";
        user = usernameField.getText();
        pass = passField.getText();
        //writeFile(user, pass);
        
        
        //passIcon.setIcon(image);
        if(checkPass(user, pass)==1){
            Main newWindow = new Main();
            newWindow.setVisible(true);
            newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }else if(checkPass(user, pass)==0){
            setPanelEnabled(errorMessage, true);
            setPanelEnabled(signInPanel, false);
            accIcon.setVisible(false);
            accLabel.setVisible(false);        
            
            ImageIcon image = new ImageIcon("src/udc/helper/icons/notFound.png");
            passIcon.setIcon(resize(image, 240, 100));
            errorLabel.setVisible(true);
            passIcon.setVisible(true);
                        
            errorMessage.setVisible(true);
        }else{
            setPanelEnabled(errorMessage, true);
            setPanelEnabled(signInPanel, false);
           
            passIcon.setVisible(false);
            errorLabel.setVisible(false);
            
            ImageIcon image = new ImageIcon("src/udc/helper/icons/search_acc.png");
            accIcon.setIcon(resize(image, 240, 100));
            errorMessage.setVisible(true);
            accIcon.setVisible(true);
            accLabel.setVisible(true);
            System.err.println("Not found");
        }
        
    }//GEN-LAST:event_logInButtonActionPerformed

    private void logInButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInButtonMouseEntered
        logInButton.setBackground(Color.decode("#8899ed"));
    }//GEN-LAST:event_logInButtonMouseEntered

    private void logInButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInButtonMouseExited
        logInButton.setBackground(Color.decode("#556EE6"));        // TODO add your handling code here:
    }//GEN-LAST:event_logInButtonMouseExited

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void regiButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regiButtonMouseExited
        regiButton.setForeground(Color.decode("#0099cc"));
    }//GEN-LAST:event_regiButtonMouseExited

    private void regiButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regiButtonMouseEntered
        regiButton.setForeground(Color.decode("#003d52"));
    }//GEN-LAST:event_regiButtonMouseEntered

    private void regiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regiButtonMouseClicked
        RegisterForm newUsr = new RegisterForm();
        newUsr.setVisible(true);
        newUsr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_regiButtonMouseClicked

    private void okButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_okButtonMouseEntered

    private void okButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_okButtonMouseExited

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        setPanelEnabled(signInPanel, true);
        errorMessage.setVisible(false);
        setPanelEnabled(errorMessage, false);
        
    }//GEN-LAST:event_okButtonActionPerformed
    
    private int checkPass(String user, String pass) {
        BufferedReader br = null;
        String line = "";
        try {
            br = new BufferedReader(new FileReader("user/user.csv"));
            
            try {
                while((line = br.readLine()) != null){
                    String[] values = line.split(",");
                    if (values[2].equals(user)){
                        if(values[4].equals(pass)){
                            return 1;
                        }
                        return 0;
                    }
                }
                return -1;
            } catch (IOException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    private ImageIcon resize(ImageIcon image,int sizeX,int sizeY) {
        Image test = image.getImage();

        Image rescaled = test.getScaledInstance(sizeX, sizeY, Image.SCALE_SMOOTH);

        image = new ImageIcon(rescaled);

        return image;
    }
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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accIcon;
    private javax.swing.JLabel accLabel;
    private javax.swing.JLabel appNameLeft;
    private javax.swing.JLabel appNameRight;
    private javax.swing.JLabel banner;
    private javax.swing.JPanel bar;
    private javax.swing.JLabel eclipseLeft;
    private javax.swing.JLabel eclipseRight;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JPanel errorMessage;
    private javax.swing.JPanel exit;
    private javax.swing.JButton logInButton;
    private javax.swing.JLabel logoLeft;
    private javax.swing.JLabel logoRight;
    private javax.swing.JPanel min;
    private javax.swing.JLabel minButton;
    private udc.helper.Overlay myOverlay;
    private javax.swing.JLabel noAccMes;
    private javax.swing.JButton okButton;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passIcon;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel regiButton;
    private javax.swing.JPanel signInPanel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel xButton;
    // End of variables declaration//GEN-END:variables

    
}
