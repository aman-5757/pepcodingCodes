class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '(' || ch == '[' || ch == '{'){
                //open bracket
                st.push(ch);
            }
            else{
                //close bracket
                if(st.size() == 0)
                    return false;
                else if(ch == ')' && st.peek() != '(')
                    return false;
                else if(ch == ']' &&  st.peek() != '[')
                    return false;
                else if(ch == '}' && st.peek() != '{')
                    return false;
                else{
                    st.pop();
                }
            }
        }
        
        return (st.size() == 0) ;
        
    }
}