
import java.util.Arrays;
import java.util.Comparator;

public class Job_Sequencing {
    public static void main(String[] args) {
        int deadline[] = {4, 1, 1, 1};
        int profit[] = {20, 10, 40, 30};
        int time = 0;
        int comb[][] = new int[deadline.length][2];
        for(int i = 0;i<deadline.length;i++){
            comb[i][0] = deadline[i];
            comb[i][1] = profit[i];
        }
        Arrays.sort(comb,Comparator.comparingDouble(o->o[1]));
        int res = 0;
        for(int i = deadline.length-1;i>0;i--){
            if(time<comb[i][0]){
                res = res+comb[i][1];
                time++;
            }
        }
        System.out.println(res);
    }
}
