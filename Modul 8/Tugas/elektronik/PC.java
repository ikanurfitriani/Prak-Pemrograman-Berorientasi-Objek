package elektronik;
public class PC {
	String Merk; //atribut Merk bertipe default
	protected String Tipe; //atribut Tipe bertipe protected
	int Tahun; //atribut Tahun bertipe default
	public void setMerk(String Merk) {
		this.Merk = Merk;
	}
	public void setTipe(String Tipe) {
		this.Tipe = Tipe;
	}
	protected void setTahun(int Tahun) {
		this.Tahun = Tahun;
	}
	protected void show() {
		System.out.println("=====DETAIL PC=====");
		System.out.println("Merk: "+Merk);
		System.out.println("Tipe: "+Tipe);
		System.out.println("Tahun Rilis: "+Tahun);
	}
}