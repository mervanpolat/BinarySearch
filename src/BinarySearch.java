public class BinarySearch {

    public static void main(String[] args) {
        int ans = binarySearch(4);
        //return the index
        //return -1 if it does not exist
        System.out.println(ans);
    }

    static int binarySearch(int target) {
        int start = 0;
        int[] arr = {2,4,6,7,8,9,12,13,14,15,16,19,22,24};
        int end = arr.length -1;

        while (start<=end) {
            //find the middle element
            //might be possible that (start + end) exceeds the range of int in Java.
            //int mid = (start + end) / 2;
            //The better way of doing that is the following arithmetic
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }


            if (target < arr[mid]) {
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }
        }
        return -1;
    }

}
