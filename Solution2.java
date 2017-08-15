public class Solution2{
	public boolean canPlaceFlowers(int[] flowerbed,int n){
	int i=0,count =0;
	while(i<flowerbed.length){
		if(flowerbed[i]==0&&(flowerbed[i-1]==0||i==0)&&flowerbed[i+1]==0||i=flowerbed.length-1)	//使得0的两侧没有1
		{
			flowerbed[i]=1;
			count++;
		}
		i++;
		if(count>=n) return true;//当能种的花大于n时  返回true；
	}
	return false;
	}
}


// 种花问题
// 描述：一个数组表示一块地种花，1表示这个位置有花，0表示这个地方没有花。求一个数组能不能再种下n朵花。要求：两朵花不能相邻。
// 例：[1,0,0,0,1]  n=1  return true;     n=2  return false;
