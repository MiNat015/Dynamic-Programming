def canSum(target: int, numbers: list, memo = {}) -> bool:
    """
    Solved recursively using memoisation

    Returns True if it's possible to get the target
    by summing a combination of digits in numbers(list)
    """
    # Memoisation
    if target in memo:
        return memo[target]
    if target == 0:
        return True
    
    if target < 0:
        return False

    for num in numbers:
        remainder = target - num
        if canSum(remainder, numbers):
            memo[target] = True
            return True
    memo[target] = False
    return False

# Test Case: 1
print(canSum(300, [7, 14]))