/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.SeanZhang.game;

//Import statements
import dev.SeanZhang.display.Display;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * This class is responsible for running the game.
 *
 * @author Sean Zhang
 */
public class Game implements Runnable {
    //this is the amount of turns a player makes before the game ends.
    private final int turnLimit=1000;
    
    //this is the name of the window and the file directory of where the logo image is
    private String title = "EvolutionSimulator", logo = "logo3.png";

    //this boolean states whether this object is running or not.
    private boolean running = false;

    //this indicates whether the game has ended or not.
    private boolean gameEnd = false;

    //this is the time/turn counter that will be used to determine when the game
    //ends.
    private static int turnCount = 0;

    //creates a thread variable
    private Thread thread;

    //this timer is not our game loop. Instead, it controls the speed of the game (turns/second)
    Timer t;

    //this is the display varaible for the game.
    private Display display;


    private Boolean stopMessages = false;

    /**
     * The constructor for the CodeRulers Class.
     *
     * @param r - Pass in an array of abstractRulers that the user wants to
     * input into the game.
     * @param graphics Whether the game opens the GUI or runs in the console.
     */
    public Game() {
        //initialization confirmation
        System.out.println("Game Initialized.");

        display=new Display(title, logo);
    }

    @Override
    public void run() {
        //this will keep our game alive.
        while (running) {
        }

        //even though the thread is stopped when the stop method
        //is called (which exits the loop)
        //we will call another stop method just in case the while loop
        //exits by itself somehow....
        stop();
    }

    /**
     * This method will be responsible for starting the thread.
     */
    public synchronized void start() {
        //ensures that there is no thread running at the
        //moment. If there is, it will result in another new thread
        //which is not good.
        if (running) {
            return;
        }
        
        //sets running to true so that it can run the "game loop"
        //(tick and render)
        running = true;
        //creates new thread (because you dont have a thread yet)
        thread = new Thread(this);
        //starts the thread.
        thread.start();

    }

    /**
     * This method will be responsible for stopping the thread.
     */
    public synchronized void stop() {
        //if the thread is not running, we do not want to stop it again
        //so we exit the loop if the boolean is false
        if (!running) {
            return;
        }
        //sets running to false
        running = false;
        try {
            //this waits for the thread to die:
            //AKA when the run method is complete/returns
            thread.join();
        } catch (InterruptedException ex) {
            //prints the exception
            ex.printStackTrace();
        }
    }

}
