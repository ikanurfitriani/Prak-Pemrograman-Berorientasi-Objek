public class BilanganGenap {
	public static void main(String[] args) {
		int[] a = {2, 4, 6, 8, 10};
		try {
			System.out.println("=== BILANGAN GENAP ===");
			System.out.println("Data keempat: " + a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) { //ditangkap dgn ArrayIndexOutOfBoundsException
			System.out.println("Exception yang dilempar: " + e);
		}
		finally {
			System.out.println("Program Genap Selesai Dijalankan");
		}
	}
}