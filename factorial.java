public class factorial {
    public static void main(String[] args) {
        System.out.println(facs(5));
    }

    static int facs (int x) {
        int fact = 1;
        while (x > 1) {
            fact *= x;
            x--;
        }
        return fact;
    }
}
