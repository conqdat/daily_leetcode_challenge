class Solution {
    
    public static int roundToMultiple(int n) {
        while(n % 10 != 0) {
            if(n % 10 >=5) {
                n ++;
            } else {
                n--;
            }
        }
        return n;
    } 

    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        return Math.abs( 100 - roundToMultiple(purchaseAmount) );
    }


    public static void main(String[] args) {
        System.out.println( roundToMultiple(11) );
    }
}