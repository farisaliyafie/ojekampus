import java.util.regex.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Class will be used to describe user's detail
 * 
 * @author (Faris Ali Yafie)
 * @version (8 April 2017)
 */
public class Pelanggan extends User
{
    /**
     * Constructor Pelanggan. 
     * Metode yang pertama kali dipanggil ketika sebuah object dari kelas pelanggan diciptakan.
     * @param int id    id pelanggan untuk object pelanggan baru.
     * @param String nama   nama pelanggan untuk object pelanggan baru.
     */
    public Pelanggan(int id, String nama, String telefon) 
    {
        // initialise instance variables
        super(id,nama);
        setTelefon(telefon);
    }
    
    /**
     * printData. 
     * Metode untuk mencetak data pelanggan.
     */    
    public String toString(){
        if(DatabasePesanan.getPesanan(this) == null){
            return "Pelanggan" + " Nama : "+ nama + " Id : "+ id + "No.Tlp : " + telefon + "||";
        }
        Pesanan temp = DatabasePesanan.getPesanan(this);
        return "Pelanggan" + " Nama : "+ nama + " Id : "+ id + "No.Tlp : " + telefon + " Pelanggan Awal :" + temp.getPenggunaAwal() + "||";
    } 
    
}
