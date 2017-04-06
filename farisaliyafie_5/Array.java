package farisaliyafie_5;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a description of class Array here.
 * 
 * @author (Faris Ali Yafie) 
 * @version (Array dan ArrayList)
 */
public class Array{
    // instance variables - replace the example below with your own
    //private static final String FILENAME="D:\\point\\ojekampus\\farisaliyafie_5\\isi.txt";
    private static ArrayList<Integer> listInt=new ArrayList<>();
    private static int arrayInt[]=new int[999];
    
    public static int[] sortArray(int[] arrayInt){
        //Algoritma Selection Sort Array
        Arrays.sort(arrayInt);
        long mulaiT=System.currentTimeMillis();
        long jumlah=0;
            for(int x=0; x<10000000; x++){
                jumlah+=x;
            }
        long selesaiT=System.currentTimeMillis();
        long lamaT=selesaiT-mulaiT;
        System.out.printf("Lama waktu sorting : "+lamaT+" ms\n\n");
            for(int x=0; x<arrayInt.length-1; x++){
                int indeks=x;
                for(int y=x+1; y<arrayInt.length; y++){
                    if(arrayInt[y]<arrayInt[indeks]){
                        indeks=y;
                    }
                    int angkakecil=arrayInt[indeks];
                    arrayInt[indeks]=arrayInt[x];
                    arrayInt[x]=angkakecil;
                }
            }
        //mencetak hasil selection sort;
        System.out.printf("Sorting Array :\n");
        for(int x=0; x<arrayInt.length;x++){
            System.out.println(arrayInt[x]);
        }
        return arrayInt;
    }
    
    public static void main(String[] args) { 
        //int arrayInt=Integer.parseInt(FILENAME);
        //poin 5.i tidak saya gunakan karena tidak dapat terlihat semua isi datanya
        /*BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;

			br = new BufferedReader(new FileReader(FILENAME));
			
			
			while ((sCurrentLine = br.readLine()) != null) {
			    listInt.add(Integer.valueOf(sCurrentLine));
				System.out.print(sCurrentLine+" ");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
         }
         */
        listInt.add(283);
        listInt.add(157);
        listInt.add(534);
        listInt.add(766);
        listInt.add(763);
        listInt.add(896);
        listInt.add(460);
        listInt.add(726);
        listInt.add(392);
        listInt.add(182);
        int arrayInt[]={283, 157,634 ,766, 763, 896, 460, 726, 392, 182};
        //memanggil metode sortArray dengan variabel arrayInt
        sortArray(arrayInt);
        //build in function untuk array dan arraylist
        Arrays.sort(arrayInt);
        System.out.printf("\n\nAngka arrayInt yang telah terurut : \n");
        for (int angka : arrayInt) {
            System.out.println(angka);
        }
        Collections.sort(listInt);
        System.out.printf("\n\nAngka listInt yang telah terurut : \n");
        for (int angka : listInt) {
            //int value = listInt.get(a);
            //System.out.printf("Isi angka ke-%d: " + value+"\n", a+1);
            System.out.println(angka);
        }
    }
    public void isi(){    
    }
    /**
     * Constructor for objects of class Array
     */
    public Array()
    {
        // initialise instance variables
    }
}
