// [ ] 3.5 Quersumme

public class Quersumme {
	
	/*
	 * Diese Methode soll die Quersumme von zahl berechnen.
	 * Die Quersumme einer Zahl ist die Summe aller Ziffern in der Zahl.
	 */
	public static int berechneQuersumme(int zahl) {
		return 0;
	}
	
	//Die Main Methode. Du kannst dir hier verschiedene Testfaelle ausdenken und testen.
	public static void main(String[] args) {
		System.out.println("Die Quersumme der Zahl 123 ist: "+berechneQuersumme(123)+" (Richtig waere 6)");
		System.out.println("Die Quersumme der Zahl 42 ist: "+berechneQuersumme(42)+" (Richtig waere 6)");
		System.out.println("Die Quersumme der Zahl 87 ist: "+berechneQuersumme(87)+" (Richtig waere 15)");
	}
}