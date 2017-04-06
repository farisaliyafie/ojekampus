package farisaliyafie_6;


/**
 * Abstract class Entity - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Entity implements Wear
{
    // instance variables - replace the example below with your own
    protected String name, weapon, armor;
    protected int level, health, maxHP, strength;
    protected double weaponDmg, armorDef, attack, defense;
    protected boolean dead;
    private Rank rank;

    public Entity (String name, int level){
        this.name=name;
        this.level=level;
        fullHP();
    }
    
    protected void levelUp(){
        this.level=level+1;
        fullHP();
    }
    
    protected void setHP(double diff){
        health-=diff;
        if(health<0){
            dead=true;
        }
        
    }
    
    protected int getDamage(double def, double opRank){
        return 0;
    }
    
    protected void setPower(){
        attack=strength*(1+(weaponDmg/100));
        defense=strength*(1+(armorDef/100));
    }
    
    protected String getName(){
        return name;
    }
    
    protected int getLevel(){
        return level;
    }
    
    protected int getHP(){
        return health;
    }
    
    protected boolean isDead(){
        return dead;
    }
    
    protected void setRank(Rank rank){
        this.rank=rank;
    }
    
    protected Rank getRank(){
        return rank;
    }
    
    protected double getAttack(){
        return attack;
    }
    
    protected double getDefense(){
        return defense;
    }
    
    protected void fullHP(){
        
    }
    
    protected void quote(){
        
    }
    
    public void setWeapon (String name, double dmg){
        this.name=name;
        dmg=dmg;
        setPower();
    }
    
    public void setArmor(String name, double def){
        this.name=name;
        def=def;
        setPower();
    }
    
    public String getWeapon(){
        return weapon;
    }
    
    public String getArmor(){
        return armor;
    }
    
    public double getWeaponDmg(){
        return weaponDmg;
    }
    
    public double getArmorDef(){
        return armorDef;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return y;
    }
}
