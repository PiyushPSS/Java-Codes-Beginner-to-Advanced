public class Binary_search {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 8, 10, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22 };
        int element = 4;
        System.out.println(search_binary(arr, element));
    }

    public static int search_binary(int[] array, int x) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
      
            if (array[mid] == x)
              return mid;
      
            if (array[mid] < x)
              low = mid + 1;
      
            else
              high = mid - 1;
          }

        return -1;
    }

}
