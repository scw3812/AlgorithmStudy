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
		ll.append(3);
		ll.append(5);
		ll.retrieve();
		int k = 3;
		Reference r = new Reference();
		LinkedList.Node found = KthToLast2(ll.getFirst(), k);
		System.out.println(found.data);
	}
	
	private static LinkedList.Node KthToLast(LinkedList.Node n, int k, Reference r) {
		if(n == null) {
			return null;
		}
		
		LinkedList.Node found = KthToLast(n.next, k, r);
		r.count++;
		if(r.count == k) {
			return n;
		}
		
		return found;
	}
	
	private static LinkedList.Node KthToLast2(LinkedList.Node first, int k){
		LinkedList.Node p1 = first;
		LinkedList.Node p2 = first;
		
		for(int i = 0; i < k; i++) {
			if(p1 == null) return null;
			p1 = p1.next;
		}
		
		while(p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return p2;
	}
}

class Reference{
	public int count = 0;
}