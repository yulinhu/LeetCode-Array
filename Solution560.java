//问题：一个数组，一个数k。返回元素和为k的子数组的个数。
class Solution560 {
    //依次以i为子数组头部，找子数组。
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int j=i;
                while(j<nums.length){
                    sum=sum+nums[j];
                    if(sum==k) count++;
                     j++;
                } 
            }
        return count;
    }
    //还可以用map来计算，这样用的时间更少。
    public int sub(int [] nums,int k){
        int count=0;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        map.put(0,1);
        for(int i=0,i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k));
            count+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
