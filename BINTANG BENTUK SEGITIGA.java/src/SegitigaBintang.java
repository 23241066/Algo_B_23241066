import java.util.Scanner;

public class SegitigaBintang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scanner.nextInt();

        // Loop untuk menggambar segitiga
        for (int i = 1; i <= tinggi; i++) {
            // Loop untuk menggambar spasi sebelum bintang
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }

            // Loop untuk menggambar bintang
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Pindah baris setelah satu baris selesai digambar
            System.out.println();
        }

        scanner.close();
    }
}
