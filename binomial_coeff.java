// Binomial coefficient = nCr = n!/((r!)(n-r)!)

import java.util.Scanner;

public class binomial_coeff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r;
        n = sc.nextInt();
        r = sc.nextInt();

        System.out.println(fact(n) / ((fact(r) * fact(n - r))));

        sc.close();
    }

    static int fact(int x) {
        int fact = 1;
        while (x > 1) {
            fact *= x;
            x--;
        }
        return fact;
    }
}
