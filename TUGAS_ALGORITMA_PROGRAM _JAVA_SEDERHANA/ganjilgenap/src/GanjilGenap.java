import java.util.Scanner;

public class GanjilGenap {

    public static void main(String[] args) {
        int bilangan;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan bilangan ");
        bilangan = input.nextInt();

        if (bilangan % 2 == 0)
            System.out.println("Bilangan genap");
        else
            System.out.println("Bilangan ganjil");

        input.close();
    }
}