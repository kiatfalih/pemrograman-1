package tugas_1_pert4;
import java.util.Scanner;

public class penghitunganParkir {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Selamat datang di tempat parkir");
    System.out.print("Masukkan jenis kendaraan (mobil/motor): ");
    String jenisKendaraan = input.nextLine();
    System.out.print("Masukkan lama parkir (jam): ");
    int lamaParkir = input.nextInt();
    int totalBiaya = 0;
    int tarifAwal = 0;
    int tarifPerJam = 0;

    if(lamaParkir <= 0){
      System.out.println("Lama parkir tidak valid.");
      return;
    }

    if(jenisKendaraan.equalsIgnoreCase("mobil")){
      tarifAwal = 5000;
      tarifPerJam = 2000;
    } else if(jenisKendaraan.equalsIgnoreCase("motor")){
      tarifAwal = 2000;
      tarifPerJam = 2000;
    } else {
      System.out.println("Jenis kendaraan tidak valid.");
      return;
    }

    if(lamaParkir <= 1){
      totalBiaya = tarifAwal;
    } else {
      totalBiaya = tarifAwal + (lamaParkir - 1) * tarifPerJam;
    }

    double diskon = 0;
    if(lamaParkir > 10){
      diskon = totalBiaya * 0.1;
      totalBiaya -= diskon;
    }

    System.out.println("===============================");
    System.out.println("Jenis kendaraan: " + jenisKendaraan);
    System.out.println("Lama parkir: " + lamaParkir + " jam");
    System.out.println("Total biaya sebelum diskon: " + (totalBiaya + diskon));
    System.out.println("Diskon: " + diskon);
    System.out.println("Total biaya setelah diskon: " + totalBiaya);
    System.out.println("===============================");
    System.out.println("Terima kasih telah menggunakan layanan parkir kami!");
  }
}