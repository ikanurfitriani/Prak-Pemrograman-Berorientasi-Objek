public class Main2 {
	public static void main(String[] args) {
		int j, k;
		Lingkaran[] a;
		a=new Lingkaran[5];
		for(j=0;j<5;j++) {
			a[j]=new Lingkaran();
		}
		a[0].setJari(00.00);
		a[1].setJari(10.00);
		a[2].setJari(20.00);
		a[3].setJari(30.00);
		a[4].setJari(40.00);
		for(k=0;k<5;k++) {
			System.out.println("Lingkaran ke: "+k);
			a[k].tampil();
		}
		System.out.print("\nLingkaran yang jari-jarinya dibawah 25:");
		for(int i=0; i < a.length; i++) {
			if(a[i].jari() < 25.00) {
				System.out.print(" "+a[i].jari);
			}
		}
		System.out.print("\nLingkaran yang diameternya dibawah 60:");
		for(int i=0; i < a.length; i++) {
			if(a[i].diameter() < 60) {
				System.out.print(" "+a[i].diameter());
			}
		}
		System.out.print("\nLingkaran yang luasnya antara 100-1000:");
			for(int i=0; i < a.length; i++) {
			if(100 < a[i].luas() && a[i].luas() < 1000) {
				System.out.print(" "+a[i].luas());
			}
		}
		System.out.print("\nLingkaran yang kelilingnya antara 100-500:");
				for(int i=0; i < a.length; i++) {
					if(100 < a[i].keliling() && a[i].keliling() < 500) {
						System.out.print(" "+a[i].keliling());
					}
		}
		System.out.println();
	}
}