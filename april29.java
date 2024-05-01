import java.util.Scanner;

public class april29 {
    public static void main(String[] args) {
        // sum();
        // concat();
        // average();
        // copyArray();
    }

    // Sum of elements in an array.
    public static void sum() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        int sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }

    // Concatenate two arrays.

    public static void concat() {

        int arr[] = new int[8];
        arr[0] = 7;
        arr[1] = 7;
        arr[2] = 7;
        arr[3] = 7;
        int arr2[] = { 1, 2, 3, 4 };

        int count = 0;

        for (int i = 4; i < 8; i++) {
            arr[i] = arr2[count++];
        }

        for (int i : arr) {
            System.out.println(arr[i]);
        }
    }

    // ENTER MARKS OF 5 SUBJECTS AND FIND AVERAGE.
    public static void average() {
        int subjects[] = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < subjects.length; i++) {
            subjects[i] = sc.nextInt();
        }

        float average = 0;

        for (int i = 0; i < subjects.length; i++) {
            average = average + subjects[i];
        }

        System.out.println(average / 5);
    }

    // COPY ARRAY.
    public static void copyArray() {
        Scanner sc = new Scanner(System.in);

        int arr1[] = new int[5];
        int arr2[] = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i : arr1) {
            arr2[i] = arr1[i];
        }

        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
