//问题：一个长度为N的数组，里面有0-n-1这些数，假设有一个链，每一个节点的元素值代表下一个节点的索引，即K[I]->K[K[I]]，节点不能重复，问最长的链路多长。
class Solution565 {
    public int arrayNesting(int[] nums) {
        //暴力方法过不了。因为链路里的每一个节点对应的链路相同，所以计算过的节点可以去掉，所以没计算一个节点，把这个元素去掉，降低复杂度。
        int lon=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
            int start=nums[i];
            int count=0;
            
                while(nums[start]>=0){
                    int temp=start;
                    start=nums[start];
                    nums[temp]=-1;
                    count++;
                }
            
            lon=Math.max(lon,count);
            }
        }
            
        
        return lon;
    }
}