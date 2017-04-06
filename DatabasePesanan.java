import java.util.ArrayList;

/**
 * Class will be used to describe user's detail
 * 
 * @author (Faris Ali Yafie)
 * @version (4 Maret 2017)
 */
public class DatabasePesanan
{
   
    private static ArrayList<Pesanan> list_pesanan=new ArrayList<>(); 

    /**
     *Penambahan pesanan baru kedalam catatan
     *@param    pesan   pesanan layanan ojek
     *@return   boolean untuk bukti berhasil atau tidaknya penambahan
     */
    public static boolean addPesanan(Pesanan pesan)
    {
        Pelanggan pengguna = pesan.getPelanggan();
        if(getPesanan(pengguna)==null){
            System.out.println("Pesanan berhasil dilakukan");
            list_pesanan.add(pesan);
            return true;
        }
        System.out.println("Pesanan gagal");
        return false;
    }
    
    public static ArrayList<Pesanan> getDatabase()
    {
        return list_pesanan;
    }
    
    /**
     *Getter pesanan melalui catatan
     *@param    none            nothing
     *@return   list_pesanan    menyimpanan data dari seluruh instansi
     *                          pesanan yang ditambahkan
     */
    public static Pesanan getPesanan(Pelanggan pengguna)
    {
       for(Pesanan pesan : list_pesanan){
            if(pesan.getPelanggan().equals(pengguna)){
                 return pesan;
            }
       }
       return null;
    }
    
    /**
     *Penghapusan pesanan dari dalam catatan
     *@param    pesan   pesanan layanan ojek
     *@return   boolean untuk bukti berhasil atau tidaknya penghapusan
     */
    public static boolean hapusPesanan(Pesanan pesan)
    {
        if(pesan.getPelayan()== null){
            return false;
        }
        list_pesanan.remove(pesan);
        return true;
    }
    
    public static boolean hapusPesanan(Pelanggan pengguna)
    {
        Pesanan pesan = getPesanan(pengguna);
        if(pesan.getPelayan()== null){
            list_pesanan.remove(pesan);
            return true;
        }
        
        return false;
    }
    
}
