class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                Set<Integer> set=new HashSet<>(nums.subList(i,j+1));
                ans+=(set.size()*set.size());
            }
        }
        return ans;
    }
}