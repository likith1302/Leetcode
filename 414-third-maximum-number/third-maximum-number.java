class Solution {
    public int thirdMax(int[] nums) {
        Long m1=null;
        Long m2=null;
        Long m3=null;
        for(int n : nums){
            long num = n;
            if((m1!=null && num==m1)||(m2!=null && num==m2)||(m3!=null && num==m3)){
                continue;
            }
            if(m1==null || m1<=num){
                m3=m2;
                m2=m1;
                m1=num;
            }
            else if(m2==null || m2<=num){
                m3=m2;
                m2=num;
            }
            else if(m3==null || m3<=num){
                m3=num;
            }
        }
        return (m3 == null) ? m1.intValue(): m3.intValue();

    }
}