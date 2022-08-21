class Calculator {
	private double a, b, c;
	private String d, e;

	//method overloading dengan perbedaan jumlah parameter
	void tambah() {
		System.out.println(0);
	}
	void tambah(double a) {
		System.out.println(2*a);
	}
	void tambah(double b, double c) {
			System.out.println(b+c);
	}
	void tambah(String d, String e) {
			System.out.println(d+e);
	}
	public static void main(String args[]) {
		Calculator obj=new Calculator();
		obj.tambah();
		obj.tambah(10);
		obj.tambah(20,20);
		obj.tambah("Selamat","Datang");
	}
}