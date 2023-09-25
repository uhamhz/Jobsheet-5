import java.util.Scanner;
/**
 * PemilihanPercobaan117
 */
public class PemilihanPercobaan117 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        int angka;
        System.out.print("Masukan angka : ");
        angka = input00.nextInt();
        if (angka % 2 ==0) {
            System.out.println("Angka "+angka+" Bilangan Genap");
        }else{
            System.out.println("Angka "+angka+" Bilangan Ganjil");
        }
    }
}