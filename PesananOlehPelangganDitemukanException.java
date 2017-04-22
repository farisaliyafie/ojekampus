
/**
 * Write a description of class PesananOlehPelangganDitemukanExecption here.
 * 
 * @author (Faris Ali Yafie) 
 * @version (13 April 2017)
 */
public class PesananOlehPelangganDitemukanException extends Exception
{
    // instance variables - replace the example below with your own
    private Pelanggan pelanggan_error;
    
    /**
     * Constructor for objects of class PesananTidakDitemukanException
     */
    public PesananOlehPelangganDitemukanException(Pelanggan pelanggan_input)
    {
        // initialise instance variables
        super("Pesanan oleh ");
        this.pelanggan_error=pelanggan_input;
    } 
    
    public String getMessage(){
        return super.getMessage()+pelanggan_error.getNama()+" tidak ditemukan";
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
