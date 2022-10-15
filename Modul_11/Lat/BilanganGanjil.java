public class BilanganGanjil {
	public static void main(String[] args) {
		int[] b = {1, 3, 5, 7, 9};
		try {
			System.out.println("=== BILANGAN GANJIL ===");
			System.out.println("Data kedua: " + b[1]);
		}
		catch(ArrayIndexOutOfBoundsException e) { //ditangkap dgn ArrayIndexOutOfBoundsException
			System.out.println("Exception yang dilempar: " + e);
		}
		finally {
			System.out.println("Program Ganjil Selesai Dijalankan");
		}
	}
}