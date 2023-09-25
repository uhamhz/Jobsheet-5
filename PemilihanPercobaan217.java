import java.util.Scanner;

public class PemilihanPercobaan217 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        float uas,uts,kuis,tugas,total;
        
        System.out.println("Nilai UAS   :");
        uas = input00.nextFloat();
        System.out.println("Nilai UTS   :");
        uts = input00.nextFloat();
        System.out.println("Nilai Kuis  :");
        kuis = input00.nextFloat();
        System.out.println("Nilai Tugas :");
        tugas = input00.nextFloat();

        total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);

        String Message = total < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println("Nilai Akhir = " + total + " Sehingga " + Message);
    }
}
