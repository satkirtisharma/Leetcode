class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[]ele=new int[2*n];
        int d=0;
        for(int i=0;i<n;i++){
            ele[d++]=nums[i];
            ele[d++]=nums[n+i];
        }
        return ele;
    }
}
