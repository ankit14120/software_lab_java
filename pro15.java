import java.util.*;

public class pro15 {
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter Binary Number:");
        String a = s.nextLine();

        int b = Integer.parseInt(a,2);

        String c= Integer.toOctalString(b);
        System.out.println("Octal Equivalent of given binary number is "+c);
        
    }
}
