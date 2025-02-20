import java.util.Scanner;

class Calculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = sc.nextInt();
        System.out.println("Enter the Any Operator (+, -, *, /, %)");
        char symbol = sc.next().charAt(0);
        operation(num1, num2, symbol);
    }

    public static void operation(int num1, int num2, char symbol) {
        switch (symbol) {
            case '+': {
                System.out.println("The addition of " + num1 + " and " + num2 + " is: " + add(num1, num2));
            }
            break;
            case '-': {
                System.out.println("The subtraction of " + num1 + " and " + num2 + " is: " + subtract(num1, num2));
            }
            break;
            case '*': {
                System.out.println("The multiplication of " + num1 + " and " + num2 + " is: " + multiply(num1, num2));
            }
            break;
            case '/': {
                if (num2 != 0) {
                    System.out.println("The division of " + num1 + " and " + num2 + " is: " + divide(num1, num2));
                } 
            }
            break;
            case '%': {
                if (num2 != 0) {
                    System.out.println("The remainder of " + num1 + " divided by " + num2 + " is: " + remainder(num1, num2));
                } 
            }
            break;
            default: {
                System.out.println("Invalid operator. Please enter one of operators: +, -, *, /, %");
            }
            break;
        }
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(int num1, int num2) {
        return(double)num1 / num2;
    }

    public static int remainder(int num1, int num2) {
        return num1 % num2;
    }
}

