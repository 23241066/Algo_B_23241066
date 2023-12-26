import java.util.Scanner;

public class Toko_Saya_2 {
    public static void main(String[] args) {
        // Input dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.print("Apakah pelanggan memiliki member card? (ya/tidak): ");
        String memilikiMemberCard = scanner.nextLine();

        if ("ya".equalsIgnoreCase(memilikiMemberCard)) {
            System.out.print("Total belanja pelanggan: ");
            double totalBelanja = scanner.nextDouble();

            if (totalBelanja > 100000) {
                // Memberikan diskon sebesar 15rb
                double diskon = 15000;

                // Menampilkan total pembayaran setelah diskon
                double totalPembayaran = totalBelanja - diskon;
                System.out.println("Diskon diberikan sebesar Rp 15,000");
                System.out.println("Total pembayaran setelah diskon: Rp " + totalPembayaran);
            } else {
                System.out.println("Maaf, total belanja tidak mencapai batas untuk mendapatkan diskon.");
            }
        } else {
            System.out.println("Maaf, hanya pelanggan dengan member card yang dapat mendapatkan diskon.");
        }

        // Menutup scanner
        scanner.close();
    }
}
