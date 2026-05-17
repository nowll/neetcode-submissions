class Solution {
    public boolean isValid(String s) {
          Stack<Character> stk = new Stack<>();
        for(int i=0;i < s.length();i++){
            char txt = s.charAt(i);
                if(txt == ')' && !stk.empty()){  
                   if(stk.peek() == '(' ){
                       stk.pop();
                   }else{
                       return false;
                   }
                } else if(txt == '}' && !stk.empty()){  
                   if(stk.peek() == '{'){
                       stk.pop();
                   }else{
                       return false;
                    }
                } else if(txt == ']' && !stk.empty()){  
                   if(stk.peek() == '['){
                       stk.pop();
                   }else{
                       return false;
                   }
                } else{
                   stk.push(txt);
                }
        }


        return stk.empty();
    }
 }


