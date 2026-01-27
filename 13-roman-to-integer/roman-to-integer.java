class Solution {
    public int romanToInt(String s) {
         HashMap<String,Integer> map = new LinkedHashMap<>();
        int sum=0;
        map.put("M", 1000);
map.put("CM", 900);
map.put("D", 500);
map.put("CD", 400);
map.put("C", 100);
map.put("XC", 90);
map.put("L", 50);
map.put("XL", 40);
map.put("X", 10);
map.put("IX", 9);
map.put("V", 5);
map.put("IV", 4);
map.put("I", 1);
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && map.get(String.valueOf(s.charAt(i)))< map.get(String.valueOf(s.charAt(i+1)))){
                sum+=map.get(s.substring(i,i+2));
                i++;
                continue;
            }
            sum+=map.get(String.valueOf(s.charAt(i)));
        }
        return sum;
        
    }
}