import java.util.Scanner;

public class optimized_prime {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i = 0;

        for(i = 2 ; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0) {
                System.out.println("NOT PRIME!");
                break;
            }
        }

        sc.close();
    }
}
