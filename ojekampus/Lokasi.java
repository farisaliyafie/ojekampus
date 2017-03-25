/**
 * Class will be used to describe user's detail
 * 
 * @author (Faris Ali Yafie)
 * @version (4 Maret 2017)
 */
public class Lokasi
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;
    private String nama_lokasi;
    private String keterangan_lokasi;

    /**
     * Konstruktor objek kelas Lokasi
     * @param   nama_lokasi         nama lokasi
     * @param   x                   koordinat horizontal
     * @param   y                   koordinat vertikal
     * @param   keterangan_lokasi   keterangan lokasi
     * @return  none                nothing
     */
    public Lokasi(double x, double y, String nama_lokasi, String
                  keterangan_lokasi)
    {
        this.x=x;
        this.y=y;
        this.nama_lokasi=nama_lokasi;
        this.keterangan_lokasi=keterangan_lokasi;
    }
    
    /**
     * Getter koordinat x
     * @param   none    nothing
     * @return  x       penggambaran koordinat horizontal
     */
    public double getX()
    {
        return x;
    }
    
    /**
     * Getter koordinat y
     * @param   none    nothing
     * @return  y       penggambaran koordinat vertikal
     */
    public double getY()
    {
        return y;
    }
    
    /**
     * Getter nama koordinat lokasi
     * @param   none        nothing
     * @return  nama_lokasi nama lokasi (dibantu koordinat x,y)
     */
    public String getNama()
    {
        return nama_lokasi;
    }
    
    /**
     * Getter keterangan koordinat lokasi
     * @param   none                nothing
     * @return  keterangan_lokasi   keterangan lokasi dengan x,y
     */
    public String getKeteranganLokasi()
    {
        return keterangan_lokasi;
    }
    
    /**
     * Setter koordinat x
     * @param   x       penggambaran koordinat horizontal
     * @return  none    nothing
     */
    public void setX(double x)
    {
        this.x=x;
    }
    
    /**
     * Setter koordinat y
     * @param   y       penggambaran koordinat vertikal
     * @return  none    nothing
     */
    public void setY(double y)
    {
        this.y=y;
    }
    
    /**
     * Setter nama koordinat lokasi
     * @param   nama_lokasi nama lokasi dengan dibantu x,y
     * @return  none        nothing
     */
    public void setNama(String nama_Lokasi)
    {
        this.nama_lokasi=nama_lokasi;
    }
    
    /**
     * Setter keterangan nama koordinat lokasi
     * @param   keterangan_lokasi   keterangan lokasi dengan x,y
     * @return  none                nothing
     */
    public void setKeteranganLokasi(String keterangan_lokasi)
    {
        this.keterangan_lokasi=keterangan_lokasi;
    }
   
}
