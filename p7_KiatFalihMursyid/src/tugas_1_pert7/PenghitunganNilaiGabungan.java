package tugas_1_pert7;
import java.util.Scanner;

public class PenghitunganNilaiGabungan {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while (true) {
      // Input realisasi SKS
      System.out.print("Input Realisasi (3 sks / 2 sks) : ");
      String sks = input.nextLine();
      // Tentukan realisasi berdasarkan input SKS
      int realisasi = 0;
      if (sks.equalsIgnoreCase("3 sks") || sks.equalsIgnoreCase("3sks") || sks.equals("3")) {
        realisasi = 21;
      } else if (sks.equalsIgnoreCase("2 sks") || sks.equalsIgnoreCase("2sks") || sks.equals("2")) {
        realisasi = 14;
      } else {
        System.out.println("SKS tidak valid!!!");
        continue; // kembali ke awal loop untuk input ulang
      }
      // Input nilai kehadiran, tugas, UTS, dan UAS
      System.out.print("Input jumlah kehadiran: ");
      int kehadiran = input.nextInt();
      System.out.print("Input nilai tugas: ");
      int tugas = input.nextInt();
      System.out.print("Input nilai UTS: ");
      int uts = input.nextInt();
      System.out.print("Input nilai UAS: ");
      int uas = input.nextInt();
      // Hitung presensi & persen 
      float Presensi = ((float)kehadiran / realisasi) * 10;
      float persen = ((float)kehadiran / realisasi) * 100;
      // Hitung nilai akhir
      int TUGAS = tugas * 20/100;
      int UTS = uts * 30/100;
      int UAS = uas * 40/100;
      float Total = Presensi + TUGAS + UTS + UAS;
      // Tentukan grade
      String grade;
      if (persen < 75) {
        grade = "E";
      } else {
        if (Total >= 80) {
          grade = "A";
        } else if (Total >= 75) {
          grade = "B";
        } else if (Total >= 60) {
          grade = "C";
        } else if (Total >= 55) {
          grade = "D";
        } else {
          grade = "E";
        }
      }
      // Output tabel
      System.out.println("\n====================================================================");
      System.out.println("Realisasi : " + (int)realisasi);
      System.out.println("Jumlah Kehadiran : " + kehadiran);
      System.out.println("Nilai Tugas : " + tugas);
      System.out.println("Nilai UTS : " + uts);
      System.out.println("Nilai UAS : " + uas);
      System.out.println("Nilai Akhir : " + (int)Total);
      System.out.println("Grade : " + grade);
      System.out.println("====================================================================");
      break; // keluar dari loop jika sudah selesai
    }
  }
}
