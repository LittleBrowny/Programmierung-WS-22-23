// [x] 6.7 Arrays und Schleifen

/*
 * In dieser Aufgabe soll das Zusammenspiel von Arrays und For-Schleifen geuebt
 * werden. In den meisten Methoden ist dem Parameter elements das Schluessel-
 * wort "final" vorangestellt. Das bedeutet, dass das Array in der Methode nur
 * gelesen, nicht aber beschrieben werden darf.
 */
public class ArraysAndLoops {
	
	// Diese Methode soll die Elemente des als Parameter (elements) uebergebenen
	// Arrays addieren und die Gesamtsumme zurueckgeben.
	public static int sum(final int[] elements){
		int output = 0;
		for (int i : elements) {
			output+=i;
		}
		return output;
	}
	
	// Diese Methode soll in einem als Parameter (elements) uebergebenen Array
	// das groesste Element finden. Rueckgabewert soll das Produkt aus dem
	// groessten Element und dem Index des groessten Elements sein.
	// Beispiel: Eingabe   = {2, 13, 56, 44, 5}
	//           Rueckgabe = 56 (groesstes Element) * 2 (Index von 56) = 112
	// Nicht vergessen, dass die Indizierung in einem Array mit 0 beginnt!
	public static int maxElement(final int[] elements){
		int output = elements[0];
		int index = 0;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] > output) {
				output = elements[i];
				index = i;
			}
		}
		return output * index;
	}

	// Diese Methode soll ein Array zurueckgeben, in dem alle Elemente des
	// uebergebenen Arrays dupliziert wurden und in der gleichen Reihenfolge
	// wie im Originalarray stehen. Beispiel:
	// Übergeben wird ein Array der Form {4, 16, 8},
	// Das zurueckgegebene Array soll dann {4, 4, 16, 16, 8, 8} beinhalten.
	public static int[] duplicateElements(final int[] elements){
		int[] output = new int[elements.length*2];
		for (int i = 0; i < output.length; i++) {
			output[i] = elements[i/2];
		}
		return output;
	}
	
	// Diese Methode soll zu einem uebergebenen Array ein neues Array zurueck
	// geben, in dem zu jedem Element des Ausgangsarrays das Quadrat steht.
	// Beispiel: Eingabe   = {4,  12,  7}
	//           Rueckgabe = {16, 144, 49}
	public static int[] getSquares(final int[] elements){
		int[] output = new int[elements.length];
		for (int i = 0; i < output.length; i++) {
			output[i] = (int) Math.pow(elements[i], 2);
		}
		return output;
	}
	
	// Diese Methode soll in einem uebergebenen Array die Reihenfolge der
	// Elemente umkehren.
	// Beispiel: Eingabe   = {4,  12,  7, 18}
	//           Rueckgabe = {18,  7, 12, 4}
	// ACHTUNG: Diese Methode hat keine Rueckgabe. Das Array Elements soll
	// nach Ausfuehrung der Methode das Ergebnis beinhalten.
	public static void reverseArray(int[] elements){
		int[] copy = elements.clone();
		for (int i = 0; i < copy.length; i++) {
			elements[i] = copy[copy.length-i-1];
		}
	}

	// Hier koennt ihr eure Methoden testen.
	public static void main(String[] args) {

	}
}