/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.SeanZhang.display;

import dev.SeanZhang.display.Panel;
import dev.SeanZhang.game.Player;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This class is the window which will display our program.
 *
 * @author Sean Zhang
 */
public class Display extends JFrame {

    private Player p1, p2;

    //This is the image icon that the program will display when it is run.
    private ImageIcon logo;

    Panel p;
    
    Screen screen;

    //this the JPanel that will be responsible for all graphical drawing to the
    //screen in the program.
    private JPanel panel1;

    //Jframe variables:
    private int width, height; //width and height of jframe

    /**
     * The Constructor for the Display Class. In this block of code, all
     * graphical components of the game are initialized.
     *
     * @param title The top window border text
     * @param imageLogo The CodeRulers logo to be displayed on the task bar
     * @param r The game being displayed in the frame
     */
    public Display(String title, String imageLogo) {
        //Message that tells user that the display has been intialized.
        System.out.println("Display Initialized.");

        //creates the new ImageIcon object.
        logo = new ImageIcon(getClass().getResource("/resources/logo/" + imageLogo));

        p1 = new Player();
        p2 = new Player();
        
        //intializes graphical components of the game.
        initComponents();

        //additional things to add to the JPanel, since I do not have access to
        //the code in initComponents();
        //this.add(panel1);
        this.setIconImage(logo.getImage());
        this.setTitle(title);
        this.pack();
        this.requestFocusInWindow();
        //display the JFrame.
        this.setVisible(true);
        screen = Screen.START;

        p = new Panel(p1,p2);
        SuperScreen.add(p);
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new dev.SeanZhang.display.bg();
        SuperScreen = new javax.swing.JPanel();
        StartScreen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ObjectiveScreen = new javax.swing.JPanel();
        ObjectiveLabel = new javax.swing.JLabel();
        PlayerScreen = new javax.swing.JPanel();
        signinUNamePanel = new javax.swing.JPanel();
        signInLabel = new javax.swing.JLabel();
        signInLabel4 = new javax.swing.JLabel();
        PlayerOneTxtField = new javax.swing.JTextField();
        signInLabel5 = new javax.swing.JLabel();
        signInLabel6 = new javax.swing.JLabel();
        PlayerTwoTxtField = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        Shopscreen = new javax.swing.JPanel();
        Player1Paenl = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        qButton = new javax.swing.JButton();
        pointLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Player1Paenl1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PButton = new javax.swing.JButton();
        pointLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infopane = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setSize(new java.awt.Dimension(1024, 768));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        SuperScreen.setLayout(new java.awt.CardLayout());

        StartScreen.setBackground(new java.awt.Color(255, 255, 255));
        StartScreen.setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pictures/start_1.png"))); // NOI18N
        StartScreen.add(jLabel1, java.awt.BorderLayout.CENTER);

        SuperScreen.add(StartScreen, "card2");

        ObjectiveScreen.setLayout(new javax.swing.BoxLayout(ObjectiveScreen, javax.swing.BoxLayout.LINE_AXIS));

        ObjectiveLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pictures/Rules_1.png"))); // NOI18N
        ObjectiveScreen.add(ObjectiveLabel);

        SuperScreen.add(ObjectiveScreen, "card3");

        PlayerScreen.setBackground(new java.awt.Color(255, 255, 255));

        signinUNamePanel.setBackground(new java.awt.Color(255, 255, 255));

        signInLabel.setFont(new java.awt.Font("Microsoft JhengHei", 1, 70)); // NOI18N
        signInLabel.setText("Player One");

        signInLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        signInLabel4.setText("Enter Species Name");

        PlayerOneTxtField.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N

        signInLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 70)); // NOI18N
        signInLabel5.setText("Player Two");

        signInLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        signInLabel6.setText("Enter Species Name");

        PlayerTwoTxtField.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N

        LoginButton.setText("OK!");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signinUNamePanelLayout = new javax.swing.GroupLayout(signinUNamePanel);
        signinUNamePanel.setLayout(signinUNamePanelLayout);
        signinUNamePanelLayout.setHorizontalGroup(
            signinUNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signinUNamePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(signinUNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(signInLabel4)
                    .addComponent(signInLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PlayerOneTxtField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signinUNamePanelLayout.createSequentialGroup()
                .addGroup(signinUNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(signinUNamePanelLayout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addGroup(signinUNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(signInLabel6)
                            .addComponent(signInLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PlayerTwoTxtField))
                        .addGap(4143, 4143, 4143))
                    .addGroup(signinUNamePanelLayout.createSequentialGroup()
                        .addGap(614, 614, 614)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        signinUNamePanelLayout.setVerticalGroup(
            signinUNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signinUNamePanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(signInLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signInLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlayerOneTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(signInLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signInLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlayerTwoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PlayerScreenLayout = new javax.swing.GroupLayout(PlayerScreen);
        PlayerScreen.setLayout(PlayerScreenLayout);
        PlayerScreenLayout.setHorizontalGroup(
            PlayerScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signinUNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PlayerScreenLayout.setVerticalGroup(
            PlayerScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signinUNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        SuperScreen.add(PlayerScreen, "card4");

        Shopscreen.setBackground(new java.awt.Color(255, 255, 255));
        Shopscreen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ShopscreenKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 30)); // NOI18N
        jLabel4.setText("Press 'Q' to Mutate");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel5.setText("Cost: 1 Point - 50% Chance Mutation is Beneficial");

        qButton.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        qButton.setText("Q");
        qButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qButtonActionPerformed(evt);
            }
        });

        pointLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        pointLabel1.setText("Points: 8");

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 27)); // NOI18N
        jLabel6.setText("Player 1");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 48)); // NOI18N
        jLabel2.setText("Sean");

        javax.swing.GroupLayout Player1PaenlLayout = new javax.swing.GroupLayout(Player1Paenl);
        Player1Paenl.setLayout(Player1PaenlLayout);
        Player1PaenlLayout.setHorizontalGroup(
            Player1PaenlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player1PaenlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Player1PaenlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Player1PaenlLayout.createSequentialGroup()
                        .addGroup(Player1PaenlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pointLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Player1PaenlLayout.createSequentialGroup()
                        .addComponent(qButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Player1PaenlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Player1PaenlLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Player1PaenlLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Player1PaenlLayout.setVerticalGroup(
            Player1PaenlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Player1PaenlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pointLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Player1PaenlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Player1PaenlLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(qButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 30)); // NOI18N
        jLabel7.setText("Press 'P' to Mutate");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel8.setText("Cost: 1 Point - 50% Chance Mutation is Beneficial");

        PButton.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        PButton.setText("P");
        PButton.setActionCommand("");
        PButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PButtonActionPerformed(evt);
            }
        });

        pointLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        pointLabel2.setText("Points: 8");

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 27)); // NOI18N
        jLabel10.setText("Player 2");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 48)); // NOI18N
        jLabel11.setText("Sean");

        javax.swing.GroupLayout Player1Paenl1Layout = new javax.swing.GroupLayout(Player1Paenl1);
        Player1Paenl1.setLayout(Player1Paenl1Layout);
        Player1Paenl1Layout.setHorizontalGroup(
            Player1Paenl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player1Paenl1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Player1Paenl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Player1Paenl1Layout.createSequentialGroup()
                        .addGroup(Player1Paenl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pointLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Player1Paenl1Layout.createSequentialGroup()
                        .addComponent(PButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Player1Paenl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Player1Paenl1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Player1Paenl1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(47, Short.MAX_VALUE))))
        );
        Player1Paenl1Layout.setVerticalGroup(
            Player1Paenl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Player1Paenl1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(0, 0, 0)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pointLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Player1Paenl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Player1Paenl1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        infopane.setEditable(false);
        jScrollPane1.setViewportView(infopane);

        jButton1.setText("OK!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ShopscreenLayout = new javax.swing.GroupLayout(Shopscreen);
        Shopscreen.setLayout(ShopscreenLayout);
        ShopscreenLayout.setHorizontalGroup(
            ShopscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShopscreenLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(ShopscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ShopscreenLayout.createSequentialGroup()
                        .addGroup(ShopscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Player1Paenl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Player1Paenl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        ShopscreenLayout.setVerticalGroup(
            ShopscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShopscreenLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(ShopscreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ShopscreenLayout.createSequentialGroup()
                        .addComponent(Player1Paenl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Player1Paenl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        SuperScreen.add(Shopscreen, "card5");

        javax.swing.GroupLayout bg1Layout = new javax.swing.GroupLayout(bg1);
        bg1.setLayout(bg1Layout);
        bg1Layout.setHorizontalGroup(
            bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg1Layout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addComponent(SuperScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );
        bg1Layout.setVerticalGroup(
            bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(SuperScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(bg1, "card5");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            switch (screen) {
                case START:
                    StartScreen.setVisible(false);
                    ObjectiveScreen.setVisible(true);
                    screen = Screen.OBJECTIVE;
                    break;
                case OBJECTIVE:
                    ObjectiveScreen.setVisible(false);
                    PlayerScreen.setVisible(true);
                    screen = Screen.PLAYER1;
                    break;
                case PLAYER1:
                    break;
            }
        }
    }//GEN-LAST:event_formKeyPressed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        if(!PlayerOneTxtField.getText().equals("")) {
            p1.setName(PlayerOneTxtField.getText());
        }
        if(!PlayerTwoTxtField.getText().equals("")) {
            p2.setName(PlayerTwoTxtField.getText());
        }
        

        System.out.println(p1.getName() + " " + p2.getName());

        PlayerScreen.setVisible(false);
        Shopscreen.setVisible(true);

        Shopscreen.requestFocusInWindow();
        jLabel2.setText(p1.getName());
        jLabel11.setText(p2.getName());
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void ShopscreenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ShopscreenKeyPressed
        // TODO add your handling code here:

        System.out.println("Pressed");

        if (evt.getKeyCode() == KeyEvent.VK_Q) {
            qButton.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_P) {
            PButton.doClick();
        }
        
    }//GEN-LAST:event_ShopscreenKeyPressed

    private void qButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qButtonActionPerformed
        if (p1.getPoints() > 0) {
            p1.setPoints(p1.getPoints() - 1);
            pointLabel1.setText("Points: " + p1.getPoints());
            
            infopane.setText(infopane.getText()+"\n"+p1.getName()+ " - " + p1.mutate()+ "\n");
            System.out.println(p1.toString());
            
        } else {
            infopane.setText(infopane.getText()+"\n"+p1.getName()+ " does not have any points left!\n");
        }
        Shopscreen.requestFocusInWindow();
    }//GEN-LAST:event_qButtonActionPerformed

    private void PButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PButtonActionPerformed
        if (p2.getPoints() > 0) {
            p2.setPoints(p2.getPoints() - 1);
            pointLabel2.setText("Points: " + p2.getPoints());
            
            infopane.setText(infopane.getText()+"\n"+p2.getName()+ " - " + p2.mutate()+ "\n");
            System.out.println(p2.toString());
            
        } else {
            infopane.setText(infopane.getText()+"\n"+p2.getName()+ " does not have any points left!\n");
        }
        Shopscreen.requestFocusInWindow();
    }//GEN-LAST:event_PButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Shopscreen.setVisible(false);
        p.setVisible(true);
        p.requestFocusInWindow();
        p.startTimer();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel ObjectiveLabel;
    private javax.swing.JPanel ObjectiveScreen;
    private javax.swing.JButton PButton;
    private javax.swing.JPanel Player1Paenl;
    private javax.swing.JPanel Player1Paenl1;
    private javax.swing.JTextField PlayerOneTxtField;
    private javax.swing.JPanel PlayerScreen;
    private javax.swing.JTextField PlayerTwoTxtField;
    private javax.swing.JPanel Shopscreen;
    private javax.swing.JPanel StartScreen;
    private javax.swing.JPanel SuperScreen;
    private dev.SeanZhang.display.bg bg1;
    private javax.swing.JTextPane infopane;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pointLabel1;
    private javax.swing.JLabel pointLabel2;
    private javax.swing.JButton qButton;
    private javax.swing.JLabel signInLabel;
    private javax.swing.JLabel signInLabel4;
    private javax.swing.JLabel signInLabel5;
    private javax.swing.JLabel signInLabel6;
    private javax.swing.JPanel signinUNamePanel;
    // End of variables declaration//GEN-END:variables
}
