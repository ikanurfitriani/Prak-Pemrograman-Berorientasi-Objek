class PC {
	protected String merk;
	protected String tipe;
	protected int tahun;
	public PC() {
		this.merk="ASUS";
		this.tipe="TUF Gaming FX505";
		this.tahun=2019;
	}
	public void cetak() {
		System.out.println("Merk PC: "+merk);
		System.out.println("Tipe PC: "+tipe);
		System.out.println("Tahun Rilis PC: "+tahun);
	}
}
class Smartphone extends PC {
	public void cetak() {
		super.cetak();
		System.out.println("\nMerk Smartphone: "+merk);
		System.out.println("Tahun Rilis Smartphone: "+tahun);
	}
}
public class TestSmartphone {
	public static void main(String[] args) {
		PC p=new Smartphone();
		p.cetak();
	}
}