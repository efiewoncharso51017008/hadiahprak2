import java.util.Scanner;
public class hargapesawat
{
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		String nama;
		char tipe;
		int bayar;
		int harga;
		int kembalian;
		
		System.out.print("Masukkan Nama: ");
		nama=in.nextLine();
		System.out.print("pilih tipe pesawat(A-C): ");
		tipe=in.next().charAt(0);
		System.out.println();
		switch(tipe)
		{
			case'A':
			{
				System.out.println("anda memilih pesawat: A ");
				System.out.println("Harga:Rp.5.000.000 ");
				harga=5000000;
				System.out.print("masukkan bayaran: Rp ");
		bayar=in.nextInt();
		kembalian=bayar-harga;
		System.out.println();
		System.out.println("Nama Anda    : "+nama);
		System.out.println("kembalian: Rp "+kembalian);
				break;
			}
			case'B':
			{
				System.out.println("anda memilih pesawat: B");
				System.out.println("Harga:Rp.2.000.000 ");
				harga=2000000;
				System.out.print("masukkan bayaran: Rp ");
		bayar=in.nextInt();
		kembalian=bayar-harga;
		System.out.println();
		System.out.println("Nama Anda    : "+nama);
		System.out.println("kembalian: Rp "+kembalian);
				break;
			}
			case 'C': 
			{
				System.out.println("anda memilih pesawat: C");
				System.out.println("Harga:Rp.1.000.000 ");
				harga=1000000;
				System.out.print("masukkan bayaran: Rp ");
		bayar=in.nextInt();
		kembalian=bayar-harga;
		System.out.println();
		System.out.println("nama Anda    : "+nama);
		System.out.println("kembalian: Rp "+kembalian);
				break;
			}
			
		}
		
		
		
	}
}