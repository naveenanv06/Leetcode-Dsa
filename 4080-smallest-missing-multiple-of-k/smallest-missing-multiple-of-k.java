import java.util.*;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        List<Integer> l=new LinkedList<>();
        for(int i:nums) l.add(i);
        for(int i=1;i<=nums.length+1;i++){
            if(!l.contains(k*i)) return k*i;
        }
        return 0;

    }
}