import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    private GreenfootImage robotimage1= new GreenfootImage("man01.png");
    private GreenfootImage robotimage2= new GreenfootImage("man02.png");
    private int lives; 
    private int score;
    private int pizzaEaten;
   
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getImage()==robotimage1)
        {
            setImage(robotimage2);
        }
        else
        {
            setImage(robotimage1);
        }
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        pizzaEaten = 0;
        detectHome(); 
        lives = 3;
        testEndGame();  
    }
    public Robot()
    {
        robotimage1= new GreenfootImage("man01.png");
        robotimage2= new GreenfootImage("man02.png");
    }
    public void robotMovement()
    {
            if (Greenfoot.isKeyDown("up"))
        {
            setLocation( getX(), getY() -3 );
            if(getImage()==robotimage1)
        {
            setImage(robotimage2);
        }
        else
        {
            setImage(robotimage1);
        }
        }
            if(Greenfoot.isKeyDown("down"))
        {
            setLocation( getX(), getY() + 3 );
            if(getImage()==robotimage1)
        {
            setImage(robotimage2);
        }
        else
        {
            setImage(robotimage1);
        }
        }
            if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 3, getY() );
            if(getImage()==robotimage1)
        {
            setImage(robotimage2);
        }
        else
        {
            setImage(robotimage1);
        }
        }
            if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 3, getY() );
            if(getImage()==robotimage1)
        {
            setImage(robotimage2);
        }
        else
        {
            setImage(robotimage1);
        }
        }
       }
    public void testEndGame()
    {
        if(lives > 0)
        {

            Greenfoot.stop(); 
        }
    }
       public void detectWallCollision()
    {
        if(isTouching(Wall.class) )
        {
            Greenfoot.playSound("hurt.wav");
            setLocation (68, 49); 
            lives = lives -1; 
        }
    }
        public void detectBlockCollision()
    {
        if(isTouching(Block.class) )
        {
          Greenfoot.playSound("hurt.wav");
          setLocation (68, 49); 
          lives = lives -1; 
        }
    }
       public void eatPizza()
    {
        if(isTouching(Pizza.class) )
        {
            Greenfoot.playSound("eat..wav");
            removeTouching(Pizza.class);
            pizzaEaten = pizzaEaten + 1;
        }
    }
    public void detectHome()
    {
        if(isTouching(Home.class) )
        {
            Greenfoot.playSound("yipee.wav");
            setLocation (68, 49); 
        }
    }
}

