
public class List {

	private static final String START_LABEL = "|START|";
	public Element head;

	// Aufgabe 1
	public void addElement(Element newElement) {
		if (head == null) {
			head = newElement;
		} else {
			Element current = head;

			while (current != null) {
				if (current.getNext() == null) {
					current.setNext(newElement);
					break;
				}
				current = current.getNext();
			}
		}

	}

	// Aufgabe 2
	public int getSize() {
		if (head == null) {
			return 0;
		} else {
			Element current = head;
			int counter = 0;

			while (current != null) {
				counter++;
				current = current.getNext();
			}

			return counter;
		}
	}

	// Aufgabe 3
	public void increase() {
		if (head == null) {
			return;
		} else {
			Element current = head;

			while (current != null) {
				current.increaseByOne();
				current = current.getNext();
			}

		}
	}

	// Aufgabe 4
	public void deleteElement() {
		if (head == null) {
			return;
		} else {
			head = head.getNext();
		}
	}

	// Methode, die zur Darstellung der Liste dient.
	@Override
	public String toString() {

		StringBuilder str = new StringBuilder(START_LABEL);

		Element pointer = head;
		while (pointer != null) {
			str.append("---> ");
			str.append(pointer.getValue());
			pointer = pointer.getNext();
		}

		str.append("---> null");

		return str.toString();
	}
}
