class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        int[] rotate = new int[n];
        for(int i=0;i<n;i++){
             rotate[(i+k)%n] = nums[i];
        }
        System.arraycopy(rotate,0,nums,0,n);
    }
}