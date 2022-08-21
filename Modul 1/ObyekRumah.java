class Rumah {
	int Tipe;
	String Alamat;
	int LuasTanah;
	int HargaJual;

	public void setRumah(int Tipe, String Alamat, int LuasTanah, int HargaJual) {
		this.Tipe = Tipe;
		this.Alamat = Alamat;
		this.LuasTanah = LuasTanah;
		this.HargaJual = HargaJual;
	}
	public void tampil() {
		System.out.println("Tipe Rumah : "+Tipe);
		System.out.println("Alamat Rumah : "+Alamat);
		System.out.println("Luas Tanah : "+LuasTanah+" m2");
		System.out.println("Harga Jual : "+HargaJual);
	}
	public void investasi() {
		System.out.println("Harga akan mengalami kenaikan karena lokasi strategis");
		System.out.println();
	}
	public void kerugian() {
		System.out.println("Harga akan mengalami penurunan karena lokasi tidak strategis");
		System.out.println();
	}
}
public class ObyekRumah {
	public static void main(String[] args) {
		Rumah rumah1=new Rumah();
		Rumah rumah2=new Rumah();
		rumah1.setRumah(48, "Provinsi DIY", 91, 501000000);
		rumah2.setRumah(82, "Provinsi Jabar", 100, 780000000);

		rumah1.tampil();
		rumah1.investasi();

		rumah2.tampil();
		rumah2.kerugian();
	}
}