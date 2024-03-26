/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;


import java.util.Random;


/**
 *
 * @author Xu Last Name
 */
public class Animal implements IEntity {
    // Variables
    private int id;             // Unique identifier for each animal
    private String name;        // Name of the animal
    private String species;     // Species of the animal
    private char sex;           // Sex of the animal (M/F)
    private int age;            // Age of the animal
    private int positionX;      // X-coordinate of the animal's position
    private int positionY;      // Y-coordinate of the animal's position
    private String size;        // Size category of the animal
    private String speed;       // Speed category of the animal
    private double direction;   // Direction in degrees
    private int hunger;         // Hunger level of the animal
    private int fatigue;        // Fatigue level of the animal
    private Image image;        // Image representing the animal
    private String sound;       // Sound produced by the animal
    
    /**
     * Outputs the sound produced by the animal.
     */
    @Override
    public void makeSound() {
        System.out.println(sound);
    }
    
    /**
     * Moves the animal based on its speed category.
     */
    @Override
    public void move() {
        int distance;
        if (speed.equals("Slow")) {
            distance = 1;
        } else if (speed.equals("Fast")) {
            distance = 4;
        } else {
            distance = 0;
        }
        
        positionX += distance;
        positionY += distance;
    }
    
    /**
     * Resets the hunger level of the animal.
     */
    @Override
    public void eat() {
        hunger = 0;
        System.out.println("Hunger is 0");
    }
    
    /**
     * Resets the fatigue level of the animal.
     */
    @Override
    public void sleep() {
        fatigue = 0;
        System.out.println("Fatigue is 0");
    }
    
    /**
     * Turns the animal by the specified number of degrees.
     * 
     * @param degree Number of degrees to turn
     */
    @Override
    public void turn(double degree) {
        direction += degree; 
        direction %= 360;
    }
    
    @Override
    public void place(int x, int y) {
        positionX = x;
        positionY = y;
    }

    public int getHunger() {
        return hunger;
    }

    public int getFatigue() {
        return fatigue;
    }

    public String getSpecies() {
        return species;
    }

    public char getSex() {
        return sex;
    }

    public String getSpeed() {
        return speed;
    }

    public int getAge() {
        return age;
    }
}