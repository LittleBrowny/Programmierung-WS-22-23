// [ ] 6.3 Arrays leeren

import java.util.Arrays;

public class DeleteArray {
	/*
	 * Diese Methode soll jede Zahl im uebergebenen Array mit 0 ueberschreiben.
	 * Die Laenge des Arrays soll dabei nicht veraendert werden, es soll aber nach dem Aufruf
	 * nur ausschliesslich 0 enthalten.
	 */
	public static void delete(int[] array)	{
		//hier beginnt der zu bearbeitende Bereich
		
		//hier endet der zu bearbeitende Bereich
	}
	
	//In der main Methode kannst du deine eigene Methode testen
	//Du darfst dir auch selber Testfaelle ausdenken
	public static void main(String[] args) {
		int[] test = new int[]{1,2,3,4,5};
		System.out.println("Vorher: "+Arrays.toString(test));
		delete(test);
		System.out.println("Nachher: "+Arrays.toString(test));
	}
}
