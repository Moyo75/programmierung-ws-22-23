public class Train {

	// Kann fuer die Ausgabe verwendet werden
	private static final String LOCOMOTIVE = "<___|o|";

	private Waggon head;

	public int getSize() {
		if (head == null) {
			return 0;
		}

		Waggon start = head;
		int counter = 0;

		while (start != null) {
			counter++;
			start = start.getNext();
		}

		return counter;
	}

	public int getPassengerCount() {
		if (head == null) {
			return 0;
		}

		Waggon start = head;
		int counter = 0;

		while (start != null) {
			counter += start.getPassengers();
			start = start.getNext();
		}

		return counter;
	}

	public int getCapacity() {
		if (head == null) {
			return 0;
		}

		Waggon start = head;
		int counter = 0;

		while (start != null) {
			counter += start.getCapacity();
			start = start.getNext();
		}

		return counter;
	}

	public void appendWaggon(Waggon waggon) {
		if (head == null) {
			head = waggon;
			return;
		}

		Waggon start = head;

		while (start != null) {

			if (start.getNext() == null) {
				start.setNext(waggon);
				break;
			}

			start = start.getNext();
		}
	}

	public void boardPassengers(int numberOfPassengers) {
		if (head == null) {
			return;
		}

		Waggon start = head;
		int remainder = 0;

		while (start != null && numberOfPassengers >= 0) {
			int passengers = start.getPassengers();

//			System.out.println("BEFORE: Wagon's passengers: " + (start.getPassengers()) + " | Wagon's space: "
//					+ (start.getCapacity() - start.getPassengers()) + " | Number of passengers: " + numberOfPassengers);

			if (start.getPassengers() < start.getCapacity()) {
				passengers += (numberOfPassengers - remainder);
				start.setPassengers(passengers);

				if (passengers > start.getCapacity()) {
					passengers = start.getCapacity();
					start.setPassengers(passengers);
					remainder = numberOfPassengers - (start.getCapacity() - passengers);
					numberOfPassengers = numberOfPassengers - remainder;
					System.out.println(numberOfPassengers);
				}
			}

//			System.out.println("AFTER: Wagon's passengers: " + (start.getPassengers()) + " | Wagon's space: "
//					+ (start.getCapacity() - start.getPassengers()) + " | Number of passengers: " + numberOfPassengers);

			start = start.getNext();
		}
	}

	public Train uncoupleWaggons(int index) {
		return new Train();
	}

	public void insertWaggon(Waggon waggon, int index) {
	}

	public void turnOver() {
	}

	public void removeWaggon(Waggon waggon) {
	}

	public Waggon getWaggonAt(int index) {
		if (head == null) {
			return null;
		}

		Waggon start = head, waggonAt = head;
		int counter = 0;

		while (start != null) {
			if (counter == index) {
				waggonAt = start;
				break;
			}

			start = start.getNext();
			counter++;
		}

		return waggonAt;
	}

	@Override
	public String toString() {
		if (getSize() == 0) {
			return LOCOMOTIVE;
		}

		StringBuilder str = new StringBuilder(LOCOMOTIVE);

		Waggon pointer = head;
		while (pointer != null) {
			str.append(" <---> ");
			str.append(pointer.getName());
			pointer = pointer.getNext();
		}

		return str.toString();
	}

	public Waggon getHead() {
		return head;
	}

}
