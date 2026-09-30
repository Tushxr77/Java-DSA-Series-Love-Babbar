public class SearchForElement {
    static boolean FindTarget(int []arr){
        int size = arr.length;
        int target = 7;
        for(int i = 0;i<size;i++){
            if(arr[i]==target){
                return true;
            }
        }return false;
    }
    public static void main(String[] args){
        int [] arr ={8,9,5,6,2};
        System.out.println(FindTarget(arr));
    }
}
