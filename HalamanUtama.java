import java.util.Scanner;

public class HalamanUtama{
 public static void main(String [] args){
  System.out.println("Selamat Datang Di Halaman Utama");
  System.out.println("===============================");
  System.out.println("Silahkan Masukkan Nama & NPM Anda");

	Scanner scanner = new Scanner(System.in);

	String Nama;
	int npm;

	System.out.print("Masukkan Nama Anda :");
	Nama = scanner.nextLine();
	System.out.print("Masukkan NPM Anda :");
	npm = scanner.nextInt();

	System.out.println(Nama);
	System.out.println(npm);
 }
}