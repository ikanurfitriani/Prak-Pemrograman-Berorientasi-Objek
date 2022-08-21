class Mahasiswa {
	String nama;
	int nim;
	String prodi;
	String jekel;
	String alamat;

	public void setMhs(String nama, int nim, String prodi, String jekel, String alamat) {
		this.nama=nama;
		this.nim=nim;
		this.prodi=prodi;
		this.jekel=jekel;
		this.alamat=alamat;
	}

	public void tampil() {
		System.out.println("Nama mahasiswa : "+nama);
		System.out.println("NIM : "+nim);
		System.out.println("Prodi : "+prodi);
		System.out.println("Jenis kelamin mahasiswa : "+jekel);
		System.out.println("Alamat mahasiswa : "+alamat);
	}
}

public class ObyekMahasiswa {
	public static void main (String[] args) {
		Mahasiswa Mhs=new Mahasiswa();
		Mhs.setMhs("Ika Nurfitriani", 205410116, "Informatika", "Perempuan", "Kuningan");
		Mhs.tampil();
	}
}