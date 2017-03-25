import java.util.ArrayList;

/**
 * Class will be used to describe user's detail
 * 
 * @author (Faris Ali Yafie)
 * @version (4 Maret 2017)
 */

public class DatabaseUser
{
    // instance variables - replace the example below with your own
    private static int id_ojek_terakhir;
    private static int id_pelanggan_terakhir;
    private static ArrayList<Ojek> ojek_database=new ArrayList<>();
    private static ArrayList<Pelanggan> pelanggan_database=new ArrayList<>();
    
    /**
     *Penammbahan pelanggan ke database
     *@param    baru    Pengguna layanan OjeKampus
     *@return   boolean bukti berhasil atau tidaknya proses penambahan
     */
    public static boolean addPelanggan(Pelanggan baru)
    {
        for(Pelanggan pengguna_temp : pelanggan_database){
            if(pengguna_temp.equals(baru)){
                System.out.println("Penambahan pelanggan gagal");
                 return false;
            }
        }
        pelanggan_database.add(baru);
        System.out.println("Pelanggan berhasil ditambahkan");
        return true;
    }
    
    /**
     *Penghapusan data pelanggan
     *@param    id      nomor identitas pelanggan
     *@return   boolean bukti berhasil atau tidaknya penghapusan
     */
    public static boolean removePelanggan(int id)
    {
        Pelanggan pengguna_temp = getUserPelanggan(id);
        if(pengguna_temp == null){
            System.out.println("ID tidak terdaftar, penghapusan gagal");
            return false;
        }
        pelanggan_database.remove(pengguna_temp);
        System.out.println("Penghapusan Pelanggan dengan id " + id + " Berhasil");
        return true;
    }
    
    /**
     *Penammbahan ojek ke database
     *@param    baru   instansi ojek yang ditambahkan
     *@return   boolean bukti berhasil atau tidaknya proses penambahan
     */
    public static boolean addOjek(Ojek baru) 
    {
        for(Ojek ojek_temp : ojek_database){
            if(ojek_temp.equals(baru)){
                System.out.println("Penambahan ojek gagal");
                 return false;
            }
        }
        ojek_database.add(baru);
        System.out.println("Ojek berhasil ditambahkan");
        return true;
    }
    
    /**
     *Penghapusan ojek dari pelanggan
     *@param    id      nomor identitas ojek
     *@return   boolean bukti berhasil atau tidaknya penghapusan
     */
    public static boolean removeOjek(int id)
    {
        Ojek ojek_temp = getUserOjek(id);
        if(ojek_temp == null){
            System.out.println("ID tidak terdaftar, penghapusan gagal");
            return false;
        }
        ojek_database.remove(ojek_temp);
        System.out.println("Penghapusan Ojek dengan id " + id + " Berhasil");
        return true;
    }
    
    /**
     *Mendapatkan nomor identitas ojek terakhir
     *@param    none                nothing
     *@return   id_ojek_terakhir    nomor identitas ojek terakhir
     */
    public static int getIDOjekTerakhir()
    {
        return id_ojek_terakhir;
    }
    
    /**
     *Mendapatkan nomor identitas pelanggan terakhir
     *@param    none                    nothing
     *@return   id_pelanggan_terakhir   no id pelanggan terakhir
     */
    public static int getIDPelangganTerakhir()
    {
        return id_pelanggan_terakhir;
    }
    
    /**
     *Mendapatkan informasi ojek
     *@param    none            nothing
     *@return   ojek_database   ojek
     */
    public static Ojek getUserOjek(int id)
    {
        for(Ojek ojek_temp : ojek_database){
            if(ojek_temp.getID() == id){
                 return ojek_temp;
            }
        }
        return null;
    }
    
    /**
     *  Mendapatkan informasi pelanggan
     *  @param none nothing
     *  @return pelanggan_database pengguna ojek
     */
    public static Pelanggan getUserPelanggan(int id)
    {
        for(Pelanggan pengguna_temp : pelanggan_database){
            if(pengguna_temp.getID() == id){
                 return pengguna_temp;
            }
        }
        return null;
    }
    
    /**
     * Metode untuk mendapatkan database dari ojek pada arraylist
     * @return mengembalikan nilai dari ojek_database untuk dimasukkan dalam
     * database
     */
    public static ArrayList<Ojek> getOjekDatabase(){
        return ojek_database;
    }
    
    /**
     * Metode untuk mendapatkan database dari pelanggan pada arraylist
     * @return mengembalikan nilai dari pelanggan_database untuk dimasukkan dalam
     * database
     */
    public static ArrayList<Pelanggan> getPelangganDatabase(){
        return pelanggan_database;
    }
}
