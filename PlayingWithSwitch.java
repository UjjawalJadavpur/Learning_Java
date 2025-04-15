
import java.util.*;

public class PlayingWithSwitch {

    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);

        
        System.out.print("Enter the week number : - ");
        int weekNo = scn.nextInt();
        SwitchOperations.printDayOfWeek(weekNo);


        System.out.print("Enter the Gender (M/F/T): ");
        char gender = scn.next().charAt(0); 
        SwitchOperations.printGender(gender);

        
        System.out.print("Enter the number (less than 2,147,483,647 ) to check whether it is EVEN / ODD :-");
        int checkNo = scn.nextInt();
        SwitchOperations.checkEvenOdd(checkNo);

        System.out.print("Enter Any Character (A B C ....a b c...): ");
        char checkvowel = scn.next().charAt(0); 
        SwitchOperations.printvowelconstant(checkvowel);

        System.out.print("Enter the Month number : - ");
        int MonthNo = scn.nextInt();
        SwitchOperations.printMonth(MonthNo);

        scn.close(); 
    }


   
}