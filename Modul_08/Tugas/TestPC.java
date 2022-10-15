import toko.*;
public class TestPC extends PC {
	public static void main(String args[]) {
		//membuat object baru dari class PC
		TestPC pc1 = new TestPC();
		//mengakses method yang memiliki tipe public
		pc1.setMerk("Lenovo");
		pc1.setTipe("IdeaPad Slim 3");
		//mengakses method yang memiliki tipe protected
		pc1.setTahun(2020);
		pc1.show();
	}
}