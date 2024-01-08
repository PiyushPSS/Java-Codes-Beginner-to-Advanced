/*Creating a pattern like this:
 * *
 * **
 * ***
 * ****
 * *****
 */

public class i_equals_j_pattern {
    public static void main(String[] args) {
       for(int i = 1 ; i <= 5 ; i++) {
        for(int j = 1 ; j <= i ; j++) {
            System.out.print("*");
        }
        System.out.println();
       }
    }
}
