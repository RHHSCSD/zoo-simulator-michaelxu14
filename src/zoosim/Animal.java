/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * Represents an animal in the zoo simulation.
 * Implements IEntity interface.
 * 
 * @author Xu Last Name
 */
public class Animal implements IEntity {
    // Variables
    private static int idSaved = 0; 
    private int id;    // Unique identifier for each animal

    /**
     * Name of the animal
     */
    public String name;
    
    /**
     * Species of the animal
     */
    private String species;
    
    /**
     * Sex of the animal (M/F)
     */
    private char sex;
    
    /**
     * Age of the animal
     */
    private int age;
    
    /**
     * X-coordinate of the animal's position
     */
    public int positionX = 0;
    
    /**
     * Y-coordinate of the animal's position
     */
    public int positionY = 0;
    
    /**
     * Width of the image representing the animal
     */
    private int xWidth;
    
    /**
     * Height of the image representing the animal
     */
    private int yWidth;
    
    /**
     * Size of the animal
     */
    private String size;
    
    /**
     * Degree of the animal
     */
    public int degree;
    
    /**
     * Speed of the animal
     */
    private int speed;
    
    /**
     * Maximum speed of the animal
     */
    private int maxSpeed = 40;
    
    /**
     * Minimum speed of the animal
     */
    private int minSpeed = 0;
    
    /**
     * Height of the animal
     */
    protected int height = 0;
    
    /**
     * Hunger level of the animal
     */
    private int hunger = 0;
    
    /**
     * Fatigue level of the animal
     */
    private int fatigue = 0;
    
    /**
     * Image representing the animal
     */
    public Image image;
    
    /**
     * Sound produced by the animal
     */
    private String sound;
    
    /**
     * Constructs an Animal object with specified parameters.
     * 
     * @param name Name of the animal
     * @param species Species of the animal
     * @param sex Sex of the animal
     * @param speed Speed of the animal
     * @param age Age of the animal
     * @param image Image representing the animal
     * @param sound Sound produced by the animal
     */
    public Animal(String name, String species, char sex, int speed, int age, Image image, String sound){
        animSetter(name, species, sex, image, sound);
        this.age = age;
        if (speed < maxSpeed && speed > minSpeed){
            this.speed = speed;
        }
        
    }
    
    /**
     * Constructs an Animal object with specified parameters.
     * 
     * @param name Name of the animal
     * @param species Species of the animal
     * @param sex Sex of the animal
     * @param image Image representing the animal
     * @param sound Sound produced by the animal
     * @param positionX X-coordinate of the animal's position
     * @param positionY Y-coordinate of the animal's position
     */
    public Animal(String name, String species, char sex, Image image, String sound, int positionX, int positionY){
        animSetter(name, species, sex, image, sound);
        this.age = age;
        this.speed = 0;
        this.positionX = positionX;
        this.positionY = positionY;
                
    }
    
    /**
     * Initializes the animal with specified parameters.
     * 
     * @param name Name of the animal
     * @param species Species of the animal
     * @param sex Sex of the animal
     * @param image Image representing the animal
     * @param sound Sound produced by the animal
     */
    public void animSetter(String name, String species, char sex, Image image, String sound){
        idSaved ++;
        id = idSaved;
        
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.sound = sound;
        
        xWidth = image.getWidth();
        yWidth = image.getHeight();
    }
    
    /**
     * Makes the animal produce its characteristic sound.
     */
    @Override
    public void makeSound() {
        System.out.println(sound);
    }
    
    /**
     * Moves the animal based on its speed.
     */
    @Override
    public void move() {
        positionX += speed;
        positionY += speed;
    }
    
    /**
     * Turns the animal to a specified degree.
     * 
     * @param degree Degree to which the animal should be turned
     */
    @Override
    public void turn(double degree){  
    }
    
    /**
     * Places the animal at a specified position.
     * 
     * @param x X-coordinate of the position
     * @param y Y-coordinate of the position
     */
    @Override
    public void place(int x, int y) {
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
    
    //GETTERS 

    /**
     * Gets the hunger level of the animal.
     * 
     * @return The hunger level of the animal
     */
    public int getHunger() {
        return hunger;
    }

    /**
     * Gets the fatigue level of the animal.
     * 
     * @return The fatigue level of the animal
     */
    public int getFatigue() {
        return fatigue;
    }

    /**
     * Gets the species of the animal.
     * 
     * @return The species of the animal
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Gets the sex of the animal.
     * 
     * @return The sex of the animal
     */
    public char getSex() {
        return sex;
    }

    /**
     * Gets the speed of the animal.
     * 
     * @return The speed of the animal
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Gets the age of the animal.
     * 
     * @return The age of the animal
     */
    public int getAge() {
        return age;
    }
}