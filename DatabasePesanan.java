/**
 * Class will be used to describe user's detail
 * 
 * @author (Faris Ali Yafie)
 * @version (4 Maret 2017)
 */
public class DatabasePesanan
{
   
    private static Pesanan list_pesanan; 

    /**
     *Penambahan pesanan baru kedalam catatan
     *@param    pesan   pesanan layanan ojek
     *@return   boolean untuk bukti berhasil atau tidaknya penambahan
     */
    public static boolean addPesanan(Pesanan pesan)
    {
        list_pesanan=pesan;
        return true;
    }
    
    /**
     *Penghapusan pesanan dari dalam catatan
     *@param    pesan   pesanan layanan ojek
     *@return   boolean untuk bukti berhasil atau tidaknya penghapusan
     */
    public static boolean hapusPesanan(Pesanan pesan)
    {
        list_pesanan=null;
        return true;
    }
     
    /**
     *Getter pesanan melalui catatan
     *@param    none            nothing
     *@return   list_pesanan    menyimpanan data dari seluruh instansi
     *                          pesanan yang ditambahkan
     */
    public static Pesanan getPesanan()
    {
        return list_pesanan;
    }
    
 
    

    
}
