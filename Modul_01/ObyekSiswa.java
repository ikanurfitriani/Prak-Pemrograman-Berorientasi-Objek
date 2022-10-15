class Siswa
{
	String NamaSiswa;
	String AlamatSiswa;
	int Nilai;

	public void setSiswa(String NamaSiswa, String AlamatSiswa, int Nilai)
	{
		this.NamaSiswa = NamaSiswa;
		this.AlamatSiswa = AlamatSiswa;
		this.Nilai = Nilai;
	}
	public void tampil()
	{
		System.out.println("Informasi Siswa");
		System.out.println("Nama Siswa : "+NamaSiswa);
		System.out.println("Alamat Siswa : "+AlamatSiswa);
		System.out.println("Nilai : "+Nilai);
		System.out.println();
	}
}
public class ObyekSiswa
{
	public static void main(String[] args)
	{
		Siswa siswa1=new Siswa();
		Siswa siswa2=new Siswa();
		siswa1.setSiswa("Ika Nurfitriani","Bantul DIY",95);
		siswa2.setSiswa("Park Chan Yeol","Bandung",98);
		siswa1.tampil();
		siswa2.tampil();
	}
}