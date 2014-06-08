package Jednostki;

public class Dlugosc {

	private Dlugosc() {}
	

	public static double metrNaMilimetr(double a) {
		return a*1000;
	}
	
	public static double metrNaCal(double a) {
		return round(a/0.0254);
	}
	
	public static double metrNaYard(double a) {
		return round(a/0.9144);
	}
	
	public static double metrNaMileMorska(double a) {
		return round(a/1852);
	}
	
	public static double metrNaMileAngielska(double a) {
		return round(a/1509.344);
	}
	
	public static double milimetrNaMetr(double a) {
		return a*0.001;
	}
	
	public static double calNaMetr(double a) {
		return a*0.0254;
	}
	
	public static double yardNaMetr(double a) {
		return a*0.9144;
	}
	
	public static double milaMorskaNaMetr(double a) {
		return a*1852;
	}
	
	public static double milaAngielskaNaMetr(double a) {
		return a*1509.344;
	}
	
	
	private static double round(double x) {
		double y = x;
		y *= 1000;
		y = Math.round(y);
		y /= 1000;	
		return y;
	}
	
}
