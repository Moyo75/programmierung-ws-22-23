
public class PrintArrayWith {

	public static void printArrayWithFor(String[][] array) {
		System.out.println("printArrayWithFor: ");
		if (array == null) {
			System.out.println("Array ist leer.");
			return;
		}

		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < array[x].length; y++) {
				System.out.println(array[x][y]);
			}
		}

		System.out.println();
	}

	public static void printArrayWithForEach(String[][] array) {
		System.out.println("printArrayWithForEach: ");
		if (array == null) {
			System.out.println("Array ist leer.");
			return;
		}

		for (String[] x : array) {
			for (String y : x) {
				System.out.println(y);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String i[][] = new String[2][];
		i[0] = new String[3];
		i[0][0] = "ErstesInneresArray,Indexposition0";
		i[0][1] = "ErstesInneresArray,Indexposition1";
		i[0][2] = "ErstesInneresArray,Indexposition2";
		String[] zweitesInneresArray = { "ZweitesInneresArray, Indexposition0", "ZweitesInneresArray, Indexposition1" };
		i[1] = zweitesInneresArray;
		printArrayWithFor(i);
		printArrayWithForEach(i);
	}

}
