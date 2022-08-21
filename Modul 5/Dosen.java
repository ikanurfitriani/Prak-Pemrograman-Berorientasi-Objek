public class Dosen {
	private String nama;
	private int nomorinduk;
	private Jurusan jurusan;

	public Dosen() {
		this.nama = "Siwon S.Kom., M.Kom";
		this.nomorinduk = 1234511;
		this.jurusan = new Jurusan("Informatika", 2020);
	}
	public void cetakDosen() {
		System.out.println("Nama Dosen: "+this.nama);
		System.out.println("NIP: "+this.nomorinduk);
		jurusan.cetakJurusan();
	}
}