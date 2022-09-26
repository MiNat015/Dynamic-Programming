def howSum(target: int, numbers: list, memo = {}) -> list:
   
    # Memoisation
    if target in memo:
       return memo[target]
   
    # Base Cases
    if target == 0:
        return []
    
    if target < 0:
        return None

    for num in numbers:
        remainder = target - num
        remainder_result = howSum(remainder, numbers, memo)
        
        if remainder_result != None:
            memo[target] = [num] + remainder_result
            return memo[target]
    
    memo[target] = None 
    return None
    




# Test Cases
print(howSum(7, [2,3])) # Test Case: 1
print(howSum(7, [5, 3, 4, 7])) # Test Case: 2
print(howSum(300, [7, 14])) # Test Case: 3 