import java.util.Scanner;

public class Percepatan {

    public static void main(String[] args) {

        // Menentukan Percepatan

        double Percepatan, Kecepatan, Waktu;
        Kecepatan = 17;
        Waktu = 20;
        Percepatan = Kecepatan / Waktu;
        System.out.println("Menentukan Percepatan ");
        System.out.println("m/s = " + Kecepatan);
        System.out.println("s = " + Waktu);
        System.out.println("m/s2 =  Perubahan Kecepatan (m/s) / Perubahan waktu (s)");
        System.err.println("      =       " + Percepatan);

    }
}