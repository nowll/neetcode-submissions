class Solution {
    public String longestCommonPrefix(String[] strs) {
        String word = strs[0];

        for(int i = 0 ; i < word.length();i++){
                char c = word.charAt(i);
                for(int j =0;j < strs.length;j++){
                        if(i == strs[j].length() || strs[j].charAt(i) != c){
                            return word.substring(0,i);
                        }
                }
        }


        return word;
    }
}