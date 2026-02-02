class Solution {
    public int pre(char ch){
        if(ch=='+'||ch=='-'){
            return 1;
        }
        else if(ch=='*'||ch=='/'){
            return 2;
        }
        else{
            return 0;
        }
    }
     public int ort(char ch,int n1,int n2){
        if(ch=='+'){
            return n1+n2;
        }
        else if(ch=='-'){
            return n1-n2;
        }
        else if(ch=='*'){
            return n1*n2;
        }
        else if(ch=='/')
            return n1/n2;
        return 0;
    }
    public int calculate(String s) {
        s=s.replace(" ", "");
        Stack<Integer> num=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') op.push(ch);
            else if(Character.isDigit(ch)){
                 int val = 0;
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    val = val*10 + (s.charAt(i)-'0');
                    i++;
                }
                num.push(val);
                i--; 
            }
            else if(ch=='-' && (i==0 || s.charAt(i-1)=='(')){
    num.push(0);
    op.push('-');
}
            else if(ch==')'){
                while(op.peek()!='('){
                char opr=op.pop();
                int n2=num.pop();
                int n1=num.pop();
                int res=ort(opr,n1,n2);
                num.push(res);
                }
                op.pop();
            }
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                while(op.size()>0 && op.peek()!='(' && pre(ch)<=pre(op.peek())){
                char opr=op.pop();
                int n2=num.pop();
                int n1=num.pop();
                int res=ort(opr,n1,n2);
                num.push(res);
                }
                op.push(ch);
            }

        }
         while(!op.isEmpty()){
            char opr = op.pop();
            int n2 = num.pop();
            int n1 = num.pop();
            num.push(ort(opr,n1,n2));
        }
        return num.peek();
    }
}