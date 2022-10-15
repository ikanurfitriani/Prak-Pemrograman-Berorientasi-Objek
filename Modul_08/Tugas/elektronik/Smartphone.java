package elektronik;
public class Smartphone {
	String Merk; //atribut Merk bertipe default
	String Tipe; //atribut Tipe bertipe default
	int Tahun; //atribut Tahun bertipe default
	public void setMerk(String Merk) { //method bertipe public
		this.Merk = Merk;
	}
	public void setTipe(String Tipe) { //method bertipe public
		this.Tipe = Tipe;
	}
	public void setTahun(int Tahun) { //method bertipe public
		this.Tahun = Tahun;
	}
	public void show() { //method bertipe public
		System.out.println("=====DETAIL SMARTPHONE=====");
		System.out.println("Merk: "+Merk);
		System.out.println("Tipe: "+Tipe);
		System.out.println("Tahun Rilis: "+Tahun);
		System.out.println();
	}
}