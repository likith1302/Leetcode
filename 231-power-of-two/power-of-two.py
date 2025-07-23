class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        def check_power(z):
            if 2 ** z == n:
                return True
            if 2 ** z > n:
                return False
            return check_power(z + 1)
        
        return check_power(0)
        