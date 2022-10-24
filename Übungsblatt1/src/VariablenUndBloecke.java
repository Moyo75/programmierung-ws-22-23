public class VariablenUndBloecke {

	public static void main(String[] args) {
		inkrementation();
		aussen();
	}

	public static void inkrementation() {
		int a;
		// System.out.println(a);
		a = 10;
		int b = a;
		System.out.println(b);
		System.out.println(++b);
		System.out.println(a--);
	}

	public static void aussen() {
		int a = 1;
		int c = innen(a);
		System.out.println("Wert aussen von a= " + a);
		// System.out.println("Wert aussen von b= "+b);
		System.out.println("Wert aussen von c= " + c);
	}

	public static int innen(int a) {
		// int a = 5;
		int b = a++;
		System.out.println("Wert innen: a= " + a + " b= " + b);
		return ++b;
	}
}