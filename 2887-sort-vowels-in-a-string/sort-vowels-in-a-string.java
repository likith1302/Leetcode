class Solution {
    public String sortVowels(String s) {
        int n=s.length();
        HashSet<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        StringBuilder res=new StringBuilder(s);
        StringBuilder ovl=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(set.contains(ch))ovl.append(ch);
        }
        char[] chars=ovl.toString().toCharArray();
         Arrays.sort(chars);
         int k=0;
         for(int i=0;i<n;i++){
            if(set.contains(s.charAt(i))){
               res.setCharAt(i,chars[k++]);
            }
         }
         return res.toString();
        }
        
    }
