import java.util.HashMap;
import java.util.Scanner;

public class CountNumberOfChars {

    static void characterCount(String inputString) {
        HashMap<Character,Integer> hm = new HashMap<>();
        char[] strArray = inputString.toCharArray();

        for (char c:strArray) {
            if (hm.containsKey(c)) {
                hm.put(c,hm.get(c)+1);
            }
            else
                hm.put(c,1);
        }
        System.out.println(hm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();

        characterCount(str.replaceAll("\\s", ""));
    }

}
