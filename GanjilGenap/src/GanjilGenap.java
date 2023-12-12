import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan suatu bilangan
        System.out.print("Masukkan suatu bilangan: ");
        int bilangan = scanner.nextInt();

        // Menentukan apakah bilangan tersebut ganjil atau genap
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }

        // Menutup objek Scanner
        scanner.close();
    }
}