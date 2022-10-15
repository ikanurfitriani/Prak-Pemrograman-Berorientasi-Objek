package geometri;
public class Tabung {
	double Phi = 3.14; //atribut Phi bertipe default
	protected double Jari; //atribut Jari bertipe protected
	protected double Tinggi; //atribut Tinggi bertipe protected
	//membuat method dengan acces modifier yang berbeda-beda
	public void setJari(double Jari) { //method bertipe public
		this.Jari = Jari;
	}
	protected void setTinggi(double Tinggi) { //method bertipe protected
		this.Tinggi = Tinggi;
	}
	public double luasPermukaan() { //method bertipe public
		return(2*Phi*Jari*(Jari+Tinggi));
	}
	public double volume() { //method bertipe public
		return(Phi*Jari*Jari*Tinggi);
	}
	protected void cetak() { //method cetak() bertipe protected
		System.out.println("=======TABUNG=======");
		System.out.println("Jari-jari: "+Jari);
		System.out.println("Tinggi: "+Tinggi);
		System.out.println("Luas Permukaan: "+luasPermukaan());
		System.out.println("Volume: "+volume());
	}
}
