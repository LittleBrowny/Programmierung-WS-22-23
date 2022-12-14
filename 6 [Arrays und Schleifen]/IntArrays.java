// [x] 6.5 Int-Arrays

public class IntArrays {
	
	//===================================
	// BEGINN des zu bearbeitenden Codes
	//===================================
	
	// Aufagbe 1
	public static double average(int[] array) {
		double summe = 0;
		for (int i : array) {
			summe += i;
		}
		return summe / array.length;
	}
	
	// Aufagbe 2
	public static double median(int[] array) {
		if (array.length%2 == 0) {
			return (double) (array[array.length/2-1] + array[array.length/2])/2;
		}
		return array[array.length/2];
	}
	
	//=================================
	// ENDE des zu bearbeitenden Codes
	//=================================
	
	/*
	 * Die Main Methode. Du kannst dir hier verschiedene Testfaelle ausdenken und testen.
	 */
	public static void main(String[] args) {
		int[] test = {3, 4, 5, 9, 12, 16, 56, 64};
		System.out.println("Beim Aufruf der Methode 'public static double durchschnitt(int[] array)' mit dem Parameter test sollte herauskommen:"
				+ "\n 15"
				+ "\n Bei dir kommt heraus:"
				+ average(test));
		System.out.println("Beim Aufruf der Methode 'public static double median(int[] array)' mit dem Parameter test sollte herauskommen:"
				+ "\n 9"
				+ "\n Bei dir kommt heraus:"
				+ median(test));
	}
}