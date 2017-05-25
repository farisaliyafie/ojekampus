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
     * Constructor yang telah dibuat saat kelas Pelanggan dibuat berisi nama dan id.
     * @param id untuk id pelanggan
     * @param nama untuk nama pelanggan
     */
    public Pelanggan(int id, String nama, String telefon)
    {
        super.id=id;
        super.nama=nama;
        this.setTelefon(telefon);
    }
    
    public Pelanggan(int id, String nama, String telefon, String email)
    {
        super.id = id;
        super.nama = nama;
        super.telefon = telefon;
        super.email = email;
    }
    
    public Pelanggan(int id, String nama, String telefon, String email, Date dob)
    {
        super.nama = nama;
        super.telefon = telefon;
        super.email = email;
        super.dob = dob;
    }
    
    /**
     * Method toString untuk menampilkan data dari pelanggan.
     */
    public String toString(){
        if(DatabasePesanan.getPesanan(this) == null){
            return "Pelanggan" + " Nama : "+ nama + " Id : "+ id + "No.Tlp : " + telefon + "|";
        }
        Pesanan temp = DatabasePesanan.getPesanan(this);
        return "Pelanggan" + " Nama : "+ nama + " Id : "+ id + "No.Tlp : " + telefon + " Pelanggan Awal :" + temp.getPenggunaAwal() + "|";
    } 
}