class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        match = {')': '(', ']': '[', '}': '{'}

        for char in s:
            if char in match:
                if not stack or stack[-1] != match[char]:
                    return False
                stack.pop()
            else:
                stack.append(char)

        return not stack