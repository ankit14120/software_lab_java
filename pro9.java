import java.util.*;
import java.lang.Math;
public class pro9
{
    public static void main(String[]args){
        char ch;
        Scanner pc =new Scanner(System.in);

        System.out.println("Enter the character:");
            ch=pc.next().charAt(0);
        if(ch>='A' && ch<='Z')
            System.out.println(ch+" is an uppercase character");
        else if(ch>='a' && ch<='z') 
            System.out.println(ch+" is an lowercase character");
        else
            System.out.println(ch+" is an specialcase character");
        
    }
}