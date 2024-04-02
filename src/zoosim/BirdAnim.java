/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Xu Last Name
 */
public class BirdAnim extends Animal implements IFlyable{
    private boolean canFly;
    private static final String BIRDNOISE = "Tweet";
    private int height = 0;
    
    public BirdAnim(String name, String species, char sex, int speed, int age, Image image, boolean canFly){
        super(name, species, sex, speed, age, image, BIRDNOISE);
        this.canFly = canFly;
    }
    
    public BirdAnim(String name, String species, char sex, Image image, int positionX, int positionY, boolean canFly){
        super(name, species, sex, image, BIRDNOISE, positionX, positionY);
        this.canFly = canFly;
    }
    
    @Override
    public void fly(){
        if (canFly) {
            height +=1;
        } else {
            System.out.println(name + "cannot fly");
        }
    }
    
    
    @Override 
    public void land(){
        height = 0;
    }
    
    @Override
    public void isFlying(){
        if (height >0){
            System.out.println(name + "is flying at " + height + "meters");
        } else {
            System.out.println(name + " is not flying");
        }
    }
}

