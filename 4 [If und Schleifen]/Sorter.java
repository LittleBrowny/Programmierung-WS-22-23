//[x] 4.3 Sortieren

import java.util.Arrays;

public class Sorter {

	/*
	 * Diese Methode bekommt ein int[] uebergeben und soll dieses sortieren.
	 * Dabei soll aber nur eine Kopie bearbeitet werden, das uebergebene Array soll
	 * seine Elemente behalten. Die sortierte Kopie wird dann zurueckgegeben.
	 * Hierbei sollen die Zahlen in aufsteigender Reihenfolge sortiert sein.
	 * Beispiel: sort({10,5,42,17,108}) --> {5,10,17,42,108}
	 */

	public int[] sort(int[] toSort)
	{
		int[] output = toSort.clone();

		for (int i = 1; i < output.length; i++) {  
			int j = i;  
			int a = output[i];  
			while ((j > 0) && (output[j-1] > a)) {   
				output[j] = output[j-1];  
				j--;  
			}  
			output[j] = a;  
		}
		return output;
	}

	//Eine Einfachere Alternative ware die Funktion Arrays.sort() aus der java.util bibliothek
	//hierfür muss aber vorher import java.util.Arrays; aufgerufen werden und zudem Wäre das zu einfach

	/* 
	public int[] sort(int[] toSort)
	{
		int[] output = toSort.clone();
		Arrays.sort(output);
		return output;
	}
	 */
	
	/*
	 * Diese Methode soll das uebergebene Array auch sortieren, allerdings soll diesmal direkt das Array
	 * sortiert werden und keine Kopie angelegt werden. Entsprechend hat diese Methode auch
	 * keinen Rueckgabewert.
	 * Beispiel:
	 * int[] a = new int[]{10,5,42,17,108};
	 * sort2(a);
	 * --> a ist jetzt {5,10,17,42,108}
	 */
	public void sort2(int[] toSort)
	{
		for (int i = 1; i < toSort.length; i++) {  
			int j = i;  
			int a = toSort[i];  
			while ((j > 0) && (toSort[j-1] > a)) {  
				toSort[j] = toSort[j-1];  
				j--;  
			}  
			toSort[j] = a;  
		}
	}
	
	/*
	 * Die Main Methode zum Testen deiner Methoden.
	 */
	public static void main(String[] args) {
		int[] toSort = new int[]{10,5,42,17,108};
		Sorter sort = new Sorter();
		System.out.println("Das folgende Array wird sortiert: "+Arrays.toString(toSort));
		System.out.println("Das Ergebnis: "+Arrays.toString(sort.sort(toSort)));
		System.out.println("Das folgende Array wird sortiert: "+Arrays.toString(toSort));
		sort.sort2(toSort);
		System.out.println("Das Ergebnis: "+Arrays.toString(toSort));
	}
}
