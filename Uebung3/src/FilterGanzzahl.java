import java.util.Arrays;

public class FilterGanzzahl {

	public static int[][] filterGanzzahl(int[][] array, int filter) {
		if (array == null) {
			System.out.println("Array ist leer.");
			return null;
		}

		int[][] filteredArray = new int[array.length][];

		for (int x = 0; x < array.length; x++) {
			int[] subarray = array[x];
			int counter = 0;

			if (subarray != null) {
				for (int y = 0; y < subarray.length; y++) {
					if (subarray[y] == filter) {
						counter++;
					}
				}

				int[] filteredsubarray = new int[subarray.length - counter];
				counter = 0;
				for (int y = 0; y < subarray.length; y++) {
					if (subarray[y] != filter) {
						filteredsubarray[counter++] = subarray[y];
					}
				}

				filteredArray[x] = filteredsubarray;

			} else {
				filteredArray[x] = new int[0];
			}

		}

		return filteredArray;
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7 } };

		for (int x = 0; x < a.length; x++) {
			System.out.println(Arrays.toString(a[x]));
		}

		int[][] b = filterGanzzahl(a, 6);
		System.out.println("//////////////////////////");

		for (int x = 0; x < b.length; x++) {
			System.out.println(Arrays.toString(b[x]));
		}
		// System.out.println("John");
	}

}
