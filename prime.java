//To check whether the number is prime or not.

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num  = sc.nextInt();
        int count = 0;

        if(num == 1) {
            System.out.println("1 is neither prime nor composite.");
            
        } else if (num <= 0) {
            System.err.println("Please enter a valid number.");
        } else {
        for(int i = num; i >= 1; i--) {
            if(num%i == 0) {
                count++;
            }
        }

        System.err.println(count>2?"Number is not prime" : "Number is prime");

        sc.close();
        }
    }
}
