import java.util.*;

public class pro12 {
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter Octal Number:");
        String a = s.nextLine();

        int b = Integer.parseInt(a,8);

        String c= Integer.toBinaryString(b);
        System.out.println("Binary Equivalent of given octal number is "+c);
        
    }
}
