package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.close();
        try {
            System.out.print("Masukkan Angka: ");
            int angka = input.nextInt();
            if (angka < 0) {
                throw new InputMismatchException();
            }
        } catch (Exception e) {
            System.out.println("Angka tidak boleh negatif");
            input.next();
        }
    }
}
