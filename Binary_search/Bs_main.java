package Binary_search;

public class Bs_main {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 9, 10, 18, 20, 30, 45, 57, 64 };
        int target = 45;

        System.out.print(binary_search(arr, target));

    }

    // This function will gonna return the index at which the target is present
    // If the target is not present or the array is empty no element is there
    static int binary_search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
       
        // now i am making the while loop which gonna check the start is less then end ?
        while (start <= end) {
             // now we gonna find the mid
            // int mid = (start + end)/2; // this may fail when the mid is too large
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        // if element is not present then this function will gonna return the -1
        return -1;
    }
}
