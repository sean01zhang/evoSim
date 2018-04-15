/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.SeanZhang.game;

import java.util.Random;

/**
 *
 * @author seanz
 */
public class Player {
    private String name;
    private int population,points;
    private double bRate, food,habitat,dRate;
    
    
    public Player() {
        population=1000;
        bRate = 10;
        food=0.00001;
        habitat=0.00001;
        name = "Player";
        points=8;
        dRate=1;
    }

    public double getdRate() {
        return dRate;
    }

    public void setdRate(double dRate) {
        this.dRate = dRate;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getbRate() {
        return bRate;
    }

    public void setbRate(double bRate) {
        this.bRate = bRate;
    }

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    public double getHabitat() {
        return habitat;
    }

    public void setHabitat(double habitat) {
        this.habitat = habitat;
    }
    
    public String mutate() {
        double rate = Math.random();
        
        if(Math.random()>0.5) {
            Random r = new Random();
            
            int x =r.nextInt(4);
            
            
            
            switch(x) {
                case 0:
                    bRate/=rate;
                    
                    return "(Beneficial) Birth rate increased by " + Math.round(rate*100) + " percent";
                case 1:
                    food*=rate;
                    return "(Beneficial) Food efficiency increased by " + Math.round(rate*100) + " percent";
                case 2:
                    habitat*=rate;
                    return "(Beneficial) Habitat efficiency increased by " + Math.round(rate*100) + " percent";
                    
                case 3:
                    dRate*=rate;
                    return "(Beneficial) Death rate decreased by " + Math.round(rate*100) + " percent";
                default:
                    return "Whoops! An error occured";
            }
            
        } else {
            Random r = new Random();
            
            int x =r.nextInt(4);
            
            switch(x) {
                case 0:
                    bRate*=rate;
                    
                    return "(Harmful) Birth rate decreased by " + Math.round(rate*100) + " percent";
                case 1:
                    food/=rate;
                    return "(Harmful) Food efficiency decreased by " + Math.round(rate*100) + " percent";
                case 2:
                    habitat/=rate;
                    return "(Harmful) Habitat efficiency decreased by " + Math.round(rate*100) + " percent"; 
                case 3:
                    dRate/=rate;
                    return "(Harmful) Death rate increased by " + Math.round(rate*100) + " percent";
                default:
                    return "Whoops! An error occured";
            }
        }
    }
    
    public String mutateN() {
        double rate = Math.random();
        
        if(Math.random()>0.5) {
            Random r = new Random();
            
            int x =r.nextInt(4);
            
            
            
            switch(x) {
                case 0:
                    bRate/=rate;
                    
                    return "(Beneficial) \nBirth rate \nincreased by \n" + Math.round(rate*100) + " percent";
                case 1:
                    food*=rate;
                    return "(Beneficial) \nFood efficiency \nincreased by \n" + Math.round(rate*100) + " percent";
                case 2:
                    habitat*=rate;
                    return "(Beneficial) \nHabitat efficiency \nincreased by \n" + Math.round(rate*100) + " percent";
                    
                case 3:
                    dRate*=rate;
                    return "(Beneficial) \nDeath rate \ndecreased by \n" + Math.round(rate*100) + " percent";
                default:
                    return "Whoops! An error occured";
            }
            
        } else {
            Random r = new Random();
            
            int x =r.nextInt(4);
            
            switch(x) {
                case 0:
                    bRate*=rate;
                    
                    return "(Harmful) \nBirth rate \ndecreased by \n" + Math.round(rate*100) + " percent";
                case 1:
                    food/=rate;
                    return "(Harmful) \nFood efficiency \ndecreased by \n" + Math.round(rate*100) + " percent";
                case 2:
                    habitat/=rate;
                    return "(Harmful) \nHabitat efficiency \ndecreased by\n" + Math.round(rate*100) + " percent"; 
                case 3:
                    dRate/=rate;
                    return "(Harmful) \nDeath rate \nincreased by \n" + Math.round(rate*100) + " percent";
                default:
                    return "Whoops! An error occured";
            }
        }
    }
    
    public String toString() {
        return name + " - Population Growth - " + (bRate-dRate) + " - Food - " + food+" - Habitat - " + habitat;
    }
}
