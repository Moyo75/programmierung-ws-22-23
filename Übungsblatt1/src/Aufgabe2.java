
public class Aufgabe2 {
	byte c = 2;
	boolean b = false;
	int d = -42000;
	long e = 6000000000L;
	public static char f = 'a';
	double g = 1.79E-308D;

	public static int m = 2 / 3;

	public static byte h = (byte) (127 + 1);

	private static String nameOf(Object o) {
		return o.getClass().getName();
	}

	public static <T> String nameOfGen(T o) {
		return o.getClass().getName();
	}

	public static void main(String[] args) {

		System.out.println(h);
		System.out.println(nameOf(h));
		System.out.println(((Object) h).getClass().getName());
		System.out.println(nameOfGen(f));
		System.out.println(m);
	}
}
