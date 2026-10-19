class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        if(nums[0]==target) ans.add(0);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==target){
                ans.add(i);
            }
            if(nums[i]!=target && nums[i-1]==target){
                break;
            }
        }
        return ans;
    }
}