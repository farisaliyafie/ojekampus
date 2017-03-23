/**
 * Class will be used to describe user's detail
 * 
 * @author (Faris Ali Yafie)
 * @version (4 Maret 2017)
 */

public class DatabaseUser
{
    // instance variables - replace the example below with your own
    private static Pelanggan pelanggan_database;
    private static Ojek ojek_database;
    private static int id_ojek_terakhir = 1;
    private static int id_pelanggan_terakhir = 1;

    /**
     *Penammbahan pelanggan ke database
     *@param    baru    Pengguna layanan OjeKampus
     *@return   boolean bukti berhasil atau tidaknya proses penambahan
     */
    public static boolean addPelanggan(Pelanggan baru)
    {
        pelanggan_database=baru;
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
        pelanggan_database=null;
        return true;
    }
    
    /**
     *Penammbahan ojek ke database
     *@param    baru   instansi ojek yang ditambahkan
     *@return   boolean bukti berhasil atau tidaknya proses penambahan
     */
    public static boolean addOjek(Ojek baru) 
    {
        ojek_database=baru;
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
        ojek_database=null;
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
    public static Ojek getUserOjek()
    {
        return ojek_database;
    }
    
    /**
     *  Mendapatkan informasi pelanggan
     *  @param  none               nothing
     *  @return pelanggan_database pengguna ojek
     */
    public static Pelanggan getUserPelanggan()
    {
        return pelanggan_database;
    }
    
}
