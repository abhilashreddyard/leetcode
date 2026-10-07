class Solution {
    public int reverse(int x) {
        long rev=0,r,n,i;
        n=x;
        if(n<0){
            n=-n;
        }
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)-rev;
        }
        else{
            return (int)rev;
        }
    }
}