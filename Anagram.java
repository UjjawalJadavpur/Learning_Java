
import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Let's  Check for Anagram ");
        System.out.print("Enter the 1st String: - ");
        String str1 = scn.nextLine();
        System.out.print("Enter the 2nd String: - ");
        String str2 = scn.nextLine();

        boolean flag = CheckAnagram(str1, str2);
        System.out.println("Anagram Status for Given String  is " + flag);

        scn.close();

    }

    public static boolean CheckAnagram(String str1, String str2) {
        HashMap<Character, Integer> hash = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (hash.containsKey(ch))
                hash.put(ch, hash.get(ch) + 1);
            else
                hash.put(ch, 1);
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if(!hash.containsKey(ch))
              return false;
            else if (hash.containsKey(ch))
                hash.put(ch, hash.get(ch) - 1);
            else
                hash.put(ch, 1);
        }

        for (Character ch : hash.keySet()) {
            if (hash.get(ch) != 0)
                return false;
        }

        return true;

    }

}
