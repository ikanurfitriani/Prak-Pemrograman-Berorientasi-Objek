class Bujursangkar {
	protected int sisi; //atribut sisi

	public Bujursangkar() { //konstruktor
		this.sisi = 8;
	}
	public double luas() { //method luas()
		return(sisi*sisi);
	}
	public double keliling() { //method keliling()
		return(4*sisi);
	}
	public void cetak() { //method cetak()
		System.out.println("======BUJURSANGKAR====");
		System.out.println("Sisi Bujursangkar: "+sisi);
		System.out.println("Luas Bujursangkar: "+luas());
		System.out.println("Keliling Bujursangkar: "+keliling());
	}
}
class Segiempat extends Bujursangkar {
	protected int panjang; //atribut panjang
	protected int lebar; //atribut lebar

	public Segiempat() { //konstruktor
		sisi = 9;
		this.panjang = 5;
		this.lebar = 3;
	}
	public double luasSegiempat() { //method luasSegiempat()
		return(panjang*lebar);
	}
	public double kelilingSegiempat() { //method kelilingSegiempat()
		return(2*(panjang+lebar));
	}
	public void cetak() { //method cetak()
		System.out.println("======SEGIEMPAT====");
		System.out.println("Sisi Bujursangkar: "+sisi);
		System.out.println("Luas Bujursangkar: "+luas());
		System.out.println("Keliling Bujursangkar: "+keliling());
		System.out.println("Panjang Segiempat: "+panjang);
		System.out.println("Lebar Segiempat: "+lebar);
		System.out.println("Luas Segiempat: "+luasSegiempat());
		System.out.println("Keliling Segiempat: "+kelilingSegiempat());
	}
}
//program utama
public class Tugas {
	public static void main(String args[]) {
		Bujursangkar bu1=new Bujursangkar();
		bu1.cetak();
		System.out.println();
		System.out.println();

		Segiempat se1=new Segiempat();
		se1.cetak();
	}
}
