//问题：买卖股票问题，找出单次交易可以获得最多收益的收益数。
class Solution121 {
	//暴力解法不过关。时刻标记最小价格，再找和之前最小价格最大差价。
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length<2) return 0;
        int max1=0;
        int min1=prices[0];
        for(int i=1;i<prices.length;i++){
            min1=Math.min(min1,prices[i]);
            max1=Math.max(max1,prices[i]-min1);
            
        }
        if(max1<=0) return 0;
        return max1;
    }
    
}