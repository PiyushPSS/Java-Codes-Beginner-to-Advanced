public class Binary_search {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 8, 10, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22 };
        int element = 12;
        System.out.println(search_binary(arr, element));
    }

    public static int search_binary(int[] arr, int element) {

      int start = 0;
      int end = arr.length - 1;

      while(start <= end) {
        int mid = (start + end) / 2;
        if(arr[mid] == element) { //found the element.
          return mid;
        } 

        if (arr[mid] < element) {
          //right.

          start = mid + 1;
        } else {
          //left.

          end = mid - 1;
        }
      }

      return -1;
    }

}
