/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.SeanZhang.display;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;

/**
 *
 * @author seanz
 */

public class SeanButton extends JComponent implements MouseListener {
    int x, y;
    int width,arcH;
    int height;
    String text;
    Color cBackground;
    Color cForeground;
    Font f;
    Boolean isPressed=false;
    
    public SeanButton(int x, int y,int width, int height, String text, Color cB, Font f, Color cF, int arcH) {
        enableInputMethods(true);
        addMouseListener(this);
        this.width=width;
        this.height=height;
        this.text=text;
        this.cBackground = cB;
        this.cForeground=cF;
        this.f = f;
        this.arcH=arcH;
        this.x=x;
        this.y=y;
    }

    @Override
    public Dimension getPreferredSize(){
        return new Dimension(width, height);
    }

    @Override
    public Dimension getMinimumSize(){
        return new Dimension(width, height);
    }

    @Override
    public Dimension getMaximumSize(){
        return new Dimension(width, height);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        if(isPressed) {
            //draw background
            g.setColor(cBackground);
            g.fillRoundRect(x, y, width, height, arcH, arcH);
            //draw text
            g.setFont(f);
            g.setColor(cForeground);
            g.drawString(text, x, y+height/2-g.getFontMetrics(f).getHeight()/2);
            //draw darkened bg
            g.setColor(new Color(0,0,0,100));
            g.fillRoundRect(x, y, width, height, arcH, arcH);
        } else{
            //draw bg
            g.setColor(cBackground);
            g.fillRoundRect(x, y, width, height, arcH, arcH);
            //draw foreground
            g.setFont(f);
            g.setColor(cForeground);
            g.drawString(text, x+5, y+height/2-g.getFontMetrics(f).getHeight()/2);
        }
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        isPressed = true;
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        isPressed = false;
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

}
