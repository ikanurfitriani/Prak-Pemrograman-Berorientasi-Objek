class BujurSangkar {
	private double sisi;
	public BujurSangkar(double s) {
		sisi = s;
	}
	public double luas() {
		return(sisi*sisi);
	}
	public double keliling() {
		return(4*sisi);
	}
}
class SetengahBujurSangkar extends BujurSangkar {
	public SetengahBujurSangkar(double s) {
		super(s);
	}
	public double luas() {	//overidding metode luas() kelas BujurSangkar
		return(0.5*super.luas());
	}
	public double keliling() { //overidding metode keliling() kelas BujurSangkar
		return(0.5*super.keliling());
	}
}
public class Utama {
	public static void main(String[] args) {
		BujurSangkar bs;
		bs=new BujurSangkar(12);
		System.out.println("===== BUJUR SANGKAR =====");
		System.out.println("Luas Bujur Sangkar: "+bs.luas());
		System.out.println("Keliling Bujur Sangkar: "+bs.keliling());
		bs=new SetengahBujurSangkar(12);
		System.out.println("\nLuas 1/2 Bujur Sangkar: "+bs.luas());
		System.out.println("Keliling 1/2 Bujur Sangkar: "+bs.keliling());
	}
}