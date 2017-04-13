
/**
 * Write a description of class PesananTidakDitemukanException here.
 * 
 * @author (Faris Ali Yafie) 
 * @version (13 April 2017)
 */
public class PesananTidakDitemukanException extends Exception
{
    // instance variables - replace the example below with your own
    private Pesanan pesanan_error;
    
    /**
     * Constructor for objects of class PesananTidakDitemukanException
     */
    public PesananTidakDitemukanException(Pesanan pesanan_input)
    {
        // initialise instance variables
        super("Pesanan yang dipesan oleh ");
        this.pesanan_error=pesanan_input;
    } 
    
    public String getMessage(){
        return super.getMessage()+pesanan_error.getPelanggan().getNama()+"tidak ditemukan";
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
