public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 18;
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
        //prints 9
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        //find whether the array is sorted in ascending/descending order
        boolean isAsc = arr[start] < arr[end];

        while (start<=end) {
            //find the middle element
            //might be possible that (start + end) exceeds the range of int in Java.
            //int mid = (start + end) / 2;
            //The better way of doing that is the following arithmetic
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            //if it's ascending do the following
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                //else it's in descending order
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
