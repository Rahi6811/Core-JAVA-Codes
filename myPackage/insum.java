import java.util.*;
import java.util.Scanner;
public class insum {
	public static void main(String[] args){
		int sum=0,number;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Enter Number: ");
			number=sc.nextInt();
			sum+=number;
		}while(number!=0);
		System.out.println("Sum is: "+sum);
	}

}
