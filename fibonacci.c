#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define true 1
#define false 0

int sqrtPerfect(double x){
	
	int raiz = (int) sqrt(x);
	printf("Rais = %d and X = %f\n\n", raiz, x);	

	if(raiz * raiz == x) 
		return true;
	return false;
}

int isFibonacci(int num){
	double binet_1 = 5*num*num - 4;
	double binet_2 = 5*num*num + 4;
	
	printf("N = %d B1 = %f and B2 = %f\n\n", num, binet_1, binet_2);

	if(sqrtPerfect(binet_1) || sqrtPerfect(binet_2)){
		printf("This is fibonacci number");
	}
	else{
		printf("This not is fibonacci number");
	}
}

void main(int argc, char* argv[]){
	isFibonacci(atoi(argv[1]));
}
