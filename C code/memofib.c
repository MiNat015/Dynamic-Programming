#include <stdio.h>
#include <stdlib.h>


// Memo object
int memo[1000];

int fib(int n){

    // Base Case
    if (n < 2){
        return n;
    }

    if(memo[n] != 0){
        return memo[n];
    }

    else{
        memo[n] = fib(n-1) + fib(n-2);
        return memo[n];
    }
    
}


int main(){
    printf("%d \n", fib(45));
    return 0;
}
