import java.util.*;
public class waveMatrix {

    static int[] Wave(int[][] nums){
        int n=nums.length;
        int m=nums[0].length;
        int ans[]=new int[m*n];
        int k=0;
        for(int j=0;j<m;j++){

            if(j%2==0){
                for(int i=0;i<n;i++){
                    int value = nums[i][j];
                    ans[k]=value;
                    k++;
                }
            }else{
                for(int i=n-1;i>=0;i--){
                    int value = nums[i][j];
                    ans[k]=value;
                    k++;
                }
            }
        }return ans;
    }
    public static void main(String[] args){
        int [][] ans = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
            int [] ans1 = Wave(ans);
            System.out.println(Arrays.toString(ans1));
    }
}
