class Pembagian {
	private double a, b, c, d;
	private int e, f, g, h, i;

	//method bagi() overloading dengan perbedaan jenis tipe parameter
	void bagi() { 						// tanpa parameter
		System.out.println(0);
	}
	void bagi(double a, double b) {		// parameter dua double
		System.out.println(a/b);
	}
	void bagi(double c, int e) {		// parameter satu double satu integer
		System.out.println((c+e)/2);
	}
	void bagi(int f, double d) {		// parameter satu integer satu double
		System.out.println(f*d*f/f);
	}
	void bagi(int g, int h, int i) {	// parameter tiga integer
		System.out.println(g*h*i/3);
	}
	public static void main(String args[]) {
		Pembagian obj=new Pembagian();	// deklarasi dan objek obj
		System.out.println("Hasil method bagi():");
		obj.bagi();
		obj.bagi(5.0, 4.0);
		obj.bagi(16.0, 8);
		obj.bagi(6, 1.5);
		obj.bagi(6, 8, 10);
	}
}