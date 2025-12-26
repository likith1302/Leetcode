class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        count=0
        for i in word:
            if(65<=ord(i)<=90):
                count+=1
        if ((65<=ord(word[0])<=90) and count==1):
            return True
        elif(count==0 or count==len(word)):
            return True
        else:
            return False


        