import java.util.*;
public class pattern1 {
	public static void main(String[] args)
	{
		int i,j,rows;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter in hoe manuy rows you want want to print the elements: ");
		rows=sc.nextInt();
		for(i=0;i<=rows;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.println(j+"");
			}
			System.out.println();
		}
		sc.close();
	}

}
