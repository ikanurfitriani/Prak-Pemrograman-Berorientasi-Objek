class Lingkaran
{
	final double phi = 3.14;
	double jari;
	public void setJari(double jari0)
	{
		this.jari=jari0;
	}
	public double jari()
	{
		return(jari);
	}
	public double luas()
	{
		double luas0;
		luas0=phi*jari*jari;
		return(luas0);
	}
	public double diameter()
	{
		double diameter0;
		diameter0=2*jari;
		return(diameter0);
	}
	public double keliling()
	{
		double keliling0;
		keliling0=phi*diameter();
		return(keliling0);
	}
	public void tampil()
	{
		System.out.println("jari jari: "+jari);
		System.out.println("luas: "+luas());
		System.out.println("diameter: "+diameter());
		System.out.println("keliling: "+keliling());
	}
}
public class Main1
{
	public static void main(String[] args)
	{
		Lingkaran a;
		a=new Lingkaran();
		a.setJari(10.00);
		a.tampil();
	}
}
