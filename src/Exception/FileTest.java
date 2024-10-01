package Exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class FileTest {
    public static void main(String[] args) {
        try {
            // membuat objek file
            File file = new File("D://test//testFile1.txt");
            // membuat file
            if (file.createNewFile()) {
                // menampilkan pesan
                System.out.println("File created");
            } else {
                // menampilkan pesan jika file sudah ada
                System.out.println("File already exists");
            }
            // membuat writer
            FileWriter writer = new FileWriter(file);
            // menulis data
            writer.write("Test Data");
            // menutup writer
            writer.close();

            // membuat reader
            FileReader reader = new FileReader(file);
            // membuat variabel
            int c;
            // membaca data
            while ((c = reader.read()) != -1) {
                char ch = (char) c;
                System.out.println(ch);
                reader.close();
            }
            // membuat eksepsi dari input user
        } catch (IOException e) {
            // menampilkan pesan
            System.out.println("Exception");
        }
    }
}
