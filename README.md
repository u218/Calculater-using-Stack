# Calculater-using-Stack
The code only supports four basic arithmetic operations (+, -, *, /) and does not handle  other operators such as exponentiation (^) or modulo (%). It also does not handle operator  precedence or parentheses, so it may not correctly evaluate complex expression
The Calculator class is a Java program that provides a simple calculator that can evaluate 
infix expressions. An infix expression is a type of mathematical expression in which the 
operators are placed between the operands, for example 4 + 5 or (1 + 2) * 3.
The main method is the entry point of the program and takes an array of String values as 
input. The input is expected to contain a sequence of numbers and operators that make up 
an infix expression. 
The main method first declares a Stack object called Calculator and a float variable called 
total values. It then defines a loop that iterates through the values in the input array. Inside 
the loop, the code pushes the current value onto the Calculator stack and then checks if the 
value is an operator by comparing it to the string literals "/", "*", "+", and "-". If the value is 
an operator, the code pops the top two values from the stack, performs the corresponding 
operation, and pushes the result back onto the stack.
At the end of the loop, the code checks if the top value on the Calculator stack is the string 
literal "end". If it is, the loop breaks and the result is printed to the console. The code uses a 
stack to store the intermediate results of the expression evaluation. When it encounters an 
operator, it pops the top two values from the stack, performs the operation, and pushes the 
result back onto the stack. This allows the code to evaluate the expression in the correct 
order. 
The code only supports four basic arithmetic operations (+, -, *, /) and does not handle 
other operators such as exponentiation (^) or modulo (%). It also does not handle operator 
precedence or parentheses, so it may not correctly evaluate complex expression
