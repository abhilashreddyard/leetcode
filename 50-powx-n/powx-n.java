class Solution {
    public double myPow(double x, int n) {
        long m=n;
        if(m<0){
            m=-m;
        }
        double p=1.0;
        double ans=x;
        while(m>0){
            if(m%2==1){
                p*=ans;
            }
            ans*=ans;
            m=m/2;
        }
        return n>0?p:1.0/p;
    }
}