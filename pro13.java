import java.util.*;

public class pro13 {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter hexadecimal Number:");
        String a = sc.nextLine();

        int b = Integer.parseInt(a,16);

        String c= Integer.toBinaryString(b);
        System.out.println("Binary Equivalent of given hexadecimal number is "+c);
        
    }
}
