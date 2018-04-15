/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.SeanZhang.display;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.LineBreakMeasurer;
import java.text.AttributedCharacterIterator;

/**
 *
 * @author seanz
 */
public class Notification {
    Font subHeader = new Font("Microsoft JhengHei", Font.BOLD, 27);
    
    
    Font subsubHeader = new Font("Microsoft JhengHei", Font.BOLD, 17);
    
    Font header = new Font("Microsoft JhengHei", Font.BOLD, 32);
    String title, body;
    
    Color c, d;
    public Notification(String title, String body, Color c, Color d) {
        this.title=title;
        this.body=body;
        this.c =c;
        this.d=d;
    }
    
    public void draw(Graphics g, int x, int y) {
        //rectange
        g.setColor(new Color(175, 180, 188));
        g.setColor(c);
        g.fillRoundRect(x, y,220 , 320, 20, 20);
        
        //header
        g.setFont(subHeader);
        g.setColor(Color.black);
        g.setColor(d);
        y=drawString(title, g, x+10, y+5, subHeader)+10;
        
        g.setFont(subsubHeader);
        drawString(body,g,x+10,y,subsubHeader);
    }
    
    public int drawString(String s,Graphics g, int x , int y, Font f) {
        for (String line : s.split("\n")) {
            g.drawString(line, x, y += g.getFontMetrics(f).getAscent());
        }
        return y;
    }
}
