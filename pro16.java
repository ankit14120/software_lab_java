import java.util.*;

public class pro16 {
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter Binary Number:");
        String a = s.nextLine();

        int b = Integer.parseInt(a,2);

        String c= Integer.toHexString(b);
        System.out.println("Hexdecimal Equivalent of given binary number is "+c);
        
    }
}
