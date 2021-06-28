import java.util.*;
import java.util.Scanner;
public class areaofsquare {
	public static void main(String[] args){
		int side,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side value: ");
		side=sc.nextInt();
		result=side*side;
		System.out.println("Area of Square is: "+result);
	}

}
