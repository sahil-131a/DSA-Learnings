package Binary_search;

public class index_infinite_array {
    public static void main(String[] args) {
        int [] arr = {2 , 23 , 34 , 45 , 56 , 67, 78 , 89 , 90 , 100 , 102 , 103 , 105 , 108 , 111 , 222 , 333 , 444};
        int target = 100;
        int [] temp = range(arr , target);
        int answer = binar_search(arr , temp[0] , temp[1] , target);
        System.out.print(answer);
        
    }

    static int [] range(int arr [] , int target ){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int new_start = end + 1;
            // here now we gonna find the new end end + (size of box )* 2
            // if arr is [2 , 3 , 4 ,5 , 6 , 7 , 9 , 10 , 38 ] its index start from 0 
            // and  we also gonna use index here to  double the size
            // so now end will be end = end + (end - start + 1)*2
            end = end + (end - start + 1) * 2;
            start = new_start;         
        }
        return new int []{start , end};
    }

    static int binar_search(int [] arr , int start ,  int end , int target ){
        
        while (start <= end ){
            int mid = start + (end - start )/ 2;

            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
}
