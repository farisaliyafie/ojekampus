package farisaliyafie_6;

import java.util.Random;
/**
 * Write a description of class Play here.
 * 
 * @author (Faris Ali Yafie) 
 * @version (case study modul 6)
 */
public class Play
{
    // instance variables - replace the example below with your own
    private Hero player;
    private Monster enemy;
    private Random rand;
    private int enemyCount;
    
    /**
     * Constructor for objects of class Play
     */
    private Play(){
         initialize();

         System.out.println("War start!");
        
         for (int i = 1; !player.isDead(); i++)
         {
             print(i);
             System.out.println("\nHero = " + player.getName() + ", level = " + player.getLevel() + "\nEnemy = " + enemy.getName() + ", level = " + player.getLevel());
             if (enemy.isDead())
             {
                 System.out.println("Enemy died! Spawning new enemy!");
                 player.levelUp();
                 enemyCount = enemyCount + 1;
                 initializeEnemy();
                 System.out.println("Player level up! Level = " + player.getLevel());
             }
         }
        
         System.out.println("Hero mati pada level " + player.getLevel());
    }
    
    private void initialize(){
        rand=new Random();
        player=new Hero("Outvoker", 1);
        player.setRank(setRank("Moon Strike", 100));
        player.setWeapon("Sauq Xew Troxe", 10.0);
        player.setArmor("Energy Balls", 30.0);
        enemyCount = 1;
        initializeEnemy();
    }
    
    private void initializeEnemy(){
        enemy=new Monster("Creep", enemyCount);
        enemy.setRank(setRank("Magic Ball", rand.nextInt(100-50)+50));
        enemy.setWeapon("Staff", rand.nextInt(25-5) + 5);
        enemy.setArmor("Skin", rand.nextInt(25-5) + 5);
    }
    
    private Rank setRank(String name, int power){
        int levelRank=player.getLevel()%3;
        Rank rank;
        if(levelRank==1){
            rank = new Tank(name, power);
        } else if (levelRank==2){
            rank = new Normal(name, power);
        } else {
            rank = new Damager(name, power);
        }
        return rank;
    }
    
    private void attackTurn(Entity attacker, Entity defender){
        int damage = attacker.getDamage(defender.getDefense(), defender.getRank().getRank());
        defender.setHP((double)damage);
        System.out.println("Serangan : " + damage);
    }
    
    public static void main(String[] args){
        Play main = new Play();
    }
    
    private void print(int i){
        Entity attacker, defender;
        System.out.println("\nRound = " + i + "\nKill count = " + (enemyCount - 1) + "\nHero health = " + player.getHP() + ", Enemy health = " + enemy.getHP());
        if(i % 2 != 0){
            attacker = player;
            defender = enemy;
        } else {
            attacker = enemy;
            defender = player;
        }
        attacker.quote();
        attackTurn(attacker, defender);
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
