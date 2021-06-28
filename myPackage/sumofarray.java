import java.util.*;
import java.util.Scanner;
public class sumofarray {
	public static void main(String[] args)
	{
		int i,x[]={10,20,30};
				int sum=0;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<=x.length;i++){
			sum=sum+x[i];
		
		
		System.out.println("Sum of Array Element is: "+sum);
		}
	}

}
