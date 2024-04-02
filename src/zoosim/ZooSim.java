/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;
import java.util.Arrays;

public class ZooSim {
    
    private Animal[] zooAnims;

    /**
     * Main method to initialize animals and perform actions.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Animal [] zooAnims = new Animal[3]; // Initialize zooAnims array
        String[] names = new String[]{"Kelly", "Jordan", "Sam"};
    
        Image image;
        double randomGen;
        char sex;
        boolean bool;
        int speed;
        int age;
    
        // Populate the zoo with animals
        for(int i =0; i<zooAnims.length; i++){
            // Determine sex randomly
            if (Math.random()<0.5){
                sex = 'M';
            } else{
                sex = 'F';
            }
        
            // Generate random age and speed between 0 and 20
            age = (int)(Math.random() * 21); 
            speed = (int)(Math.random() * 21); 
            image = new Image(5,5);
        
            // Determine if the animal can breathe underwater randomly
            if (Math.random()<0.5){
                bool = false;
            } else {
                bool = true;
            }
        
            // Randomly choose the type of animal
            randomGen = Math.random();
            if (randomGen < 0.3){
                zooAnims[i] = new WaterAnim(names[i], "Whale", sex, speed, age, image, -3, bool);
            } else if (randomGen < 0.5){
                zooAnims[i] = new BirdAnim(names[i], "Eagle", sex, speed, age, image, bool);
            } else {
                zooAnims[i] = new LandAnim(names[i], "Bear", sex, speed, age, image, "ROAR");
            }
            
        }
        
        // Display individual statistics of the animals
        individualStats(zooAnims);
        
        // Display general statistics of the animals
        stats(zooAnims);
    }

    /**
     * Method to add a water animal to the zoo.
     * @param zooAnims the array of animals in the zoo
     * @param name the name of the animal
     * @param sex the sex of the animal
     * @param speed the speed of the animal
     * @param age the age of the animal
     * @param image the image of the animal
     * @param height the height of the animal
     * @param canBreathe the flag indicating if the animal can breathe underwater
     * @return the updated array of animals in the zoo
     */
    public static Animal[] addAnimal(Animal[] zooAnims, String name, char sex, int speed, int age, Image image, int height, boolean canBreathe) {
        Animal[] newZooAnims = Arrays.copyOf(zooAnims, zooAnims.length + 1);
        newZooAnims[zooAnims.length] = new WaterAnim(name, "Fish", sex, speed, age, image, height, canBreathe);
        return newZooAnims;
    }

    /**
     * Method to add a bird to the zoo.
     * @param zooAnims the array of animals in the zoo
     * @param name the name of the bird
     * @param sex the sex of the bird
     * @param speed the speed of the bird
     * @param age the age of the bird
     * @param image the image of the bird
     * @param canFly the flag indicating if the bird can fly
     * @return the updated array of animals in the zoo
     */
    public static Animal[] addAnimal(Animal[] zooAnims, String name, char sex, int speed, int age, Image image, boolean canFly) {
        Animal[] newZooAnims = Arrays.copyOf(zooAnims, zooAnims.length + 1);
        newZooAnims[zooAnims.length] = new BirdAnim(name, "Bird", sex, speed, age, image, canFly);
        return newZooAnims;
    }

    /**
     * Method to add a land animal to the zoo.
     * @param zooAnims the array of animals in the zoo
     * @param name the name of the animal
     * @param species the species of the animal
     * @param sex the sex of the animal
     * @param speed the speed of the animal
     * @param age the age of the animal
     * @param image the image of the animal
     * @return the updated array of animals in the zoo
     */
    public static Animal[] addAnimal(Animal[] zooAnims, String name, String species, char sex, int speed, int age, Image image) {
        Animal[] newZooAnims = Arrays.copyOf(zooAnims, zooAnims.length + 1);
        newZooAnims[zooAnims.length] = new LandAnim(name, species, sex, speed, age, image, "ROAR");
        return newZooAnims;
    }
    
    /**
     * Method to display individual statistics of animals in the zoo.
     * @param zooAnims the array of animals in the zoo
     */
    public static void individualStats(Animal[] zooAnims){
        // Print details of the created animals
        for (Animal animal : zooAnims) {
            System.out.println("Name: " + animal.name
                    + ", Species: " + animal.getSpecies()
                    + ", Sex: " + animal.getSex()
                    + ", Age: " + animal.getAge()
                    + ", Speed: " + animal.getSpeed());
                    
        }
    }
    
    // Methods for performing actions on animals

    /**
     * Method to feed all hungry animals in the zoo.
     */
    public void feedAllAnimals() {
        // Iterate through animals and feed hungry ones
        for (Animal x : this.zooAnims){
            if (x.getHunger() > 50){
                x.eat();
            }
        }
    }
    
    /**
     * Method to make all tired animals in the zoo sleep.
     */
    public void animalsSleep() {
        // Iterate through animals and make tired ones sleep
        for (Animal x : this.zooAnims){
            if (x.getFatigue() > 50){
                x.sleep();
            }
        }
    }
     
    /**
     * Method to move all animals in the zoo.
     */
    public void moveAllAnimals() {
        // Iterate through animals and move them based on their position, speed, and direction
        for (Animal x : this.zooAnims){
            System.out.println("Moving animal");
            x.move();
        }
    }
     
    /**
     * Method to display general statistics of animals in the zoo.
     * @param zooAnims the array of animals in the zoo
     */
    public static void stats(Animal[] zooAnims){
        
        int landNum = 0;
        int waterNum = 0;
        int birdNum = 0;
        
        int maleNum = 0;
        int femaleNum = 0;
        
        int averageSpeed = 0;
        int averageAge = 0;
        String species;
        
        for (Animal x:zooAnims){
            species = x.getSpecies();
            if (species.equals("Eagle")){
                birdNum++;
            }else if (species.equals("Whale")){
                waterNum++;
            }else{
                landNum++;
            }
            if (x.getSex() == 'F'){
                femaleNum++;
            }else{
                maleNum++;
            }
            averageSpeed += x.getSpeed();
            averageAge += x.getAge();
        }
        
        averageSpeed = (int)(averageSpeed/(zooAnims.length));
        averageAge = (int)(averageAge/(zooAnims.length));
        
        System.out.println(maleNum + " males, " + femaleNum + " females");
    
        System.out.println(averageSpeed + " is the average speed");
        
        System.out.println(averageAge + " is the average age");
    }
}
