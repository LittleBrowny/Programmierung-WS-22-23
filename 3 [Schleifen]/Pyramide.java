// [x] 3.4 Pyramide

public class Pyramide {
	
	/*
	 * Diese Methode soll eine Pyramide aus * zurueckgeben.
	 * Dabei wird mit n die breite der untersten Reihe angegeben.
	 * Als n wird immer eine ungerade Zahl angegeben.
	 * Eine Pyramide sieht wie folgt aus:
	 *   *
	 *  ***
	 * *****
	 * Diese wird so erstellt, dass in der obersten Zeile 1 * ist, in der darunterliegenden 3 *,...
	 * in der (n/2+1)ten Zeile (die unterste Zeile) kommmen n *.
	 * Vor dem ersten * in jeder Zeile muessen noch Leerzeichen eingesetzt werden,
	 * damit die Sterne jeder Zeile in der Mitte stehen. Nach dem letzten Stern in
	 * jeder Zeile kommt ein Zeilenumbruch, dann beginnt die n�chste Zeile.
	 * Nach der letzten Zeile folgt KEIN Zeilenumbruch mehr.
	 * Das Zeichen Zeilenumbruch ist das Folgende: \n
	 */
	public static String machePyramide(int n) {
		String output = "";
		for (int i = 1; i <= (n/2 + 1); i++) {
			for (int j = 0; j < (n/2 + 1) - i; j++) {
				output += " ";
			}

			for (int j = 0; j < (i*2 -1); j++) {
				output += "*";
			}

			if (i + 1 <= (n/2 + 1)) {
				output  += "\n";
			}
		}
		return output;
	}
	
	/*
	 * Beispielmethode.
	 * So sieht die Loesung fuer n=5 aus.
	 */
	public static String beispiel() {
		return "  *\n ***\n*****";
	}
	
	//In der Main Methode kannst du deine eigene Methode testen. Du kannst natuerlich auch eigene Testfaelle schreiben.
	public static void main(String[] args) {
		System.out.println(beispiel());
		System.out.println();
		System.out.println(machePyramide(1));
		System.out.println();
		System.out.println(machePyramide(3));
		System.out.println();
		System.out.println(machePyramide(5));
		System.out.println();
		System.out.println(machePyramide(7));
	}
}