public class Lingkaran {
	final double phi = 3.14;
	double jari;

	public double luas() {
		return(phi*jari*jari);
	}
	public double keliling() {
		return(2*phi*jari);
	}
	//3 MACAM TIPE KONSTRUKTOR
	public Lingkaran() { //ini konstruktor default
		jari = 7.0;
	}
	public Lingkaran(double r) { //ini konstruktor copy
		jari = r;
	}
	public Lingkaran(Lingkaran li) { //ini konstruktor copy objek
		jari = li.jari;
	}
	public static void main(String[] args) {
		Lingkaran li0 = new Lingkaran(); //memanggil konstruktor default
		System.out.println("Luas = "+ li0.luas());
		System.out.println("Keliling = "+ li0.keliling());

		Lingkaran li1 = new Lingkaran(12.0); //memanggil konstruktor copy
		System.out.println("\nLuas = "+ li1.luas());
		System.out.println("Keliling = "+ li1.keliling());

		Lingkaran li2 = new Lingkaran(li1); //memanggil konstruktor copy objek
		System.out.println("\nLuas = "+li2.luas());
		System.out.println("Keliling = "+li2.keliling());
	}
}
