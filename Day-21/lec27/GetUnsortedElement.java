public class GetUnsortedElement {
    static int Unsorted(int [ ] arr){
        int size = arr.length;
        for(int i= 0;i<size-1;i++){
            if(arr[i+1]<=arr[i]){
                return arr[i+1];
            }

        }return -1;
    }
    public static void main(String[] args){
        int [] arr = {4,5,6,7,3,9};
        System.out.println(Unsorted(arr));
    }
}
