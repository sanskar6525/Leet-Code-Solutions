#include<stdio.h>

int countOdds(int low, int high){
    int i=low;
    if(low%2==0)
        low++;
    if(high%2==0)
        high--;
    return ((high-low)/2)+1;
}

