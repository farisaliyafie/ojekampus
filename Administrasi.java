
/**
 * Write a description of class Administrasi here.
 * 
 * @author (Faris Ali Yafie) 
 * @version (16 Maret 2017)
 */
public class Administrasi
{
    // instance variables - replace the example below with your own
    private int x;
    
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
        Pelayan.getPesanan().setStatusDiproses(false);
    }
    
    public static void pesananDibatalkan(Ojek Pelayan){
        Pelayan.getPesanan().setStatusDiproses(false);
        Pelayan.getPesanan().setStatusSelesai(false);
        Pelayan.setPesanan(null);
        ojekLepasPesanan(Pelayan);
    }
    
    public static void pesananSelesai(Ojek Pelayan){
        Pelayan.getPesanan().setStatusDiproses(false);
        Pelayan.getPesanan().setStatusSelesai(true);
        Pelayan.getPesanan().setPelayan(null);
        ojekLepasPesanan(Pelayan);        
    }
    
    public static void pesananDibatalkan(Pesanan pesan){
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(false);  
        pesan.setPelayan(null);
        ojekLepasPesanan(pesan.getPelayan());
    }
    
    public static void pesananSelesai(Pesanan pesan){
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(true);
        pesan.setPelayan(null);
        ojekLepasPesanan(pesan.getPelayan());
    }
    
    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
}
