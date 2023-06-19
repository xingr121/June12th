package class4;

public class AssignmentP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int myRandom = (int)Math.random()*12 + 1;
		 System.out.println("Random number: " + myRandom);
		 
		 String monthName;
		    
	      switch (myRandom) {
			case 1:
				monthName = "January";
				break;
			case 2:
				monthName = "February";
				break;
			case 3:
				monthName = "March";
				break;
			case 4:
				monthName = "April";
				break;
			case 5:
				monthName = "May";
				break;
			case 6:
				monthName = "June";
				break;
			case 7:
				monthName = "July";
				break;
			case 8:
				monthName = "August";
				break;
			case 9:
				monthName = "September";
				break;
			case 10:
				monthName = "October";
				break;
			case 11:
				monthName = "November";
				break;
			case 12:
				monthName = "December";
				break;
			default:
				monthName = "invalid month";
				break;
			
			}
	      System.out.println("month chosen: " + monthName);
			
	}

}
