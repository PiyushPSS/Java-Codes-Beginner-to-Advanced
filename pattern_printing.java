public class pattern_printing {
    public static void main(String[] args) {
        hollowRectanglePattern();
        System.out.println();
        System.out.println();
        invertedAndRotatedHalfPyramid();
    }

    private static void hollowRectanglePattern() {
        // ********
        // * *
        // * *
        // ********

        for (int i = 1; i <= 4; i++) {
            if (i == 2 || i == 3) {

                for (int j = 1; j <= 8; j++) {
                    if (j == 1 || j == 8) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }

            } else {
                // odd
                for (int j = 1; j <= 8; j++) {
                    System.out.print(" * ");
                }
            }

            System.out.println();
        }
    }

    private static void invertedAndRotatedHalfPyramid() {
        //     *
        //    **
        //   ***
        //  ****
        // *****

        for(int i = 4 ; i >= 0 ; i--) {
            for(int j = 0 ; j <= i ; j++) {
                System.out.print(" ");
            }

            for(int j = 1 ; j <= (5-i) ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
