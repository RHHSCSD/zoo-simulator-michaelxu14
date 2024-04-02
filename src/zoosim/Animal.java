/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Xu Last Name
 */
public class Animal implements IEntity{
    // Variables
    private static int idSaved = 0; 
    private int id;    // Unique identifier for each animal

    /**
     *
     */
    public String name;        // Name of the animal
    private String species;     // Species of the animal
    private char sex;           // Sex of the animal (M/F)
    private int age;            // Age of the animal

    /**
     *
     */
    public int positionX = 0;      // X-coordinate of the animal's position

    /**
     *
     */
    public int positionY = 0;      // Y-coordinate of the animal's position
    private int xWidth;
    private int yWidth;
    private String size;  

    /**
     *
     */
    public int degree;
    
    
    //Will be randomly chosen
    private int speed; 
    private int maxSpeed = 40;
    private int minSpeed = 0;
    
    /**
     *
     */
    protected int height = 0;
    // Slow, fast, medium 
    private int hunger = 0;         // Hunger level of the animal
    private int fatigue = 0;        // Fatigue level of the animal

    /**
     *
     */
    public Image image;        // Image representing the animal
    private String sound;       // Sound produced by the animal
    
    
    
    //Constructor

    /**
     *
     * @param name
     * @param species
     * @param sex
     * @param speed
     * @param age
     * @param image
     * @param sound
     */
    public Animal(String name, String species, char sex, int speed, int age, Image image, String sound){
        animSetter(name, species, sex, image, sound);
        this.age = age;
        if (speed < maxSpeed && speed > minSpeed){
            this.speed = speed;
        }
        
    }
    
    /**
     *
     * @param name
     * @param species
     * @param sex
     * @param image
     * @param sound
     * @param positionX
     * @param positionY
     */
    public Animal(String name, String species, char sex, Image image, String sound, int positionX, int positionY){
        animSetter(name, species, sex, image, sound);
        this.age = age;
        this.speed = 0;
        this.positionX = positionX;
        this.positionY = positionY;
        
                
    }
    
    /**
     *
     * @param name
     * @param species
     * @param sex
     * @param image
     * @param sound
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
     *
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
     *
     * @param degree
     */
    @Override
    public void turn(double degree){  
    }
    
    /**
     *
     * @param x
     * @param y
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
     *
     * @return
     */
    
    public int getHunger() {
        return hunger;
    }

    /**
     *
     * @return
     */
    public int getFatigue() {
        return fatigue;
    }

    /**
     *
     * @return
     */
    public String getSpecies() {
        return species;
    }

    /**
     *
     * @return
     */
    public char getSex() {
        return sex;
    }

    /**
     *
     * @return
     */
    public int getSpeed() {
        return speed;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        return age;
    }
}