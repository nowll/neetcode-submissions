class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        char[] strChar1 = s.toCharArray();
        char[] strChar2 = t.toCharArray();
        for(int i=0;i < strChar1.length;i++){
            if(hm.getOrDefault(strChar1[i],0)!= 0){
               hm.put(strChar1[i],hm.get(strChar1[i]) + 1); 
            }else {
                hm.put(strChar1[i],1);
            }

            if(hm2.getOrDefault(strChar2[i],0)!= 0){
               hm2.put(strChar2[i],hm2.get(strChar2[i]) + 1); 
            }else{
                hm2.put(strChar2[i],1);
            }

        }

        return hm.equals(hm2);



    }
}
