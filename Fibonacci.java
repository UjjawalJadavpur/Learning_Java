
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) 
    {
        
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number :- ");
        int number = scn.nextInt();

        printFibonacci(number);
    }

    public static void printFibonacci(int number) 
    {
        int fibo1 = 0, fibo2 = 1;

        int result = 0;

        System.out.println("Fibonacci series Till " + number + "th term is:-  ");

        while( number > 0)
        {
            System.out.print(fibo1 + " ");

            result = result + fibo1;

            int nextFibo = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = nextFibo;

            number--;
        }

        System.out.println();
        System.out.println("Sum of Fibonacci Series  :- " + result);
        
    }
    
}
