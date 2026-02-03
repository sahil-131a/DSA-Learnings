package Linear_Search;

public class Search_instring {
   public static void main(String[] args) {
    String name = "Sahil";
    char find = 'i';
    System.out.print(search(name , find));
   }

   // this will search in the string if char is present then return true if not return false 
   static boolean search(String text , char target){
    if (text.length() == 0 ){
        return false;
    }
    for (int index = 0 ; index < text.length() ; index++){
        if (text.charAt(index) == target){
            return true;
        }
    }
    return false;
   }  
}
