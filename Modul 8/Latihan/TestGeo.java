import geometri.*;
public class TestGeo {
	public static void main(String args[]) {
		//membuat object baru dari class Lingkaran
		Lingkaran lk1 = new Lingkaran();
		//memanggil method yang memiliki tipe public
		lk1.setJari(21.0);
		lk1.cetak();

		//membuat object baru dari class Segitiga
		Segitiga sg1 = new Segitiga();
		//memanggil method yang memiliki tipe public
		sg1.setAlas(10.0);
		sg1.setTinggi(14.0);
		sg1.tampil();
	}
}