class Kubus {
	private double sisi;
	public Kubus(double s) {
		sisi=s;
	}
	public double volume() {
		return(sisi*sisi*sisi);
	}
	public double luasPermukaan() {
		return(6*sisi*sisi);
	}
}
class SetengahKubus extends Kubus {
	public SetengahKubus(double s) {
		super(s);
	}
	public double volume() { //overidding metode volume() kelas Kubus
		return(0.5*super.volume());
	}
	public double luasPermukaan() { //overidding metode luasPermukaan() kelas Kubus
		return(0.5*super.luasPermukaan());
	}
}
public class Utama {
	public static void main(String[] args) {
		Kubus k;
		k=new Kubus(11); //mula2 k berbentuk Kubus
		System.out.println("===== KUBUS =====");
		System.out.println("Volume Kubus = " +k.volume());
		System.out.println("Luas Permukaan Kubus = " +k.luasPermukaan());
		k=new SetengahKubus(11); //k berubah menjadi SetengahKubus
		System.out.println("\nVolume Setengah Kubus = "+k.volume());
		System.out.println("Luas Permukaan Setengah Kubus = " +k.luasPermukaan());
	}
}