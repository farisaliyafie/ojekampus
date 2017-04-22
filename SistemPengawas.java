
/**
 * Write a description of class SistemPengawas here.
 * 
 * @author (Faris Ali Yafie) 
 * @version (1406576710)
 */
public class SistemPengawas implements Runnable
{
    // instance variables - replace the example below with your own

    private Thread t;
    private String ThreadName;
    private boolean program_run;
    private int waktu_cek;

    public void start(){
        System.out.println("Starting " + ThreadName);        
        if (t == null) {
         t = new Thread (this);
         t.start();
        }        
    }
    
    public void run(){
        System.out.println("Running " + ThreadName);        
        while(program_run==true){
            try{
                Administrasi.jalankanSistemPenugas();
                Thread.sleep(waktu_cek);
            }catch(InterruptedException error){
                System.out.println("Thread " + ThreadName + " interrupted.");
            }
            catch(NullPointerException error) {
                exit();
            }
        }
        System.out.println("Thread " + ThreadName + " exiting.");        
    }
    
    public void join() throws InterruptedException{
        t.join();
    }
    
    public void exit(){
        //men-stop thread
        program_run=false;
    }
    
    /**
     * Constructor for objects of class SistemPengawas
     */
    public SistemPengawas(String ThreadName, int waktu_cek)
    {
        // initialise instance variables
        program_run = true;
        this.ThreadName = ThreadName;
        this.waktu_cek = waktu_cek;
        System.out.println("Creating " + ThreadName); 
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
