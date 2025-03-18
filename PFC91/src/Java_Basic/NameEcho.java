package Java_Basic;

import java.util.Scanner;

public class NameEcho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=scan.nextLine();
		System.out.println("Enter you want to count");
		int count=scan.nextInt();
		for(int i=0;i<count;i++)
		{
			System.out.println("Hello "+name);
		}
		System.out.println("Have a nice day "+name);

	}

}
