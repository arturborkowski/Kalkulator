package Jednostki;

public class Objetosc {

	private Objetosc() {}
	
	
	public static double litrNaMetrSzesc (double a) {
		return a/1000;
	}
	
	public static double litrNaKwaterki(double a) {
		return a*4;
	}
	
	public static double litrNaGalon(double a) {
		return round(a/4.5456);
	}
	
	public static double galonNaLitr(double a) {
		return round(a*4.5456);
	}
	
	public static double kwaterkaNaLitr(double a) {
		return a/4;
	}

	public static double metrSzescNaLitr(double a) {
		return a*1000;
	}
	
	
	private static double round(double x) {
		double y = x;
		y *= 1000;
		y = Math.round(y);
		y /= 1000;	
		return y;
	}
}
