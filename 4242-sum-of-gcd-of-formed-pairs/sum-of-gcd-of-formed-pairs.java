import java.util.*;
class Solution {
    private static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b); 
    }
    public long gcdSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            max = Math.max(max, nums[i]);
            l.add(gcd(nums[i], max));

        }
        Collections.sort(l);
        int i=0;
        int j=l.size()-1;
        long sum=0;
        
        while(i<j){
            sum+=gcd(l.get(i),l.get(j));
            i++;
            j--;
            
        }
        return sum;
    }
}