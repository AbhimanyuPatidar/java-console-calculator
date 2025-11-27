import java.util.Scanner;

public class CLICalculator {
    public static final String QUIT_CMD = "quit";
    public static void main(String[] args) {
        System.out.println("Welcome to Console based calculator!");

        Scanner scan = new Scanner(System.in);
        String command;
        double num1 = 0;
        double num2 = 0;
        double result = 0;

        do {
            System.out.println("Enter command: ");
            command = scan.nextLine();

            if (!command.equals(QUIT_CMD)) {
                System.out.println("Enter first number: ");
                String num1String = scan.nextLine();
                
                System.out.println("Enter second number: ");
                String num2String = scan.nextLine();

                try {
                    num1 = Double.parseDouble(num1String);
                    num2 = Double.parseDouble(num2String);
                } catch (NumberFormatException nfe) {
                    System.out.println(nfe.getMessage());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                switch (command) {
                    case "+":
                        result = num1 + num2;
                        System.out.println("Result of adding " + num1 + " and " + num2 + " is: " + result);
                        
                        break;

                    case "-":
                        result = num1 - num2;
                        System.out.println("Result of subtracting " + num1 + " from " + num2 + " is: " + result);
                        
                        break;

                    case "*":
                        result = num1 * num2;
                        System.out.println("Result of multiplying " + num1 + " and " + num2 + " is: " + result);
                        
                        break;

                    case "/":
                        if (num2 == 0) {
                            System.out.println("Division by 0 is an invalid operation, please try again!");
                        } else {
                            result = num1/num2;
                            System.out.println("Result of dividing " + num1 + " by " + num2 + " is: " + result);
                        }

                        break;

                    case "%":
                        result = num1 % num2;
                        System.out.println("Result of " + num1 + " modulo " + num2 + " is: " + result);
                        
                        break;

                    case "pow":
                        result = Math.pow(num1, num2);
                        System.out.println("Result of " + num1 + " raised to the power of  " + num2 + " is: " + result);

                        break;

                    case "floor":
                        result = (int) Math.floor(num1);
                        System.out.println("Result of the floor of " + num1 + " is: " + result);
                        
                        if (num2 != 0) {
                            result = (int) Math.floor(num2);
                            System.out.println("Result of the floor of " + num2 + " is: " + result);
                        }

                        break;

                    case "ceil":
                        result = (int) Math.ceil(num1);
                        System.out.println("Result of the ceil of " + num1 + " is: " + result);
                        
                        if (num2 != 0) {
                            result = (int) Math.ceil(num2);
                            System.out.println("Result of the ceil of " + num2 + " is: " + result);
                        }

                        break;

                    case "round":
                        result = Math.round(num1);
                        System.out.println("Result of the round of " + num1 + " is: " + result);
                        
                        if (num2 != 0) {
                            result = (int) Math.round(num2);
                            System.out.println("Result of the round of " + num2 + " is: " + result);
                        }

                        break;

                    default:
                        System.out.println("Invalid command entered, please try again!");
                }
            }
        } while (!command.equals(QUIT_CMD));

        scan.close();
    }
}