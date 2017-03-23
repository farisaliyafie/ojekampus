package farisaliyafie_5;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class OOP here.
 * 
 * @author (Faris Ali Yafie) 
 * @version (Array dan ArrayList)
 */
public class OOP
{
    // instance variables - replace the example below with your own
    private static ArrayList<Mahasiswa> siswa = new ArrayList<Mahasiswa>();
    
    /**
     * Constructor for objects of class OOP
     * Metode yang pertama kali di panggil ketika sebuah objek OOP dicbuat.
     * Metode ini akan request input yang akan disimpan pada arraylist dari objek.
     */
    public OOP(){
        // initialise instance variables 
        System.out.println("MASUKKAN DATA");
        Scanner scanner = new Scanner(System.in);
        String inputString=" ";
        boolean cekInput=false;
        int inputInt=0;
        while(true){
            System.out.println("Masukkan nama lalu nilai mahasiswa untuk input data Mahasiswa");
            System.out.println("Ketik (stop) untuk melihat hasil masukkan");
            inputString = scanner.nextLine();
            if(inputString.equals("stop")){
                break;
            }
            inputInt = scanner.nextInt();
            scanner.nextLine();
            siswa.add(new Mahasiswa(inputString,inputInt));
        }
        //printData();
    }
    
    /**
     * Getter List siswa
     */
    public ArrayList<Mahasiswa> getMahasiswa(){
        return siswa;
    }
    
    /**
     * Metode main yang akan dipanggil ketika program dikompilasikan.
     * program akan membuat sebuah objek OOP yang akan meminta input pada array dari objek
     * dan melakukan sorting pada array tersebut.
     */
    public static void main(){
        OOP inputdata = new OOP();
        System.out.println("Sebelum diurutkan :");
        System.out.println(siswa);
        //build in function untuk mengurutkan data yang dimasukan
        Collections.sort(siswa);
        System.out.println("Sesudah diurutkan :");
        System.out.println(siswa);
    }
    
    /**
     * Method untuk menampilkan data objek Mahasiswa yang ada dalam List siswa
     */
    /*
    public void printData(){
        System.out.println("Data siswa : ");
        for(int i = 0; i < siswa.size(); i++){
            System.out.println(siswa.get(i).getNama());
            System.out.println(siswa.get(i).getNilai());
        }
    }
    */
}
