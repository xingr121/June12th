package class4;

import java.util.Scanner;

public class AssignmentP3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String firstName = kb.next();
		System.out.println("Please Enter your last name: ");
		String lastName = kb.next();
		System.out.println("Please Enter your age: ");
		int age = kb.nextInt();
		
		System.out.printf("Hello: %s, you have %d years\' old; nice to meet you!", lastName, age);
		
		int myRandom = (int)(Math.random()* 50) +1;
		System.out.println("Please guess a number between 1 and 50: ");
		int guessNum = kb.nextInt();
		
		if (guessNum == myRandom) {
			System.out.println("You are lucky");
		} else if (guessNum > myRandom) {
	    	System.out.println("Choose a smaller one, You are unlucky");
		} else {
	    	System.out.println("Choose a bigger one, You are unlucky");	
	    }
	    
	    kb.close();
		
	}

}
