class Buku
{
	String judul;
	int harga;
	int halaman;
	String penulis;
	String penerbit;

	public void setBuku(String judul, int harga, int halaman, String penulis, String penerbit)
	{
		this.judul=judul;
		this.harga=harga;
		this.halaman=halaman;
		this.penulis=penulis;
		this.penerbit=penerbit;
	}
	public void tampil()
	{
		System.out.println("Judul buku : "+judul);
		System.out.println("Harga buku : "+harga);
		System.out.println("Jumlah halaman : "+halaman);
		System.out.println("Penulis buku : "+penulis);
		System.out.println("Penerbit buku : "+penerbit);
	}
}
public class ObyekBuku
{
	public static void main(String[] args)
	{
		Buku buku1=new Buku();
		buku1.setBuku("PBO",60000,100,"Ika Nurfitriani","Gramedia Pustaka");
		buku1.tampil();
	}
}