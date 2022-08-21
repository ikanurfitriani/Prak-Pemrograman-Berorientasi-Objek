public class Lingkaran {
	double jari;

	//Variasi 3
	public double diameter() {
		return(2*jari);
	}
	public Lingkaran(double r) { //ini konstruktor copy
		jari = r;
	}
	public Lingkaran(Lingkaran li) { //ini konstruktor copy objek
		jari = li.jari;
	}
	public static void main(String[] args) {
		Lingkaran li0 = new Lingkaran(10); //memanggil konstruktor copy
		System.out.println("Diameter = "+ li0.diameter());

		Lingkaran li1 = new Lingkaran(li0); //memanggil konstruktor copy objek
		System.out.println("\nDiameter = "+li1.diameter());
	}
}