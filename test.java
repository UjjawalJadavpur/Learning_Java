import java.util.*;

public class test {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the String to check Pallindrome : - ");
        String str = scn.nextLine();
        boolean flag = Pallindrome.CheckPallindrome(str);
        System.out.println("Pallindrome Status for Given String  is " + flag);



        System.out.print("Enter the number to find factorial :-  ");
        int number = scn.nextInt();
        long factorialResult = PlayWithJava.factorial(number);
        System.out.println("Factorial Result is  :-  " + factorialResult);



        System.out.println("Swapping two number ....");
        System.out.print("Enter 1st number :- ");
        int a = scn.nextInt();
        System.out.print("Enter 2nd number :- ");
        int b = scn.nextInt();
        System.out.println("Before Swapping Numbers are :-  a: " + a + "  b: " + b );
        int[] swapped = PlayWithJava.swap(a, b);
        
        a = swapped[0];
        b = swapped[1];
        
        System.out.println("After Swapping Numbers are :-  a: " + a + "  b: " + b );

        
        scn.close();
    }

}
