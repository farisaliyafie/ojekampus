import java.util.regex.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

/**
 * Class will be used to describe user's detail
 * 
 * @author (Faris Ali Yafie)
 * @version (8 April 2017)
 */
public class Ojek extends User
{
    // instance variables - replace the example below with your own
    private StatusOjek status = StatusOjek.Idle;
    private Lokasi posisi_sekarang;
    private Pesanan pesanan_sekarang = null;
    private String no_plat;
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_PHONE_NUM_ID = Pattern.compile("^08[0-9]{9,}$");
    public static final Pattern VALID_PLAT_NUM_ID = Pattern.compile("^[A-Z]{1,3}+[0-9]{1,4}+[A-Z]{1,4}$",  Pattern.CASE_INSENSITIVE);
 
    /**
     * Constructor yang telah dibuat saat kelas Ojek dibuat berisi id, nama, lokasi.
     * @param id untuk id ojek
     * @param nama untuk nama ojek
     * @param posisi_sekarang untuk lokasi ojek
     */
    public Ojek(int id, String nama, Lokasi posisi_sekarang)
    {
        // initialise instance variables
        super.id=id;
        super.nama=nama;
        this.posisi_sekarang = posisi_sekarang;
    }
    
    public Ojek(int id, String nama, String telefon, String email, Date date, String no_plat, Lokasi posisiSekarang)
    {
        super.id = id;
        super.nama = nama;
        super.telefon = telefon;
        super.email = email;
        super.dob = date;
        this.no_plat = no_plat;
        this.posisi_sekarang = posisi_sekarang;
    }

    /**
     * Method untuk menampilkan data pada kelas Ojek
     */
    public String toString(){
    if(pesanan_sekarang == null)
    {
        return "\nOjek" + " Id: "+id + " Nama: "+ nama + " Status:" + status.toString();
    }
    else
    {
        Pelanggan temp = pesanan_sekarang.getPelanggan();
        return "\nOjek" + " Id: "+id + " Nama: "+ nama + " Status:" + status.toString() + " Pelanggan:" + temp.getNama();
    }
    }
   
    /**
     * Method untuk Men-set no plat ojek
     * @param no plat untuk no plat ojek baru
     * @return true mengembalikan nilai betul jika sesuai dengan pattern
     * @return true mengembalikan salah betul jika tidak sesuai dengan pattern
     */
    public boolean setNoPlat(String no_plat)
    {
        Pattern pattern = Pattern.compile("[A-Z]\\d{1,4}[A-Z]{1,3}");
        Matcher matcher = pattern.matcher(no_plat);
        if(matcher.matches())
        {
            this.no_plat = no_plat;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Method untuk Men-set pesan ojek
     * @param pesan untuk pesan ojek baru
     */
    public void setPesanan(Pesanan pesan)
    {
        pesanan_sekarang = pesan;
    }
    
    /**
     * Method untuk Men-set lokasi ojek sekarang
     * @param sekarang untuk lokasi ojek baru
     */
    public void setPosisi(Lokasi sekarang)
    {
        posisi_sekarang = sekarang;
    }
    
    /**
     * Method untuk Men-set status ojek
     * @param status untuk status ojek baru
     */
    public void setStatus(StatusOjek status)
    {
        this.status=status;
    }
    
    /**
     * Method untuk Mendapatkan pesanan ojek
     * @return pesan = nilai pesanan ojek
     */
    public Pesanan getPesanan()
    {
        return pesanan_sekarang;
    }
    
    /**
     * Method untuk Mendapatkan posisi ojek sekarang
     * @return posisi_sekarang = nilai posisi ojek sekarang
     */
    public Lokasi getPosisi()
    {
        return posisi_sekarang;
    }
    
    /**
     * Method untuk Mendapatkan status ojek
     * @return status = nilai status ojek
     */
    public StatusOjek getStatus()
    {
        return status;
    }
    
}
