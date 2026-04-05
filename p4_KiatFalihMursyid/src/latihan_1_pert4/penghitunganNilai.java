package  latihan_1_pert4;
import java.util.Scanner;

public class penghitunganNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input realisasi: ");
        int realisasi = input.nextInt();
        System.out.print("input kehadiran: ");
        int kehadiran = input.nextInt();
        System.out.print("input tugas: ");
        int tugas = input.nextInt();
        System.out.print("input uts: ");
        int uts = input.nextInt();
        System.out.print("input uas: ");
        int uas = input.nextInt();

        float Presensi = kehadiran / realisasi * 10;
        int TUGAS = tugas * 20/100;
        int UTS = uts * 30/100;
        int UAS = uas * 40/100;
        float Total = Presensi + TUGAS + UTS + UAS;

        System.out.println("-------------------------------");
        System.out.println("Realisasi : " + realisasi);
        System.out.println("Kehadiran kamu : " + kehadiran);
        System.out.println("Nilai keseluruhan : " + Total);
        System.out.println("-------------------------------");
    }
}