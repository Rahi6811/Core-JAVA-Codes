import java.util.*;
import java.util.Scanner;


public class randomnumber {
	public static void main(String[] args)
	{
		int i;
		Random rno=new Random();
		System.out.println("The random numbers in between 0 to 500 is below: ");
		for(i=0;i<10;i++)
		{
			System.out.println(rno.nextInt(500));
			
		}
	
	}

}
