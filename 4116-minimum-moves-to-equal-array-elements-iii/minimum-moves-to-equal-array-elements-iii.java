class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int l=0,i,max=nums[0];
        for(i=1;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(i=0;i<n;i++){
            l=l+(max-nums[i]);
        }
        return l;
    }
}