public class AbstractLatihan {
	public static void main(String[] args) {
	//Geometri g=new Geometri(); //Geometri abstract, tdk bisa dibuat instan
	//g.cetak(); 				 //shg, pernyataan ini tdk diizinkan

	LayangLayang ll = new LayangLayang(12.0, 12.0, 7.0, 14.0);
	ll.cetak();		//Kelas Geometri abstract tapi methodnya dapat digunakan
	}
}