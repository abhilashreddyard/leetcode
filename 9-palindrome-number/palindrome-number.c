bool isPalindrome(int x) {
    long long r,m,rev=0;
    if(x<0) return false;
    else{
        m=x;
        while(m>0){
            r=m%10;
            rev=rev*10+r;
            m=m/10;
        }
        if(x==rev) return true;
        else return false;
    }
}