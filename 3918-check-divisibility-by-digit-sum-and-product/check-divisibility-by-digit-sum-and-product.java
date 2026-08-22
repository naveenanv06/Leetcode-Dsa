class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int a=n;
        int prod=1;
        while(n>0){
            int temp=n%10;
            sum+=temp;
            prod*=temp;
            n/=10;
        }
        return a%(sum+prod)==0;
        
    }
}