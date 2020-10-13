import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReverseString {

    static StringBuffer reversed = new StringBuffer();


    private static void reverser(String input) {

List<Character> charList = new ArrayList<Character>();
        int len = input.length() ;

        for (int i=len -1; i>=0; i-- ){
            charList.add(input.charAt(i));    

        }

        Iterator<Character> it = charList.iterator();
        while(it.hasNext()) {
            reversed.append(it.next());
        }

       

}

private static boolean isPalindrome(String input) {

    if(input.equals(reversed.toString())) {
      return true;
    }
    return false;
}
public static void main(String args[]) {

    String input = "amma";

    reverser(input);

    System.out.println("Reversed String: " + reversed.toString() + " \n");

    System.out.println("Is string palindrome? : " + isPalindrome(input));


}
    
}
