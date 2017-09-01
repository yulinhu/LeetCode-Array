//问题：进击的提莫。一个升序数组，里面的数代表提莫攻击的时间，给一个整数k，代表攻击后毒的时间。问 一共毒了多少时间。
class Solution495{
	//很简单，找到是毒先结束还是下次攻击先开始，加最后一击的k秒。
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries==null||timeSeries.length==0) return 0;
        int count=0;
        for(int i=0;i<timeSeries.length-1;i++){
            count+=Math.min(duration,timeSeries[i+1]-timeSeries[i]);
        }
        count+=duration;
         return count;
    }
   
}