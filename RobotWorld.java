import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author Peyton Dunn
 * @version 4/2/21
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        addObject (new Wall(), 51, 140); 
        addObject (new Wall(), 158, 140);
        addObject (new Wall(), 264, 140);
        addObject (new Block(), 418, 130);
        addObject (new Wall(), 573, 140);
        addObject (new Wall(), 680, 140);
        addObject (new Wall(), 787, 140);
        addObject (new Home(), 740, 533);
        addObject (new Scorepanel(), 89, 536);
        
        addObject (new Pizza(), 737, 42);
        addObject (new Pizza(), 426, 42);
        addObject (new Pizza(), 430, 243);
        addObject (new Pizza(), 716, 369);
        addObject (new Pizza(), 155, 369);
    }
}
