package Day14.Scope;

import java.util.Scanner;


class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] a) {
		elements = a;
	}

	public void computeDifference() {
		int Max = elements[0], Min = elements[0];
		for (int i = 1; i < elements.length; ++i) {
			if (Max < elements[i]) {
				Max = elements[i];
			} else if (elements[i] < Min) {
				Min = elements[i];
			}
		}
		maximumDifference = Max - Min;
	}
}

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}
