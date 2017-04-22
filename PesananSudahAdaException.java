
/**
 * Write a description of class PesananSudahAdaException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PesananSudahAdaException extends Exception
{
    // instance variables - replace the example below with your own

    private Pesanan pesanan_error;
    
    /**
     * Constructor for objects of class PesananSudahAdaException
     */
    public PesananSudahAdaException(Pesanan pesanan_input)
    {
        // initialise instance variables
        super("Pelanggan dengan nama ");
        this.pesanan_error=pesanan_input;
    } 
    
    public String getMessage(){
        return super.getMessage()+pesanan_error.getPelanggan().getNama()+
             " sudah melakukan pemesanan dengan tipe layanan "+pesanan_error.getTipeLayanan();
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
