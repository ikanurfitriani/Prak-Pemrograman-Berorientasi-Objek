class Mahasiswa {
	private int nim, angkatan;
	private String nama, prodi;

	//method mahasiswa() overloading dengan perbedaan jenis tipe parameter
	void mahasiswa() { 			// tanpa parameter
		System.out.println("-");
	}
	void mahasiswa(int nim) {		// parameter satu integer
		System.out.println("\nNIM: "+nim);
	}
	void mahasiswa(int nim, String nama) {	// parameter satu integer satu String
		System.out.println("\nNIM: "+nim+"\nNama: "+nama);
	}
	void mahasiswa(String nama, String prodi) {	// parameter dua String
		System.out.println("\nNama: "+nama+"\nProdi: "+prodi);
	}
	void mahasiswa(String nama, int angkatan) {	// parameter satu String satu integer
		System.out.println("\nNama: "+nama+"\nTahun Angkatan: "+angkatan);
	}
	public static void main(String args[]) {
		Mahasiswa obj=new Mahasiswa();	// deklarasi dan objek obj
		System.out.println("Hasil method mahasiswa():");
		obj.mahasiswa();
		obj.mahasiswa(205410116);
		obj.mahasiswa(205410116, "Ika Nurfitriani");
		obj.mahasiswa("Ika Nurfitriani", "Informatika");
		obj.mahasiswa("Ika Nurfitriani", 2020);
	}
}