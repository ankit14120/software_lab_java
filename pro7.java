import java.util.*;
public class pro7 {
    public static void main(String[] args){

        Scanner pc= new Scanner(System.in);
        System.out.println("Enter numbers");
        int a=pc.nextInt(), b=pc.nextInt(), c=pc.nextInt();
        
        if(a<b&&a<c)
        {System.out.println("Number a is smallest\n" +a);}
        else if(b<a&&b<c)
        {System.out.println("Number b is smallest\n" +b);}
        else
        {System.out.println("Number c is smallest\n" +c);}
    }
    
}


