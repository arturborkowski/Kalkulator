package Jednostki;

import java.util.Scanner;

public class Kalkulator {
	
	private double arg;  // parametr do przeliczenia
	private int wybor;	// zmienna pomocnicza do switcha 
	
	
	
	/***********  gettery i settery ****************/
	
	void setArg(double n) {
		this.arg = n;
	}
	
	double getArg() {
		return this.arg;
	}
	
	void setWybor(int n) {
		this.wybor = n; 
	}

	public Kalkulator() {
		menu();
	}
	
	
	
	// menu wyboru otwieraj¹ce program
	void menu() {
		do {
			System.out.println("************ Witaj w kalkulatorze!!! ************\n\n");
			System.out.println("Wybierz kategoriê jednostek jak¹ chcesz przeliczaæ:");
			System.out.println("1. Iloœæ\n2. D³ugoœæ\n3. Objêtoœæ\n4. Temperatura\n5. Moc");
			
			Scanner czyt = new Scanner(System.in);
			setWybor(czyt.nextInt());
			
			// odnoœniki do poszczególnych metod
			switch(wybor) {
			case 1: {liczIlosc(); break;}
			case 2: {liczDlugosc(); break;}
			case 3: {liczObjetosc(); break;}
			case 4: {liczTemperature(); break;}
			case 5: {liczMoc(); break;}
			default: {System.out.println("Musisz wybrac wartoœæ od 1 - 5"); break;}
			}
			
			System.out.println("Czy chcesz powróciæ do pocz¹tku? [1 -TAK] [2 - NIE]");
			setWybor(czyt.nextInt());
		} while(wybor==1);
	}
	
	
// poni¿ej zestaw metod do przeliczania jednostek z zaimplementowanym menu wyboru.
	 void liczIlosc() {
		 System.out.println("Wybierz sposob przeliczania jednostek.\n");
		 System.out.println("MENU:\n1. Kopa na mendel\n2. Mendel na kope\n3.Kopa na tuzin\n4. Tuzin na kopê\n"
		 		+ "5. Mendel na tuzin\n6. Tuzin na mendel\n");
		 Scanner czyt = new Scanner(System.in);
		 setWybor(czyt.nextInt());
		 
		 
		 switch(wybor) {
		 case 1: { 
			 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
			 setArg(czyt.nextDouble());
			 System.out.println(arg+" k. to "+Ilosc.kopaNaMendel(arg)+ " men."); break;
			 }
		 case 2: {
			 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
			 setArg(czyt.nextDouble());
			 System.out.println(arg+" men. to "+Ilosc.mendelNaKope(arg)+ " k."); break;
			 }
		 case 3: {
			 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
			 setArg(czyt.nextDouble());
			 System.out.println(arg+" k. to "+Ilosc.kopaNaTuzin(arg)+ " tuz."); break;
			 }
		 case 4: {
			 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
			 setArg(czyt.nextDouble());
			 System.out.println(arg+" tuz. to "+Ilosc.tuzinNaKope(arg)+ " k."); break;
			 }
		 case 5: {
			 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
			 setArg(czyt.nextDouble());
			 System.out.println(arg+" k. to "+Ilosc.mendelNaTuzin(arg)+ "tuz."); break;
			 }
		 case 6: {
			 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
			 setArg(czyt.nextDouble());
			 System.out.println(arg+" k. to "+Ilosc.tuzinNaMendel(arg)+ "tuz."); break;
			 }
		 default: {System.out.println("Musisz podaæ wartoœæ odpowiadaj¹c¹ pozycji w Menu!"); break;}
		 }
		 
	 }
	 
	 
	 void liczDlugosc() {
		 System.out.println("Wybierz sposob przeliczania jednostek.\n");
		 System.out.println("MENU:\n1. Metr na milimetr\n2. Metr na cal\n3. Metr na yard\n4. Metr na milê morsk¹\n"
		 		+ "5. Metr na milê angielsk¹\n6. Milimetr na metr\n7. Cal na metr\n8. Yard na metr\n9. Mila morska na metr\n"
		 		+ "10. Mila angielska na metr\n");
		 Scanner czyt = new Scanner(System.in);
		 setWybor(czyt.nextInt());
		 
		 
		 switch(wybor) {
		 case 1: { 
			 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
			 setArg(czyt.nextDouble());
			 System.out.println(arg+" m to "+Dlugosc.metrNaMilimetr(arg)+ " mm"); break;
			 }
		 case 2: {
			 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
			 setArg(czyt.nextDouble());
			 System.out.println(arg+" m to "+Dlugosc.metrNaCal(arg)+ " in."); break;
			 }
		 case 3: {
			 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
			 setArg(czyt.nextDouble());
			 System.out.println(arg+" m to "+Dlugosc.metrNaYard(arg)+ " yd"); break;
			 }
		 case 4: {
			 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
			 setArg(czyt.nextDouble());
			 System.out.println(arg+" m to "+Dlugosc.metrNaMileMorska(arg)+ " mil morskich"); break;
			 }
		 case 5: {
			 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
			 setArg(czyt.nextDouble());
			 System.out.println(arg+" m to "+Dlugosc.metrNaMileAngielska(arg)+ "mil ang."); break;
			 }
		 case 6: {
			 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
			 setArg(czyt.nextDouble());
			 System.out.println(arg+" mm to "+Dlugosc.milimetrNaMetr(arg)+ " m"); break;
			 }
		 case 7: {
			 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
			 setArg(czyt.nextDouble());
			 System.out.println(arg+" in. to "+Dlugosc.calNaMetr(arg)+ " m"); break;
			 }
		 case 8: {
			 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
			 setArg(czyt.nextDouble());
			 System.out.println(arg+" yd to "+Dlugosc.yardNaMetr(arg)+ " m"); break;
			 }
		 case 9: {
			 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
			 setArg(czyt.nextDouble());
			 System.out.println(arg+" mil morskich to "+Dlugosc.milaMorskaNaMetr(arg)+ " m"); break;
			 }
		 case 10: {
			 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
			 setArg(czyt.nextDouble());
			 System.out.println(arg+" mil angielskich to "+Dlugosc.milaAngielskaNaMetr(arg)+ " m"); break;
			 }
		 default: {System.out.println("Musisz podaæ wartoœæ odpowiadaj¹c¹ pozycji w Menu!"); break;}
		 }
	 }
		
		 
		 
