class GabungKata {
	private String a, b, c, d, e, f;

	//method gabung() overloading dengan perbedaan jumlah parameter
	void gabung() { 			// tanpa parameter
		System.out.println("Kosong");
	}
	void gabung(String a) {		// parameter satu String
		System.out.println(a+"-"+a);
	}
	void gabung(String b, String c) {	// parameter dua String
		System.out.println(b+" "+c);
	}
	void gabung(String d, String e, String f) {	// parameter tiga String
		System.out.println(d+" "+e+" "+f+"?");
	}
	public static void main(String args[]) {
		GabungKata obj=new GabungKata();	// deklarasi dan objek obj
		System.out.println("Hasil method gabung():");
		obj.gabung();
		obj.gabung("Hallo");
		obj.gabung("Selamat", "Datang");
		obj.gabung("Bagaimana", "kabar", "kamu");
	}
}