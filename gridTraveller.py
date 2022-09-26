def grid_Traveller(m: int, n: int, memo = {}) -> int:
    """
    Returns the number of ways to travel from 
    the start to end point of a grid(mxn)
    """
    # Memoisation
    key = (m, n)

    # Check if key is in memo
    if key in memo:
        return memo[key]

    # Base Case
    if n == 1 and m == 1:
        return 1
    
    # Invalid Grid
    if n == 0 or m == 0:
        return 0

    memo[key] = grid_Traveller(m-1, n, memo) + grid_Traveller(m, n-1, memo)

    return memo[key]

m = int(input('Enter the no. of columns: '))
n = int(input('Enter the no. of rows: '))

print(grid_Traveller(m, n))
