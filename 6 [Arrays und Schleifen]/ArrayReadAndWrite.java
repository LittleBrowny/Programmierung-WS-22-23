// [ ] 6.2 Arrays lesen, schreiben und erzeugen;

/*
 * In dieser Aufgabe geht es darum das erste mal mit Arrays zu arbeiten.
 * Implementieren Sie die Methoden addArrayElements und neighbourNumbers.
 * Die Verwendung einer Schleife ist in dieser Aufgabe NICHT notwendig.
 */
public class ArrayReadAndWrite {
	// Die Methode addElementsOfArray erwartet ein IntegerArray mit zwei
	// Elementen. Rueckgabewert soll die Summe der beiden Arrayelemente sein.
	public static int addElementsOfArray(int[] numbers){
		
		return 0;	
	}

	// In dieser Methode soll ein Integer Array mit zwei Eintr�gen erzeugt werden.
	// An erster Stelle im Array soll number-1 stehen und an zweiter Stelle number+1
	// (number ist dabei der Wert, der der Methode �bergeben wurde).
	public static int[] neighbourNumbers(int number){

		return null;
	}
	
	// Testausgabe. Hier koennt ihr eure Methoden testen.
	public static void main(String[] args) {
		int zahlenArray[]	= new int[]{5,17};
		System.out.println("Summe der Arrayelemente: "
						   + addElementsOfArray(zahlenArray));
		int zahl = 3;
		int ergebnisArray[]	= neighbourNumbers(zahl);
		System.out.println("Kleiner Nachbar der Zahl " + zahl +
						   ": " + ergebnisArray[0] +
						   "\nGro�er Nachbar der Zahl " + zahl +
						   ": " + ergebnisArray[1]);
	}
}