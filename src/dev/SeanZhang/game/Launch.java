/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.SeanZhang.game;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seanzhang
 */
public class Launch {
    public static  void main(String[]args) {
    //creates new game object
    
        //Set true for graphics, false for no graphics
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Game game = new Game();
        //starts the thread
        game.start();
    }
    
}
