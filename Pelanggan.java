import java.util.regex.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Class will be used to describe user's detail
 * 
 * @author (Faris Ali Yafie)
 * @version (4 Maret 2017)
 */
public class Pelanggan
{
    private int id;
    private String nama, telefon, email;
    private Date dob;

    /**
     *Konstruktor kelas Pelanggan
     *@param    id      nomor identitas pelanggan
     *@param    nama    nama pelanggan
     *@return   retun   nothing
     */
    public Pelanggan(int id, String nama)
    {
        this.id=id;
        this.nama=nama;
    }

    /**
     *Getter indentitas pelanggan ojek
     *@param    none    nothing
     *@retun    id      mengembalikan nilai no identitas
     */
    public int getID()
    {
        return id;
    }

    /**
     *Getter dob
     *@param    none    nothing
     *@retun    dob      mengembalikan nilai dob
     */
    public Date getDOB(){
        return dob;
    }   
    
    /**
     *Getter nama pelanggan ojek
     *@param    none    nothing
     *@retun    nama      mengembalikan nama ojek
     */
    public String getNama(){
        return nama;
    }

    /**
     *Setter no telefon pelanggan ojek
     *@param    id      nilai telefon yang di set
     *@retun    none    nothing
     */
    public boolean setTelefon(String telefon)
    {
       this.telefon = telefon; 
       String telefonPattern="^[0-9]{10,13}$"; //10-13 digit angka
       Pattern pattern = Pattern.compile(telefonPattern);
       Matcher regexMatcher = pattern.matcher(telefon);
       return regexMatcher.find();
    }    

    /**
     *Setter email pelanggan ojek
     *@param    email      nilai email yang di set
     *@retun    none    nothing
     */
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

    /**
     *Setter no telefon pelanggan ojek
     *@param    id      nilai telefon yang di set
     *@retun    none    nothing
     */
    public void setDOB (int day, int month, int year){
       this.dob=dob;
       this.dob = new GregorianCalendar(year, month-1, day).getTime(); 
    }     
    
    /**
     *Setter indentitas pelanggan ojek
     *@param    id      nilai id yang di set
     *@retun    none    nothing
     */
    public void setID(int id)
    {
        this.id=id;
    }
    
    /**
     *Setter nama pelanggan ojek
     *@param    nama    nama pengemudi yang di set
     *@retun    none    nothing
     */
    public void setNama(String nama)
    {
        this.nama=nama;
    }
    
    /**
     *Print informasi identitas dan nama pelanggan
     */
    /*
    public void printData()
    {
        System.out.println("ID Pelanggan : " + this.id);
        System.out.println("Nama : " + this.nama);
    }
    
   /**
    * Method untuk mencetak ID dan Nama Pelanggan.
    */
   public String toString ()
   {
         return "Pelanggan bernama " +nama + " dan ID " +id + " dengan nomor telfon " +telefon + " pelanggan " + " mengirim pesan";
        
   }
}
