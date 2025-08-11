class Solution:
  def resultingString(self, s: str) -> str:
    stack = []
    for ch in s:
        if stack:
            r = ord(stack[-1]) - ord(ch)
            if abs(r) == 1 or abs(r) == 25:
                stack.pop()
                continue
        stack.append(ch)
    return "".join(stack)

