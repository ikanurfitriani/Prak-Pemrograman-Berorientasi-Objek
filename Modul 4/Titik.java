public class Titik {
	int x;
	int y;
	public Titik() {
		System.out.println("Konstruktor titik dijalankan!");
	}
	public Titik(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Konstruktor titik 2 dijalankan!");
	}
	// 5 macam konstruktor berbeda
	public Titik(int x, double y1) {
		System.out.println("\nKonstruktor titik 3 dijalankan!");
	}
	public Titik(double x1, int y) {
		System.out.println("\nKonstruktor titik 4 dijalankan!");
	}
	public Titik(double x1, double y1) {
		System.out.println("\nKonstruktor titik 5 dijalankan!");
	}
	public Titik(double a, double b, double c) {
		double rata = (a+b+c)/3;
		System.out.println("\nRata-rata tiga bilangan tersebut: "+rata);
	}
	public Titik(int nim, String nama) {
		System.out.println("\nNIM: "+nim);
		System.out.println("Nama: "+nama);
	}
}