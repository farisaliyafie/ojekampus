
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
        super("Pesanan yang dipesan oleh");
        pesanan_error = pesanan_input;
    }

    public String getMessage()
    {
        return super.getMessage() + pesanan_error.getPelanggan().getNama() 
        + " tidak ditemukan";
    }
}
