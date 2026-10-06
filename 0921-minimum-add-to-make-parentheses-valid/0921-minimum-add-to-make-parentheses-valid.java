class Solution {
    public int minAddToMakeValid(String s) {
        int oc=0,cc=0;
        for(char c: s.toCharArray()){
            if(c=='('){
                oc++;
            }else if(c==')' && oc>0){
                oc--;
            }else{
                cc++;
            }
        }
        return Math.abs(cc+oc);
    }
}