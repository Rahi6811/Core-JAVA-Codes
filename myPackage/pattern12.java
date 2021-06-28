import java.util.*;
import java.util.Scanner;
public class pattern12 {
	public static void main(String[] args)
	{
		int i,j,rows;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Rows: ");
		rows=sc.nextInt();
		System.out.println("Your pattern is: ");
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+"");
			}
			System.out.println("");
		}
		sc.close();
	}
	

}
