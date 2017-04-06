package farisaliyafie_6;


/**
 * Write a description of interface Wear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Wear
{
    public void setWeapon(String name, double damage);
    public void setArmor(String nama, double def);
    public String getWeapon();
    public String getArmor();
    public double getWeaponDmg();
    public double getArmorDef();
    
    /**
     * An example of a method header - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    int sampleMethod(int y);
}
