public class swapAlternateElement {
    static int[] Swap(int[] arr){
        int size = arr.length;

        for(int i =0;i<size-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }return arr;
    }public static void main(String[] args){
        int [] arr= {1,2,3,4,5,6,7,8,9,0};
        int [] ans = Swap(arr);
        for(int k:ans){
            System.out.print(" " +k);
        }
    }
}
