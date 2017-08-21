/*问题：在一个长度为n的数组，存了0-n的数，找出没有出现的一个数*/
public class Solution268{
	//只找一个数，用异或。把i和nums[i]异或一遍，剩下n和少的数，再异或n。得到数字。
	public int missingNumber(int[] nums){
		int tor=0,i=0;
		for(i=0;i<nums.length;i++){
			tor=tor^i^nums;
		}
		return tor^i;

	}
}