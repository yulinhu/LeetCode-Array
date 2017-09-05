//问题：一个数组nums，返回一个数组，使输出数组第i位的元素为nums数组中除了第i个数以外的数的乘积。
class Solution238{
    //用整个数组的乘积除以第i个数，但要考虑0的问题。
    public int[] productExceptSelf(int[] nums) {
        int[] out=new int[nums.length];
        int sumpro=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) count++;
        }
        if(count>1) return out;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            sumpro*=nums[i];
        }
        if(count==0){
        
        for(int i=0;i<nums.length;i++){
            
                out[i]=sumpro/nums[i];
        }
        }else if(count==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0) out[i]=sumpro;
            }
        }
        return out;
        
    }
}
class Solution {
    //巧妙的方法，从左到右乘一遍，再从右往左乘一遍。
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] out=new int[nums.length];
        out[0]=1;
        for(int i=1;i<n;i++){
            out[i]=out[i-1]*nums[i-1];
        }
        int right=1;
        for(int i=n-1;i>=0;i--){
            out[i]=out[i]*right;
            right*=nums[i];
        }
        
        return out;
        
    }
}