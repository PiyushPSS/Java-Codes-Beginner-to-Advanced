import java.util.Scanner;

public class twoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        Scanner sc = new Scanner(System.in);

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; i++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }

        addMatrix();
    }

    public static void addMatrix() {
        int[][] arr1 = new int[4][4];
        int[][] arr2 = new int[4][4];
        int[][] sum = new int[4][4];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Sum of matrices:");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void multiplyMatrix() {
        int[][] arr1 = new int[4][4];
        int[][] arr2 = new int[4][4];
        int[][] product = new int[4][4];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[i].length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    product[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("Product of matrices:");
        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[i].length; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void add() {
        int arr1[][] = new int[4][4];

        Scanner sc = new student(System.in);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        int sum[] = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            sum[i] = 0;

            for (int j = 0; j < arr1.length; i++) {
                sum[i] += arr1[i][j];
            }
        }

        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i] + "\n");
        }
    }
}