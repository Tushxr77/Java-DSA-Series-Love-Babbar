public class ReturnSum {
    static int Return(int [] arr){
        int size = arr.length;
        int pos =0;
        int neg = 0;
        int sum =0;
        for(int i = 0;i<size;i++){
            if(arr[i]>=0){
                pos = pos+arr[i];
            }else{
                neg += arr[i];
            }
        }sum = pos+neg;
        return sum;
    }public static void main(String[] args){
        int [] arr ={7,9,-6,-9,8,-3,9,-4};
        System.out.println(Return(arr));
    }
}
