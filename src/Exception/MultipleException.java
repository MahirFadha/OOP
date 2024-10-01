package Exception;

public class MultipleException {
    public static void main(String[] args) {
        try {
            // membuat array berukuran 2
            int a[] = new int[2];
            // membuat variable
            int b = 0;
            // membuat variable dengan hasil pembagian
            int c = 1 / b;
            // mengakses elemen array index 3
            System.out.println("Acces Element Three: " + a[3]);
            // membuat eksepsi untuk index melebihi batas
        } catch (ArrayIndexOutOfBoundsException e) {
            // menampilkan pesan
            System.out.println("Exception thrown " + e);
            // memembuat eksepsi
        } catch (Exception e) {
            // menampilkan pesan
            System.out.println("Exception thrown " + e);
        }
        // menutup block
        System.out.println("Out of the block");
    }
}
