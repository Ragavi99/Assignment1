package hw;

//import java.util.Scanner;

public class Color {

	public static void main(String[] args) {
		int colorname=4;
		/*
		 * System.out.println("enter colorname"); 
		 * Scanner s = new Scanner(System.in);
		 * int colorname=s.nextInt();
		 */
		switch(colorname)
		{
		case 1:
			System.out.println("red");
			break;
		case 2:
			System.out.println("blue");
			break;
		case 3:
			System.out.println("green");
			break;
		case 4:
			System.out.println("yellow");
			break;
		case 5:
			System.out.println("orange");
			break;
		case 6:
			System.out.println("white");
			break;
		default:
			System.out.println("Invalid data");
		}

	}

}
