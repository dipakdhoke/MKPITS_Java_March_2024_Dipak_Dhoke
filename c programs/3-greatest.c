#include <stdio.h>
#include<conio.h>


void result(int num1,int num2) {
    if (num1 >= num2) {
        printf("greatest is %d\n",num1);
    } else {
       printf("greatest is %d\n",num2);
    }
}

void main() {
    int number1,number2;

    // Input the number
    printf("Enter a number: ");
    scanf("%d%d", &number1,&number2);

    result(number1,number2);


}