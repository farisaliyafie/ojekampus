package farisaliyafie_6;


/**
 * Write a description of class Tank here.
 * 
 * @author (Faris Ali Yafie) 
 * @version (case study modul 6)
 */
public class Tank implements Rank
{
    // instance variables - replace the example below with your own
    private String attackName;
    private int attackPower;
    private static double rank=0.8;
    
    /**
     * Constructor for objects of class Tank
     */
    public Tank(String name, int power){
        this.attackName=name;
        this.attackPower=power;
    }
    
    public void setAttackName(String name){
        this.attackName=name;
    }
    
    public void setAttackPower(int power){
        this.attackPower=power;
    }
    
    public String getAttackName(){
        return attackName;
    }
    
    public int getAttackPower(){
        return attackPower;
    }
    
    public double getRank(){
        return rank;
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