	 void liczTemperature() {
			 System.out.println("Wybierz sposob przeliczania jednostek.\n");
			 System.out.println("MENU:\n1. Kelvina na Celsjusza\n2. Kelvina na Fahrenheita\n3. Celsjusza na Kelvina\n4. Celsjusza na Fahrenheita\n"
			 		+ "5. Fahrenheita na Celsjusza\n6. Fahrenheita na Kelvina\n");
			 Scanner czyt = new Scanner(System.in);
			 setWybor(czyt.nextInt());
			 
			 
			 switch(wybor) {
			 case 1: { 
				 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
				 setArg(czyt.nextDouble());
				 System.out.println(arg+" K to "+Temperatura.kelvinNaCelsjusz(arg)+ " C"); break;
				 }
			 case 2: {
				 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
				 setArg(czyt.nextDouble());
				 System.out.println(arg+" K to "+Temperatura.kelvinNaFahrenheit(arg)+ " F"); break;
				 }
			 case 3: {
				 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
				 setArg(czyt.nextDouble());
				 System.out.println(arg+" C to "+Temperatura.celsjuszNaKelvin(arg)+ " K"); break;
				 }
			 case 4: {
				 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
				 setArg(czyt.nextDouble());
				 System.out.println(arg+" C to "+Temperatura.celsjuszNaFahrenheit(arg)+ " F"); break;
				 }
			 case 5: {
				 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
				 setArg(czyt.nextDouble());
				 System.out.println(arg+" F to "+Temperatura.fahrenheitNaCelsjusz(arg)+ " C"); break;
				 }
			 case 6: {
				 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
				 setArg(czyt.nextDouble());
				 System.out.println(arg+" F to "+Temperatura.fahrenheitNaKelvin(arg)+ " K"); break;
				 }
			 default: {System.out.println("Musisz podaæ wartoœæ odpowiadaj¹c¹ pozycji w Menu!"); break;}
			 }
		 }

			 
			 
	 void liczObjetosc() {
				 System.out.println("Wybierz sposob przeliczania jednostek.\n");
				 System.out.println("MENU:\n1. Litr na metr szeœcienny\n2. Litr na kwaterki\n3. Litr na galon\n4. Galon na litr\n"
				 		+ "5. Kwaterka na litr\n6. Metr szeœcienny na litr\n");
				 Scanner czyt = new Scanner(System.in);
				 setWybor(czyt.nextInt());
				 
				 
				 switch(wybor) {
				 case 1: { 
					 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
					 setArg(czyt.nextDouble());
					 System.out.println(arg+" l to "+Objetosc.litrNaMetrSzesc(arg)+ " m^3"); break;
					 }
				 case 2: {
					 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
					 setArg(czyt.nextDouble());
					 System.out.println(arg+" l to "+Objetosc.litrNaKwaterki(arg)+ " kwat."); break;
					 }
				 case 3: {
					 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
					 setArg(czyt.nextDouble());
					 System.out.println(arg+" l to "+Objetosc.litrNaGalon(arg)+ " gal."); break;
					 }
				 case 4: {
					 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
					 setArg(czyt.nextDouble());
					 System.out.println(arg+" gal. to "+Objetosc.galonNaLitr(arg)+ " l"); break;
					 }
				 case 5: {
					 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
					 setArg(czyt.nextDouble());
					 System.out.println(arg+" kwat. to "+Objetosc.kwaterkaNaLitr(arg)+ " l"); break;
					 }
				 case 6: {
					 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
					 setArg(czyt.nextDouble());
					 System.out.println(arg+" m^3 to "+Objetosc.metrSzescNaLitr(arg)+ " l"); break;
					 }
				 default: {System.out.println("Musisz podaæ wartoœæ odpowiadaj¹c¹ pozycji w Menu!"); break;}
				 }
			 }


				 
	void liczMoc() {
					 System.out.println("Wybierz sposob przeliczania jednostek.\n");
					 System.out.println("MENU:\n1. Waty na konie mech.\n2. Konie mech na waty\n");
					 Scanner czyt = new Scanner(System.in);
					 setWybor(czyt.nextInt());
					 
					 
					 switch(wybor) {
					 case 1: { 
						 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
						 setArg(czyt.nextDouble());
						 System.out.println(arg+" W to "+Moc.watNaKonMech(arg)+ " k. mech."); break;
						 }
					 case 2: {
						 System.out.println("Podaj wartoœæ parametru do przeliczenia: ");
						 setArg(czyt.nextDouble());
						 System.out.println(arg+" k. mech. to "+Moc.konMechNaWat(arg)+ " W"); break;
						 }
					 default: {System.out.println("Musisz podaæ wartoœæ odpowiadaj¹c¹ pozycji w Menu!"); break;}
					 }

	 }

}


