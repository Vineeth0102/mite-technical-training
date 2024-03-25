/*
Implement simple calculator.

Sample input

10 + 20 - 30 * 10

Output:

0

Explanation: (No operator precedence)

10 + 20 = 30
30 - 30 = 0
0 x 10 = 0
*/

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int evaluateExpression(char *expression)
{
    int result = 0;
    int num = 0;
    char op = '+';

    for (int i = 0; expression[i] != '\0'; i++)
    {
        if (expression[i] == '+' || expression[i] == '-' || expression[i] == '*')
        {
            if (op == '+')
                result += num;
            else if (op == '-')
                result -= num;
            else if (op == '*')
                result *= num;

            op = expression[i];
            num = 0;
        }
        else if (expression[i] >= '0' && expression[i] <= '9')
        {
            num = num * 10 + (expression[i] - '0');
        }
    }

    if (op == '+')
        result += num;
    else if (op == '-')
        result -= num;
    else if (op == '*')
        result *= num;

    return result;
}

int main()
{
    char expression[100];
    printf("Enter the expression: ");
    fgets(expression, sizeof(expression), stdin);

    int result = evaluateExpression(expression);
    printf("Output: %d\n", result);

    return 0;
}
