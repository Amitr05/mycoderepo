class Solution {
    public int maxProfit(int[] prices) {
        int[] arr=new int[10000];
        for(int i=0; i<=prices.length; i++){
            arr[i]=prices[i];
        }
        for(int i=0; i<=prices.length; i++ ) {
            if (prices[i] > prices[i + 1]) {
                int temp = prices[i];
                prices[i] = prices[i + 1];
                prices[i + 1] = temp;
            }
        }
        int a=0;
        int b=0;
        int z=prices[0];
        int l=prices[prices.length];
        for(int i=0; i<=prices.length; i++){
            if(z!=arr[i]){
                 a=a+1;
            }
        }
        for(int i=0; i<=prices.length; i++){
            if(l!=arr[i]){
                b++;
            }
        }
        if(b<a){
            return 0;
        }
        else{
            return prices[prices.length]-prices[0];
        }


    }
}