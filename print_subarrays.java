public class print_subarrays {
    public static void main(String[] args) {

        int[] array = {2,3,4,5,6};
        print_subarray(array);
        
    }

    public static void print_subarray(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++) {

            for(int j = i ; j < arr.length ; j++) {

                for(int k = i ; k <= j ; k++) {
                    System.out.print(arr[k] + " ");
                }

                System.out.println();
            }
        }
    }
}
