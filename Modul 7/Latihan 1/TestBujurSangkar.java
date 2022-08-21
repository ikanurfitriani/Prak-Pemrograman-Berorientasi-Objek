class BujurSangkar {
	private double sisi;
	public BujurSangkar() {
		this.sisi = 5.0;
	}
	public double luas() {
		return(sisi*sisi);
	}
	public double keliling() {
		return(4*sisi);
	}
	public void tampil() {
		System.out.println("Luas Bujur Sangkar: "+luas());
		System.out.println("Keliling Bujur Sangkar: "+keliling());
	}
}
public class TestBujurSangkar {
	public static void main(String[] args) {
		BujurSangkar bs=new BujurSangkar();
		bs.tampil();
	}
}