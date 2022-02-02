import java.util.Scanner;

public class pro11 {
    public static void main() {
        Scanner a= new Scanner(System.in);

        System.out.println("Enter Decimal Number:");
        int b = a.nextInt();

        String c = Integer.toBinaryString(b);
        System.out.println("Binary Equivalent of given decimal number is"+c);
        
    }
}
