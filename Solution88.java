//问题：两个有序数组，合并两个有序数组。（假设数组1的容量足够大，为M+N)
class Solution88{
	//本方法，先创建一个数组，一个个比较放入数组。
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] num =Arrays.copyOfRange(nums1,0,m+n);
        int i=0,j=0,a=0;
        while(i<m&&j<n){
            if(nums1[i]<=nums2[j]){
                num[a]=nums1[i];
                i++;}
            else{
                num[a]=nums2[j];
                j++;
            }
            a++;
            
        }
        while(i<m){
            num[a]=nums1[i];
            i++;
            a++;
        }
        while(j<n){
            num[a]=nums2[j];
            j++;
            a++;
        }
        for(int count=0;count<n+m;count++){
           
            nums1[count]=num[count];
        }
    }
}

method2	{
	//好一点的方法，因为数组1的容量为m+n。可以从后往前一个个放入数组，而不会覆盖数组1的数字。
	public void merge(int [] nums1,int m,int[] nums2,int n){
		int i=n-1,j=m-1,a=m+n-1;
		while(i>=0&&j>=0){
			nums1[a--]=nums1[i]>nums2[j]?nums1[i--]:nums2[j--];

			}
		while(j>=0){
			nums1[a--]=nums2[j--];
		}
		}

	}

}