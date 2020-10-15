import java.util.Scanner;

public class latihan5{
	public static void main(String[] args)
	{
		Scanner inputan = new Scanner(System.in);
		int nilai;
		
		System.out.print("Masukkan nilai = ");
		nilai = inputan.nextInt();
		
		//posisi if berjalan 
		if (nilai > 0)
		{
			System.out.println("Angka yang dimasukkan adalah bilangan positif");
		}
		else
		{
			System.out.println("Angka yang dimasukkan adalah bilangan negatif");
		}
	}
}