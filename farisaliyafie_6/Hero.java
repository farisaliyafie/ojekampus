package farisaliyafie_6;


/**
 * Write a description of class Hero here.
 * 
 * @author (Faris Ali Yafie) 
 * @version (case study modul 6)
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
        System.out.println("Aku akan mengalahkanmu!");
    }
    
    public void fullHP(){
        maxHP=(15*level+5)/4;
        strength=(15*level+5)/8;
        setPower();
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
