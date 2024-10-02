package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NamaUmur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int umur;
        boolean valid = true;

        while (valid) {
            try {
                System.out.print("Masukkan Nama: ");
                nama = input.nextLine();
                if (!nama.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("Nama harus berupa huruf");
                }
                System.out.print("Masukkan Umur: ");
                umur = input.nextInt();
                if (umur < 0) {
                    throw new InputMismatchException("");
                }
                valid = false;
                System.out.println(nama + " berumur " + umur);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException a) {
                System.out.println("Umur harus berupa angka positif");
                input.nextLine();
            }
        }
        input.close();
    }
}
