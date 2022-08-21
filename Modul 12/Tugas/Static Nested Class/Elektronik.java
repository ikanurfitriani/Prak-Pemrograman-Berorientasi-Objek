public class Elektronik {
	static class Smartphone {
		public void spesifikasi() {
			System.out.println("=== SPESIFIKASI SMARTPHONE ==="+
			"\nMerk Smartphone: Iphone \nTipe Smartphone: 13 Pro"+
			"\nTahun Rilis Smartphone: 2021");
		}
	}
	public static void main(String args[]) {
		Elektronik.Smartphone esmart=new Elektronik.Smartphone();
		esmart.spesifikasi();
	}
}