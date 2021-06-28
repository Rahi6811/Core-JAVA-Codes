import java.util.*;
import java.util.Scanner;

public class reversenum {
	public static void main(String[] args)
	{
		int num,no,old;
		num=0;
		old=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number which you want to reverse: ");
		num=sc.nextInt();
		while(num!=0)
		{
			old=old*10;
			old=old+num%10;
			num=num/10;
		}
		System.out.println("Reverse number is : "+old);
	}

}
