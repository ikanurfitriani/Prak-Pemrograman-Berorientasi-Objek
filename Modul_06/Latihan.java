class Lingkaran {
	protected double phi = 3.14; //atribut phi
	protected double jari; //atribut jari-jari

	public Lingkaran() { //konstruktor
		this.jari = 7.0;
	}
	public double luas() { //method luas()
		return(phi*jari*jari);
	}
	public double keliling() { //method keliling()
		return(2*phi*jari);
	}
	public void cetak() { //method cetak()
		System.out.println("======LINGKARAN====");
		System.out.println("Jari-jari: "+jari);
		System.out.println("Luas Lingkaran: "+luas());
		System.out.println("Keliling Lingkaran: "+keliling());
	}
}
class SetengahLingkaran extends Lingkaran {
	public SetengahLingkaran() { //konstruktor
		jari = 14.0;
	}
	public double luasSetengah() { //method luasSetengah()
		return(phi*jari*jari/2);
	}
	public double kelilingSetengah() { //method kelilingSetengah()
		return(2*phi*jari/2);
	}
	public void cetak() { //method cetak()
		System.out.println("======SETENGAH LINGKARAN====");
		System.out.println("Jari-jari: "+jari);
		System.out.println("Luas Lingkaran: "+luas());
		System.out.println("Keliling Lingkaran: "+keliling());
		System.out.println("Luas Setengah Lingkaran: "+luasSetengah());
		System.out.println("Keliling Setengah Lingkaran: "+kelilingSetengah());
	}
}
//program utama
public class Latihan {
	public static void main(String args[]) {
		Lingkaran ling1=new Lingkaran();
		ling1.cetak();
		System.out.println();
		System.out.println();

		SetengahLingkaran setling1=new SetengahLingkaran();
		setling1.cetak();
	}
}
