package hw;

//import java.util.Scanner;

public class Months {

	public static void main(String[] args) {
		int month=9;
/*
 * System.out.println("enter month"); Scanner s = new Scanner(System.in); int
 * month=s.nextInt();
 */
		switch(month)
		{
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("june");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("augest");
			break;
		case 9:
			System.out.println("septamber");
			break;
		case 10:
			System.out.println("october");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("december");
			break;
			
		default:
			System.out.println("Invalid data");
		}


	}

}
