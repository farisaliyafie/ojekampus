
/**
 * Write a description of class Array here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        int angka[]={90,87,84,96,99};
        
        for(int i=0; i<angka.length; i++)
            angka[i]+=5;
        
        for(int i : angka)
            System.out.println(i);
                    
    }
    
    /**
     * Constructor for objects of class Array
     */
    public Array(){
    
    }
    
     
}
