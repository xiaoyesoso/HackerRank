package Day15.Linked.List;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

public class Solution {
	public static Node insert(Node head, int data) {
		// Complete this method
		Node start = head;
		if (head == null) {
			start = new Node(data);
			return start;
		}

		while (start.next != null) {
			start = start.next;
		}
		start.next = new Node(data);
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}
}
