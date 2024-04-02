/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Xu Last Name
 */
public class WaterAnim extends Animal implements ISwimmable{
    
    private boolean canBreathe;
    private static final String WATERSOUND = "Splash";
    
    
    public WaterAnim(String name, String species, char sex, int speed, int age, Image image, int height, boolean canBreathe) {
        super(name, species, sex, speed, age, image, WATERSOUND);
        this.height = height;
        this.canBreathe = canBreathe;
    }
    public WaterAnim(String name, String species, char sex, Image image,int positionX, int positionY, int height, boolean canBreathe) {
        super(name, species, sex, image, WATERSOUND, positionX, positionY);
        this.height = height;
        this.canBreathe = canBreathe;
    }
    
    @Override
    public boolean canSurface() {
        return canBreathe;
    }
}
  
    
    
    
    

