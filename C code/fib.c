#include <stdio.h>
#include <stdlib.h>


int fibbo(int pos){

    // Base Case
    if(pos <= 2){
        return 1;
    }

    return fibbo(pos-1) + fibbo(pos-2);
}


int main(){

    printf("%d \n", fibbo(10));

    return 0;
}