import java.util.regex.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

/**
 * Class will be used to describe user's detail
 * 
 * @author (Faris Ali Yafie)
 * @version (4 Maret 2017)
 */
public class Ojek
{
    // instance variables - replace the example below with your own
    private StatusOjek status = StatusOjek.Idle;
    private Lokasi posisi_sekarang;
    private Pesanan pesanan_sekarang = null;
    private int id;
    private String nama, telefon, email, no_plat;
    private Date dob;
    private GregorianCalendar g_calendar;

    /**
     * Konstruktor kelas ojek
     * @param   id              no identitas pengemudi
     * @param   nama            nama pengemudi
     * @param   posisi_sekarang lokasi pengemudi sekarang
     * @return  none            nothing
     */
    public Ojek(int id, String nama, Lokasi posisi_sekarang){
        this.id=id;
        this.nama=nama;
        this.posisi_sekarang=posisi_sekarang;
    }

    /**
     * Setter identitas pengemudi
     * @param   id      nilai id yang di set
     * @retun   none    nothing
     */
    public void setID(int id){
        this.id=id;
    }
    
    /**
     * Setter nama pengemudi
     * @param   nama    nama pengemudi yand di set
     * @retun   none    nothing
     */
    public void setNama (String nama){
        this.nama=nama;
    }
    
    public boolean setTelefon (String telefon){
        return false;
    }    
    
    public boolean setEmail (String email){
        Pattern pattern=Pattern.compile("[a-zA-Z]+[@]+[a-z]+.[a-z]+");
        Matcher matcher=pattern.matcher(email);
        this.email=email;
        if(matcher.matches()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean setNoPlat (String no_plat){
        return false;
    }
    
    public void setDOB (int day, int month, int year){
        this.dob=dob;
        GregorianCalendar g_calendar=new GregorianCalendar(year, month, day);
    }
    
    /**
     * Setter pesanan u/ pengemudi
     * @param   pesan   objek pesanan yang di set
     * @return  none    nothing
     */
    public void setPesanan (Pesanan pesan){
        pesanan_sekarang=pesan;
    }
    
    /**
     * Setter lokasi sekarang pengemudi
     * @param   sekarang    objek lokasi u/ informasi posisi
     * @return  none        nothing
     */
    public void setPosisi (Lokasi sekarang){
        posisi_sekarang=sekarang;
    }
    
    /**
     * Setter status pengemudi
     * @param   status  status pengemudi
     * @return  none    nothing
     */
    public void setStatus (StatusOjek status){
        this.status=status;
    }
    
    /**
     * Getter identitas pengemudi
     * @param   none    nothing
     * @return  id      mengembalikan nilai no identitas
     */
    public int getID(){
        return id;
    }
    
    /**
     * Getter nama u/ pengemudi
     * @param   none    nothing
     * @return  nama    mengembalikan nama pengemudi
     */
    public String getNama(){
        return nama;
    }
    
    public String getTelefon(){
        return telefon;
    }    
    
    public String getEmail(){
        return email;
    }
    
    public String getNoPlat(){
        return no_plat;
    }
    
    public Date getDOB(){
        int year           = g_calendar.get(g_calendar.YEAR);
        int month          = g_calendar.get(g_calendar.MONTH);
        int dayOfMonth     = g_calendar.get(g_calendar.DAY_OF_MONTH);
        
        dob=g_calendar.getTime();
        SimpleDateFormat tgl= new SimpleDateFormat("yyyy MM dd");
        tgl= new SimpleDateFormat("yyyy--MM--dd");
        System.out.println(tgl.format(dob));
        return dob;
    }
    
    /**
     * Getter pesanan untuk pengemudi
     * @param   none                nothing
     * @return  pesanan_sekarang    mengembalikan nilai objek pesanan
     */
    public Pesanan getPesanan(){
        return pesanan_sekarang;
    }
    
    /**
     * Getter lokasi sekarang pengemudi
     * @param   none            nothing
     * @return  posisi_sekarang mengembalikan objek lokasi posisi sekarang
     */
    public Lokasi getPosisi(){
        return posisi_sekarang;
    }
    
    /**
     * Getter status dari pengemudi
     * @param   none    nothing
     * @return  status  mengembalikan kondisi status pengemudi
     */
    public StatusOjek getStatus(){
        return status;
    }
    
    /**
     * Cetak informasi identitas, nama dan statusnya
     * @param   none    nothing
     * @return  none 
     */
    public void printData(){
        System.out.println("ID Ojek : " + this.id);
        System.out.println("Nama : " + this.nama);
        System.out.println("Status : " + this.status);
    }
}
