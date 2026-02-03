package Linear_Search;

public class ls_main {
    public static void main(String[] args) {
        int [] arr = {1 , 13 , 20 , 31 , 30 , 11 , 16 , 8};
        int target = 11 ;
        int answer = linear_search_ls(arr , target);
        if (answer == -1 ){
            System.out.println("The element is not present or the length of array is 0");
        }
        else{
            System.out.print(answer);
        }

    }

    // Search in the array : and return the index if the element is found 
    // if the element is not found or the length of array is 0 in that case it will gonna return -1 

    static int linear_search_ls(int arr[] , int target){
        if (arr.length == 0){
            return -1;
        }

        // run a for loop to find the target
        for(int index = 0 ; index < arr.length ; index ++){
            if (target == arr[index]){
                return index;
            }
        }
        return -1;
    }
}
