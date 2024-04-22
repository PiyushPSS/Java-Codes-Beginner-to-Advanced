public class reverse_array {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6};
        array_reverse(array);
    }

    public static void array_reverse(int[] array) {
        for(int i = 0 ; i < array.length / 2 ; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        for(int i = 0 ; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
