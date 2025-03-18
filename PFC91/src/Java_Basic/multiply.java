package Java_Basic;

import java.util.Scanner;

public class multiply {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number prefer to multiply");
		int num=scan.nextInt();
		System.out.println("Do you terminate number");
		int terminate=scan.nextInt();
		for(int i=0;i<terminate;i++)
		{
			System.out.println(i+"*"+num+"="+(i*num));
		}
	}

}
