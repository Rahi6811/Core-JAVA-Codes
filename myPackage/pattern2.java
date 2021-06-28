import java.util.*;
public class pattern2 {
	public static void main(String[] args)
	{
		int i,j,rows;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter in How many rows you required pattern: ");
		rows=sc.nextInt();
		System.out.println("YOur pattern is: ");
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
		for(i=rows-1;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
			System.out.print(j+"");	
			}
			System.out.println();
		}
		sc.close();
		
	}

}
