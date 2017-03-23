/**
 * Class will be used to describe user's detail
 * 
 * @author (Faris Ali Yafie)
 * @version (4 Maret 2017)
 */
public class OjeKampus
{
    public static Ojek ojek_farisali;
    public static DatabaseUser database;
    public static DatabasePesanan pes_database;
    public static Lokasi ojek_lokasi, per_yafie_awal, per_yafie_akhir;
    public static Pelanggan p_herdianto;
    public static Pesanan pes_herdianto;
    public static Administrasi administrasi;    
    /**
     * Fungsi utama OjeKampus
     * @param   args    Array string yang dapat menjadi argumen, default:null
     * @return  none
     */
    public static void main(String[] args) {
        Ojek ojek_farisali = new Ojek(DatabaseUser.getIDPelangganTerakhir()
        , "farisali", new Lokasi("UI", 14, 06, "Depok"), "B124UA");
        Pelanggan p_yafie = new Pelanggan(DatabaseUser.getIDPelangganTerakhir(),
        "yafie");
        Lokasi per_yafie_awal = new Lokasi("Bekasi", 5, 7, "perum");
        Lokasi per_yafie_akhir = new Lokasi("Bandung", 6, 7, "nangor");
        Pesanan pes_yafie = new Pesanan(p_yafie, TipeLayanan.AntarOrang, per_yafie_awal, per_yafie_akhir,
        "eka", "pabe", 100000);
        
        DatabaseUser.addOjek(ojek_farisali);
        DatabaseUser.addPelanggan(p_yafie);
        DatabasePesanan.addPesanan(pes_yafie);
        
        DatabaseUser.getUserOjek().toString();
        DatabaseUser.getUserPelanggan().toString();
        
       
        //tugas 4
        //A
        Ojek o_ojek;            //objek untuk Ojek
        Pelanggan o_pelanggan;  //objek untuk Pelanggan
        Lokasi o_lokasi1;       //objek lokasi pertama
        Lokasi o_lokasi2;       //objek lokasi kedua
        Pesanan o_pesanan;      //objek untuk Pesanan
        o_ojek=new Ojek(14, "Aye", new Lokasi("Bekasi", 57, 65, "Rawa"), "B124UA");
        o_pelanggan=new Pelanggan(2, "Faris");         //nilai pada objek Pelanggan
        o_lokasi1=new Lokasi("Bekasi", 65, 57,"perum"); //nilai untuk lokasi pertama
        o_lokasi2=new Lokasi("Depok", 76, 67, "UI");    //nilai untuk lokasi kedua
        o_pesanan=new Pesanan(o_pelanggan, TipeLayanan.AntarOrang , o_lokasi1, o_lokasi2, "Ali", "Yafie", 100);
        
        //B
        DatabaseUser o_dbuser=new DatabaseUser();
        o_dbuser.addPelanggan(o_pelanggan);         //menambahkan pelanggan ke database user
        o_dbuser.addOjek(o_ojek);                   //menambahkan ojek ke database user
        DatabasePesanan o_dbpesanan=new DatabasePesanan();
        o_dbpesanan.addPesanan(o_pesanan);
        
        //C
        System.out.println("Ojek dengan nama "+o_ojek.getNama()+" dan ID "+o_ojek.getID()+" memiliki status "+o_ojek.getStatus());
        System.out.println("Pelanggan dengan nama "+o_pelanggan.getNama()+" memiliki ID "+o_pelanggan.getID());
        
        //D
        Administrasi o_admin=new Administrasi();
        if(o_ojek.getStatus()==StatusOjek.Idle){
            o_admin.pesananDitugaskan(o_pesanan, o_ojek);
            System.out.println("Status ojek sedang "+o_ojek.getStatus()+", ojek dapat menjalankan tugas mengantar ");
        }
        else if(o_ojek.getStatus()==StatusOjek.Antar||o_ojek.getStatus()==StatusOjek.Jemput){
            o_admin.pesananDibatalkan(o_ojek);
            System.out.println("Pesanan telah dibatalkan");
        }
        else if(o_ojek.getStatus()==StatusOjek.Antar||o_ojek.getStatus()==StatusOjek.Jemput){
            o_admin.pesananSelesai(o_ojek);
            System.out.println("Pesanan telah selesai dilakukan");
        }
        
        //7
        Ojek ojek_7=new Ojek(2, "Faris", new Lokasi("Pocin", 14, 10, "Depok"), "B124UA");
        ojek_7.setNama("Faris");
        ojek_7.setNoPlat("B124UA");
        Pelanggan pelanggan_7=new Pelanggan(2, "Ali Yafie");
        pelanggan_7.setNama("Ali Yafie");
        pelanggan_7.setTelefon("08966767100");
        
        System.out.println("Print hasil objek :");
        System.out.println("Objek ojek :"+ojek_7);
        System.out.println("No Plat :");
        System.out.println("Objek pelanggan :"+pelanggan_7);
    }
}
