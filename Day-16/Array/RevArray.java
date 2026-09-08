public class RevArray {
//    static int [] rev(int [] arr){
//        int size = arr.length;
//        int [] brr = new int[size];
//        for(int i = arr.length-1;i>=0;i--){
//            int element = arr[i];
//           brr[size-1-i]=arr[i];
//
//
//        }return brr;
    static int[] rev(int [] arr){
        int size = arr.length;
        int i =0;
        int j = size-1;
        while(i<j){
            //swap
            arr[i] = arr[i]+arr[j];
            arr[j] = arr[i]-arr[j];
            arr[i] = arr[i]-arr[j];
            //increment
            i++;
            //decrement
            j--;


        }return arr;
    }public static void main(String[] args){
        int arr[] ={7,8,59,3,6,2};
        int ans[] = rev(arr);
        System.out.println("Rev array");
        for(int i:ans){
            System.out.print(" "+i);
        }
    }
}
