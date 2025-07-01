import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String args[]){
        int pairs[][] = {{1,2},{2,3},{3,4}};
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int end = pairs[0][1];
        int c = 1;
        for(int i = 1;i<pairs.length;i++){
            if(pairs[i][0]>end){
                c++;
                end = pairs[i][1];
            }
        }
        System.out.println(c);
    }
}
