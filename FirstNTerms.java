package hw;

import java.util.Scanner;

public class FirstNTerms {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n,i=1;
		System.out.println("enter the range");
		n=scan.nextInt();
		while(i<=n)
		{
			System.out.print(i*i*i+" ");
					i++;
		}
	
	}

}
