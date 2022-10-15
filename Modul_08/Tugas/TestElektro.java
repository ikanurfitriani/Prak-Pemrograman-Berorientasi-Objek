import elektronik.*;
public class TestElektro {
	public static void main(String args[]) {
		//membuat object baru dari class PC
		PC pc1 = new PC();
		//mengakses method yang memiliki tipe public
		pc1.setMerk("Lenovo");
		pc1.setTipe("IdeaPad Slim 3");
		pc1.setTahun(2020);
		pc1.show();
		
		//membuat object baru dari class Smartphone
		Smartphone sm1 = new Smartphone();
		//mengakses method yang memiliki tipe public
		sm1.setMerk("OPPO");
		sm1.setTipe("A5");
		sm1.setTahun(2020);
		sm1.show();
	}
}