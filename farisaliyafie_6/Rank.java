package farisaliyafie_6;


/**
 * Write a description of interface Rank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Rank
{
    public void setAttackName(String name);
    public void setAttackPower(int power);
    public String getAttackName();
    public int getAttackPower();
    public double getRank();
    
    /**
     * An example of a method header - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    int sampleMethod(int y);
}
