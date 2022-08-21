public abstract class Hewan {
	protected String nama;
	public Hewan() {
		nama="Belum pasti";
	}
	abstract public String deskripsi(); //metode deskripsi() abstrak,
								   		//tidak ada tubuh(definisi) fungsi-nya
								   		//tapi ini diperlukan utk inheritance
	abstract public double hitungHewan();	//metode hitungHewan() abstrak,
								   			//tidak ada tubuh(definisi) fungsi-nya
								   			//tapi ini diperlukan utk inheritance
	public void tampil() {
		System.out.println("===== INFORMASI HEWAN =====");
		System.out.println(nama);
		System.out.println(deskripsi());
		System.out.println("Total "+nama+"= "+hitungHewan());
		System.out.println();
	}
}