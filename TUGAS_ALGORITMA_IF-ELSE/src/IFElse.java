import java.util.Scanner;

public class IFElse {
    public static void main(String[] args) throws Exception {
        
        // Data member
        int total_belanja = 0;

        // Membuat scanner
        Scanner scan = new Scanner(System.in);

        // Mengambil input dari keyboard
        System.out.println("Masukan total belanja :");
        total_belanja = scan.nextInt();;

        // Mengambil input dari keyboard
        if (total_belanja >= 50000) {
            System.out.println("Anda mendapatkan mmouse");
        } else {
            System.out.println("Belanja anda kurang dari rp : 50000");
        }

        System.out.println("Terimakasih sudah belanja di toko kami");

    }
}
