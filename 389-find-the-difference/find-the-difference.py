class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        t=list(t)
        for ch in s:
            if ch in t:
                t.remove(ch)
        return ''.join(t)

        