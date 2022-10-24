// [x] 3.4 Quersumme

public class Quersumme {
	
	/*
	 * Diese Methode soll die Quersumme von zahl berechnen.
	 * Die Quersumme einer Zahl ist die Summe aller Ziffern in der Zahl.
	 */
	public static int berechneQuersumme(int zahl) {

		// Stellen zählen
		int zahlenraum = 1;

		for (int i = 10; i <= zahl; i*=10) { 
			//ermittelt wie viele Stellen zahl hat und speichert den zahlenraum ensprechend als:
			//10,100,1000 usw.
			zahlenraum = i;
		}

		int output = 0;
		int digit = 0;

		for (int i = 10; i <= zahlenraum*10; i *= 10) { //geht die einzelnen Stellen von zahl ab.

			digit = (zahl % i - digit)/(i/10); //Isoliert den Einer, Zehner, Hunderter usw.

			output += digit; //Addieren
			
		}
		return output;
	}

	/*
	 * Alternativ lassen sich die eizelnen ziffern auch isolieren indem man die Zahl in einen
	 * String umwandelt und dannn die einzelen Chars Addiert, was in dieser Aufgabe aber warscheinlich
	 * nicht gewollt ist.
	 */
	
	//Die Main Methode. Du kannst dir hier verschiedene Testfaelle ausdenken und testen.
	public static void main(String[] args) {
		System.out.println("Die Quersumme der Zahl 123 ist: "+berechneQuersumme(123)+" (Richtig waere 6)");
		System.out.println("Die Quersumme der Zahl 42 ist: "+berechneQuersumme(42)+" (Richtig waere 6)");
		System.out.println("Die Quersumme der Zahl 87 ist: "+berechneQuersumme(87)+" (Richtig waere 15)");
	}
}