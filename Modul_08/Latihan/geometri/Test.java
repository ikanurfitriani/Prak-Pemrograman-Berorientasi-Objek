public class Test {
	public static void main(String[] args) {
		Tabung tb2 = new Tabung();
		//mengakses method yang memiliki tipe public
		tb2.setJari(14.0);
		tb2.setTinggi(24.0);
		//mengakses method cetak() yang memiliki tipe Default
		tb2.cetak();
	}
}