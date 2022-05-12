public class lec002_RecursionTree{
    public static int coinChangePermInf(int [] coins, int tar, String asf){
        if(tar == 0){
            System.out.println(asf);
            return 1;
        }
        int count = 0;
        for(int i = 0; i<coins.length; i++){
            if(tar - coins[i] >= 0){
                count += coinChangePermInf(coins, tar-coins[i], asf + coins[i]);
            }
        }


        return count;

    }

    public static void main(String [] args){
        int [] coins = {2,3,5,7};
        int tar = 15;
        int ans = coinChangePermInf(coins, tar, "");
        System.out.println("Count is -> " + ans);
    }
}