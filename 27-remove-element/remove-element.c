int removeElement(int* nums, int numsSize, int val) {
    int i,j,k=0;
    for(i=0;i<numsSize;i++){
        if(nums[i]==val){
            j=i;
            while(j<numsSize-1){
            nums[j]=nums[j+1];
            j++;
            }
            numsSize--;
            i--;
        }
    }
    return numsSize;
}