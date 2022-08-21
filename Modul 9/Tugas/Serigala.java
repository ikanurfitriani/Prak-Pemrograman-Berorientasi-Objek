public class Serigala extends Hewan {
	private String habitat;
	private String makan;
	private int jmlhKaki;
	private double jmlhKandang;
	private double jmlhEkor;
	public Serigala(String h, String m, int k, double jkd, double jek) {
		nama="Serigala";
		this.habitat=h;
		this.makan=m;
		jmlhKaki=k;
		jmlhKandang=jkd;
		jmlhEkor=jek;
	}
	public String deskripsi() {
		return("Hidup di: "+this.habitat+"\nHewan pemakan: "+
		this.makan+"\nMemiliki: "+jmlhKaki+" kaki");
	}
	public double hitungHewan() {
		return(jmlhKandang*jmlhEkor);
	}
}