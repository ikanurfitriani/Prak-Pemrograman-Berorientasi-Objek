public class LayangLayang extends Geometri{
	private double sisiA, sisiB, dg1, dg2; //membuat variabel dengan tipe data double

	public LayangLayang(double sA, double sB, double d1, double d2) {
		bentuk="Layang-Layang";
		sisiA=sA;
		sisiB=sB;
		dg1=d1;
		dg2=d2;
	}
	public double luas() {
		return(dg1*dg2/2);
	}
	public double keliling() {
		return((2*sisiA) + (2*sisiB));
	}
}