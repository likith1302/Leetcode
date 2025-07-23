class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        def check_power(z):
            if 3 ** z == n:
                return True
            if 3 ** z > n:
                return False
            return check_power(z + 1)
        
        return check_power(0)