import java.util.Scanner;

public class PemilihanPercobaan217 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        float uas,uts,kuis,tugas,total;
        
        System.out.println("Nilai UAS   :");
        uas = input17.nextFloat();
        System.out.println("Nilai UTS   :");
        uts = input17.nextFloat();
        System.out.println("Nilai Kuis  :");
        kuis = input17.nextFloat();
        System.out.println("Nilai Tugas :");
        tugas = input17.nextFloat();

        total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);

        // if (total > 100) {
        //     System.out.println("Nilai yang Anda Masukan Salah");
        // } else if (total >= 0 && total <= 100){
        //     String Message = total < 65 ? "Remidi" : "Tidak Remidi";
        // }

        String Message = total < 65 ? "Remidi" : "Tidak Remidi";
        

        if (total >= 81 && total <= 100) {
            System.out.println("Anda Mendapatkan Nilai A Kualifikasi Sangat Baik");
        } else if (total > 73 && total <= 80) {
            System.out.println("Anda Mendapatkan Nilai B+ Kualifikasi Lebih Dari Baik");
        } else if (total > 65 && total <= 73){
            System.out.println("Anda Mendapatkan Nilai B Kualifikasi Baik");
        } else if (total > 60 && total <= 65){
            System.out.println("Anda Mendapatkan Nilai C+ Kualifikasi Lebih Dari Cukup");
        } else if (total > 50 && total <= 60){
            System.out.println("Anda Mendapatkan Nilai C Kualifikasi Cukup ");
        } else if (total > 39 && total <= 50){
            System.out.println("Anda Mendapatkan Nilai D Kualifikasi Kurang");
        } else{
            System.out.println("Anda Mendapatkan Nilai E Kualifikasi Gagal");
        }

        System.out.println("Nilai Akhir = " + total + " Sehingga " + Message);
    }
}
