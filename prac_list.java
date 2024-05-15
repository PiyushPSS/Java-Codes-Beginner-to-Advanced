import java.util.Scanner;

public class prac_list {
    public static void main(String[] args) {
        if (args.length == 0) {

            // greatestNumber();



        } else {
            String sum = "";

            for (int i = 0; i < args.length; i++) {
                sum += args[i];
            }

            System.out.println(sum);
        }
    }

    // Write a Java program to insert 3 numbers from keyboard and find out greater
    // number among 3 numbers

    static void greatestNumber() {
        int num[] = new int[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            num[i] = sc.nextInt();
        }

        int greatest = num[0];

        for (int i = 1; i < 3; i++) {
            if (greatest > num[i]) {
                greatest = num[i];
            }
        }

        System.out.println(greatest);

    }
}
