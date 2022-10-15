public class TransaksiJual {
	private int nomorTrans = 10001;
	private Pembeli pembeli;
	private Product product;

	public TransaksiJual(String nmPembeli, String almtPembeli, String[] nmProduct) {
		this.pembeli = new Pembeli(nmPembeli, almtPembeli);
		this.product = new Product(nmProduct);
	}
	public int nomorTransOto() {
		nomorTrans++;
		return nomorTrans;
	}
	public void cetakTransaksi() {
		System.out.println("No Transaksi: "+nomorTrans);
		pembeli.cetakPembeli();
		product.cetakProduct();
	}
}