package udc.helper;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author carlos
 */
public class Main extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    /**
     * Creates new form Main
     */
    public Main() {

        initComponents();
        String path = "src/udc/helper/icons/link.png";
        loadIcon(linkLabel, path);
        String path1 = "src/udc/helper/icons/presentation.png";
        loadIcon(classesLabel, path1);
        String path2 = "src/udc/helper/icons/assignment.png";
        loadIcon(assignLabel, path2);
        myClasses.setVisible(false);
        myAssign.setVisible(false);

        setBackground(new Color(0, 0, 0, 0));

    }

    private void loadIcon(JLabel label, String path) {
        ImageIcon icon = new ImageIcon(path);
        icon = resize(icon, 30);
        label.setIcon(icon);
    }

    private ImageIcon resize(ImageIcon image, int size) {
        Image test = image.getImage();

        Image rescaled = test.getScaledInstance(size, size, Image.SCALE_SMOOTH);

        image = new ImageIcon(rescaled);

        return image;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        overlay = new udc.helper.Overlay();
        assignLabel = new javax.swing.JLabel();
        linkLabel = new javax.swing.JLabel();
        classesLabel = new javax.swing.JLabel();
        sideMenu = new udc.helper.sideMenu();
        pages = new udc.helper.Bar();
        exit = new javax.swing.JPanel();
        xButton = new javax.swing.JLabel();
        bar = new javax.swing.JPanel();
        min = new javax.swing.JPanel();
        minButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        quickLinks = new udc.helper.links();
        udcButton = new javax.swing.JButton();
        bbButton = new javax.swing.JButton();
        qlButton = new javax.swing.JButton();
        myClasses = new udc.helper.links();
        classLabel = new javax.swing.JLabel();
        descLabel = new javax.swing.JLabel();
        daysLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        classTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        className = new javax.swing.JTextField();
        days = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        location = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        myAssign = new udc.helper.links();
        seeActivityLabel = new javax.swing.JLabel();
        pasteField = new javax.swing.JTextField();
        pasteLabel = new javax.swing.JLabel();
        subActivity = new javax.swing.JButton();
        assignmentTable = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        overlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        assignLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        assignLabel.setForeground(new java.awt.Color(255, 255, 255));
        assignLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignLabel.setText("MyAssignments");
        assignLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assignLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                assignLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                assignLabelMouseExited(evt);
            }
        });
        overlay.add(assignLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 290, 80));

        linkLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        linkLabel.setForeground(new java.awt.Color(255, 255, 255));
        linkLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linkLabel.setText("QuickLinks");
        linkLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                linkLabelMouseExited(evt);
            }
        });
        overlay.add(linkLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 290, 80));

        classesLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        classesLabel.setForeground(new java.awt.Color(255, 255, 255));
        classesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classesLabel.setText("MyClasses");
        classesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classesLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                classesLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                classesLabelMouseExited(evt);
            }
        });
        overlay.add(classesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 290, 80));
        overlay.add(sideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 520));
        overlay.add(pages, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 290, 80));

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

        overlay.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 40, 40));

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
            .addComponent(minButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/udc/helper/icons/purpleHH (1).png"))); // NOI18N

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                .addGap(0, 566, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(224, 224, 224)
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(min, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        overlay.add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 870, 40));

        udcButton.setBackground(new java.awt.Color(0, 53, 99));
        udcButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        udcButton.setForeground(new java.awt.Color(255, 255, 255));
        udcButton.setText("MyUDC");
        udcButton.setBorder(null);
        udcButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                udcButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                udcButtonMouseExited(evt);
            }
        });
        udcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                udcButtonActionPerformed(evt);
            }
        });

        bbButton.setBackground(new java.awt.Color(0, 53, 99));
        bbButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        bbButton.setForeground(new java.awt.Color(255, 255, 255));
        bbButton.setText("Blackboard");
        bbButton.setBorder(null);
        bbButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbButtonActionPerformed(evt);
            }
        });

        qlButton.setBackground(new java.awt.Color(0, 53, 99));
        qlButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        qlButton.setForeground(new java.awt.Color(255, 255, 255));
        qlButton.setText("QuickLaunch");
        qlButton.setBorder(null);
        qlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qlButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout quickLinksLayout = new javax.swing.GroupLayout(quickLinks);
        quickLinks.setLayout(quickLinksLayout);
        quickLinksLayout.setHorizontalGroup(
            quickLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quickLinksLayout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addGroup(quickLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bbButton, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(qlButton, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(udcButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(266, 266, 266))
        );
        quickLinksLayout.setVerticalGroup(
            quickLinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quickLinksLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(udcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(bbButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(qlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        overlay.add(quickLinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 660, 500));

        classLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        classLabel.setText("Class Name");

        descLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        descLabel.setText("Description");

        daysLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        daysLabel.setText("Days");

        timeLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        timeLabel.setText("Time");

        locationLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        locationLabel.setText("Location");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Class Name", "Description", "Days", "Time", "Location"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        classTable.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout myClassesLayout = new javax.swing.GroupLayout(myClasses);
        myClasses.setLayout(myClassesLayout);
        myClassesLayout.setHorizontalGroup(
            myClassesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myClassesLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(myClassesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classTable, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(myClassesLayout.createSequentialGroup()
                        .addComponent(locationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myClassesLayout.createSequentialGroup()
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myClassesLayout.createSequentialGroup()
                        .addComponent(descLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myClassesLayout.createSequentialGroup()
                        .addComponent(classLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(className, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myClassesLayout.createSequentialGroup()
                        .addComponent(daysLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        myClassesLayout.setVerticalGroup(
            myClassesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myClassesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(myClassesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(className, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myClassesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myClassesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daysLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myClassesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myClassesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton))
                .addGap(18, 18, 18)
                .addComponent(classTable, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        overlay.add(myClasses, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 660, 500));

        seeActivityLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        seeActivityLabel.setText("Please paste your Activity Stream here: ");

        pasteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteFieldActionPerformed(evt);
            }
        });

        pasteLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pasteLabel.setText("Please paste your Activity Stream here: ");

        subActivity.setText("Submit");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        assignmentTable.setViewportView(jTable2);

        javax.swing.GroupLayout myAssignLayout = new javax.swing.GroupLayout(myAssign);
        myAssign.setLayout(myAssignLayout);
        myAssignLayout.setHorizontalGroup(
            myAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myAssignLayout.createSequentialGroup()
                .addGroup(myAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myAssignLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(assignmentTable, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myAssignLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(myAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pasteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seeActivityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myAssignLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(myAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subActivity)
                    .addComponent(pasteField, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );
        myAssignLayout.setVerticalGroup(
            myAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myAssignLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(pasteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pasteField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(subActivity)
                .addGap(3, 3, 3)
                .addComponent(seeActivityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(assignmentTable, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        overlay.add(myAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 660, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(overlay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(overlay, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barMousePressed

    private void barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMouseDragged
        int x;
        int y;
        x = evt.getXOnScreen();
        y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barMouseDragged

    private void xButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xButtonMouseEntered
        exit.setBackground(Color.decode("#ff6961"));
    }//GEN-LAST:event_xButtonMouseEntered

    private void xButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_xButtonMouseClicked

    private void xButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xButtonMouseExited
        exit.setBackground(Color.white);
    }//GEN-LAST:event_xButtonMouseExited

    private void linkLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkLabelMouseEntered
        linkLabel.setForeground(Color.black);
        String path = "src/udc/helper/icons/link hover.png";
        loadIcon(linkLabel, path);
    }//GEN-LAST:event_linkLabelMouseEntered

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        this.setExtendedState(Main.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseEntered
        min.setBackground(Color.decode("#F2F2F2"));
    }//GEN-LAST:event_minMouseEntered

    private void minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseExited
        min.setBackground(Color.white);
    }//GEN-LAST:event_minMouseExited

    private void linkLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkLabelMouseExited
        linkLabel.setForeground(Color.white);
        String path = "src/udc/helper/icons/link.png";
        loadIcon(linkLabel, path);
    }//GEN-LAST:event_linkLabelMouseExited

    private void linkLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkLabelMouseClicked
        setPanelEnabled(myClasses, false);
        setPanelEnabled(myAssign, false);
        setPanelEnabled(quickLinks, true);

        myClasses.setVisible(false);
        myAssign.setVisible(false);
        quickLinks.setVisible(true);


    }//GEN-LAST:event_linkLabelMouseClicked

    private void udcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_udcButtonActionPerformed
        openWebpage("https://my.udc.edu/");
    }//GEN-LAST:event_udcButtonActionPerformed

    private void bbButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbButtonActionPerformed
        openWebpage("https://udc.blackboard.com/ultra/course");
    }//GEN-LAST:event_bbButtonActionPerformed

    private void qlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qlButtonActionPerformed
        openWebpage("https://my.udc.edu/app/QuickLaunch7/QuickLaunch7");
    }//GEN-LAST:event_qlButtonActionPerformed

    private void classesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classesLabelMouseClicked
        setPanelEnabled(myAssign, false);
        setPanelEnabled(quickLinks, false);
        setPanelEnabled(myClasses, true);
        quickLinks.setVisible(false);
        myAssign.setVisible(false);
        myClasses.setVisible(true);
    }//GEN-LAST:event_classesLabelMouseClicked

    private void classesLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classesLabelMouseEntered
        classesLabel.setForeground(Color.black);
        String path = "src/udc/helper/icons/presentation_hover.png";
        loadIcon(classesLabel, path);
    }//GEN-LAST:event_classesLabelMouseEntered

    private void classesLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classesLabelMouseExited
        classesLabel.setForeground(Color.white);
        String path = "src/udc/helper/icons/presentation.png";
        loadIcon(classesLabel, path);
    }//GEN-LAST:event_classesLabelMouseExited

    private void assignLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignLabelMouseClicked
        setPanelEnabled(myClasses, false);
        setPanelEnabled(quickLinks, false);
        setPanelEnabled(myAssign, true);
        quickLinks.setVisible(false);
        myClasses.setVisible(false);
        myAssign.setVisible(true);
    }//GEN-LAST:event_assignLabelMouseClicked

    private void assignLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignLabelMouseEntered
        assignLabel.setForeground(Color.black);
        String path = "src/udc/helper/icons/assignment_hover.png";
        loadIcon(assignLabel, path);
    }//GEN-LAST:event_assignLabelMouseEntered

    private void assignLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignLabelMouseExited
        assignLabel.setForeground(Color.white);
        String path = "src/udc/helper/icons/assignment.png";
        loadIcon(assignLabel, path);
    }//GEN-LAST:event_assignLabelMouseExited

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitButtonActionPerformed

    private void pasteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasteFieldActionPerformed

    private void udcButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_udcButtonMouseEntered
        udcButton.setBackground(Color.decode("#0084F7"));
    }//GEN-LAST:event_udcButtonMouseEntered

    private void udcButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_udcButtonMouseExited
        udcButton.setBackground(Color.decode("#003563"));
    }//GEN-LAST:event_udcButtonMouseExited

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
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

    public static void openWebpage(String urlString) {
        try {
            Desktop.getDesktop().browse(new URL(urlString).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assignLabel;
    private javax.swing.JScrollPane assignmentTable;
    private javax.swing.JPanel bar;
    private javax.swing.JButton bbButton;
    private javax.swing.JLabel classLabel;
    private javax.swing.JTextField className;
    private javax.swing.JScrollPane classTable;
    private javax.swing.JLabel classesLabel;
    private javax.swing.JTextField days;
    private javax.swing.JLabel daysLabel;
    private javax.swing.JTextField desc;
    private javax.swing.JLabel descLabel;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel linkLabel;
    private javax.swing.JTextField location;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JPanel min;
    private javax.swing.JLabel minButton;
    private udc.helper.links myAssign;
    private udc.helper.links myClasses;
    private udc.helper.Overlay overlay;
    private udc.helper.Bar pages;
    private javax.swing.JTextField pasteField;
    private javax.swing.JLabel pasteLabel;
    private javax.swing.JButton qlButton;
    private udc.helper.links quickLinks;
    private javax.swing.JLabel seeActivityLabel;
    private udc.helper.sideMenu sideMenu;
    private javax.swing.JButton subActivity;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField time;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JButton udcButton;
    private javax.swing.JLabel xButton;
    // End of variables declaration//GEN-END:variables

}
