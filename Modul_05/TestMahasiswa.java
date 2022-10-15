public class TestMahasiswa {
	public static void main(String[] args) {
		String[] mkMhs1 = {"Pemrograman Berorientasi Objek", "PKN", "Pengembangan Diri"};
		Mahasiswa mahasiswa1 = new Mahasiswa("Ika Nurfitriani", 205410116, mkMhs1);
		mahasiswa1.cetakMahasiswa();
		System.out.println();

		String[] mkMhs2 = {"Pengenalan Big Data", "Sistem Operasi", "Sistem Basis Data"};
		Mahasiswa mahasiswa2 = new Mahasiswa("Oh Se Hun", 205400099, mkMhs2);
		mahasiswa2.cetakMahasiswa();
	}
}