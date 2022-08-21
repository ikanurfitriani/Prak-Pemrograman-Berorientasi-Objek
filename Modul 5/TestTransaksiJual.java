public class TestTransaksiJual {
	public static void main(String[] args) {
		String[] nmProduct = {"Oppo A5 2020", "Iphone X", "Realme Narzo"};
		TransaksiJual transaksi = new TransaksiJual("Ika N", "Kuningan", nmProduct);
		transaksi.cetakTransaksi();
		System.out.println();

		String[] nmProduct2 = {"Oppo A7", "Iphone 13", "Realme C21"};
		TransaksiJual transaksi2 = new TransaksiJual("Lay", "Kuningan", nmProduct);
		transaksi2.nomorTransOto();
		transaksi2.cetakTransaksi();
	}
}