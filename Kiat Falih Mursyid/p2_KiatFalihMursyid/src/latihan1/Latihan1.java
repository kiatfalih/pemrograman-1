package latihan1;
import java.util.Scanner;

public class Latihan1 {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    String nama; int usia;
    System.out.print("Input nama: ");
    nama = input.nextLine();
    System.out.print("Input usia: ");
    usia = input.nextInt();
    System.out.println("-------------");
    System.out.println("nama: "+nama);
    System.out.println("usia: "+usia);
    System.out.println("-------------");
  }
}
