import java.util.ArrayList;

/**
 * Class will be used to describe user's detail
 * 
 * @author (Faris Ali Yafie)
 * @version (8 April 2017)
 */

public class DatabaseUser
{
    // instance variables - replace the example below with your own
    private static ArrayList<User> user_database = new ArrayList<User>();
    private static int id_ojek_terakhir=1;
    private static int id_pelanggan_terakhir=1;

    /**
     * Constructor yang telah dibuat saat kelas DatabaseUser dibuat.
     */
    public DatabaseUser()
    {
        //Belum ada isi yang dibutuhkan
    }
    
    /**
     * Method untuk mendapatkan database dari ojek pada arraylist
     * @return mengembalikan nilai dari ojek_database untuk dimasukkan dalam
     * database
     */
    public static ArrayList<Ojek> getOjekDatabase(){
        ArrayList<Ojek>  ojek_database = new ArrayList<Ojek>();
       
        for(User user_temp : user_database){
            if(user_temp instanceof Ojek){
                ojek_database.add((Ojek)user_temp);
            }
        }
        return ojek_database;
    }
    
    /**
     * Method untuk mendapatkan database dari pelanggan pada arraylist
     * @return mengembalikan nilai dari pelanggan_database untuk dimasukkan dalam
     * database
     */
    public static ArrayList<Pelanggan> getPelangganDatabase(){
        ArrayList<Pelanggan>  pelanggan_database = new ArrayList<Pelanggan>();
        for(User user_temp : user_database){
            if(user_temp instanceof Pelanggan){
                pelanggan_database.add((Pelanggan)user_temp);
            }
        }
        return pelanggan_database;
    }
    
    /**
     * Method untuk Menambahkan pelanggan baru
     * @param baru untuk menambahkan pelanggan baru
     * @return true = nilai benar jika ada pelanggan baru
     */
    public static boolean addPelanggan(Pelanggan baru)
    {
        for(User user_temp : user_database){
            if(user_temp.getID() == baru.getID()){
                if(user_temp instanceof Pelanggan){
                    System.out.println("Penambahan pelanggan gagal");
                    return false;
                }
            }
        }
        user_database.add(baru);
        id_pelanggan_terakhir++;
        System.out.println("Penambahan pelanggan berhasil");
        return true;
    }
    
    /**
     * Method untuk Menghapus pelanggan
     * @param id untuk menghapus id pelanggan
     * @return true = nilai benar jika id pelanggan null (tidak ada)
     */
    public static boolean removePelanggan(int id)
    {
        for(User user_temp : user_database){
            if(user_temp.getID() == id){
                if(user_temp instanceof Pelanggan){
                    user_database.remove(user_temp);
                    System.out.println("Penghapusan Pelanggan dengan id " + id + " Berhasil dilakukan");
                    return true;
                }
            }
        }
        System.out.println("ID tidak terdaftar, penghapusan gagal");
        return false;
    }
    
    /**
     * Method untuk Menambahkan ojek baru
     * @param baru untuk menambahkan ojek baru
     * @return true = nilai benar jika ada ojek baru
     */
    public static boolean addOjek(Ojek baru)
    {
        for(User user_temp : user_database){
            if(user_temp.getID() == baru.getID()){
                if(user_temp instanceof Ojek){
                    System.out.println("Penambahan ojek gagal");
                    return false;
                }
            }
        }
        user_database.add(baru);
        id_ojek_terakhir++;
        System.out.println("Penambahan ojek berhasil");
        return true;
    }
    
    /**
     * Method untuk Menghapus ojek
     * @param id untuk menghapus id ojek
     * @return true = nilai benar jika id ojek null (tidak ada)
     */
    public static boolean removeOjek(int id)
    {
        for(User user_temp : user_database){
            if(user_temp.getID() == id){
                if(user_temp instanceof Ojek){
                    user_database.remove(user_temp);
                    System.out.println("Penghapusan Ojek dengan id " + id + " Berhasil dilakukan");
                    return true;
                }
            }
        }
        System.out.println("ID Ojek tidak terdaftar, penghapusan gagal");
        return false;
    }
    
    /**
     * Method untuk Mendapatkan ID ojek terakhir
     * @return id_ojek_terakhir = nilai id ojek terakhir
     */
    public static int getIDOjekTerakhir()
    {
        return id_ojek_terakhir;
    }
    
    /**
     * Method untuk Mendapatkan ID pelanggan terakhir
     * @return id_pelanggan_terakhir = nilai id pelanggan terakhir
     */
    public static int getIDPelangganTerakhir()
    {
        return id_pelanggan_terakhir;
    }
    
    /**
     * Method untuk Mendapatkan id ojek
     * @return ojek_database = nilai id ojek
     */
    public static Ojek getUserOjek(int id)
    {
        for(User user_temp : user_database){
            if(user_temp.getID() == id){
                if(user_temp instanceof Ojek){
                    return (Ojek)user_temp;
                }
            }
        }
        return null;
    }
    
    /**
     * Method untuk Mendapatkan id pelanggan
     * @return ojek_pelanggan = nilai id pelanggan
     */
    public static Pelanggan getUserPelanggan(int id)
    {
       for(User user_temp : user_database){
            if(user_temp.getID() == id){
                if(user_temp instanceof Pelanggan){
                    return (Pelanggan)user_temp;
                }
            }
        }
        return null;
    }
}