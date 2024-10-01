package Exception;

public class StudyCase {
    public static void main(String[] args) {
        // membuat array berukuran 5
        int a[] = new int[5];
        try {
            // mengakses elemen array index 5
            a[5] = 100;
            // membuat eksepsi untuk index melebihi batas
        } catch (ArrayIndexOutOfBoundsException e) {
            // menampilkan pesan
            System.out.println("Index melebihi ukuran array");
        }
    }
}