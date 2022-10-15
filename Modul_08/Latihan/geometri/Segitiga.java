package geometri;
public class Segitiga {
	double alas; //atribut alas bertipe default
	double tinggi; //atribut tinggi bertipe default
	//membuat method dengan acces modifier yang berbeda-beda
	public void setAlas(double alas) { //method bertipe public
		this.alas = alas;
	}
	public void setTinggi(double tinggi) { //method bertipe public
		this.tinggi = tinggi;
	}
	public double luas() { //method bertipe public
		return(alas*tinggi/2);
	}
	public void tampil() { //method tampil() bertipe public
		System.out.println("=======SEGITIGA=======");
		System.out.println("Alas: "+alas);
		System.out.println("Tinggi: "+tinggi);
		System.out.println("Luas: "+luas());
		System.out.println();
	}
}