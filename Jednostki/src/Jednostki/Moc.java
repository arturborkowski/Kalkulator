package Jednostki;

public class Moc {
	
	public Moc() {}
	
	
	public static double watNaKonMech(double a) {
		double x = a/735.498;
		return round(x);
	}
	
	public static float konMechNaWat(double a) {
		return (float)a*735.498f;
	}
	
	
	private static double round(double x) {
		double y = x;
		y *= 1000;
		y = Math.round(y);
		y /= 1000;	
		return y;
	}

}


