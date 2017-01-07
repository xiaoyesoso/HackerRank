package Day12.Inheritance;

import java.util.Vector;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: "
				+ idNumber);
	}

}

class Student extends Person {

	Student(String firstName, String lastName, int identification, int[] Scores) {
		super(firstName, lastName, identification);
		testScores = Scores;
		// TODO Auto-generated constructor stub
	}

	public char calculate() {
		double sum = 0.0;
		int len = testScores.length;
		for (int i = 0; i < len; ++i) {
			sum += testScores[i];
		}
		double result = sum / (double) len;
		if (result < 40)
			return 'T';
		else if (result < 55)
			return 'D';
		else if (result < 70)
			return 'P';
		else if (result < 80)
			return 'A';
		else if (result < 90)
			return 'E';
		else
			return 'O';
	}

	private int[] testScores;

}
