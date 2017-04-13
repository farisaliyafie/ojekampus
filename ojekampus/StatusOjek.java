
/**
 * Enumeration class StatusOjek - write a description of the enum class here
 * 
 * @author (Faris Ali Yafie)
 * @version (8 April 2017)
 */
public enum StatusOjek
{    
    Antar("Mengantar"),
    Idle("Idle"),
    Jemput("Menjemput");
    
    private String deskripsi;
    
    /**
     * Method untuk mendapatkan StatusOjek
     * @param deskripsi untuk deskripsi dari enum yang dibuat
     */
    StatusOjek(String deskripsi)
    {
        this.deskripsi = deskripsi;
    }

    /**
     * Method untuk menampilkan deskripsi yang sudah dibuat
     */
    public String toString(){
        return this.deskripsi;
    }
    
    public String getIDStatus(){
        return deskripsi;
    }
    
    public static void main(String[] args){
        System.out.println(StatusOjek.Antar.toString());
        System.out.println(StatusOjek.Idle.toString());
        System.out.println(StatusOjek.Jemput.toString());
    }
}
