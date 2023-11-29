
package latihan2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// test

public class Main {
    public static void main(String[] args) {
        String fileName = "Jwbn soal2.txt"; // Ganti dengan nama file yang sebenarnya

        try {
            String isiFile = bacaFile(fileName);
            if (isiFile != null) {
                System.out.println("Isi file: " + isiFile);
            } else {
                System.out.println("File tidak ditemukan.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan. Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file. Error: " + e.getMessage());
        }
    }

    public static String bacaFile(String fileName) throws FileNotFoundException, IOException {
        StringBuilder isiFile = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                isiFile.append(line).append("\n");
            }
        }
        return isiFile.toString();
    }
}


