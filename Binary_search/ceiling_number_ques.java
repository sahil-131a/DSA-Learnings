package Binary_search;
// In this question we have to find the target if the target is not present in the array then it will
// gonna return the number which smallest greatest then the target like m gonna give the target here 19 
// it is not present in the array so it gonna return the 20
public class ceiling_number_ques {
    public static void main(String [] args){
        int [] arr = {1 , 3 , 4 , 8 , 10 , 15 , 16 , 20 , 25 , 30};
        int target = 19;
        int ans = ceiling_number(arr, target);
        System.out.print("The index on which the number is "+ ans + " and the number is " + arr[ans]);

    }
    // this function will gonna return the index of start  if the target not found
    // which is the little larger element 
    static int ceiling_number(int [] arr , int target ){
        int start = 0 ;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid]< target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return start;
        // If the element is not present the index of the start will be returned because 
        // when the element is not present between the start and the end then when the while loop break 
        // then start will be on the end + 1  that element will be little larger then the target 
    }

}
