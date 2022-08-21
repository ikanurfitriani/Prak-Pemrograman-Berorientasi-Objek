public class Jurusan {
	private String nmjurusan;
	private int angkatan;

	public Jurusan(String nmjurusan, int angkatan) {
		this.nmjurusan = nmjurusan;
		this.angkatan = angkatan;
	}
	public void cetakJurusan() {
		System.out.println("Nama jurusan: "+nmjurusan);
		System.out.println("Tahun angkatan: "+angkatan);
	}
}