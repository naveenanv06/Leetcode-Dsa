class Solution {
    public boolean checkDivisibility(int n) {
        int sum=n%10;
        int a=n;
        int prod=n%10;
        n/=10;
        while(n>0){
            int temp=n%10;
            sum+=temp;
            prod*=temp;
            n/=10;
        }
        return a%(sum+prod)==0;
        
    }
}