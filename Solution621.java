//问题：用A-Z代表不同的任务，每个任务需要的时间是1，两个相同的任务之间间隔要至少为n，可以有休息时间。 问一个数组的时间
class Solution621{
    //这个问题最重要的是把A-Z转化为数字，这里把同样的字母个数放入一个数组中。这样可以代表不同的任务。 然后每次运行一个任务，字母个数减1，时间加1.
    //若一次循环不超过n，则加入休息，只用time+1就行。
    
    public int leastInterval(char[] tasks, int n) {
       int[] map = new int[26];
        int time=0;
        for(int c:tasks){
            map[c-'A']++;
        }
        
        Arrays.sort(map);
        while(map[25]>0){
            for(int i=0;i<=n;i++){
                if(map[25]==0) break;
                if(i<26&&map[25-i]>0){
                    map[25-i]--;
                }
                time++;
            }
            Arrays.sort(map);
        }
        return time;
        
    }
}