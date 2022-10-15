public class LumbaLumba extends Hewan {
	private String habitat;
	private String bernafas;
	private double jmlhKolam;
	private double jmlhEkor;
	public LumbaLumba(String h1, String b, double jko, double jor) {
		nama="Lumba-Lumba";
		this.habitat=h1;
		this.bernafas=b;
		jmlhKolam=jko;
		jmlhEkor=jor;
	}
	public String deskripsi() {
		return("Hidup di: "+this.habitat+"\nBernafas dengan: "+
		this.bernafas);
	}
	public double hitungHewan() {
		return(jmlhKolam*jmlhEkor);
	}
}