public class Lingkaran extends Geometri {
	private double jari;
	public Lingkaran(double r) {
		bentuk="Lingkaran";
		jari=r;
	}
	public double luas() {
		return(3.14*jari*jari);
	}
	public double keliling() {
		return(2*3.14*jari);
	}
}