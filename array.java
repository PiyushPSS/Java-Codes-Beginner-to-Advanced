public class array {
    public static void main(String[] args) {
        int array[] = new int[20];
        for(int i = 0 ; i < 20 ; i++) {
            array[i] = i;
        }

        for (int i : array) {
            System.out.println(i);
        }

        changeArray(array);
    }

    private static void changeArray(int[] array) {
        for(int i = 0 ; i < 20 ; i++) {
            array[i] = i + 5;
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
