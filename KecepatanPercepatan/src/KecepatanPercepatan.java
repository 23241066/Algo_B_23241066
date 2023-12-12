import java.util.Scanner;

public class KecepatanPercepatan {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan posisi awal
        System.out.print("Masukkan posisi awal (meter): ");
        double posisiAwal = scanner.nextDouble();

        // Meminta pengguna memasukkan posisi akhir
        System.out.print("Masukkan posisi akhir (meter): ");
        double posisiAkhir = scanner.nextDouble();

        // Meminta pengguna memasukkan waktu yang diperlukan
        System.out.print("Masukkan waktu yang diperlukan (detik): ");
        double waktu = scanner.nextDouble();

        // Menghitung kecepatan
        double kecepatan = (posisiAkhir - posisiAwal) / waktu;

        // Menghitung percepatan
        double percepatan = kecepatan / waktu;

        // Menampilkan hasil
        System.out.println("Kecepatan adalah " + kecepatan + " m/s");
        System.out.println("Percepatan adalah " + percepatan + " m/s^2");

        // Menutup objek Scanner
        scanner.close();
    }
}
