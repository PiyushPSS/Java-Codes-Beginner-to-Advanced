//This code will give the reverse of a number.

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int num, rev = 0, reverse = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while (num!=0) {
            rev = num%10;
            reverse = rev + (reverse * 10);
            num /= 10;
        }

        System.err.println(reverse);

        sc.close();
    }
}
