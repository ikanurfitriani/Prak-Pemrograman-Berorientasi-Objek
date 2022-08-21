public class Mahasiswa {
	int nim;
	String nama;
	String prodi;

	public Mahasiswa() {
		nim = 123456789;
		nama = "Park Chan Yeol";
		prodi = "Sistem Informasi";
	}
	public Mahasiswa(int no, String nm, String prd) {
		nim = no;
		nama = nm;
		prodi = prd;
	}
	public void tampil() {
		System.out.println("NIM saya adalah "+nim);
		System.out.println("Nama saya adalah "+nama);
		System.out.println("Berasal dari prodi "+prodi);
	}
	public static void main(String[] args) {
		Mahasiswa ma0 = new Mahasiswa();
		ma0.tampil();
		System.out.println();

		Mahasiswa ma1 = new Mahasiswa(205410116, "Ika Nurfitriani", "Informatika");
		ma1.tampil();
		System.out.println();
	}
}