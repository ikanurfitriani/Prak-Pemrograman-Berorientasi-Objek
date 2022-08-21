public class PersegiPanjang extends Geometri {
	private double panjang;
	private double lebar;
	public PersegiPanjang(double p, double l) {
		bentuk="Persegi Panjang";
		panjang=p;
		lebar=l;
	}
	public double luas() {
		return(panjang*lebar);
	}
	public double keliling() {
		return(2*(panjang+lebar));
	}
}