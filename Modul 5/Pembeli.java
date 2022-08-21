public class Pembeli {
	private String nmPembeli;
	private String almtPembeli;

	public Pembeli(String nmPembeli, String almtPembeli) {
		this.nmPembeli = nmPembeli;
		this.almtPembeli = almtPembeli;
	}
	public void cetakPembeli() {
		System.out.println("Nama Pembeli: "+nmPembeli);
		System.out.println("Alamat Pembeli: "+almtPembeli);
	}
}