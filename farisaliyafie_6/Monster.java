package farisaliyafie_6;


/**
 * Write a description of class Monster here.
 * 
 * @author (Faris Ali Yafie) 
 * @version (case study modul 6)
 */
public class Monster extends Entity
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Monster
     */
    public Monster(String name, int level){
        super(name,level);
    }
    
    public void quote(){
        System.out.println("Kau tidak akan bisa mengalahkanku!");
    }
    
    public void fullHP(){
        setPower();
        maxHP=(level*level/10)+5;
        strength=((level*level/10)+5)/2;
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
