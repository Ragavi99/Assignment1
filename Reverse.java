package hw;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int n,reverse=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number :");
		n=scan.nextInt();
		while(n!=0)
		{
			reverse=reverse*10;
			reverse=reverse+n%10;
			n=n/10;
		}
		System.out.println("Reverse of digits:"+reverse);

	}

}
