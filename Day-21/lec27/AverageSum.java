import java.util.*;
public class AverageSum {
    static double getAverage(int[] arr){
        double size = arr.length;
        int sum= 0;
        for(int i : arr){
            sum +=i;

        }double avg=sum/size;
        return avg;
    }
    public static void main(String[] args){
        int []arr = {2,4,3,3};
        System.out.println(getAverage(arr));
    }

}
