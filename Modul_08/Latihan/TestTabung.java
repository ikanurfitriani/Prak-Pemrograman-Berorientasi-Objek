import geometri.*;
public class TestTabung extends Tabung {
	public static void main(String args[]) {
		//membuat object baru dari class Tabung
		TestTabung tb1 = new TestTabung();
		//mengakses method yang memiliki tipe public
		tb1.setJari(24.0);
		//mengakses method yang memiliki tipe protected
		tb1.setTinggi(42.0);
		tb1.cetak();
	}
}