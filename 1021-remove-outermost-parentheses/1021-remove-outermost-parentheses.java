class Solution {
    public String removeOuterParentheses(String s) {
       int cnt=0;
       StringBuilder sb=new StringBuilder();
       for(char ch:s.toCharArray()){
        if(ch=='('){
            cnt+=1;
            if(cnt>1){
                sb.append(ch);
            }
        }else{
            if(cnt>1){
                sb.append(ch);
            }
            cnt--;
        }
       } 
       return sb.toString();
    }
}