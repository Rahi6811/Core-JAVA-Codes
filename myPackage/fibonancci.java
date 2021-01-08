import java.util.*;
import java.util.Scanner;

public class fibonancci {
	public static void main(String[] args)
	{
		int a=5,b=0,c=1,i,m,sum;
		System.out.println("Fibonancci Series is you want : ");
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		for(i=0;i<m;++i)
		{
			sum=b+c;
			b=c;
			c=sum;
			System.out.println("Series is: "+sum);
		}
	}

}
