
/**
 * Write a description of class tes here.
 * 
 * @author (Faris Ali) 
 * @version (tes modul 3 dan 4)
 */
public enum tes
{
   ezra("kacamata", "12"),
   kuya("laptop", "11"),
   aduy("smule", "10"),
   yudha("robot", "9"),
   yunus("ketua", "8");
   
   private final String desc;
   private final String year;
   
    tes(String desc, String year){
       this.desc=desc;
       this.year=year;
    }
   
   public String getDesc(){
       return desc;
    }
    
    public String getYear(){
       return year;
    }

}
