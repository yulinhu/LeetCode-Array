//问题：一个长度为n+1的数组，存着值为1-n的数，其中有一个是重复的，找出来。（要求不能改变数组，不能格外增加空间）
class Solution287 {
    //题目要求O(n2)就行，然后就用暴力方法了，然后也通过了。
    public int findDuplicate(int[] nums) {
        int dup=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) {
                    dup=nums[i];
                    break;
                }
            }
        }
        return dup;
    }
}
class Solution {
    //还有一个方法，时间复杂度为O(N)，设置两个指针。一个移动的快（一次两步），一个移动的慢（一次一步）,因为所有数字都一定是一个索引，所以重复的数字导致形成一个环
    //这个重复的数字就是环的入口。设到入口为m步，环长度为c，慢指针和快指针相遇时在环中走了n步，则有（m+n）*2=m+n+c  求得m=c-n,即指针再走k步到环入口，这时
    //重置slow，让其从0开始走，则正好在入口相等，即为所求。
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[nums[0]];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        slow=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}