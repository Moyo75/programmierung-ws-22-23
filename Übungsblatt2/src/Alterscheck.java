
public class Alterscheck {

	// Aufgabe 1:
	
	//- Char ist ein Primitiv und hält nur ein Zeichen; String ist stattdessen ein Referenztyp (Klasse), daher ein 	komplettes Objekt.
	//- Ein char besteht aus Einzelzeichen mit einfachen Anführungszeichen; Ein String definiert Zeilen, die in doppeltem Anführungszeichen angegeben sind.
	  
	//  Beispiele:
	//  char a = 'z';  
	// 	char b = '$';
	// 	char c = '0';
	
	// 	String a = "John";
	// 	String b = "91921";
	// 	String c = "###";
	 
	//   In String können mehrere chars abgespeichert werden.
	

	// Aufgabe 2:

	public static void alterscheck(String name, int alter) {
		if (alter < 18)
			System.out.println(name + " is zu jung.");
		else if (alter > 67)
			System.out.println(name + " is zu alt.");
	}

	public static boolean alterscheck(int alter) {
		if (alter < 18 || alter > 67)
			return false;
		return true;
	}

	// Aufgabe 3:
	public static void zahlenMitWhile() {
		int x = 0;

		System.out.println("Zahlen mit while-Schleife: ");
		while (x <= 10) {
			System.out.println(x);
			x++;
		}
	}

	public static void zahlenMitDoWhile() {
		int x = 0;

		System.out.println("Zahlen mit do-while-Schleife: ");
		do {
			System.out.println(x);
			x++;
		} while (x <= 10);
	}

	public static void zahlenMitForWhile() {
		System.out.println("Zahlen mit for-while-Schleife: ");

		for (int x = 0; x <= 10; x++) {
			System.out.println(x);
		}
	}

	public static void zahlenMitForWhileMitLeerDritteil() {
		System.out.println("Zahlen mit for-while-Schleife-mit-leerem-Dritteil: ");

		for (int x = 0; x <= 10;) {
			System.out.println(x);
			x++;
		}
	}

	public static void forSchleife(int i) {
		for (; i != 10; i++) {
			System.out.println(i);
			i++;
		}
	}
	
	// Aufgabe 4:
		// a. gibt ungerade Zahlen auf der Console aus.
		// b. wenn zufallszall entweder 0.5 oder 0.6 gleicht.
		/*
		 * c. Im Gründe inkrementiert die Schleife i um 2 
		 * und wenn eine ungerade Zahl übergeben wird, dann gleicht i nicht mal 10, 
		 * was zu einer Endlosschleife führt.
		 * */

	public static void main(String[] args) {
		System.out.println("Dies ist die Ausgabe f�r Teil a:");

		alterscheck("Arya", 17);
		alterscheck("Sansa", 18);
		alterscheck("John", 68);
		System.out.println("----------\nDies ist die Ausgabe f�r Teil b:");
		System.out.println("Tom:" + alterscheck(16));
		System.out.println("Jane:" + alterscheck(19));
		System.out.println("Michael:" + alterscheck(70));

		// System.out.println();
		// zahlenMitWhile();

		// System.out.println();
		// zahlenMitDoWhile();

		// System.out.println();
		// zahlenMitForWhile();

		// System.out.println();
		// zahlenMitForWhileMitLeerDritteil();

		System.out.println();
		forSchleife(0);
	}

}
