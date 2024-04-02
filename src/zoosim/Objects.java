/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author Xu Last Name
 */
public class Objects implements IObject{
    private int degrees = 0;
    private int positionX;
    private int positionY;
    private int xWidth;
    private int yWidth;
    private String type;
    
            
            
    public Objects(int positionX, int positionY, int xWidth, int yWidth, String type){
        this.positionX = positionX;
        this.positionY = positionY;
        this.xWidth = xWidth;
        this.yWidth = yWidth;
        this.type = type;
        
        
               
    }
    
    /**
     * Turns the animal by the specified number of degrees.
     * 
     * @param degree Number of degrees to turn
     */
    
    @Override
    public void turn(double degree){
        // Turn, and make sure degrees do not exceed 360
        this.degrees += degree;
        this.degrees %= 360; 
    }
    
    
    /**
     * Sets the position of the object to the specified coordinates.
     * 
     * @param x The x-coordinate to place the object.
     * @param y The y-coordinate to place the object.
     */
    
    @Override
    public void place(int x, int y) {
        this.positionX = x;
        this.positionY = y;
    }

    
    
}
