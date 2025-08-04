class Solution:
    def secondHighest(self, s: str) -> int:
        m = -1
        m2 = -1
        for ch in s:
            if ch.isdigit():
                num = int(ch)
                if num > m:
                    m2 = m
                    m = num
                elif m2 < num < m:
                    m2 = num
        return m2 if m2 != -1 else -1
        