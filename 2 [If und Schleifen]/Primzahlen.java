//[x] 2.1 Primzahlen

public class Primzahlen {

	/*
	 * Diese Methode soll zurueckgeben, ob die uebergebene Zahl eine Primzahl ist.
	 * Eine Zahl ist genau dann eine Primzahl, wenn sie durch genau 2 Zahlen teilbar ist,
	 * naemlich 1 und diese Zahl. Anders formuliert koennte man auch sagen:
	 * Eine Zahl ist genau dann eine Primzahl, wenn keine Zahl i existiert,
	 * fuer die gilt: i>=2 und i < zahl und zahl%i == 0
	 * Sollte die uebergebene Zahl eine Primzahl sein, soll true zureuckgegeben werden, sonst false.
	 */
	public static boolean isPrime(int zahl)
	{
		//Edgecase: 1 ist keine Primzahl
		if (zahl == 1) {
			return false;
		}

		//Geht alle Zahlen von 2 Bis zahl/2 durch. Alle zahlen die größer als zahl/2 sind irrelewand.
		//es gilt:		i > zahl/2		-->	  zahl/i < 1
		for (int i = 2; i <= zahl/2; i++) {
			if (zahl % i == 0) {	//Checkt auf Teilbarkeit
				return false;
			}
		}

		//sind alle Möglichhkeiten getestet und return false wurde noch nicht ausgelößt,
		//muss zahl eine primzahl sein.
		return true;
	}
	
	//In der Main Methode kannst du verschieden Faelle testen.
	public static void main(String[] args) {
		System.out.println(isPrime(42));//sollte false ergeben
		System.out.println(isPrime(41));//sollte true ergeben
		System.out.println(isPrime(7));//sollte true ergeben
		System.out.println(isPrime(11));//sollte true ergeben
		System.out.println(isPrime(100));//sollte false ergeben
		System.out.println(isPrime(141));//sollte false ergeben
	}
}