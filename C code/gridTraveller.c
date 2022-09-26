#include <stdio.h>
#include <stdlib.h>

// Memo for memoization
int memo[1000];

int gridTraveller(int col, int row){
    
    // Base Cases
    if(col == 1 || row == 1){
        return 1; 
    }
    if(col == 0 || row == 0){
        return 0;
    }

    return gridTraveller(col-1,row) + gridTraveller(col, row-1);
}

int main(){
    printf("%d \n", gridTraveller(4,5));
    return 0;
}