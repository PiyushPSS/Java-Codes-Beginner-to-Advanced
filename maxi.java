public class maxi {
    // public static void main(String[] args) {
    // System.out.println(fuel(8, 5, 6));
    // }

    // public static int fuel(int x, int a, int b) {
    // int result = 0;

    // if (a >= b) {
    // result = a;
    // } else {
    // result = b;
    // }

    // if (result == x) {
    // return result;
    // }

    // int temp = result;

    // result = result / 2;

    // while (result < x) {
    // int temp1 = result + a;
    // int temp2 = result + b;

    // if (temp1 <= x && temp2 > x) {

    // // only temp1 is under x.
    // if (temp1 == x) {
    // result = temp1;
    // break;
    // } else if (temp1 < x) {
    // result = result + temp1;
    // result = result / 2;
    // } else {
    // break;
    // }

    // } else if (temp2 <= x && temp1 > x) {

    // //only temp2.

    // if (temp2 == x) {
    // result = temp2;
    // break;
    // } else if (temp2 < x) {
    // result = result + temp2;
    // result = result / 2;
    // } else {
    // break;
    // }

    // } else if (temp1 <= x && temp2 <= x) {

    // //both.

    // if(temp1 >= temp2) {
    // result = result + temp1;
    // } else {
    // result = result + temp2;
    // }

    // result = result / 2;

    // } else{
    // result = temp;
    // break;
    // }
    // }

    // return result;
    // }

    public static void main(String[] args) {
        System.out.println(fuel(8, 5,6));
    }

    public static int fuel(int x, int a, int b) {
        int result = Math.max(a, b); // Initialize result with the larger of a and b

        if(result == x) {
            return result;
        }

        int temp = result;

        result /= 2;

        while (result < x) {
            int temp1 = result + a;
            int temp2 = result + b;

            // Choose the larger value that is less than or equal to x
            if (temp1 <= x && temp2 <= x) {
                result = Math.max(temp1, temp2);
                temp = result;

                if(result < x) {
                    result /= 2;
                } else if (result == x) {
                    break;
                }
            } else if (temp1 <= x) {
                result = temp1;

                if(temp1 == x) {
                    break;
                }
            } else if (temp2 <= x) {
                result = temp2;
                if(temp2 == x) {
                    break;
                }
            } else {
                result = temp;
                break;
                 // Neither temp1 nor temp2 is less than or equal to x
            }
        }

        return result;
    }
}