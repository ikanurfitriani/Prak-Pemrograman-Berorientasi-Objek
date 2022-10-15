public abstract class Geometri {
	protected String bentuk;
	public Geometri() {
		bentuk="Belum pasti";
	}
	abstract public double luas(); //method luas() abstrak
								   //tidak ada tubuh(definisi) fungsi-nya
								   //tp diperlukan utk inheritance
	abstract public double keliling();	//method keliling() abstrak
										//tidak ada tubuh(definisi) fungsi-nya
								   		//tp diperlukan utk inheritance
	protected void cetak() {
		System.out.println("=====INFORMASI GEOMETRI=====");
		System.out.println(bentuk);
		System.out.println("Luas: "+luas());
		System.out.println("Keliling: "+keliling());
		System.out.println();
	}
}