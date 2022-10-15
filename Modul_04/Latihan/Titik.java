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
	// Method untuk menampilkan koordinat titik
	public void tampil() {
		System.out.println("\nKoordinat titik: ("+x+", "+y+")");
	}
}