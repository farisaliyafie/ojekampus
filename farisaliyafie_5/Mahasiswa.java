package farisaliyafie_5;


/**
 * Write a description of class Mahasiswa here.
 * 
 * @author (Faris Ali Yafie) 
 * @version (Array dan ArrayList)
 */
public class Mahasiswa implements Comparable<Mahasiswa>{
    // instance variables - replace the example below with your own
    private String nama;
    private int nilai;

    /**
     * Constructor for objects of class Mahasiswa
     * @param nama parameter untuk nama dari objek mahasiswa yang baru
     * @param nilai parameter untuk nilai dari objek mahasiswa yang baru
     */
    public Mahasiswa(String nama, int nilai){
        // initialise instance variables
        this.nama=nama;
        this.nilai=nilai;
    }
    
    /**
     * Metode untuk mengembalikan String nama
     * @param nama deskripsi nama dari mahasiswa 
     */
    public void setNama(String nama){
        this.nama=nama;
    }
    
    /**
     * Metode untuk mengembalikan String nama
     * @param nilai deskripsi nilai dari mahasiswa 
     */
    public void setNilai(int nilai){
        this.nilai=nilai;
    }
    
    /**
     * Metode untuk mengembalikan String nama
     * @return nama dari Mahasiswa 
     */
    public String getNama(){
        return nama;
    }
    
    /**
     * Metode untuk mengembalikan String nama
     * @return nilai dari Mahasiswa 
     */
    public int getNilai(){
        return nilai;
    }
    
    /**
     * Metode compareTo yang akan membandingkan suatu objek mahasiswa dengan objek mahasiswa lain.
     * fungsi ini melakukan override/penggulangan sehingga methode ini yang akan dipanggil ketika sorting dilakukan
     * @param x objek mahasiswa lainnya
     * @return hasil dari perbandingan dengan hasil apabila x lebih besar maka x akan bernilai >0
     */
    public int compareTo(Mahasiswa x)
    {
        return x.nilai-this.nilai;     
    }
    
    /**
     * Metode toString
     * @return metode yang mencetak informasi dari kelas mahasiswa
     */
    public String toString(){
        return "Mahasiswa dengan "+nama+" mempunyai score "+nilai+"\n";
    }
}
