package Jednostki;

public class Temperatura {

	private Temperatura() {}
		
	public static double kelvinNaCelsjusz(double a) {
		return round(a-273.15);
	}
	
	public static double kelvinNaFahrenheit(double a) {
		return celsjuszNaFahrenheit(kelvinNaCelsjusz(a));
	}
	
	public static double celsjuszNaKelvin(double a) {
		return round(a+273.15);
	}
	
	public static double celsjuszNaFahrenheit(double a) {
		return round(32 + 1.8*a);
	}
	
	public static double fahrenheitNaCelsjusz(double a) {
		return round((a-32) / 1.8);
	}
	
	public static double fahrenheitNaKelvin(double a) {
		return fahrenheitNaCelsjusz(a) + 273.15;
	}
	
	
	private static double round(double x) {
		double y = x;
		y *= 1000;
		y = Math.round(y);
		y /= 1000;	
		return y;
	}
}
