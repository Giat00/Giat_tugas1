package DataDosen;

import java.util.Scanner;

public class Dosen{
 public static void  Tampilan(){

 String nama;
 int nidn;
 
 Scanner scanner = new Scanner(System.in);

  System.out.println();
  System.out.println("======= Data Dosen ========");
  System.out.print("Nama : ");
  nama = scanner.nextLine();
  System.out.print("NIDN : ");
  nidn = scanner.nextInt();
  System.out.println("===========================");

	System.out.println("Nama Anda"+nama);
	System.out.println("NPM Anda"+nidn); 
 }
}