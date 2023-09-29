import java.util.Scanner;

public class TugasPemilihan17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int meter;

        System.out.println("Masukan Meter : ");
        meter = input.nextInt();

        if (meter > 5) {
            System.out.println("Pakai Range Weapon");
        } else {
            System.out.println("Pakai Melee Weapon");
        }
    }
}
