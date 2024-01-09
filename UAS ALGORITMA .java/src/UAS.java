import java.util.Scanner;

public class UAS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi piramida angka: ");
        int tinggi = scanner.nextInt();

        // Loop untuk menggambar piramida
        for (int i = 1; i <= tinggi; i++) {
            // Loop untuk menggambar spasi sebelum angka
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }

            // Loop untuk menggambar angka pada setiap baris
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(" " + k);
            }

            // Pindah baris setelah satu baris selesai digambar
            System.out.println();
        }

        scanner.close();
    }
}
