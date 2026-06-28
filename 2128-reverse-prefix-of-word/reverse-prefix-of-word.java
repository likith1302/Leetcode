class Solution {
    public String reversePrefix(String word, char ch) {
        int r=word.indexOf(ch);
        int l=0;
        char[] arr = word.toCharArray();
        while(l<r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l+=1;
            r-=1;
        }
        String swapped = new String(arr);
        return swapped;
    }
}