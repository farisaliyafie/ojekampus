package farisaliyafie_6;


/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Entity
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Hero
     */
    public Hero(String name, int level){
        super(name,level);
    }
    
    public void quote(){
        System.out.println("Aku tak boleh kalah!");
    }
    
    public void fullHP(){
        setPower();
        maxHP=(15*level+5)/4;
        strength=(15*level+5)/8;
    }
    
    private int x;
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
