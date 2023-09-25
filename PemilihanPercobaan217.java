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

        if (total > 80) {
            System.out.println("Anda Mendapatkan Nilai A Kualifikasi Sangat Baik");
        } else if (total > 73) {
            System.out.println("Anda Mendapatkan Nilai B+ Kualifikasi Lebih Dari Baik");
        } else if (total > 65){
            System.out.println("Anda Mendapatkan Nilai B Kualifikasi Baik");
        } else if (total > 60){
            System.out.println("Anda Mendapatkan Nilai C+ Kualifikasi Lebih Dari Cukup");
        } else if (total > 50){
            System.out.println("Anda Mendapatkan Nilai C Kualifikasi Cukup ");
        } else if (total > 39){
            System.out.println("Anda Mendapatkan Nilai D Kualifikasi Kurang");
        } else{
            System.out.println("Anda Mendapatkan Nilai E Kualifikasi Gagal");
        }

        System.out.println("Nilai Akhir = " + total + " Sehingga " + Message);
    }
}
