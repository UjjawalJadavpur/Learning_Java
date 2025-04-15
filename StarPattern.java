import java.util.*;

public class StarPattern {

    static void diamondStarPattern(int n) {

        System.out.println("Your Diamond Star Pattern for N = " + n + " is :- ");

        int Y = 1, upper = n, lower;

        while (upper > 0) {

            for (int i = 0; i < upper; i++)
                System.out.print(" ");

            for (int j = 0; j < Y; j++)
                System.out.print("*");

            Y = Y + 2;
            upper--;
            System.out.println();
        }

        Y = 2 * n - 3;
        lower = n - 1;
        int space = 1;

        while (lower > 0) {
            for (int i = 0; i <= space; i++) {
                System.out.print(" ");
            }

            for (int j = 0; j < Y; j++) {
                System.out.print("*");
            }

            Y = Y - 2;
            lower--;
            space = space + 1;
            System.out.println();
        }

    }

    static void pyramidStarPattern(int n) {
        int Y = 1;

        System.out.println("Your Star Pattern for N = " + n + " is :- ");

        while (n > 0) {

            for (int i = 0; i < n; i++)
                System.out.print(" ");

            for (int j = 0; j < Y; j++)
                System.out.print("*");

            Y = Y + 2;
            n--;
            System.out.println();
        }
        System.out.println();

    }

    static void NormalStarPattern(int n) {

        System.out.println("Your Star Pattern for N = " + n + " is :- ");

        int Y = 1, space = n - 1;

        while (n > 0) {
            for (int i = 0; i < space; i++)
                System.out.print(" ");

            for (int j = 0; j < Y; j++)
                System.out.print("*");

            Y = Y + 1;
            n--;
            space = space - 1;
            System.out.println();
        }

    }

    static void DabangPattern(int n) {
        int count = 1, i = 0;
        int l = 1, k = 1;

        while (n > 0) {

            count = 1;
            while (count <= n) {
                System.out.print(count + " ");
                count++;
            }

            l = 1;
            while (l < k) {
                System.out.print("*" + " ");
                l++;
            }

            count--;
            while (count > 0) {
                System.out.print(count + " ");
                count--;
            }
            System.out.println();

            i++;
            n--;
            k = k + 2;

        }
    }

    public static void main(String[] args) {

        System.out.println("Let's build Some Pattern ..... ");
        System.out.print("Enter the number :-  ");
        Scanner scn = new Scanner(System.in);

        int number = scn.nextInt();

        System.out.println();

        // pyramidStarPattern(number);
        // diamondStarPattern(number);
        // NormalStarPattern(number);
        DabangPattern(number);

        scn.close();

    }

}