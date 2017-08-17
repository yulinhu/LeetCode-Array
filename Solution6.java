//问题：给定一个数组，一个数字k；找出数组中差为k的两两数字组合，输出组合的数目。
//首先想到把数组放入set中去掉重复的数字。然后遍历数组，找到set中是否有和nums[i]相差k的元素，输入到map中（去重）。 最后输出map的大小就是有多少对。
//但是没有想到k=0时的解决办法，所以单独列出来了。
public class Solution {
    public int findPairs(int[] nums, int k) {
         Arrays.sort(nums);
        if(k<0) return 0;
        else if(k==0){
            
            Set<Integer> set= new HashSet<Integer>();
            for(int i=0;i<nums.length-1;i++){
                if(nums[i+1]==nums[i])
                    set.add(nums[i]);
                     
            }
            return set.size();
        }
        else{
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        Set<Integer> set= new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]+k))
               map.put(nums[i],nums[i]+k);
        }
        return map.size();
        }
        
    }
}