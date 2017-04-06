import java.util.ArrayList;
/**
 * Write a description of class Administrasi here.
 * 
 * @author (Faris Ali Yafie) 
 * @version (16 Maret 2017)
 */
public class Administrasi
{
    // instance variables - replace the example below with your own
    private static Pesanan cariPesananIdle(){
        ArrayList<Pesanan>  pesanan = new ArrayList<>();
        pesanan.addAll(DatabasePesanan.getDatabase());
        
        for(Pesanan pesan : pesanan){
            if(pesan.getStatusDiproses() == false){
                if(pesan.getStatusSelesai() == false){
                 return pesan;
                }
            }
        }
        return null;
    }
    
    private static Ojek temukanOjekTerdekat(Pesanan pesan){
        ArrayList<Ojek>  ojek_database = new ArrayList<>();
        Lokasi lokasi_pengguna = pesan.getLokasiAwal();
        ojek_database.addAll(DatabaseUser.getOjekDatabase());
        Ojek ojek_terdekat = null;
        Lokasi lokasi_ojek = null;
        double x=0;
        double y=0;
        double jarak=0;
        int count=0;
        double jarak_terdekat=0;
        for(Ojek ojek_temp : ojek_database){
            if(ojek_temp.getStatus().equals(StatusOjek.Idle)){
                lokasi_ojek = ojek_temp.getPosisi();
                x = Math.abs(lokasi_ojek.getX() - lokasi_pengguna.getX());
                y = Math.abs(lokasi_ojek.getY() - lokasi_pengguna.getY());
                jarak  = Math.sqrt((x*x)+(y*y));
                if(count == 0){
                    jarak_terdekat = jarak;
                    ojek_terdekat = ojek_temp;
                    count++;
                }
                else{
                    if(jarak<jarak_terdekat){
                        ojek_terdekat = ojek_temp;
                    }
                }
            }
        }
        return ojek_terdekat;
    }
    
    public static void pesananDitugaskan(Pesanan pesan, Ojek layanan){
        pesan.setStatusDiproses(true);
        pesan.setStatusSelesai(false);
        pesan.setPelayan(layanan);
        Administrasi admin = new Administrasi();
        admin.ojekAmbilPesanan(pesan, layanan);
    }
    
    public static void ojekAmbilPesanan(Pesanan pesan, Ojek pelayan){
        pelayan.setStatus(StatusOjek.Jemput);
        pelayan.setPesanan(pesan);
    }    
    
    public static void ojekLepasPesanan(Ojek Pelayan){
        Pelayan.setStatus(StatusOjek.Idle);
        Pelayan.setPesanan(null);
    }
    
    public static void pesananDibatalkan(Ojek Pelayan){
        Pesanan pesan = Pelayan.getPesanan();
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(false);
        pesan.setPelayan(null);
        ojekLepasPesanan(Pelayan);
    }
    
    public static void pesananSelesai(Ojek Pelayan){
        Pesanan pesan = Pelayan.getPesanan();
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(true);
        pesan.setPelayan(null);
        ojekLepasPesanan(Pelayan);
    }
    
    public static void pesananDibatalkan(Pesanan pesan){
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(false);
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setPelayan(null);
    }
    
    public static void pesananSelesai(Pesanan pesan){
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(true);
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setPelayan(null);
    }
    
    /**
     * Metode untuk memberi pemberitahuan jika ada pesanan dibatalkan (untuk pelanggan)
     * @param pengguna untuk pelanggan
     */
    public static void pesananDibatalkan(Pelanggan pengguna){
        Pesanan pesan = DatabasePesanan.getPesanan(pengguna);
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(false);
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setPelayan(null);
    }
    
    public static void pesananSelesai(Pelanggan pengguna){
        Pesanan pesan = DatabasePesanan.getPesanan(pengguna);
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(true);
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setPelayan(null);
    }    
    
    /**
     * Metode untuk menampilkan data ojek database
     */
    public static void printOjekDatabase(){
        System.out.println("Database Ojek : " + DatabaseUser.getOjekDatabase());
    }
    
    /**
     * Metode untuk menampilkan data pelanggan database
     */
    public static void printPelangganDatabase(){
        System.out.println("Database Pelanggan : " + DatabaseUser.getPelangganDatabase());
    }
    
    /**
     * Metode untuk menampilkan pesanan database
     */
    public static void printPesananDatabase(){
        System.out.println("Database Pesanan : " + DatabasePesanan.getDatabase());
    }
    
    /**
     * Metode untuk menampilkan data semua database
     */
    public static void printAllDatabase(){
        printPesananDatabase();
        printPelangganDatabase();
        printOjekDatabase();
    }
    
    public static void jalankanSistemPenugas(){
        Pesanan pesanan_idle = cariPesananIdle();
        Ojek ojek_terdekat = temukanOjekTerdekat(pesanan_idle);
        pesananDitugaskan(pesanan_idle,ojek_terdekat);
    }
    
    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod()
    {
        // put your code here
        return 0;
    }
    
}
