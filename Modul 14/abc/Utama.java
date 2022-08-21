class Lingkaran {
    protected double jari;
    public Lingkaran() {
	    jari = 0.0;
    }
    public Lingkaran(double r) {
        jari = r;
    }
    public Lingkaran(Lingkaran l) {
		jari = l.jari;
	}
    public double luas() {
        return(3.14*jari*jari);
    }
    public double keliling() {
	    return(2*3.14*jari);
    }
}
class SetengahLingkaran extends Lingkaran {
	private double jarijari;
	public SetengahLingkaran() {
		jarijari = 0.0;
    }
    public SetengahLingkaran(double r) {
        super(r);
    }
    public SetengahLingkaran(SetengahLingkaran l) {
		jarijari = l.jarijari;
	}
    public double luas() {
        return(0.5*super.luas());
    }
    public double keliling() {
	    return(0.5*super.keliling());
    }
}
public class Utama {
    public static void main(String[] args) {
        Lingkaran l;
        l = new Lingkaran(10);
        System.out.println("Luas Lingkaran = "+l.luas());
        System.out.println("Keliling Lingkaran = "+l.keliling());
        l = new SetengahLingkaran(10);
        System.out.println("\nLuas Setengah Lingkaran = "+l.luas());
        System.out.println("Keliling Setengah Lingkaran = "+l.keliling());
    }
}