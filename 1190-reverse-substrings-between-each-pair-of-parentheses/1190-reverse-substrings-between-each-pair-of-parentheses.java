class Solution {
    public String reverseParentheses(String s) {
        Deque<Character> st=new ArrayDeque<>();
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<s.length()){
            char c=s.charAt(i++);
            if(c!=')'){
                st.push(c);
            }else{
                while(st.peek()!='('){
                    sb.append(st.pop());
                }
                st.pop();
                for(char ch:sb.toString().toCharArray()){
                    st.push(ch);
                }
                sb.setLength(0);
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty() && st.peek()!='('){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}