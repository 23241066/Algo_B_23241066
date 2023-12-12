import java.util.Scanner;

public class VolumeBola {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan jari-jari bola
        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = scanner.nextDouble();

        // Menghitung volume bola
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);

        // Menampilkan hasil
        System.out.println("Volume bola dengan jari-jari " + jariJari + " adalah " + volume);

        // Menutup objek Scanner
        scanner.close();
    }
}