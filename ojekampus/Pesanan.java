/**
 * Class will be used to describe user's detail
 * 
 * @author (Faris Ali Yafie)
 * @version (8 April 2017)
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
    private Ojek pelayan = null;
    private Pelanggan pengguna;
    private String pelanggan_awal;
    private String pelanggan_akhir;
    private double biaya;
    private TipeLayanan layanan;
    private Lokasi lokasi_awal;
    private Lokasi lokasi_akhir;
    private boolean diproses;
    private boolean selesai;
    
    /**
     * Constructor Pesanan. 
     * Metode yang pertama kali dipanggil ketika sebuah object dari kelas pesanan diciptakan.
     * @param Pelanggan pengguna    Pelanggan yang memesan Pesanan.
     * @param String layanan  nama pelanggan untuk object pelanggan baru.
     * @param Lokasi lokasi_awal    lokasi awal dari sebuah pesanan. 
     * @param Lokasi lokasi_akhir   lokasi tujuan dari sebuah pesanan.
     * @param String pelanggan_awal     nama dari pelanggan yang akaan diantar/memberikan barang untuk diantar.
     * @param String pelanggan_akhir    nama dari pelanggan yang akaan diantar/diberikan barang yang diantar.
     * @param double biaya  biaya layanan dari sebuah pesanan.
     */
    
    public Pesanan(Pelanggan pengguna, TipeLayanan layanan, Lokasi lokasi_awal, Lokasi lokasi_akhir, String pelanggan_awal, String pelanggan_akhir, double biaya)
    {
        this.pengguna = pengguna;
        this.layanan = layanan;
        this.lokasi_awal = lokasi_awal;
        this.lokasi_akhir = lokasi_akhir;
        this.pelanggan_awal = pelanggan_awal;
        this.pelanggan_akhir = pelanggan_akhir;
        this.biaya = biaya;
    }

    
    public Pesanan(Pelanggan pengguna, TipeLayanan layanan, Lokasi lokasi_awal, Lokasi lokasi_akhir, String pelanggan_awal)
    {
        this.pengguna = pengguna;
        this.layanan = layanan;
        this.lokasi_awal = lokasi_awal;
        this.lokasi_akhir = lokasi_akhir;
        this.pelanggan_awal = pelanggan_awal;
    }
    
    public Pesanan(Pelanggan pengguna, TipeLayanan layanan, Lokasi lokasi_awal, Lokasi lokasi_akhir, String pelanggan_awal, String pelanggan_akhir)
    {
        this.pengguna = pengguna;
        this.layanan = layanan;
        this.lokasi_awal = lokasi_awal;
        this.lokasi_akhir = lokasi_akhir;
        this.pelanggan_awal = pelanggan_awal;
        this.pelanggan_akhir = pelanggan_akhir;
    }
    
    /**
     * printData. 
     * Metode untuk mencetak data pesanan.
     */   
    public String toString()
    {
        String final_status = "KOSONG";
        if(diproses == true && selesai == false){
            final_status = "DIPROSES";
        }
        else if(diproses == false && selesai == false){
            final_status = "KOSONG";
        }
        else if(diproses == false && selesai == true){
            final_status = "SELESAI";
        }
        else{}
        if(pelayan == null){
            if(pelanggan_akhir != null){
                return ("Dibuat oleh " + pengguna.getNama() + " untuk " + pelanggan_awal + " di " + lokasi_awal.getNama() + " ke " +
                pelanggan_akhir + " di " + lokasi_akhir.getNama() + " dengan layanan " + layanan + " status " + final_status + " || ");
            }
            return ("Dibuat oleh " + pengguna.getNama() + " untuk " + pelanggan_awal + " di " + lokasi_awal.getNama() + " ke "+ 
            lokasi_akhir.getNama() + " dengan layanan " + layanan + " status " + final_status + " || ");
        }
        if(pelanggan_akhir != null){
            return ("Dibuat oleh " + pengguna.getNama() + " untuk " + pelanggan_awal + " di " + lokasi_awal.getNama() + " ke " +
            pelanggan_akhir + " di " + lokasi_akhir.getNama() + " dengan layanan " + layanan 
            +" status " + final_status + " || Diproses oleh " + pelayan.getNama());
        }
        return ("Dibuat oleh " + pengguna.getNama() + " untuk " +
        pelanggan_awal + " di " + lokasi_awal.getNama() + " ke "+
        lokasi_akhir.getNama() + " dengan layanan " + layanan +
        " status " + final_status + " || Diproses oleh " +
        pelayan.getNama());
    }
    
    /**
     * getStatusPesanan. 
     * Metode yang akan mengembalikan status dari pesanan ketika dipanggil.
     * @return boolean diproses   status dari pesanan.
     */  
    public boolean getStatusDiproses()
    {
        return diproses;
    }
    
    public boolean getStatusSelesai()
    {
        return selesai;
    }
    
    /**
     * getPelanggan. 
     * Metode yang akan mengembalikan data pelanggan ketika dipanggil.
     * @return Pelanggan pengguna   data pelanggan yang memesan pesanan.
     */  
    public Pelanggan getPelanggan()
    {
        return pengguna;
    }
    
    /**
     * getOjek. 
     * Metode yang akan mengembalikan data Ojek yang menjalankan pesanan ketika dipanggil.
     * @return Ojek pelayan   data Ojek yang menjalankan pesanan.
     */  
    public Ojek getPelayan()
    {
        return pelayan;
    }
    
    /**
     * getLokasiAwal. 
     * Metode yang akan mengembalikan data lokasi awal dari pesanan ketika dipanggil.
     * @return Lokasi lokasi_awal   data lokasi awal dari pesanan .
     */ 
    public Lokasi getLokasiAwal()
    {
        return lokasi_awal;
    }
    
    /**
     * getLokasiAkhir. 
     * Metode yang akan mengembalikan data lokasi akhir dari pesanan ketika dipanggil.
     * @return Lokasi lokasi_akhir   data lokasi akhir dari pesanan .
     */ 
    public Lokasi getLokasiAkhir()
    {
        return lokasi_akhir;
    }
    
    /**
     * getTipeLayanan. 
     * Metode yang akan mengembalikan jenis layanan dari pesanan ketika dipanggil.
     * @return String layanan  jenis layanan dari pesanan .
     */ 
    public TipeLayanan getTipeLayanan()
    {
        return layanan;
    }
    
    /**
     * getPenggunaAwal. 
     * Metode yang akan mengembalikan nama pelanggan awal dari pesanan ketika dipanggil.
     * @return String pelanggan_awal  nama pelanggan awal dari pesanan .
     */ 
    public String getPenggunaAwal()
    {
        return pelanggan_awal;
    }
    
    /**
     * getPenggunaAkhir. 
     * Metode yang akan mengembalikan nama pelanggan akhir dari pesanan ketika dipanggil.
     * @return String pelanggan_awal  nama pelanggan akhir dari pesanan .
     */ 
    public String getPenggunaAkhir()
    {
        return pelanggan_akhir;
    }
    
    /**
     * getBiaya. 
     * Metode yang akan mengembalikan jumlah biaya pesanan ketika dipanggil.
     * @return int biaya   jumlah biaya pesanan.
     */  
    public double getBiaya()
    {
        return biaya;
    }
    
    public void setPelayan(Ojek pelayan){
        this.pelayan = pelayan;
    }
    
    public void setPelanggan(Pelanggan pengguna){
        this.pengguna = pengguna;
    }
    
    public void setPenggunaAwal(String pelanggan_awal){
        this.pelanggan_awal = pelanggan_awal;
    }
    
    public void setPenggunaAkhir(String pelanggan_akhir){
        this.pelanggan_akhir = pelanggan_akhir;
    }
    
    public void setBiaya(double biaya){
        this.biaya = biaya;
    }
    
    public void setTipeLayanan(TipeLayanan layanan){
        this.layanan = layanan;
    }
    
    public void setLokasiAwal(Lokasi lokasi_awal){
        this.lokasi_awal = lokasi_awal;
    }
    
    public void setLokasiAkhir(Lokasi lokasi_akhir){
        this.lokasi_akhir = lokasi_akhir;
    }
    
    public void setStatusDiproses(Boolean diproses){
        this.diproses = diproses;
    }
    
    
    public void setStatusSelesai(Boolean selesai){
        this.selesai = selesai;
    }
    
}
