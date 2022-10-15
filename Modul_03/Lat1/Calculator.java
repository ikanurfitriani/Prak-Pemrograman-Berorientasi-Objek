class Calculator {
	private double a, b, c, j;
	private String d, e, f;
	private int g, h, i, k;

	//method tambah() overloading dengan perbedaan jenis tipe dan jumlah parameter
	void tambah() { 			// tanpa parameter
		System.out.println(0);
	}
	void tambah(double a) {		// parameter satu double
		System.out.println(2*a);
	}
	void tambah(double b, double c) {	// parameter dua double
		System.out.println(b+c);
	}
	void tambah(String d, String e) {	// parameter dua String
		System.out.println(d+e);
	}
	void tambah(String f) {		// parameter satu String
		System.out.println(f);
	}
	void tambah(int g, int h, int i) {	// parameter tiga integer
		System.out.println(g+h+i);
	}
	void tambah(double j, int k) {		// parameter satu double satu integer
		System.out.println(j+k);
	}

	//method kali() overloading dengan perbedaan jenis tipe parameter
	void kali() {				// tanpa parameter
		System.out.println(1);
	}
	void kali(double a, double b) {		// parameter dua double
		System.out.println(a*b);
	}
	void kali(int g) {			// parameter satu integer
		System.out.println(g*g);
	}
	void kali(double c, int h, int i) {		// parameter satu double dua integer
		System.out.println(c*h*i);
	}
	void kali(int k, double j) {		// parameter satu integer satu double
		System.out.println(1*k*j);
	}

	//method kurang() overloading dengan perbedaan jenis tipe parameter
	void kurang() {				// tanpa parameter
		System.out.println(-1);
	}
	void kurang(double a) {		// parameter satu double
		System.out.println(a/2);
	}
	void kurang(double b, int g) {	// parameter satu double satu integer
		System.out.println(b-g);
	}
	void kurang(int h, double c, double j) {	// parameter satu integer dua double
		System.out.println(h-c-j);
	}
	void kurang(int i, int k) {		// parameter dua integer
		System.out.println(i-k/2);
	}
	public static void main(String args[]) {
		Calculator obj=new Calculator();	// deklarasi dan objek obj
		System.out.println("Hasil method tambah():");
		obj.tambah();
		obj.tambah(10.0);
		obj.tambah(5.0, 4.0);
		obj.tambah("Selamat","Datang");
		obj.tambah("Hallo");
		obj.tambah(6, 8, 10);
		obj.tambah(6.5, 7);

		Calculator obk=new Calculator();	// deklarasi dan objek obk
		System.out.println("\nHasil method kali():");
		obk.kali();
		obk.kali(5.0, 4.0);
		obk.kali(10);
		obk.kali(6.0, 8, 10);
		obk.kali(6, 7.5);

		Calculator obl=new Calculator();	// deklarasi dan objek obl
		System.out.println("\nHasil method kurang():");
		obl.kurang();
		obl.kurang(13.0);
		obl.kurang(15.5, 10);
		obl.kurang(5, 12.0, 13.0);
		obl.kurang(9, 21);
	}
}