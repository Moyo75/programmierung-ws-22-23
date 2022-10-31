public class Probetestat {
	// Aufgabe 1
	public static int betrag(int wert) {
		if (wert < 0) {
			return wert * -1;
		}
		return wert;
	}

	// Aufgabe 2
	public static void eineKaputteMethode() {

		int a = 5;
		int b = 0;
		if (a == 5) {
			b = 10;
		}

		if (true) {
			a = 15;
		}

		System.out.println("Die Methode sollte a = 15 ausgeben, ihre Methode liefert: a = " + a);
		System.out.println("Die Methode sollte b = 10 ausgeben, ihre Methode liefert: b = " + b);

	}

	// Aufgabe 3
	public static int sucheMinimum(int a, int b, int c) {
		if (a < b && a < c) {
			return a;
		} else if (b < a && b < c) {
			return b;
		}
		return c;
	}

	public static void main(String[] args) {

		// Testaufruf Aufgabe 1
		System.out.println("Testausgabe Aufgabe 1:");
		System.out.println("Der Betrag von  -2 = " + betrag(-2) + " (2 ist korrekt)");
		System.out.println("Der Betrag von   1 = " + betrag(1) + " (1 ist korrekt)");
		System.out.println();

		// Testaufruf Aufgabe 2
		System.out.println("Testausgabe Aufgabe 2:");
		eineKaputteMethode();
		System.out.println();

		// Testaufruf Aufgabe 3
		System.out.println("Testausgabe Aufgabe 3:");
		System.out.println("Der Aufruf von sucheMinimum(1,2,3) sollte 1 ergeben.\n" + "Ihre Methode liefert: "
				+ sucheMinimum(1, 2, 3));

	}

}