import java.util.Scanner;
public class pattern6 {
	public static void main(String[] args)
	{
		int i,j,rows;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter in how many rows you required : ");
		rows=sc.nextInt();
		System.out.println("Your pattern is here: ");
		for(i=rows;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
sc.close();
	}

}
