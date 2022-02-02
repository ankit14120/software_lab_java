import java.util.*;

public class pro10
{
    public static void main(String[]args){
        
        Scanner pc =new Scanner(System.in);

        System.out.print("Enter the first term of equation:");  
        double a=pc.nextDouble();
        System.out.print("Enter the second term of equation:");  
        double b=pc.nextDouble();
        System.out.print("Enter the third term of equation:");  
        double c=pc.nextDouble();

        Double D=(b*b)-(4*a*c);
        if(D>0)
        {
            double first_root=(-b+Math.sqrt(D))/(2*a);
            double second_root=(-b-Math.sqrt(D))/(2*a);
            System.out.println("First Root of the equation is"+first_root);
            System.out.println("Second Root of the equation is"+second_root);
        }
        else if(D==0)
        {
            double equal_root=(-b+Math.sqrt(D))/(2*a);
            System.out.println("Equal Roots is:"+equal_root);
        }
        else
        { 
            System.out.println("Roots are Imaginary");
        }
        
    }
}