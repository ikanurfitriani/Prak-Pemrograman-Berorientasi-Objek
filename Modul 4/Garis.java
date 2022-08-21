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
	public Garis(double x3, double y3, double x4, double y4) {
		double rata = (x3+y3+x4+y4)/4;
		System.out.println("\nRata-rata 4 bilangan tersebut: "+rata);
	}
	public Garis(double x, double y) {
		System.out.println("\nHasil perkalian 2 bilangan: "+(x*y));
	}
	public Garis(String nama, String kelas) {
		System.out.println("\nNama: "+nama);
		System.out.println("Kelas: "+kelas);
	}
	public static void main(String[] args) {
		Garis a = new Garis();
		Garis b = new Garis(2, 4, 7, 11);
		Garis c = new Garis(1.5, 3.0, 4.5, 7);
		Garis d = new Garis(12.0, 6.0);
		Garis e = new Garis("Ika Nurfitriani", "IF-3");
	}
}