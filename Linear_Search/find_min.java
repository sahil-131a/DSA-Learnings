package Linear_Search;

public class find_min {
    public static void main(String [] args){
        int [] arr = {19 , 30 , 40 , 2 , 1 , -2 , -100};
        int ans = min(arr);
        if (ans == Integer.MAX_VALUE){
            System.out.print("The array is empty");
        }
        else{
            System.out.print(ans);
        }
    }

    // this function is going to find the minimum value in the array and then gonna return that 
    // if min array is empty then it gonna return the MAX_VALUE
    static int min(int [] arr ){
        if (arr.length == 0 ){
            return Integer.MAX_VALUE;
        }
        int min = arr[0];
        for(int index = 0 ; index < arr.length ; index++ ){
            if (arr[index] < min){
                min = arr[index];
            }
        }
        return min;
    }
}
