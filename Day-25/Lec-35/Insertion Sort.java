public class Insertionsort {
    static void InsertionSort(int [] arr){
        int n =arr.length;
        for(int i=1;i<n;i++){
            int curr=i;
            int prev=i-1;
            int currValue = arr[i];
            //shifting
            while(prev>=0&&currValue<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //placed
            arr[prev+1]=currValue;
        }
    }
    public static void main(String[] args){
            int [] arr ={4,8,5,3,6,9,7};
            InsertionSort(arr);
            System.out.println("Printing The Sorted Array");
            for(int i:arr){
                System.out.print(" "+i);
            }
    }
}
