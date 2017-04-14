import java.util.Scanner;

/****************************************************************************************
 *                   Challenge #01 from Week of Code 31 !                               *
 *                                                                                      *
 * We consider a word "W" to be beautiful if the following two conditions are satisfied:*
 *  -> No two consecutive characters are the same.                                      *
 *  -> No two consecutive characters are in the following vowel set: a, e, i, o, u, y.  *
 * Note that we consider y to be a vowel in this challenge.                             *
 * Given , print Yes if it is beautiful or No if it is not.                             *
 ****************************************************************************************/

//input: a string "W"
//output: "Yes" if "W" is a beautiful word or "No" if it's not
public class BeautifulWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
        for(int i = 0; i < w.length() - 1; i++) {
            if(w.charAt(i) == w.charAt(i + 1)) {
                System.out.println("No");
                return;
            }
        }
        if(w.matches("([a-zA-Z]*)[aAeEiIoOuUyY][aAeEiIoOuUyY]([a-zA-Z]*)*")) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }

}
