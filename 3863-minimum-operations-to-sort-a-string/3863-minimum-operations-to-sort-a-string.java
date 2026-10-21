class Solution {
    public int minOperations(String s) {
        int n=s.length();
        if(n==2){
            return s.charAt(0)>s.charAt(1)?-1:0;
        }
        char[] arr=s.toCharArray();
        char[] sorted=s.toCharArray();
        Arrays.sort(sorted);
        if(Arrays.equals(arr,sorted)) return 0;
        int l=0,r=n-1;
        while(arr[l]==sorted[l]) l++;
        while(arr[r]==sorted[r]) r--;
        if(l>0 || r<n-1) return 1;
        char min=sorted[0];
        char max=sorted[n-1];
        boolean me=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]==min){
                me=false;
                break;
            }
        }
        boolean ms=true;
        for(int i=1;i<n;i++){
            if(arr[i]==max){
                ms=false;
                break;
            }
        }
        return (me && ms )?3:2;
    }
}