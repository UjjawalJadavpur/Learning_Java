
import java.util.Scanner;

public class Pallindrome {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);


        System.out.println("Let's  Check for Pallindrome ");

        System.out.print("Enter the String: - ");
        String str = scn.nextLine();

        boolean flag = CheckPallindrome(str);
        System.out.println("Pallindrome Status for Given String  is " + flag);

        scn.close();

    }

    public static boolean CheckPallindrome(String str)
    {
        int n = str.length();

        for(int i=0; i<=n/2; i++)
        {
            if(str.charAt(i) != str.charAt(n-i-1))
               return false;
        }

        return  true;

    }
}
