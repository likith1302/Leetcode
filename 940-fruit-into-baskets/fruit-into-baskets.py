class Solution:
   def totalFruit(self, fruits: List[int]) -> int:
     basket = {}  
     left = 0
     max_fruits = 0

     for right in range(len(fruits)):
        fruit = fruits[right]
        if fruit in basket:
            basket[fruit] += 1
        else:
            basket[fruit] = 1
        while len(basket) > 2:
            left_fruit = fruits[left]
            basket[left_fruit] -= 1
            if basket[left_fruit] == 0:
                del basket[left_fruit]
            left += 1

        max_fruits = max(max_fruits, right - left + 1)

     return max_fruits




        