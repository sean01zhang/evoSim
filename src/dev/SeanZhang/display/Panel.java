/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.SeanZhang.display;

import dev.SeanZhang.game.Player;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.Timer;

/**
 * This class will be responsible for handling all drawing to the screen and
 * input from the user.
 *
 * @author Sean Zhang
 */
public class Panel extends javax.swing.JPanel {

    int xOffset;
    int isGameEnd=-1;
    Player p1, p2;
    int iterations;
    /*  These two fonts are the main two fonts that will be used in our program.
        One will be used as a header (for bigger headings)
        And the other will be used for less important things
     */
    Font subHeader = new Font("Microsoft JhengHei", Font.BOLD, 27);

    ArrayList<Notification> alert = new ArrayList<Notification>();

    Font subsubHeader = new Font("Microsoft JhengHei", Font.BOLD, 17);

    Font header = new Font("Microsoft JhengHei", Font.BOLD, 32);

    Font superHeader = new Font("Microsoft JhengHei", Font.BOLD, 60);
    Timer t;

    /**
     * The constructor for the Panel Class. Creates new form Panel.
     *
     * @param r This is the codeRulers object that is passed in. In this
     * program, it is passed through to the display and then to this class.
     */
    public Panel(Player p1, Player p2) {
        //initializes graphical components related to the Netbeasn GUI builder.
        initComponents();

        t = new Timer(5, new TimerListener());

        this.p1 = p1;
        this.p2 = p2;

        //sets the size of the JPanel to 768x1024
        this.setSize(700, 700);

        repaint();
    }

    public void startTimer() {
        t.start();
    }

    public void stopTimer() {
        t.stop();
    }

