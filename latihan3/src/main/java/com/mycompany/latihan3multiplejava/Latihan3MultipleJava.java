/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan3multiplejava;

/**
 *
 * @author ASUS
 */
//import java.io.BufferedReader;
import java.io.FileReader; // Membaca File
import java.io.FileNotFoundException; // Menangkap Error File Tidak Ditemukan
import java.io.IOException; // Menangkap Error File Bermasalah

public class Latihan3MultipleJava {

    public static String bacaFile(String fileName) throws FileNotFoundException, IOException{
        
         StringBuilder content = new StringBuilder();
            try (FileReader file = new FileReader(fileName)) {
                int character;
                
          while ((character = file.read()) != -1) {
                    content.append((char) character);
                }
          
          System.out.println("File ditemukan!");
          
           return content.toString();
        }
    }
    
    public static void main(String[] args) {
        String fileName = "tes.txt";
        try {
            bacaFile(fileName);
        }catch(FileNotFoundException e){
            System.out.println("File tidak ditemukan");
        }catch (IOException e){
            System.out.println("Kesalahan dalam membaca file");                
        }
    }
}
    
