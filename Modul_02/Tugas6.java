class PersegiPanjang
{
	double panjang;
	double lebar;

	public double keliling()
	{
		return(2*(panjang+lebar));
	}
	public double luas()
	{
		return(panjang*lebar);
	}
	public void setPanjang(double p)
	{
		panjang=p;
	}
	public void setLebar(double l)
	{
		lebar=l;
	}
	public void tampil()
	{
		System.out.println("panjang: "+panjang);
		System.out.println("lebar: "+lebar);
		System.out.println("keliling: "+keliling());
		System.out.println("luas: "+luas());
	}
}
public class Tugas6
{
	public static void main(String[] args)
	{
		PersegiPanjang a;
		a=new PersegiPanjang();
		a.setPanjang(10.00);
		a.setLebar(6.00);
		a.tampil();
	}
}
