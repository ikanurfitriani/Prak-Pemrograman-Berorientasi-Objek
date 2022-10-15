public class Balok {
	//membuat variabel dengan tipe data double
	double pj;
	double lb;
	double tg;

	public double keliling() {
		return(4*(pj+lb+tg));
	}
	public double volume() {
		return(pj*lb*tg);
	}
	public Balok() { // konstruktor default
		pj=6.0;
		lb=8.0;
		tg=10.0;
	}
	public Balok(double p, double l, double t) { // konstruktor copy
		pj=p;
		lb=l;
		tg=t;
	}
	public Balok(Balok ba) { // konstruktor copy objek
		pj=ba.pj;
		lb=ba.lb;
		tg=ba.tg;
	}
	public static void main (String[] args) {
		Balok ba0=new Balok(); //panggil konstruktor default
		System.out.println("Keliling = "+ba0.keliling());
		System.out.println("Volume = "+ba0.volume());
		Balok ba1=new Balok(3.0, 4.0, 5.0); //panggil konstruktor copy
		System.out.println("\nKeliling = "+ba1.keliling());
		System.out.println("Volume = "+ba1.volume());
		Balok ba2=new Balok(ba1); //panggil konstruktor copy objek
		System.out.println("\nKeliling = "+ba2.keliling());
		System.out.println("Volume = "+ba2.volume());
	}
}