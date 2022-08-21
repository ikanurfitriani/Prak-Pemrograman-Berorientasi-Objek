public class Mahasiswa {
	private String nama;
	private int nomorinduk;
	private Jurusan jurusan;
	private MataKuliah mk;

	public Mahasiswa(String nama, int nomorinduk, String[] matkul) {
		this.nama = nama;
		this.nomorinduk = nomorinduk;
		this.jurusan = new Jurusan("Informatika", 2020);
		this.mk = new MataKuliah(matkul);
	}
	public void cetakMahasiswa() {
		System.out.println("Nama Mahasiswa: "+this.nama);
		System.out.println("NIM: "+this.nomorinduk);
		jurusan.cetakJurusan();
		mk.cetakMataKuliah();
	}
}