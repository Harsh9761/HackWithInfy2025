public class MinCoins {
    public static void main(String[] args) {
        int amount = 93;
        int coins[] = {1,2,5,10,20,50,100};
        int res = 0;
        int n = coins.length;
        while(amount>0){
            if(coins[n-1]<=amount){
                res++;
                amount = amount-coins[n-1];
            }
            else{
                n--;
            }
        }
        System.out.println(res);
    }
}
