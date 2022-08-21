class Laptop {
	String Merk;
	int TahunRilis;
	int Harga;

	public void setLaptop(String Merk, int TahunRilis, int Harga) {
		this.Merk = Merk;
		this.TahunRilis = TahunRilis;
		this.Harga = Harga;
	}
	public void tampil() {
		System.out.println("Detail Laptop");
		System.out.println("Merk Laptop : "+Merk);
		System.out.println("Tahun Rilis : "+TahunRilis);
		System.out.println("Harga : "+Harga);
	}
	public void kondisi(String keadaan) {
		System.out.println("Kondisi Laptop ialah "+keadaan);
		System.out.println();
	}
}
public class ObyekLaptop {
	public static void main(String[] args) {
		Laptop laptop1=new Laptop();
		Laptop laptop2=new Laptop();
		laptop1.setLaptop("ASUS", 2020, 4000000);
		laptop2.setLaptop("Lenovo", 2021, 6000000);

		laptop1.tampil();
		laptop1.kondisi("Baru");

		laptop2.tampil();
		laptop2.kondisi("Bekas");
	}
}