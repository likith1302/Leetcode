class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int c=0;
        int sum=0;
        String r="";
        StringBuilder sb=new StringBuilder();
        while(i>=0||j>=0||c>0){
            int n1=(i>=0)? num1.charAt(i)-'0':0;
            int n2=(j>=0)? num2.charAt(j)-'0':0;
            sum=n1+n2+c;
            c=sum/10;
            sum%=10;
            sb.append(sum);
            i--;
            j--;
      }
      if(c!=0){
        sb.append(c);
      }
      return sb.reverse().toString();

    }
}