class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int tc=0;
        int ltc=0;
        for(int n:nums){
            if(n==target) tc++;
            if(n<target) ltc++;
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<tc;i++){
            ans.add(ltc+i);
        }        
        return ans;
    }
}