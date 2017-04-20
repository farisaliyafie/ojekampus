package modul8;


/**
 * Write a description of class LombaHitung here.
 * 
 * @author (Faris Ali Yafie) 
 * @version (20 April 2017)
 */
public class LombaHitung implements Runnable
{
    // instance variables - replace the example below with your own
    private String nama;
    private Thread x;
    private int jeda;
    
    /**
     * Constructor for objects of class LombaHitung
     */
    LombaHitung(String nama, int jeda)
    {
        // initialise instance variables
        this.nama = nama;
        this.jeda = jeda;
        System.out.println(nama + " hadir");     
    }

        public void start(){
        System.out.println(nama + " bersiap");        
        if (x == null) {
         x = new Thread (this, nama);
         x.start ();
        }        
    }
    
    public void run(){
        System.out.println(nama + " mulai berhitung");        
        try{
            for(int i=0; i<24; i++){
            System.out.println("Kontestan " + nama + " menghitung "+ i);
            // Let the thread sleep for a while.
            Thread.sleep(jeda);
        }
        }catch(InterruptedException error){
            System.out.println("Kontestan " + nama + " interrupted.");
        }        
        System.out.println("Kontestan " + nama + " selesai menghitung.");        
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
