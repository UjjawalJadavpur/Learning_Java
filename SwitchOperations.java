
public class SwitchOperations {

    public static void printDayOfWeek(int weekNo) {
        switch (weekNo) {
            case 1:
                System.out.println("SUNDAY");
                break;
            case 2:
                System.out.println("MONDAY");
                break;
            case 3:
                System.out.println("TUESDAY");
                break;
            case 4:
                System.out.println("WEDNESDAY");
                break;
            case 5:
                System.out.println("THURSDAY");
                break;
            case 6:
                System.out.println("FRIDAY");
                break;
            case 7:
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("Invalid week number! Please enter a number between 1 and 7.");
                break;
        }
    }

    public static void printGender(char gender) {
        switch (gender) {
            case 'M':
            case 'm':
                System.out.println("It's a MALE");
                break;
            case 'F':
            case 'f':
                System.out.println("It's a FEMALE");
                break;
            case 'T':
            case 't':
                System.out.println("It's a TRANSGENDER");
                break;
            default:
                System.out.println("Invalid Character! Enter the correct Gender.");
        }
    }

    public static void checkEvenOdd(int checkNo) {
        switch (checkNo % 2) {
            case 0:
                System.out.println(checkNo + " is an EVEN Number");
                break;
            case 1:
                System.out.println(checkNo + " is an ODD Number");
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void printvowelconstant(char checkvowel) {
        if ((checkvowel >= 'A' && checkvowel >= 'Z') || (checkvowel >= 'a' && checkvowel >= 'z')) {
            switch (checkvowel) {

                case 'A':
                case 'a':
                case 'I':
                case 'i':
                case 'E':
                case 'e':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                    System.out.println(checkvowel + "  is vowel ");
                    break;
                default:
                    System.out.println(checkvowel + "  is not vowel, it is Consonant ");

            }

        } else
            System.out.println(" Invalid Character !!! ");

    }

    public static void printMonth(int number) {
        switch (number) {
            case 1:
                System.out.println(number + " is 1st Month - January having 31 days");
                break;
            case 2:
                System.out.println(number + " is 2nd Month - Febuary having 28/29 days");
                break;
            case 3:
                System.out.println(number + " is 3rd Month - March having 31 days");
                break;
            case 4:
                System.out.println(number + " is 4th Month - April having 30 days");
                break;
            case 5:
                System.out.println(number + " is 5th Month - May having 31 days");
                break;
            case 6:
                System.out.println(number + " is 6th Month - June having 30 days");
                break;
            case 7:
                System.out.println(number + " is 7th Month - July having 31 days");
                break;
            case 8:
                System.out.println(number + " is 8th Month - August having 31 days");
                break;
            case 9:
                System.out.println(number + " is 9th Month - September having 30 days");
                break;
            case 10:
                System.out.println(number + " is 10th Month - October having 31 days");
                break;
            case 11:
                System.out.println(number + " is 11th Month - November having 30 days");
                break;
            case 12:
                System.out.println(number + " is 12th Month - December having 31 days");
                break;
            default:
                System.out.print(" Invalid Month number !! ");

        }
    }

}
