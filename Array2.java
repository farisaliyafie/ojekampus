import java.util.*;

/**
 * Write a description of class Array2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array2
{
    // instance variables - replace the example below with your own
    //telur, baso, eskrim, siomay 
    
    public static void main(String[] args){
        String[] makanan={"telur", "baso", "eskrim", "siomay"};
        ArrayList<String> listmakanan = new ArrayList<String>();
        
        for(String i : makanan)
            listmakanan.add(i);
            
        String[] makanan1={"telur", "eskrim"};
        ArrayList<String> listmakanan1 = new ArrayList<String>();
        
        for(String j : makanan1)
            listmakanan1.add(j);
        
        System.out.println(listmakanan);
        System.out.println(listmakanan1);
        
        metode_iterator(listmakanan, listmakanan1);
        System.out.println(listmakanan);
    }
    
    public static void metode_iterator(ArrayList<String> a, ArrayList<String> a1){
        Iterator<String> iterator = a.iterator();
        while(iterator.hasNext()){
            if(a1.contains(iterator.next()))
                iterator.remove();
        }
    }
    
    /**
     * Constructor for objects of class Array2
     */
    public Array2()
    {
       
    }
    
}
