//question28
import java.util.Scanner;
public class assign28
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the se code :");
        char code = obj.nextLine().charAt(0);
        if(code == 'M' || code == 'm')
        System.out.println("Given data is male");
        else if (code== 'F' || code == 'f')
        System.out.println("Given data is female");
        else 
        System.out.println("Wrong code intered");
    }
    
}        
