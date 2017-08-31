//问题：一个非负的数组，问有多少个可以组成一个三角形的3个元素的组合。
class Solution611 {
    public int triangleNumber(int[] nums) {
        //暴力方法太慢了，但是非暴力方法也快不到哪去。先排序数组，再依次固定两条短边，找长边。当第一个不符合的长边出现时停止，在这之前的长边都能组成三角形
        if(nums.length<3) return 0;
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                int k=j+1;
                while(k<nums.length&&nums[k]<nums[i]+nums[j])
                    k++;
                count+=k-j-1;
                // int lo=j+1;
                // while(lo<nums.length&&nums[lo]<nums[i]+nums[j]){
                //     count++;
                //     lo++;
                // }
                
            }
        }
        return count;
    }
}