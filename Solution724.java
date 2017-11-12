//问题：我们定义一个索引为pivot，这个索引的特点是这个索引左边的数组之和与右边索引之和相等。返回最左边的索引
class Solution724{
    //两个计数，一个记左边和，一个记右边和。需要注意的是pivot既不在左边也不在右边。
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int ans=0,lsum=0,rsum=sum;
       for(int i=0;i<nums.length;i++){
           rsum-=nums[i];
            if(lsum==rsum) {
                return i;
            }
           lsum+=nums[i];
        }
        return -1;
    }
}