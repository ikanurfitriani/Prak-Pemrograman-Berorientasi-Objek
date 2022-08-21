public class Garis {
	int x1;
	int y1;
	int x2;
	int y2;
	public Garis() {
		System.out.println("Konstruktor garis dijalankan!");
	}
	public Garis(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		System.out.println("\nKonstruktor garis 2 dijalankan!");
	}
	//Method untuk menampilkan koordinat titik awal dan akhir garis
	public void show() {
		System.out.println("\nKoordinat titik awal: ("+x1+", "+y1+")");
		System.out.println("Koordinat titik akhir: ("+x2+", "+y2+")");
	}
	public static void main(String[] args) {
		Garis a = new Garis();
		Garis b = new Garis(2, 4, 7, 11);
		// Panggil method show()
		b.show();
	}
}