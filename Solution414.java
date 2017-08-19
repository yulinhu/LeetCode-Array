/*问题：在一个数组中，找到第三大的数字。 如果没有第三大的数字则返回最大的数字。要求O（n）时间.
*/
class Solution414 {
    /*依次找出第一大、第二大、第三大的数字。输出。
    */
    public int thirdMax(int[] nums) {
        Integer max1=null;
        Integer max2=null;
        Integer max3=null;
        for(Integer n:nums){
            if(n.equals(max1)||n.equals(max2)||n.equals(max3)) continue;
            if(max1==null||n>max1){
                max3=max2;
                max2=max1;
                max1=n;
            }
            else if(max2==null||n>max2){
                max3=max2;
                max2=n;
            }
            else if(max3==null||n>max3){
                max3=n;
            }
        }
        return max3==null?max1:max3;
    }
}