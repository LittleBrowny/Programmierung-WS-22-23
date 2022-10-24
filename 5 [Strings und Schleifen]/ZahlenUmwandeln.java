//[x] 5.1 Binärsystem

public class ZahlenUmwandeln
{
	// Aufgabe 1 
	public static int binaryToDecimal(String number)
	{
		int output = 0;
		int binaryValue = 1;
		for (int i = number.length() -1; i >= 0; i--) {
			output += (number.charAt(i) - '0') * binaryValue;
			binaryValue *= 2;
		}
		return output;
	}
	
	//Alterativ:
	/*
	public static int binaryToDecimal(String number)
	{
		return Integer.parseInt(number, 2);
	}
	 */


	//Aufgabe 2
	public static String decimalToBinary(int number)
	{
		String output = "";
		while (true) {
			if (number%2 == 0) {
				output = "0" + output;
			}
			else {
				output = "1" + output;
			}
			number /= 2;

			if (number < 1) {
				return output;
			}
		}
	}
	
	//Alterativ:
	/*
	public static String decimalToBinary(int number)
	{
		return Integer.toBinaryString(number);
	}
	 */
	public static void main(String[] args) {
		System.out.println("Die Lösung von Aufgabe 1 ist: " + binaryToDecimal("101010"));
		System.out.println("Die Lösung von Aufgabe 2 ist: " + decimalToBinary(42));
	}
}
