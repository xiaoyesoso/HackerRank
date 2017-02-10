package Linked.Lists.Detect.a.Cycle;

public class Solution {

	class Node {
		int data;
		Node next;
	}

	boolean hasCycle(Node head) {
		if (head == null)
			return false;
		Node p1 = head;
		Node p2 = head;
		while (p2 != null) {
			if (p2.next == null)
				return false;
			p2 = p2.next.next;
			p1 = p1.next;
			if (p2 == p1)
				return true;
		}
		return false;
	}
}
