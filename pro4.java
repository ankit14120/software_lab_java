import java.util.*;
public class pro4 {
    public static void main(String[] args) { 
//variables
    Scanner pc = new Scanner(System.in); 
        System.out.println("Enter numbers a nad b:");
        int a = pc.nextInt(); 
        int b = pc.nextInt();
        
        int sum=a+b;
        int diff=a-b;
        int mul=a*b;
        float div=a/b;
        
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
    }
}

