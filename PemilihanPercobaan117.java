import java.util.Scanner;

/**
 * PemilihanPercobaan117
 */
public class PemilihanPercobaan117 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        
        int angka;
        String hasil;

        System.out.print("Masukan angka : ");
        angka = input17.nextInt();

        hasil = (angka % 2 == 0) ? " Bilangan Genap" : " Bilangan Ganjil";
        System.out.println("Angka "+angka+ hasil);
    }
}