    @Override
    public void paintComponent(Graphics g) {
        //calls the paintComponent method in the superClass. This essentially
        //clears the screen (I think)
        super.paintComponent(g);
        //resources word
        DecimalFormat df = new DecimalFormat("0.00");
        g.setFont(subHeader);

        g.setColor(new Color(175, 180, 188));

        //first two
        g.fillRoundRect(10, 10, 335, 170, 20, 20);
        g.fillRoundRect(355, 10, 335, 170, 20, 20);

        //3rd rect
        g.fillRoundRect(10, 190, 680, 170, 20, 20);

        //header for p1,p2
        g.setColor(Color.black);
        g.drawString(p1.getName(), 20, 8 + g.getFontMetrics(subHeader).getHeight());
        g.drawString(p2.getName(), 365, 8 + g.getFontMetrics(subHeader).getHeight());

        //player 1 status
        g.setFont(subsubHeader);
        g.drawString("Growth Rate: " + df.format(p1.getbRate() - p1.getdRate()), 20, 10 + g.getFontMetrics(subHeader).getHeight() + g.getFontMetrics(subsubHeader).getHeight());
        int x = 10 + g.getFontMetrics(subHeader).getHeight() + g.getFontMetrics(subsubHeader).getHeight();
        x += g.getFontMetrics(subsubHeader).getHeight();
        g.drawString("Food Usage (%): " + df.format(p1.getFood() * p1.getPopulation() * 100), 20, x);
        x += g.getFontMetrics(subsubHeader).getHeight();
        g.drawString("Habitat Usage (%): " + df.format(p1.getHabitat() * p1.getPopulation() * 100), 20, x);
        x += g.getFontMetrics(subsubHeader).getHeight();
        g.drawString("Population: " + p1.getPopulation(), 20, x);
        x += g.getFontMetrics(subsubHeader).getHeight();
        g.drawString("Points (Press 'Q' to Mutate): " + p1.getPoints(), 20, x);

        //player 2 status
        g.setFont(subsubHeader);
        g.drawString("Growth Rate: " + df.format(p2.getbRate() - p2.getdRate()), 365, 10 + g.getFontMetrics(subHeader).getHeight() + g.getFontMetrics(subsubHeader).getHeight());
        x = 10 + g.getFontMetrics(subHeader).getHeight() + g.getFontMetrics(subsubHeader).getHeight();
        x += g.getFontMetrics(subsubHeader).getHeight();
        g.drawString("Food Usage (%): " + df.format(p2.getFood() * p2.getPopulation() * 100), 365, x);
        x += g.getFontMetrics(subsubHeader).getHeight();
        g.drawString("Habitat Usage (%): " + df.format(p2.getHabitat() * p2.getPopulation() * 100), 365, x);
        x += g.getFontMetrics(subsubHeader).getHeight();
        g.drawString("Population: " + p2.getPopulation(), 365, x);
        x += g.getFontMetrics(subsubHeader).getHeight();
        g.drawString("Points: " + p2.getPoints(), 365, x);

        g.setFont(subHeader);
        //height of the bottom of resources word
        x = 180 + 8 + g.getFontMetrics(subHeader).getHeight();

        g.drawString("Resources", 20, x);
        g.setFont(subsubHeader);
        g.drawString("Food: " + df.format((p1.getFood() * p1.getPopulation() + p2.getFood() * p2.getPopulation()) * 100) + "% Used  /  Habitat: "
                + df.format((p2.getHabitat() * p2.getPopulation() + p1.getHabitat() * p1.getPopulation()) * 100) + "% Used", 170, x);

        //progress bars
        int rectHeight = 170 - 20 - g.getFontMetrics(subHeader).getHeight();

        //bg
        g.setColor(Color.white);
        g.fillRect(20, x + 10, 660, rectHeight);

        //p1 bar
        g.setColor(new Color(242, 101, 34));
        g.fillRect(20, x + 10, (int) Math.round(660 * p1.getFood() * p1.getPopulation()), rectHeight / 2);
        g.fillRect(20, x + 10 + rectHeight / 2, (int) Math.round(660 * p1.getHabitat() * p1.getPopulation()), rectHeight / 2);

        g.setColor(new Color(236, 0, 140));
        g.fillRect(20 + (int) Math.round(660 * p1.getFood() * p1.getPopulation()), x + 10, (int) Math.round(660 * p2.getFood() * p2.getPopulation()), rectHeight / 2);
        g.fillRect(20 + (int) Math.round(660 * p1.getHabitat() * p1.getPopulation()), x + 10 + rectHeight / 2, (int) Math.round(660 * p2.getHabitat() * p2.getPopulation()), rectHeight / 2);
        //680,170

        //outline
        g.setColor(Color.black);
        g.drawRect(20, x + 10, 660, rectHeight);

        //Notifications
        //y will always be 370.
        //width of box is 220.
        for (int i = 1; i <= alert.size(); i++) {
            alert.get(alert.size() - i).draw(g, i * 10 + (i - 1) * 220 + xOffset, 370);
        }
        //n.draw(g, 10, 370);
        
        //endgame prompt
        if(isGameEnd>=0) {
            g.setColor(new Color(0, 0, 0,220));
            g.fillRect(0, 0, 700, 700);
            g.setColor(Color.white);
            g.setFont(superHeader);
            if(isGameEnd==0) {
                g.drawString("Draw.", 10, g.getFontMetrics().getAscent());
                g.setFont(subsubHeader);
                g.drawString("By chance, you drew the game. Congrats.", 10, g.getFontMetrics(superHeader).getHeight()+20);
                g.drawString("Press enter to exit.", 10, g.getFontMetrics(superHeader).getHeight()+g.getFontMetrics(subsubHeader).getAscent()+20);
            } else if(isGameEnd==1) {
                g.drawString(p1.getName()+" wins.", 10, g.getFontMetrics().getAscent());
                g.setFont(subsubHeader);
                g.drawString("Player One Wins. Sorry player 2, but life is unfair.", 10, g.getFontMetrics(superHeader).getHeight()+20);
                g.drawString("Press enter to exit.", 10, g.getFontMetrics(superHeader).getHeight()+g.getFontMetrics(subsubHeader).getAscent()+20);
            } else {
                g.drawString(p2.getName()+" wins.", 10, g.getFontMetrics().getAscent());
                g.setFont(subsubHeader);
                g.drawString("Player Two Wins. Sorry player 1, but life is unfair.", 10, g.getFontMetrics(superHeader).getHeight()+20);
                g.drawString("Press enter to exit.", 10, g.getFontMetrics(superHeader).getHeight()+g.getFontMetrics(subsubHeader).getAscent()+20);
            }
        }
    }

    public void naturalD() {
        int p1loss = (int) (p1.getPopulation() * p1.getHabitat() * p1.getPopulation());
        System.out.println(p1loss);
        p1.setPopulation(p1.getPopulation() - p1loss);
        int p2loss = (int) (p2.getPopulation() * p2.getHabitat() * p2.getPopulation());
        p2.setPopulation(p2.getPopulation() - p2loss);
        Notification n = new Notification("Natural\nDisaster", "A natural disaster \noccured. Populations \nwith higher habitat "
                + "\noccupancy will be more \nvunerable. Bottleneck \neffect has occured \n(Microevolution)\n\nCasualties: \n"
                + p1.getName() + " - " + p1loss + "\n" + p2.getName() + " - " + p2loss, Color.RED, Color.white);
        alert.add(n);
    }

