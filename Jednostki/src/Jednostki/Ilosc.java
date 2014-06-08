package Jednostki;

public class Ilosc {

	private Ilosc() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static double kopaNaMendel(double a) {
		return a*4;
	}
	
	public static double mendelNaKope(double a) {
		return a/4;
	}
	
	public static double kopaNaTuzin(double a) {
		return a*5;
	}
	
	public static double tuzinNaKope(double a) {
		return a/5;
	}
	
	public static double mendelNaTuzin(double a) {
		return (a*5)/4;		
	}
	
	public static double tuzinNaMendel(double a) {
		return (a*4)/5;
	}
	

}
