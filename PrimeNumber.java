package hw;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count=count+1;
		}
		if(count==2)
			System.out.println("prime number");
		else
			System.out.println("not primr number");



	}

}