    public void famine() {
        int p1loss = (int) (p1.getPopulation() * p1.getFood() * p1.getPopulation());
        p1.setPopulation(p1.getPopulation() - p1loss);
        int p2loss = (int) (p2.getPopulation() * p2.getFood() * p2.getPopulation());
        p2.setPopulation(p2.getPopulation() - p2loss);
        Notification n = new Notification("Famine!", "Due to prolonged \nperiods of dryness, \nfood supply has been \nreduced. Bottleneck \neffect has occured \n(Microevolution)\n\nCasualties: \n"
                + p1.getName() + " - " + p1loss + "\n" + p2.getName() + " - " + p2loss, Color.RED, Color.white);
        alert.add(n);
    }

    public void competition() {
        double reduction = Math.random();
        p1.setPopulation((int) (p1.getPopulation() * reduction));
        p2.setPopulation((int) (p2.getPopulation() * reduction));

        Notification n = new Notification("Competition  \nWithin\nPopulations", "Due to limited supply of \nresources, populations \nwill be reduced in \nresponse.\n\nCasualties: \n"
                + p1.getName() + " - " + (int) (p1.getPopulation() * (1 - reduction)) + "\n" + p2.getName() + " - " + (int) (p2.getPopulation() * (1 - reduction)),
                Color.YELLOW, Color.BLACK);

        alert.add(n);
    }

    public void mutation(Player p) {
        String sean = p.mutateN();

        Notification n = new Notification("Mutation\nIntroduced", sean + "\nThis mutation \nintroduces new \nalleles in the \npopulation. \n(Microevolution)",
                Color.GREEN, Color.BLACK);

        alert.add(n);
    }

    public void updatePlayerStats() {
        p1.setPopulation((int) Math.round(p1.getPopulation() + p1.getbRate() - p1.getdRate()));
        p2.setPopulation((int) Math.round(p2.getPopulation() + p2.getbRate() - p2.getdRate()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method is called whenever the mouseWheel is moved.
     *
     * @param evt The mouse wheel event.
     */
    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        double wheel = evt.getPreciseWheelRotation() * 50;
        if ((xOffset - wheel) <= 3 && (xOffset - wheel) >= ((alert.size() - 1) * 220 + alert.size() * 10) * -1) {
            xOffset -= (int) wheel;
        }
        repaint();
    }//GEN-LAST:event_formMouseWheelMoved

    /**
     * This method is called when the mouse is dragged across the screen.
     *
     * @param evt the mouse event.
     */
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

    }//GEN-LAST:event_formMouseDragged

    /**
     * Called when a mouse button is pressed.
     *
     * @param evt the mouse event.
     */
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

    }//GEN-LAST:event_formMousePressed

    /**
     * Called when the mouse button is released.
     *
     * @param evt the mouse event.
     */
    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased


    }//GEN-LAST:event_formMouseReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        System.out.println("Pressed");

        if (evt.getKeyCode() == KeyEvent.VK_Q) {
            if (p1.getPoints() > 0) {
                p1.setPoints(p1.getPoints() - 1);
                mutation(p1);
                System.out.println(p1.toString());

            }
        } else if (evt.getKeyCode() == KeyEvent.VK_P) {
            if (p2.getPoints() > 0) {
                p2.setPoints(p2.getPoints() - 1);
                mutation(p2);
                System.out.println(p2.toString());

            }
        } else if(isGameEnd>=0 && evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.exit(0);
        }
    }//GEN-LAST:event_formKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private class TimerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            iterations++;
            updatePlayerStats();

            //add points for every 1000 turns
            if (iterations % 500 == 0) {
                p1.setPoints(p1.getPoints() + 1);
                p2.setPoints(p2.getPoints() + 1);
            }

            //also need to chance disaster (1 in 500)
            Random r = new Random();

            if (r.nextInt(320) == 0) {
                if (Math.random() > 0.5) {
                    System.out.println("HIII");
                    naturalD();
                } else {
                    famine();
                }
            }

            //check for win as well
            if (p1.getPopulation() <= 0) {
                t.stop();
                isGameEnd=1;
                System.out.println("P2 wins");
            }
            if (p2.getPopulation() <= 0) {
                t.stop();
                isGameEnd=2;
                System.out.println("p1 wins");
            }
            if(iterations>10000) {
                t.stop();
                if(p1.getPopulation()>p2.getPopulation()) {
                    isGameEnd=1;
                } else if(p1.getPopulation()==p2.getPopulation()) {
                    isGameEnd=0;
                }else {
                    isGameEnd=2;
                }
            }

            //also need to check for competition
            if ((p1.getFood() * p1.getPopulation() + p2.getFood() * p2.getPopulation()) > 1 || (p2.getHabitat() * p2.getPopulation() + p1.getHabitat() * p1.getPopulation()) > 1) {
                competition();
            }

            repaint();
        }

    }

}
