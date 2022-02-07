import java.util.*;
import java.lang.Math;
public class pro19 {
    public static void main(String[] args)
	{
	    Scanner sc= new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    double num = sc.nextDouble();
	    Double square = Math.sqrt(num);
	    System.out.println("Square of "+ num + " is: "+ square);
    }
}