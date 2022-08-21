public class Perhitungan {
	double bil1;
	double bil2;

	public Perhitungan() {
		bil1 = 28.0;
		bil2 = 10.0;
	}
	public Perhitungan(double a, double b) {
		bil1 = a;
		bil2 = b;
	}
	public double kali() {
		return(bil1*bil2);
	}
	public double bagi() {
		return(bil1/bil2);
	}
	public static void main(String[] args) {
		Perhitungan x1 = new Perhitungan();
		System.out.println("Hasil perkalian = "+x1.kali());
		System.out.println("Hasil pembagian = "+x1.bagi());

		Perhitungan z1 = new Perhitungan(6.0, 12.0);
		System.out.println("\nHasil perkalian = "+z1.kali());
		System.out.println("Hasil pembagian = "+z1.bagi());
	}
}