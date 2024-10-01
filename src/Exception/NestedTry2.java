package Exception;

public class NestedTry2 {
    public static void main(String[] args) {
        try {
            // membuat array berukuran 2
            int a[] = new int[2];
            try {
                // membuat variable
                int b = 0;
                // membuat variable dengan operasi pembagian
                int c = 1 / b;
                // membuat eksepsi untuk index melebihi batas
            } catch (ArrayIndexOutOfBoundsException e) {
                // menampilkan pesan
                System.out.println("Exception Thrown " + e);
            }
            // mengakses elemen array index 3
            System.out.println("Acces element three " + a[3]);
            // membuat eksepsi
        } catch (Exception a) {
            // menampilkan pesan
            System.out.println("Exception Thrown " + a);
        }
        // menutup block
        System.out.println("Out of the Block");
    }
}
