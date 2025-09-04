class Solution:
    def findClosest(self, x: int, y: int, z: int) -> int:
        i=abs(z-x)
        j=abs(z-y)
        if(i>j):
            return 2
        elif(i<j):
            return 1
        else:
            return 0