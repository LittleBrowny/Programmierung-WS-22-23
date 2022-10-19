//[x] 3.3 Caesar Chiffrierung

public class CaesarChiffrierung {
	/*
	* Hinweis: Diese Aufgabe ist ein guter Moment, um sich tiefer mit dem Datentyp char auseinanderzusetzen.
	* Wie wird das Zeichen im Datentyp char gespeichert?
	* Was geschieht, wenn ich eine Addition oder Subtraktion auf char ausfuehre?
	*
	* Natuerlich laesst sich die Aufgabe auch ohne dieses Wissen loesen,
	* vielleicht nur nicht so elegant.
	*/

	/*
	 * chars werden auch als int Zahlen gespeichert. welche zahlen welchem char zugeordnet
	 * werden richtet sich nach der ASCII tabelle:
	 * 
	   0:  	   1: ☺	   2: ☻	   3: ♥	   4: ♦	   5: ♣
	   6: ♠	   7: 	   8: 	   9:  	  10:	  11: ♂
	  12: ♀	  13: 	  14: ♫	  15: ☼	  16: ►	  17: ◄
	  18: ↕	  19: ‼	  20: ¶	  21: §	  22: ▬	  23: ↨
	  24: ↑	  25: ↓	  26: →	  27: ←	  28: ∟	  29: ↔
	  30: ▲	  31: ▼	  32:	  33: !	  34: "	  35: #
	  36: $	  37: %	  38: &	  39: '	  40: (	  41: )
	  42: *	  43: +	  44: ,	  45: -	  46: .	  47: /
	  48: 0	  49: 1	  50: 2	  51: 3	  52: 4	  53: 5
	  54: 6	  55: 7	  56: 8	  57: 9	  58: :	  59: ;
	  60: <	  61: =	  62: >	  63: ?	  64: @	  65: A
	  66: B	  67: C	  68: D	  69: E	  70: F	  71: G
	  72: H	  73: I	  74: J	  75: K	  76: L	  77: M
	  78: N	  79: O	  80: P	  81: Q	  82: R	  83: S
	  84: T	  85: U	  86: V	  87: W	  88: X	  89: Y
	  90: Z	  91: [	  92: \	  93: ]	  94: ^	  95: _
	  96: `	  97: a	  98: b	  99: c	 100: d	 101: e
	 102: f	 103: g	 104: h	 105: i	 106: j	 107: k
	 108: l	 109: m	 110: n	 111: o	 112: p	 113: q
	 114: r	 115: s	 116: t	 117: u	 118: v	 119: w
	 120: x	 121: y	 122: z	 123: {	 124: |	 125: }
	 126: ~	 127: ⌂
	 *
	 * Diese lassen sich addieren, subtrahieren und beliebig hinund her casten
	 * es gilt:
	 * (char) 65 = 'A'
	 * (int) 'y' = 122
	 * (char) 'A' +1 = 'B'
	 * usw.
	 */
	public static String encrypt(String text, int number) {
		String output = "";
		for (char c : text.toCharArray()) {	//schleife die den String buchtabe für buchstabe durchgeht.
			if (c >= 'A' && c <= 'Z') {		//erkennen von Grosbuchstaben (Zahlenbereich)
				if ((char)(c + number) > 'Z') {
					output += (char)(c + number -26);
					 //geht die verschiebung über 'Z' hinaus muss wieder zum 'A' zurückgekehrt werden
					 //'Z' + 1 = 'A' und nicht 'Z' + 1 = '[' wie es laut Liste der Fall wäre.
				}
				else {
					output += (char)(c + number); 
					//Das casten (char) ist hier notwendig da es sonst als int ausgegeben wird.
				}
			}
			else if (c >= 'a' && c <= 'z') {	//erkennen von Kleinbuchstaben (Zahlenbereich)
				if ((char)(c + number) > 'z') {
					output += (char)(c + number -26);
				}
				else {
					output += (char)(c + number);
				}
			}
			else {
				output += c; 
				//ist c weder groß noch kleinbuchstabe soll es einfach übernommen werden
				//sonderzeichen werden nicht verändert ' ', '!', '.' usw.
				//Steht zwar nicht so in der Aufgabe, ist aber so.
			}
		}
		return output;
	}

	//Gleiches Prinzip nur umgekehrt.
	public static String decrypt(String text, int number) {
		String output = "";
		for (char c : text.toCharArray()) {
			if (c >= 'A' && c <= 'Z') {
				if ((char)(c - number) < 'A') {
					output += (char)(c - number +26);
				}
				else {
					output += (char)(c - number); 
				}
			}
			else if (c >= 'a' && c <= 'z') {
				if ((char)(c - number) < 'a') {
					output += (char)(c - number +26);
				}
				else {
					output += (char)(c - number);
				}
			}
			else {
				output += c; 
			}
		}
		return output;
	}
	
	 //Die Main Methode. Du kannst dir hier verschiedene Testfaelle ausdenken und testen.
	public static void main(String[] args) {
		System.out.println("Wenn man den String \"abcd\" mit der number 1 encryptt, sollte das Ergebnis \"bcde\" lauten."
				+ "\nDeine Methode gibt Folgendes zurueck: "+encrypt("abcd", 1));
		System.out.println("Wenn man den String \"wxyz\" mit der number 2 encryptt, sollte das Ergebnis \"yzab\" lauten."
				+ "\nDeine Methode gibt Folgendes zurueck: "+encrypt("wxyz", 2));
		System.out.println("Wenn man den String \"Hallo Welt!\" mit der number 3 encryptt, sollte das Ergebnis \"Kdoor Zhow!\" lauten."
				+ "\nDeine Methode gibt Folgendes zurueck: "+encrypt("Hallo Welt!", 3));
		System.out.println("Wenn man den String \"bcde\" mit der number 1 decryptt, sollte das Ergebnis \"abcd\" lauten."
				+ "\nDeine Methode gibt Folgendes zurueck: "+decrypt("bcde", 1));
		System.out.println("Wenn man den String \"yzab\" mit der number 2 decryptt, sollte das Ergebnis \"wxyz\" lauten."
				+ "\nDeine Methode gibt Folgendes zurueck: "+decrypt("yzab", 2));
		System.out.println("Wenn man den String \"Kdoor Zhow!\" mit der number 3 decryptt, sollte das Ergebnis \"Hallo Welt!\" lauten."
				+ "\nDeine Methode gibt Folgendes zurueck: "+decrypt("Kdoor Zhow!", 3));		
	}
}