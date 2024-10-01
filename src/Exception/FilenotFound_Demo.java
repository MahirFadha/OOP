package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilenotFound_Demo {
    public static void main(String[] args) {
        try {
            // membuat objek file
            File file = new File("D://file.txt");
            // membuka file
            FileReader fr = new FileReader(file);
            // eksepsi jika file tidak ditemukan
        } catch (FileNotFoundException e) {
            // menampilkan pesan
            System.out.println("File tidak ditemukan");
        }

        // membuat array
        int num[] = { 1, 2, 3, 4, 5 };
        try {
            // mengakses elemen array
            System.out.println(num[5]);
            // eksepsi jika index melebihi batas
        } catch (IndexOutOfBoundsException e) {
            // menampilkan pesan
            System.out.println("Index melebihi batas");
        }
    }
}
