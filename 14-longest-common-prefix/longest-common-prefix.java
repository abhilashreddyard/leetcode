class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int count=0;
        int m=strs.length;
        int i,j;
        j=0;
        int k=strs[0].length();
        int l=strs[m-1].length();
        while(j<k&&j<l){
        if(strs[0].charAt(j)==(strs[m-1].charAt(j))){
            count++;
            j++;
        }
        else{
            break;
        }
        }
        return strs[0].substring(0,count);
    }
}