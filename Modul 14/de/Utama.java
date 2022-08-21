interface Geometri {
	public void luas();
	public void keliling();
}
class Lingkaran implements Geometri {
    protected double jari;
    public Lingkaran(double r) {
        jari = r;
    }
    public void luas() {
        System.out.println("Luas = "+3.14*jari*jari);
    }
    public void keliling() {
		System.out.println("Keliling = "+2*3.14*jari);
	}
}
class SetengahLingkaran implements Geometri {
	private double jarijari;
    public SetengahLingkaran(double r) {
        jarijari = r;
    }
    public void luas() {
        System.out.println("Luas = "+0.5*3.14*jarijari*jarijari);
    }
    public void keliling() {
	    System.out.println("Keliling = "+0.5*2*3.14*jarijari);
    }
}
public class Utama {
	public static void main(String[] args) {
		System.out.println("=== INFO LUAS & KELILING ===");
		System.out.println("Lingkaran:");
		Lingkaran l=new Lingkaran(10);
		l.luas();
		l.keliling();
		System.out.println("\nSetengah Lingkaran:");
		SetengahLingkaran sl=new SetengahLingkaran(10);
		sl.luas();
		sl.keliling();
	}
}