public class max_subarray_sum {
    public static void main(String[] args) {
        int[] array = {1, -2, 6, -1, 3};

        maxSubarrayUsingPrefixArray(array);

        int[] kadaneAlgo = {-2,-3,4,-1,-2,1,5,-3};

        maxSubarrayUsingKadaneAlgorithm(kadaneAlgo);
    }

    //Using Kadane's Algorithm.

    public static void maxSubarrayUsingKadaneAlgorithm(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        currentSum = arr[0];
        if(currentSum < 0) {
            currentSum = 0;
            maxSum = 0;
        }

        for(int i = 1 ; i < arr.length ; i++) {
            currentSum = currentSum + arr[i];

            if(currentSum < 0) {
                currentSum = 0;
            } else {
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println(maxSum);
    }

    //Using PrefixArray Logic.

    public static void maxSubarrayUsingPrefixArray(int[] arr) {
        int[] prefixArray = new int[arr.length];
        int currentSum = 0;
        int maxSum = 0;
        
        prefixArray[0] = arr[0];

        for(int i = 1 ; i < arr.length ; i++) {
            prefixArray[i] = prefixArray[i-1] + arr[i];
        }

        for(int i = 0 ; i < arr.length ; i++) {

            for(int j = i ; j < arr.length ; j++) {

                currentSum = 0;

                int start = i;
                int end = j;

                if(start == 0) {
                    currentSum = prefixArray[end];
                } else {
                    currentSum = prefixArray[end] - prefixArray[start - 1];
                }

                if(maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println(maxSum);
    }
}
