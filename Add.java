package hw;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		int m,n,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number :");
		m=scan.nextInt();
		while(m>0)
		{
			n=m%10;
			sum=sum+n;
			m=m/10;
		}
		System.out.println("sum of digits:"+sum);
	}

}
