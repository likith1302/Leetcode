class Solution {
    public String intToRoman(int num) {
        Map<String, Integer> map = new LinkedHashMap<>();
        String r="";
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

        for (Map.Entry<String, Integer> v : map.entrySet()) {
            int c=num/v.getValue();
            if(c==0){
                continue;
            }
            else{
                while(c!=0){
                    r+=v.getKey();
                    num-=v.getValue();
                    c--;
                }
            }
        }

        return r;
    }
}