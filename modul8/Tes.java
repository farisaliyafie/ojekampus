package modul8;
import java.util.Random;
import java.util.Collection;
import java.util.Arrays;

/**
 * Write a description of class Tes here.
 * 
 * @author (Faris Ali Yafie) 
 * @version (20 April 2017)
 */
public class Tes
{
    // instance variables - replace the example below with your own
    private static int[] arrayJeda = new int[3];
    
    /**
     * Constructor for objects of class Tes
     */
    public Tes()
    {
        // initialise instance variables  
    }

    public static int random(int awal, int akhir){
        Random angkaRandom = new Random();  
        return angkaRandom.nextInt(100)+1;
    }

    public static int[] pilahJeda(int[] buatJeda){
        Arrays.sort(buatJeda);
        return buatJeda;
    }
    
    public static void main(String args[]) {
        int acak;
        for(acak=0; acak<3; acak++){
            arrayJeda[acak] = random(0, 100);
        }
        arrayJeda = pilahJeda(arrayJeda);
        LombaHitung P1 = new LombaHitung( "Tomi", arrayJeda[2]);
        P1.start();
        arrayJeda = pilahJeda(arrayJeda);
        LombaHitung P2 = new LombaHitung( "Toma", arrayJeda[0]);
        P2.start();        
        arrayJeda = pilahJeda(arrayJeda);
        LombaHitung P3 = new LombaHitung( "Tomo", arrayJeda[1]);
        P3.start();
    }  
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return y;
    }
}
