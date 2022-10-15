package geometri;
public class Lingkaran {
	double Phi = 3.14; //atribut Phi bertipe default
	protected double Jari; //atribut Jari bertipe protected
	//membuat method dengan acces modifier yang berbeda-beda
	public void setJari(double Jari) { //method bertipe public
		this.Jari = Jari;
	}
	public double keliling() { //method bertipe public
		return(Phi*2*Jari);
	}
	public double luas() { //method bertipe public
		return(Phi*Jari*Jari);
	}
	protected void cetak() { //method cetak() bertipe protected
		System.out.println("=======LINGKARAN=======");
		System.out.println("Jari-jari: "+Jari);
		System.out.println("Keliling: "+keliling());
		System.out.println("Luas: "+luas());
	}
}