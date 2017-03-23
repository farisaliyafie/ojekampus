/**
 * Class will be used to describe user's detail
 * 
 * @author (Faris Ali Yafie)
 * @version (4 Maret 2017)
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private Ojek pelayan=null;
    private Pelanggan pengguna;
    private String pelanggan_awal;
    private String pelanggan_akhir;
    private double biaya;
    private TipeLayanan layanan;
    private Lokasi lokasi_awal;
    private Lokasi lokasi_akhir;
    private boolean diproses = false;
    private boolean selesai = false;


    /**
     * Konstruktor kelas pesanan
     * @param   pengguna        user yang memesan layanan ojek
     * @param   layanan         tipe layanan yang dipesan
     * @param   lokasi_awal     lokasi menjemput pesanan
     * @param   lokasi_akhir    lokasi tujuan pesanan
     * @param   pelanggan_awal  penjelasan benda/orang yang dijemput
     * @param   pelanggan_akhir penjelasan benda/orang yang selesai dilayani
     * @param   biaya           harga pesanan yang diberikan
     * @return  none            nothing
     */
    public Pesanan(Pelanggan pengguna, TipeLayanan layanan, Lokasi 
                   lokasi_awal, Lokasi lokasi_akhir, String
                   pelanggan_awal, String pelanggan_akhir, double biaya)
    {
        this.pengguna=pengguna;
        this.layanan=layanan;
        this.lokasi_awal=lokasi_awal;
        this.lokasi_akhir=lokasi_akhir;
        this.pelanggan_awal=pelanggan_awal;
        this.pelanggan_akhir=pelanggan_akhir;
        this.biaya=biaya;
    }

   public Pesanan(Pelanggan pengguna, TipeLayanan layanan, 
                  Lokasi lokasi_awal, Lokasi lokasi_akhir, 
                  String pelanggan_awal){
       // inisialisasi untuk instance variables pada constructor kelas Pesanan
       this.pengguna = pengguna;
       this.layanan = layanan;
       this.lokasi_awal = lokasi_awal;
       this.lokasi_akhir = lokasi_akhir;
       this.pelanggan_awal = pelanggan_awal;
   }
      
   public Pesanan(Pelanggan pengguna, TipeLayanan layanan, 
                  Lokasi lokasi_awal, Lokasi lokasi_akhir, 
                  String pelanggan_awal, String pelanggan_akhir){
       // inisialisasi untuk instance variables pada constructor kelas Pesanan
       this.pengguna = pengguna;
       this.layanan = layanan;
       this.lokasi_awal = lokasi_awal;
       this.lokasi_akhir = lokasi_akhir;
       this.pelanggan_awal = pelanggan_awal;
       this.pelanggan_akhir = pelanggan_akhir;
   }    
    
    public Ojek getPelayan()
    {
        return pelayan;
    }    
    
    /**
     * Getter status dari pesanan
     * @param   none    nothing
     * @return  boolean false
     */
    public boolean getStatusPesanan()
    {
        return false;
    }
    
    /**
     * Getter pelanggan dari instansi pengguna
     * @param   none        nothing
     * @return  pengguna    instansi dari kelas pengguna sbg penjelasan user
     */
    public Pelanggan getPelanggan()
    {
        return pengguna;
    }
    
    /**
     * Getter ojek dari instansi pelayan
     * @param   nonw    nothing
     * @return  pelayan instansi dari kelas Ojek sbg penjelasan pengemudi
     */
    public Ojek getOjek()
    {
        return pelayan;
    }

    /**
     * Geeter lokasi_awal dari pesanan
     * @param   none            nothing
     * @return  lokasai_awal    lokasi menjemput pesanan
     */
    public Lokasi getLokasiAwal()
    {
        return lokasi_awal;
    }
    
    /**
     * Geeter lokasi_akhir dari pesanan
     * @param   none            nothing
     * @return  lokasai_akhir    lokasi tujuan pesanan
     */
    public Lokasi getLokasiAkhir()
    {
        return lokasi_akhir;
    }
    
    /**
     * Getter layanan dari pesanan
     * @param   none    nothing
     * @return  layanan tipe layanan yang dipesan
     */
    public TipeLayanan getTipeLayanan()
    {
        return layanan;
    }
    
    /**
     * Getter pengguna awal dari pesanan
     * @param   none            nothing
     * @return  pelanggan_awal  bukti benda/orang yang dijemput
     */
    public String getPenggunaAwal()
    {
        return pelanggan_awal;
    }
    
    /**
     * Getter pengguna akhir dari pesanan
     * @param   none            nothing
     * @return  pelanggan_akhir bukti benda/orang yang selesai dilayani
     */
    public String getPenggunaAkhir()
    {
        return pelanggan_akhir;
    }
    
    /**
     * Getter biaya pesanan
     * @param   none    nothing
     * @return  biaya   harga dari pesanan ojek pengguna
     */
    public double getBiaya()
    {
        return biaya;
    }

    /**
     * Metode ini mencetak nama lokasi awal, lokasi akhir, dan tipe layanan
     * @param   none    nothing
     * @return  none
     */
    /*
    public void printData()
    {
        System.out.println("Lokasi awal         : " + this.lokasi_awal.getNama());
        System.out.println("Lokasi akhir        : " + this.lokasi_akhir.getNama());
        System.out.println("Tipe layanan        : " + this.layanan);
        System.out.println("Pelanggan awal      : " + this.pelanggan_awal);
        System.out.println("Pelanggan akhir     : " + this.pelanggan_akhir);
        System.out.println("Status diproses     : " + this.diproses);
        System.out.println("Status selesai      : " + this.selesai);
    }
    */
    
    public void setStatusDiproses(boolean diproses){
        this.diproses=diproses;
    }
    
    public void setStatusSelesai(boolean selesai){
        this.selesai=selesai;
    }
    
    public void setTipeLayanan(TipeLayanan layanan){
        this.layanan=layanan;
    }
    
    public void setPelayan(Ojek pelayan){
        this.pelayan=pelayan;
    }    
    
    public boolean getStatusDiproses(){
        return false;
    }
    
    public boolean getStatusSelesai(){
        return false;
    }

    /**
    * Method untuk mencetak lokasi awal, akhir dan tipe layanan.
    */
    public String toString (){
       String final_status = "KOSONG";
       if (diproses == true && selesai == false){
           final_status = "DIPROSES";
       }
       else if (diproses == false && selesai == false){
           final_status = "KOSONG";
       }
       else if (diproses == false && selesai == true){
           final_status = "SELESAI";
       }
       
       if (pelayan == null && pelanggan_akhir != null){
               return ("Dibuat oleh " + pengguna.getNama() + " untuk " + pelanggan_awal + " di " + lokasi_awal.getNama() + " ke " + pelanggan_akhir + " di " + 
               lokasi_akhir.getNama() + " dengan layanan " + layanan + " status " + final_status + " || ");
           }
       else if(pelayan == null && pelanggan_akhir == null){
               return ("Dibuat oleh " + pengguna.getNama() + " untuk " + pelanggan_awal + " di " + lokasi_awal.getNama() + " ke "+ lokasi_akhir.getNama() + 
               " dengan layanan " + layanan +" status " + final_status + " || ");
       }
       else if (pelayan != null && pelanggan_akhir != null){
               return ("Dibuat oleh " + pengguna.getNama() + " untuk " + pelanggan_awal + " di " + lokasi_awal.getNama() + " ke " + pelanggan_akhir + " di " 
               + lokasi_akhir.getNama() + " dengan layanan " + layanan + " status " + final_status + " || Diproses oleh " + pelayan.getNama());
       }
       else{
               return ("Dibuat oleh " + pengguna.getNama() + " untuk " + pelanggan_awal + " di " + lokasi_awal.getNama() + " ke "+ lokasi_akhir.getNama() 
               + " dengan layanan " + layanan +" status " + final_status + " || Diproses oleh " + pelayan.getNama());
       }
       }
}
