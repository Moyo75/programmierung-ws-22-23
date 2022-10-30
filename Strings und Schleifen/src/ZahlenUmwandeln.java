public class ZahlenUmwandeln {
	// Aufgabe 1
	public static int binaryToDecimal(String number) {
		int sum = 0;

		for (int i = 0; i < number.length(); i++) {
			sum += (number.charAt(i) - '0') * (int) Math.pow(2, number.length() - 1 - i);
			// System.out.println(number.charAt(i) + " times " + (number.length() - 1 - i));
		}
		return sum;
	}

	// Aufgabe 2
	public static String decimalToBinary(int number) {
		if (number <= 0)
			return "0";

		String binary = "";

		while (number > 0) {

			binary = (number % 2) + binary;
			number = number / 2;
		}
		return binary;
	}

	public static void main(String[] args) {
		System.out.println("Die Lösung von Aufgabe 1 ist: " + binaryToDecimal("101010"));
		System.out.println("Die Lösung von Aufgabe 2 ist: " + decimalToBinary(0));
	}
}
