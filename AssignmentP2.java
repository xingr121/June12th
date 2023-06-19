package class4;

import java.util.Scanner;

public class AssignmentP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Give me month number: ");
		int monthNum = kb.nextInt();
		System.out.println("Give me the year: ");
		int yearNum = kb.nextInt();
		
		
		switch (monthNum) {
		case 1:
			System.out.println("January " + yearNum + " had 31 days.");
			break;
		case 2:
			if ((yearNum % 4 == 0 && yearNum % 100 != 0)|| yearNum % 400 == 0 ) {
				System.out.println("February " + yearNum + " had 29 days.");
			} else {
					System.out.println("February " + yearNum + " had 28 days.");
				}
			break;
		case 3:
			System.out.println("March " + yearNum + " had 31 days.");
			break;
		case 4:
			System.out.println("April " + yearNum + " had 30 days.");
			break;
		case 5:
			System.out.println("May " + yearNum + " had 31 days.");
			break;
		case 6:
			System.out.println("June " + yearNum + " had 30 days.");
			break;
		case 7:
			System.out.println("July " + yearNum + " had 31 days.");
			break;
		case 8:
			System.out.println("August " + yearNum + " had 31 days.");
			break;
		case 9:
			System.out.println("September " + yearNum + " had 30 days.");
			break;
		case 10:
			System.out.println("October " + yearNum + " had 31 days.");
			break;
		case 11:
			System.out.println("November " + yearNum + " had 30 days.");
			break;
		case 12:
			System.out.println("December " + yearNum + " had 31 days.");
			break;
		default:
			System.out.println("Invalid month");
			break;
		
		}
		kb.close();
		
	}

}
