package DataNilai;

import java.util.Scanner;

public class Nilai{
 public static void Tampilan(){

	int nilai;

	Scanner scanner = new Scanner(System.in);

	System.out.println();
	System.out.print("Masukkan Nilai Anda : ");
	nilai = scanner.nextInt();

	if (nilai >= 70) {
		System.out.println("Selamat Nilai Anda "+nilai);
  	}else{
		System.out.println("Maaf Nilai Anda "+nilai);
	}
 }
}