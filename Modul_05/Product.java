public class Product {
	private String[] nmProduct;

	public Product(String[] nmProduct) {
		this.nmProduct = nmProduct;
	}
	public void cetakProduct() {
		for(int x = 0; x < nmProduct.length; x++) {
			System.out.println("Nama Product ke-"+(x+1)+": "+nmProduct[x]);
		}
	}
}