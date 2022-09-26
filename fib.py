
def fib(n: int, memo = {}) -> int:
    """
    Returns the value of the nth fib number

    Takes O(n) time
    Takes O(n) space
    """
    # Memoization
    # Checking if n is in the memo
    if n in memo:
        return memo[n]
    # Base Case
    if n <= 2:
        return 1
    
    memo[n] = fib(n-1, memo) + fib(n-2, memo)
    return memo[n]


n = int(input('Enter the position of the fib number: '))
print(fib(n))

