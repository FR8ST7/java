package data_structures;
import java.util.*;
public class Infix_to_prifix {
	    public static void main(String args[]) {
	        String infix = "(A-B/C)*(A/K-L)";
	        Stack<Character> operators = new Stack<Character>();
	        Stack<String> operands = new Stack<String>();

	        for (int i = 0; i < infix.length(); i++) {
	            char c = infix.charAt(i);

	            if (c == '(') {
	                operators.push(c);
	            } else if (c == ')') {
	                while (!operators.empty() && operators.peek() != '(') {
	                    String op1 = operands.peek();
	                    operands.pop();
	                    String op2 = operands.peek();
	                    operands.pop();
	                    char op = operators.peek();
	                    operators.pop();
	                    String tmp = op + op2 + op1;
	                    operands.push(tmp);
	                }
	                operators.pop();
	            } else if (!(c >= 'a' && c <= 'z') && !(c >= '0' && c <= '9') && !(c >= 'A' && c <= 'Z')) {
	                while (!operators.empty() && getPriority(c) <= getPriority(operators.peek())) {
	                    String op1 = operands.peek();
	                    operands.pop();
	                    String op2 = operands.peek();
	                    operands.pop();
	                    char op = operators.peek();
	                    operators.pop();
	                    String tmp = op + op2 + op1;
	                    operands.push(tmp);
	                }
	                operators.push(c);
	            } else {
	                operands.push(c + "");
	            }
	        }

	        while (!operators.empty()) {
	            String op1 = operands.peek();
	            operands.pop();
	            String op2 = operands.peek();
	            operands.pop();
	            char op = operators.peek();
	            operators.pop();
	            String tmp = op + op2 + op1;
	            operands.push(tmp);
	        }

	        System.out.println(operands.peek());
	    }

	    static int getPriority(char c) {
	        if (c == '-' || c == '+') return 1;
	        else if (c == '*' || c == '/') return 2;
	        else if (c == '^') return 3;
	        return 0;
	    }
	}

