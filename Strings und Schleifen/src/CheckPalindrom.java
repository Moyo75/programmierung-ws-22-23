public class CheckPalindrom {
	// Aufgabe 1
	public String reverse(String toReverse) {

		String reversed = "";
		for (int i = 0; i < toReverse.length(); i++) {
			reversed += toReverse.charAt((toReverse.length() - 1 - i));
		}
		return reversed;
	}

	// Aufgabe 2
	public boolean palindrome(String palindrome) {
		palindrome = palindrome.toLowerCase();

		for (int i = 0; i < palindrome.length(); i++) {
			if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - 1 - i)) {
				return false;
			}
		}

		return true;
	}

	// Die Main Methode zum Testen deiner Methoden
	public static void main(String[] args) {
		CheckPalindrom check = new CheckPalindrom();
		System.out.println("Die Ausgabe sollte cba lauten: " + check.reverse("abc"));
		System.out.println("Die Ausgabe sollte ffeed lauten: " + check.reverse("deeff"));
		System.out.println("Die Ausgabe sollte true lauten: " + check.palindrome("Lagerregal"));
		System.out.println("Die Ausgabe sollte true lauten: " + check.palindrome("Rentner"));
		System.out.println("Die Ausgabe sollte false lauten: " + check.palindrome("Hallo Welt!"));
	}
}
