package Practical_13;
import  java.util.*;
public class Calculator {

        public static void main (String[] args) {
            //((4+5)-(1*2)/5)
            // this is given is question we need to apply different mathematical approcahes using stacks
            String[] values = {"4", "5", "+", "1", "2", "*", "-", "5", "/", "end"};
            // the overall values of the above all mathematical operation will store in this
            float total_values = 0;
            // here we initilise our stack
            Stack<String> Calculator = new Stack<>();
            int i = 0;
            //boolean b = Calculator.empty();
            //using loop to treverse our stack to check values
            while (true) {

                // first of all it will push the top value and print it
                Calculator.push(values[i]);
                System.out.print("the top is : ");
                System.out.println(values[i]);
                i++;
                // after the values is being pushed if the next variable matched to the mathematical operation it will
                // then use that operation to do that operation
                if (Calculator.peek() == "/") {
                    Calculator.pop();
                    int num1 = Integer.parseInt((String) Calculator.pop());

                    int num2 = Integer.parseInt((String) Calculator.pop());

                    total_values = (float) num2 / num1;
                    System.out.print("the top is : ");
                    System.out.println(total_values);
                    Calculator.push("" + total_values);


                }


                if (Calculator.peek() == "*") {
                    Calculator.pop();
                    int num1 = Integer.parseInt((String) Calculator.pop());

                    int num2 = Integer.parseInt((String) Calculator.pop());
                    int multiply = num1 * num2;
                    System.out.print("the top is : ");
                    System.out.println(multiply);
                    Calculator.push("" + multiply);


                }

                if (Calculator.peek() == "+") {
                    Calculator.pop();
                    int num1 = Integer.parseInt((String) Calculator.pop());

                    int num2 = Integer.parseInt((String) Calculator.pop());
                    int sum = num1 + num2;
                    System.out.print("the top is : ");
                    System.out.println(sum);
                    Calculator.push("" + sum);
                }

                if (Calculator.peek() == "-") {
                    Calculator.pop();
                    int num1 = Integer.parseInt((String) Calculator.pop());

                    int num2 = Integer.parseInt((String) Calculator.pop());
                    int substract = num2 - num1;
                    System.out.print("the top is : ");
                    System.out.println(substract);
                    Calculator.push("" + substract);

                }


                // here it is kind of condition for stack to stop if it reach at the end of it
                if (Calculator.peek() == "end") {
                    break;
                }

            }
            // after all the operation have been completed it will print this value

                System.out.println("The final answer for the expression ((4+5)-(1*2)/5) is " + total_values);
            
        }
        }



