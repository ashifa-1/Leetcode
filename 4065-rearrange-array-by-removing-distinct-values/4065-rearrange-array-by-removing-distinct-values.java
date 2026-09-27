class Solution {
    public int[] rearrangeArray(int[] nums) {
        int freq[]=new int[101];
        for(int n:nums){
            freq[n]++;
        }
        int ans[]=new int[nums.length];
        int i=0;
        while(i<nums.length){
            for(int val=1;val<101;val++){
                if(freq[val]>0){
                    ans[i++]=val;
                    freq[val]--;
                }
            }
        }
        return ans;
    }
}