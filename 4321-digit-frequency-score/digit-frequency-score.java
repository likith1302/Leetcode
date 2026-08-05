class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        while(n!=0){
            int rem=n%10;
            freq.put(rem,freq.getOrDefault(rem,0)+1);
            n=n/10;
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            int count=entry.getKey()*entry.getValue();
            sum+=count;
        }
        return sum;
        
    }
}