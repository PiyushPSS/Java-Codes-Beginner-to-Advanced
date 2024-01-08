//To convert a number from binary to decimal;

import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        int rem = 0, count = 1;
        int result = 0;
        long n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();

        while(n!=0) {
            rem = (int) n % 10;
            if(rem == 1) {
                result = result + count;
            }
            count *= 2;
            n /= 10;
        }

        System.out.println(result);
    }
}
