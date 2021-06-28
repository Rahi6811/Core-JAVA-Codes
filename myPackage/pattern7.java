import java.util.Scanner;
public class pattern7 {
	public static void main(String[] args)
	{
		int i,j,rows;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter in How many rows your required pattern: ");
		rows=sc.nextInt();
		System.out.println("Your pattern is: ");
		for(i=rows;i>=1;i--)
		{
			for(j=rows;j>=i;j--)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
		sc.close();
	}

}
