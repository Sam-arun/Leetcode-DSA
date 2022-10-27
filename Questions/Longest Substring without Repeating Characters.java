class Solution {
    public int lengthOfLongestSubstring(String s) {
   
        int len = s.length();
        int i=0;
        int j=0;
        HashMap<Character, Integer> hm = new HashMap();
        int count =0;
        int countmax =0;
        
        while(i<len){

        while(hm.get(s.charAt(i))!=null){
        hm.remove(s.charAt(j));
        j++;
        }
            
            hm.put(s.charAt(i),i);
         count = i - j + 1;
                i++;
             countmax = Math.max(count,countmax);
            }
            return countmax;
        }
    }
