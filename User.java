import java.util.Date;
import java.util.regex.*;

/**
 * Abstract class User - write a description of the class here
 * @author (Faris Ali Yafie)
 * @version (8 April 2017)
 */
public abstract class User
{
    protected int id;
    protected String nama,telefon,email;
    protected Date dob;
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_PHONE_NUM_ID = Pattern.compile("^08[0-9]{9,}$");

    /**
     * Constructor yang telah dibuat saat kelas User dibuat berisi id, nama.
     * @param id untuk id ojek
     * @param nama untuk nama ojek
     */
    /*public User(int id, String nama)
    {
       this.id = id;
       this.nama = nama;
    }*/

    /**
     * Method untuk Mendapatkan ID ojek
     * @return id mengembalikan nilai ID ojek
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * Method untuk Mendapatkan no telefon ojek
     * @return no telefon mengembalikan nilai no telefon ojek
     */
    public String getTelefon()
    {
        return telefon;
    }
    
    /**
     * Method untuk Mendapatkan email ojek
     * @return email mengembalikan nilai email ojek
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Method untuk Mendapatkan DOB ojek
     * @return DOB mengembalikan nilai DOB ojek
     */
    public Date getDOB()
    {
        return dob;
    }
    
    /**
     * Method untuk Mendapatkan nama ojek
     * @return nama = nilai nama ojek
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Method untuk Men-set ID ojek
     * @param id untuk id ojek baru
     */
    public void setID(int id)
    {
        this.id=id;
    }
    
    /**
     * Method untuk Men-set nama ojek
     * @param nama untuk nama ojek baru
     */
    public void setNama(String nama)
    {
        this.nama=nama;
    }
    
    /**
     * Method untuk Men-set DOB ojek
     * @param day,month,year untuk tanggal lahir ojek
     */
    public void setDOB(Date dob)
    {
        this.dob=dob;
    }
    
    /**
     * Method untuk Men-set no telefon ojek
     * @param telefon untuk no telefon ojek baru
     * @return true mengembalikan nilai betul jika sesuai dengan pattern
     * @return true mengembalikan salah betul jika tidak sesuai dengan pattern
     */
    public boolean setTelefon(String telefon)
    {
        Pattern pattern = Pattern.compile("^08[0-9]{10,12}$");
        Matcher matcher = pattern.matcher(telefon);
        if(matcher.matches())
        {
            this.telefon = telefon;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Method untuk Men-set email ojek
     * @param email untuk email ojek baru
     * @return true mengembalikan nilai betul jika sesuai dengan pattern
     * @return true mengembalikan salah betul jika tidak sesuai dengan pattern
     */
    public boolean setEmail(String email)
    {
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$");
        Matcher matcher = pattern.matcher(email);
        this.email=email;
        if(matcher.matches())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
