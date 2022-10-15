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
class Segiempat extends BujurSangkar {
	private double p;
	private double l;
	public Segiempat() {
		this.p = 9.0;
		this.l = 4.0;
	}
	public double luasSe() {
		return(p*l);
	}
	public double kelilingSe() {
		return(2*(p+l));
	}
	public void tampil() {
		super.tampil();
		System.out.println("Luas Segiempat: "+luasSe());
		System.out.println("Keliling Segiempat: "+kelilingSe());
	}
}
public class TestSegiempat {
	public static void main(String[] args) {
		BujurSangkar bs=new Segiempat();
		bs.tampil();
	}
}