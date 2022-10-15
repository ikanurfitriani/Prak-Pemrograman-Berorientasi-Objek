public class Lingkaran {
	double bil1;
	double bil2;
	double bil3;

	//Variasi 1
	public double rata() {
		return ((bil1+bil2+bil3)/3);
	}
	public Lingkaran(double a, double b, double c) { //ini konstruktor copy
		bil1 = a;
		bil2 = b;
		bil3 = c;
	}
	public Lingkaran(Lingkaran ratarata) { //ini konstruktor copy objek
		bil1 = ratarata.bil1;
		bil2 = ratarata.bil2;
		bil3 = ratarata.bil3;
	}
	public static void main(String[] args) {
		Lingkaran li0 = new Lingkaran(10, 38, 24); //memanggil konstruktor copy
		System.out.println("Rata - rata = "+li0.rata());

		Lingkaran li1 = new Lingkaran(li0); //memanggil konstruktor copy objek
		System.out.println("\nRata - rata = "+li0.rata());
	}
}