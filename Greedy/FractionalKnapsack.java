
import java.util.Arrays;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int items[][] = {{60,10},{100,20},{120,30}};
        int weight = 50;
        int ans = maximumUnits(items,weight);
        System.out.println(ans);
    }
    public static int maximumUnits(int[][] arr, int t) {
        Arrays.sort(arr, (a, b) -> b[1] - a[1]);
        int ans=0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i][0]>t){
                ans+=(arr[i][1]*t);
                break;
            }else{
                ans+=(arr[i][1]*arr[i][0]);
                t-=arr[i][0];
            }
        }
        return ans;
    }
}
