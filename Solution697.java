//问题：一个数组的最多重复出现的数字 出现的次数叫做数组的degree，找出和这个数组degree一样大的子数组。返回最短的子数组。
class Solution 697{
    //用双指针法，用map count 来记录每个数字出现了几次。找到最大的degree
    //然后通过两个map left 和right 从两个方向找到这个数字的左右两个元素，算出距离
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> left=new HashMap(),right=new HashMap(),count=new HashMap();
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(left.get(x)==null) left.put(x,i);
            right.put(x,i);
            count.put(x, count.getOrDefault(x,0)+1);
        }
        int ans=nums.length;
        int degree = Collections.max(count.values());
        for(int n:count.keySet()){
            if(count.get(n)==degree){
                ans=Math.min(ans,right.get(n)-left.get(n)+1);
            }
            
        }
        return ans;
    }
}