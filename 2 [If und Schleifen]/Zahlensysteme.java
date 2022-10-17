//[x] 2.2 Zahlensysteme

public class Zahlensysteme {

	/*
	 * Diese Methode soll zurueckgeben, ob der uebergebene String als Dualzahl interpretierbar ist.
	 * Eine Dualzahl ist eine Zahl, die ausschliesslich aus den Ziffern 0 und 1 besteht.
	 * Enthaelt der String also nur 0 und 1, soll true zurueckgegeben werden, sonst false.
	 */
	public static boolean istDualZahl(String zahl)
	{
		for (char c : zahl.toCharArray()) {		//Geht den String buchstabenweise durch
			//Character.digit interpretiert als wert mit festgelegter basis (in diesem fall 2)
			//und gibt -1 aus wenn der wert inkompatibel ist.
			if (Character.digit(c, 2) == -1) {
				return false;
			}
		}
		//wenn die Funktion es durch die schleife geschaft hat, sind alle chars im String kompatibel.
		return true;
	}

	//Wenn Character.digit oder die foreach schleife nicht bekannt sind,
	//wäre das hier eine alternative Lösung,
	//die jedoch deutlich weniger kompakt ist.

	/*
	 * public static boolean istDualZahl(String zahl)
	{
		char c;

		for (int i; i < zahl.length(); i++) {	
			c = zahl.charAt(i);	
			if (c != '0' && c != '1') {
				return false;
			}
		}
		return true;
	}
	 */

	//für die Basis 2 ist das zwar noch machbar die einzelnen Fälle zu checken,
	//aber bei der Basis 8 (octal) sähe die if abfrage so aus:

	/*
	 * if (c != '0' && c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7') {
		return false;
	}
	 */
	
	//oder alternativ als switchcase:

	/*
	 * switch (c) {
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
            return true;
        default:
            return false;
	}
	 */
	
	/*
	 * Diese Methode soll zurueckgeben, ob der uebergebene String als Dezimalzahl interpretierbar ist.
	 * Eine Dezimalzahl ist eine Zahl, die ausschliesslich aus den Ziffern 0 bis 9 besteht.
	 * Enthaelt der String also nur diese Ziffern, soll true zurueckgegeben werden, sonst false.
	 */
	public static boolean istDezimalzahl(String zahl)
	{
		for (char c : zahl.toCharArray()) {
			if (Character.digit(c, 10) == -1) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * Diese Methode soll zurueckgeben, ob der uebergebene String als Hexadezimalzahl interpretierbar ist.
	 * Eine Hexadezimalzahl ist eine Zahl, die ausschliesslich aus den Ziffern 0 bis 9 und A bis F besteht.
	 * Diese Zahl kann also 16 verschiedene Ziffern haben: 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
	 * Enthaelt der String also nur diese Ziffern, soll true zurueckgegeben werden, sonst false.
	 */
	public static boolean istHexadezimalzahl(String zahl)
	{
		for (char c : zahl.toCharArray()) {
			if (Character.digit(c, 16) == -1) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * Diese Methode soll zurueckgeben, ob der uebergebene String als Oktalzahl interpretierbar ist.
	 * Eine Oktalzahl ist eine Zahl, die ausschliesslich aus den Ziffern 0 bis 7 besteht.
	 * Enthaelt der String also nur diese Ziffern, soll true zurueckgegeben werden, sonst false.
	 */
	public static boolean istOktalzahl(String zahl)
	{
		for (char c : zahl.toCharArray()) {
			if (Character.digit(c, 8) == -1) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * In der Main Methode kannst du deine eigenen Methoden testen.
	 * Du darfst auch eigeneTestfaelle schreiben.
	 */
	public static void main(String[] args) {
		System.out.println(istDualZahl("101010"));//Sollte true sein
		System.out.println(istDualZahl("123"));//Sollte false sein
		System.out.println(istDezimalzahl("42"));//Sollte true sein
		System.out.println(istDezimalzahl("12AB"));//Sollte false sein
		System.out.println(istHexadezimalzahl("123ABC"));//Sollte true sein
		System.out.println(istHexadezimalzahl("EFG"));//Sollte false sein
		System.out.println(istOktalzahl("1234567"));//Sollte true sein
		System.out.println(istOktalzahl("876543210"));//Sollte false sein
	}
}
