//问题：一个有序的数组，没有重复元素，用简略表达数组。例：{1，2，4，5，6，9}  表示为：{“1->2","4->6""9"}
class Solution 228{
    //一个判定连续的方法，两种方法都可以(基本相同)。
     public List<String> summaryRanges(int[] nums) {
    List<String> list=new ArrayList();
	if(nums.length==1) { list.add(nums[0]+"");
                        return list;}
         for(int i=0;i<nums.length;i++){
             int a=nums[i];
             while(i<nums.length-1&&nums[i+1]-nums[i]==1){
                 i++;
             }
             if(a==nums[i]) list.add(a+"");
             else list.add(a+""+"->"+nums[i]+"");
         }
     
    return list;
}


    public List<String> summaryRanges(int[] nums) {
        List<String> str = new ArrayList<String>();
        if(nums.length<1) return str;
        List<Integer> in = new ArrayList<Integer>();
        int start=nums[0];
        int end=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]==1) end=nums[i];
            else{
                in.add(start);
                in.add(end);
                start=nums[i];
                end=nums[i];
               
            }
        }
        in.add(start);
        in.add(end);
        
        for(int i=0;i<in.size();i=i+2){
            if(in.get(i+1).equals(in.get(i))) str.add(String.valueOf(in.get(i)));
            else{
                str.add(String.valueOf(in.get(i))+"->"+String.valueOf(in.get(i+1)));
            }
        }
        return str;
    }
}