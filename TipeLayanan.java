
/**
 * Enumeration class TipeLayanan - write a description of the enum class here
 * 
 * @author (Faris Ali Yafie)
 * @version (8 April 2017)
 */
public enum TipeLayanan
{
    AntarBarang("Antar Barang"),
    AntarOrang("Antar Orang"),
    BeliBarang("Beli Barang");
    
    private String deskripsi;
    
    /**
     * Method untuk mendapatkan TipeLayanan
     * @param deskripsi untuk deskripsi dari enum yang dibuat
     */
    TipeLayanan(String deskripsi)
    {
        this.deskripsi = deskripsi;
    }

    /**
     * Method untuk menampilkan deskripsi yang sudah dibuat
     */
    public String toString(){
        return this.deskripsi;
    }
    
    public static void main(String[] args) {
        System.out.println(TipeLayanan.AntarBarang.toString());
        System.out.println(TipeLayanan.AntarOrang.toString());
        System.out.println(TipeLayanan.BeliBarang.toString());
    }
}
