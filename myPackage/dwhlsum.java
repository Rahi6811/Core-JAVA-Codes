import java.util.*;
import java.util.Scanner;
public class dwhlsum {
	public static void main(String[] args)
	{
		double sum=0.0,i,no;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Enter a Number: ");
			no=sc.nextDouble();
			sum+=no;
		}while(no!=0.0);
		System.out.println("Sum is: "+sum);
	}

}
