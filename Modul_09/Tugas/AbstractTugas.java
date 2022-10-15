public class AbstractTugas {
	public static void main(String[] args) {
		//Hewan h=new Hewan(); 	//Hewan abstract, tdk bisa dibuat instan
		//h.tampil(); 			//shg, pernyataan ini tdk diizinkan

		Serigala sr=new Serigala("darat", "daging", 4, 5.0, 18.0);
		sr.tampil();	//Kelas Hewan abstract tapi methodnya dapat digunakan

		LumbaLumba ll=new LumbaLumba("air", "paru-paru", 7.0, 4.0);
		ll.tampil();	//Kelas Hewan abstract tapi methodnya dapat digunakan
	}
}