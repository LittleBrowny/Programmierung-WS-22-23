//[x] 3.2 Palindrom

public class CheckPalindrom {
	//Aufgabe 1
	public String reverse(String toReverse) {
		String output = "";
		for(int i = toReverse.length()-1; i >= 0; i--) {
			output += toReverse.charAt(i);
		}
		return output;
	}
	
	//Aufgabe 2
	public boolean palindrome(String palindrome) {
		String reverse = "";
		for(int i = palindrome.length()-1; i >= 0; i--) {
			reverse += palindrome.charAt(i);
		}
		if (reverse.toLowerCase().equals(palindrome.toLowerCase())) {
			return true;
		}
		return false;
	}
	
	// Die Main Methode zum Testen deiner Methoden
	public static void main(String[] args) {
		CheckPalindrom check = new CheckPalindrom();
		System.out.println("Die Ausgabe sollte cba lauten: "+check.reverse("abc"));
		System.out.println("Die Ausgabe sollte ffeed lauten: "+check.reverse("deeff"));
		System.out.println("Die Ausgabe sollte true lauten: "+check.palindrome("Lagerregal"));
		System.out.println("Die Ausgabe sollte true lauten: "+check.palindrome("Rentner"));
		System.out.println("Die Ausgabe sollte false lauten: "+check.palindrome("Hallo Welt!"));
	}
}
