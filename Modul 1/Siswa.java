public class Siswa
{
	String NamaSiswa;
	String AlamatSiswa;
	int Nilai;

	Siswa (String nama, String alamat, int nilai) //konstruktor
	{
		NamaSiswa = nama;
		AlamatSiswa = alamat;
		Nilai = nilai;
	}
	Siswa () //konstruktor
	{
		NamaSiswa = "Ika Nurfitriani";
		AlamatSiswa = "Bantul DIY";
		Nilai = 100;
	}
	void Show()
	{
		System.out.println("Informasi Siswa");
		System.out.println("Nama	: "+NamaSiswa);
		System.out.println("Id	: "+AlamatSiswa);
		System.out.println("Posisi	: "+Nilai);
	}
	public static void main(String args[])
	{
		Siswa siswa1 = new Siswa();
		Siswa siswa2 = new Siswa("Aloysius","Bandung",100);
		siswa1.Show();
		siswa2.Show();
	}
}