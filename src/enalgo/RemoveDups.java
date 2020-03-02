package enalgo;

public class RemoveDups {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.append(3);
		ll.append(2);
		ll.append(3);
		ll.append(3);
		ll.append(4);
		ll.append(3);
		ll.retrieve();
		ll.removeDups();
		ll.retrieve();
	}
}
