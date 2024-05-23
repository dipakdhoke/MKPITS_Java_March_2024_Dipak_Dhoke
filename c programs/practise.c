#include <stdio.h>
#include <stdbool.h>

int main() {
    int array[100], size, i;
    bool isPalindrome = false ;
;

    // Input elements of the array
    printf("Enter %d elements of the array:\n", size);
    for (i = 0; i < 6; i++) {
        scanf("%d", &array[i]);
    }

    // Check if the array is a palindrome
    for (i = 0; i < 6 / 2; i++) {
        if (array[i] == array[6 - i - 1]) {
            isPalindrome = true;
            break;
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
