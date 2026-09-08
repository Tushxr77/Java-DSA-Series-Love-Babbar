public class sortedarray {
    static int unsorted(int [] arr){
        int size = arr.length;
        for(int i = 0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
                return arr[i+1];

            }
        }
        return -1;
    }public static void main(String[] args){
        int arr[]={2,5,7,8,9,10};
        System.out.println(unsorted(arr));
    }
}
