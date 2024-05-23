#include <stdio.h>
#include <stdbool.h>

int main() {
    int array[100], size, i;
    bool isPalindrome = false;

    // Input the size of the array
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    // Input elements of the array
    printf("Enter %d elements of the array:\n", size);
    for (i = 0; i < size; i++) {
        scanf("%d", &array[i]);
    }

    // Check if the array is a palindrome
    for (i = 0; i < size; i++) {
    	printf("1st side :%d,2nd side%d\n",array[i],array[size -i -1]);
        if (array[i]  == array[size - i -1]) {
            isPalindrome = true;
            
        }
    }

    // Print the result
    if (isPalindrome) {
        printf("The array is a palindrome.\n");
    } else {
        printf("The array is not a palindrome.\n");
    }

    return 0;
}
