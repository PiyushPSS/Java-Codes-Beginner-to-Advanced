import java.util.*;

public class gig1 {
    public static void main(String[] args) {

        System.out.println(getwater(10, 3, 11, 4, 12, 5));

    }

    public static ArrayList<Integer> getwater(int c1, int w1, int c2, int w2, int c3, int w3) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        int flag = 0;
        int temp = 0;
        int count = 100000;

        for (long i = 1; i <= count; i++) {

            if (flag == 0) {
                // from a to b.
                if (w1 + w2 <= c2) {
                    // can be fitted.
                    w2 = w1 + w2;
                    w1 = 0;
                } else {
                    temp = w1;
                    w1 = (w1 + w2) - c2;
                    w2 = (temp - w1) + w2;
                }
                flag = 1;
            }

            else if (flag == 1) {
                // from b to c.
                if (w2 + w3 <= c3) {
                    // can be fitted.
                    w3 = w2 + w3;
                    w2 = 0;
                } else {
                    temp = w2;
                    w2 = (w2 + w3) - c3;
                    w3 = (temp - w2) + w3;
                }
                flag = 2;
            }

            else if (flag == 2) {
                // from c to a.
                if (w3 + w1 <= c1) {
                    // can be fitted.
                    w1 = w3 + w1;
                    w3 = 0;
                } else {
                    temp = w3;
                    w3 = (w3 + w1) - c1;
                    w1 = (temp - w3) + w1;
                }
                flag = 0;
            }

            if (i == count) {
                result.add(w1);
                result.add(w2);
                result.add(w3);
                break;
            }

        }
        
        return result;
    }
}
