//找到一个数组的所有数字组成的子数组，不能由重复的数组
public class Solution78 {
    //两个循环，大循环即每次加一个数字，小循环是把各个原来的子数组加一个数字形成新的数组，注意，没进去一个数组都是新的元素，不能用引用进行添加。
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        return res;
        Arrays.sort(nums);
        for(int i:nums){
            List<List<Integer>> tem=new ArrayList<>();
            for(List<Integer> list:res){
                List<Integer> an=new ArrayList<>(list);
                an.add(i);
                tem.add(an);
            }
            res.addAll(tem);
        }
        return res;
    }
}