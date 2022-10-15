import geometri.*;
public class TestLingkaran extends Lingkaran {
	public static void main(String args[]) {
		//membuat object baru dari class Lingkaran
		TestLingkaran lk1 = new TestLingkaran();
		//mengakses method yang memiliki tipe public
		lk1.setJari(21.0);
		//mengakses method yang memiliki tipe protected
		lk1.cetak();
	}
}