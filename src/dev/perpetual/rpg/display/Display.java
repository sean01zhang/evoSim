package dev.perpetual.rpg.display;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Sean Zhang
 */

public class Display {
    //creates the jframe window for our game
    private JFrame frame;
    //creates the canvas for us to draw our graphics on our game
    private Canvas canvas;
    
    private ImageIcon logo;
    
    //Jframe variables:
    private String title; //title of the jframe
    private int width,height; //width and height of jframe
    
    //takes in jframe variable parameters
    public Display(String title, int width, int height,String imageName){
        //sets the jframe varaibles
        this.title=title;
        this.width=width;
        this.height=height;
        //this sets logo ImageIcon to the image found in the path below
        //logo = new ImageIcon(getClass().getResource("/res/logo/"+imageName));
        //calls method createDisplay (creates the jframe)
        createDisplay();
    }
    
    //creates the jframe
    private void createDisplay() {
        //initializes the jframe with string title
        frame = new JFrame(title);
        //sets size of parameter with the width and height variables
        frame.setSize(width,height);
        //exits the program when it is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //prevents user from resizing it
        frame.setResizable(false);
        //sets the location to the center of the screen
        frame.setLocationRelativeTo(null);
        //sets icon
        frame.setIconImage(logo.getImage());
        //when initializing a jframe, it is default to invisible
        //so we have to set it to visible
        frame.setVisible(true);
        
        //creates new canvas
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width,height));
        canvas.setMaximumSize(new Dimension(width,height));
        canvas.setMinimumSize(new Dimension(width,height));
        canvas.setFocusable(false);
        frame.add(canvas);
        frame.pack();
    }
    
    public Canvas getCanvas() {
        return canvas;
    }
    
    public JFrame getFrame() {
        return frame;
    }
}
