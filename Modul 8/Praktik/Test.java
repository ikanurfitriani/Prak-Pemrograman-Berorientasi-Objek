public class Test {
	public static void main(String[] args) {
		Mahasiswa mhs2 = new Mahasiswa();
		//memanggil atribut Nim dengan tipe public
		mhs2.Nim=115410025;
		//memanggil atribut Nama dengan tipe protected
		mhs2.Nama="Yudhi";
		mhs2.Jurusan="Teknik Informatika";
		mhs2.Tampil();
	}
}