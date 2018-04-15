/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.SeanZhang.display;

import dev.SeanZhang.util.image.IMAGE;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.Timer;

/**
 *
 * @author seanz
 */
public class bg extends javax.swing.JPanel {

    String[] images;
    BufferedImage bimage;
    Timer t;
    
    /**
     * Creates new form bg
     */
    public bg() {
        initComponents();
        t = new Timer(5,new TimerListener());
        t.start();
    }

    /**
     * Draws to the panel of the JPanel
     *
     * @param g the graphical component
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //draws image to the JPanel.
        try {
            if (bimage == null) {
                bimage = IMAGE.getResizedImage(IMAGE.getBlurredImage(IMAGE.getBufferedImage("test1.png"), 5), getWidth(), getHeight());
            } else {
                g.drawImage(IMAGE.getResizedImage(bimage, getWidth(), getHeight()), WIDTH, HEIGHT, this);
            }
        } catch (Exception e) {

        }

        //draws dark overlay over picture
        g.setColor(new Color(0, 0, 0, 130));
        g.fillRect(0, 0, getWidth(), getHeight());

        //draws UI box
        //g.setColor(new Color(255, 255, 255, 255));
        //g.fillRect((getWidth() / 2) - 175, (getHeight() / 2) - 150, 350, 300);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
private class TimerListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}

}
