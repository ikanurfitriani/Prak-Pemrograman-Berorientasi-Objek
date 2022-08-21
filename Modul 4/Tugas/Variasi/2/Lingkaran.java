public class Lingkaran {
	double jari;
	double tinggi;

	//Variasi 2
	public double volume() {
		return (3.14*jari*jari*tinggi);
	}
	public Lingkaran(double r, double t) { //ini konstruktor copy
		jari = r;
		tinggi = t;
	}
	public Lingkaran(Lingkaran tabung) { //ini konstruktor copy objek
		jari = tabung.jari;
		tinggi = tabung.tinggi;
	}
	public static void main(String[] args) {
		Lingkaran li0 = new Lingkaran(4, 10); //memanggil konstruktor copy
		System.out.println("Volume tabung = "+ li0.volume());

		Lingkaran li1 = new Lingkaran(li0); //memanggil konstruktor copy objek
		System.out.println("\nVolume tabung = "+li1.volume());
	}
}