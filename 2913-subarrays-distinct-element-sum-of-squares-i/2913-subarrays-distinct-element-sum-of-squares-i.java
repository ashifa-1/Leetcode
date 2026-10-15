class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int ans=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            boolean v[]=new boolean[101];
            for(int j=i;j<n;j++){
                int num=nums.get(j);
                if(!v[num]){
                    v[num]=true;
                    cnt++;
                }
                ans+=cnt*cnt;
            }
        }
        return ans;
    }
}