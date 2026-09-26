class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        for(List<String> li:knowledge){
            map.put(li.get(0),li.get(1));
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                int ci=s.indexOf(')',i+1);
                String k=s.substring(i+1,ci);
                ans.append(map.getOrDefault(k,"?"));
                i=ci;
            }else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}