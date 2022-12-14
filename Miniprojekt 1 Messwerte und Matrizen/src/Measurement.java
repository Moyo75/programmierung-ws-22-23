import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		data = new int[0];
	}

	public void addValue(int value) {

		int[] newArray = new int[data.length + 1];

		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}

		newArray[newArray.length - 1] = value;

		data = newArray;

	}

	public void addValues(int[] values) {
		int[] newArray = new int[data.length + values.length];

		for (int i = 0; i < data.length; i++) {
			newArray[i] = data[i];
		}

		for (int i = 0; i < values.length; i++) {
			newArray[data.length + i] = values[i];
		}

		data = newArray;

	}

	public int getMinimumValue() {
		int min = data[0];

		for (int ktr = 0; ktr < data.length; ktr++) {
			if (data[ktr] < min) {
				min = data[ktr];
			}
		}

		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] array = new int[0];

		for (int x = 0; x < data.length; x++) {

			if (data[x] > threshold) {
				int[] newArray = new int[array.length + 1];

				for (int i = 0; i < array.length; i++) {
					newArray[i] = array[i];
				}

				newArray[newArray.length - 1] = data[x];

				array = newArray;
			}
		}

		return array;
	}

	// --------------------------------------------------------------

	public void printData() {
		System.out.println(Arrays.toString(data));
	}

	public static void main(String[] args) {
		Measurement m = new Measurement();
		System.out.println("Neues Measurement-Objekt m erzeugt. m:");
		// ErwarteteAusgabe:
		// []
		m.printData();

		System.out.println("------------------------------------------------------------------");

		m.addValue(85);
		System.out.println("Hinzufuegen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();

		System.out.println("------------------------------------------------------------------");

		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("Hinzufuegen einer Menge von Werten. m:");
		// Erwartete Ausgabe:
		// [85, 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93]
		m.printData();

		System.out.println("------------------------------------------------------------------");

		int minimumValue = m.getMinimumValue();
		System.out.println("Minimaler Wert der Messreihe m:");
		// Erwartete Ausgabe: 58
		System.out.println(minimumValue);

		System.out.println("------------------------------------------------------------------");

		int[] valuesAbove78 = m.getValuesAboveThreshold(78);
		System.out.println("Messwerte ueber 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));

		System.out.println("------------------------------------------------------------------");

		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte ueber 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}