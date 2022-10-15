public class Test {
	public static void main(String[] args) {
		PC pc2=new PC();
		//mengakses method yang memiliki tipe public
		pc2.setMerk("ASUS");
		pc2.setTipe("ROG Ryzen 5");
		pc2.setTahun(2021);
		//mengakses method show() yang memiliki tipe Default
		pc2.show();
	}
}