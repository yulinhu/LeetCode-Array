//prices为每天的价格，进行买卖操作，问最大利益是多少,必须买后才能卖出。
class Solution122 {
	//开始想的是把所有的低价买入再在后面找最高价卖出，后来发现想多了。复杂度太高。只要在后一天高价的时候卖出，就能抵消掉之前非最高价卖出赚的钱。
    public int maxProfit(int[] prices) {
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                max=max+prices[i]-prices[i-1];
            }
        }
        return max;
        
    }
}