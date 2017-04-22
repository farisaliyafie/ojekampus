import java.util.Scanner;

/**
 * Write a description of class demo7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class demo7
{
    // instance variables - replace the example below with your own
    private static boolean selesai = true;
    private static int a, b, c;
    
    public static void main(String[] args){
        while(selesai==true){
            try{
                System.out.print("Masukkan nilai pertama : ");
                a = Integer.parseInt(new Scanner(System.in).nextLine());
                System.out.print("Masukkan nilai kedua : ");
                b = Integer.parseInt(new Scanner(System.in).nextLine());
                int c= a + b;
                System.out.print(a + " + " + b + " = " + c);
                selesai=false;
            }catch(IllegalArgumentException error){
                System.out.println("Masukkan salah!!");
                selesai=true;
            }
        }
    } 
    
    /**
     * Constructor for objects of class demo7
     */
    public demo7()
    {
        // initialise instance variables
        
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
