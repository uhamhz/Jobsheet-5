import java.util.Scanner;

public class TugasPemilihan217 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    String user,pass;
    String dataUser = "admin";
    String dataPass = "test123";

    System.out.print("Masukan Username : ");
    user = input.nextLine();
    System.out.print("Masukan Password : ");
    pass = input.nextLine();

    if (user.equals(dataUser) && pass.equals(dataPass)) {
        System.out.println("Login Berhasil");
    } else {
        System.out.println("Username atau Password yang Anda Masukan Salah");
    }

    }
}
