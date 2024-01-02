import java.util.Scanner;

public class BintangBerjejer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bintang: ");
        int jumlahBintang = scanner.nextInt();

        // Loop untuk mencetak bintang berjejer
        for (int i = 0; i < jumlahBintang; i++) {
            System.out.print("*" + ",");
        }

        scanner.close();
    }
}
