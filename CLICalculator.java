import java.util.Scanner;

public class CLICalculator {
    public static final String QUIT_CMD = "quit";
    public static void main(String[] args) {
        System.out.println("\nWelcome to Console based calculator!\n");

        Scanner scan = new Scanner(System.in);
        String command;
        double num1 = 0;
        double num2 = 0;
        double result = 0;

        do {
            displayMenu();
            
            System.out.println("Enter command: ");
            command = scan.nextLine();
            System.out.println();

            if (!command.equals(QUIT_CMD)) {
                System.out.println("Enter first number: ");
                String num1String = scan.nextLine();
                
                System.out.println("Enter second number: ");
                String num2String = scan.nextLine();

                try {
                    num1 = Double.parseDouble(num1String);
                    num2 = Double.parseDouble(num2String);
                } catch (NumberFormatException nfe) {
                    System.out.println("\nAtleast one of the two inputs is not a number, kindly try again!\n");
                    continue;
                } catch (Exception e) {
                    e.printStackTrace();
                    continue;
                }

                switch (command) {
                    case "+":
                        result = num1 + num2;
                        System.out.println("Result of adding " + num1 + " and " + num2 + " is: " + result + "\n");
                        
                        break;

                    case "-":
                        result = num1 - num2;
                        System.out.println("Result of subtracting " + num1 + " from " + num2 + " is: " + result + "\n");
                        
                        break;

                    case "*":
                        result = num1 * num2;
                        System.out.println("Result of multiplying " + num1 + " and " + num2 + " is: " + result + "\n");
                        
                        break;

                    case "/":
                        if (num2 == 0) {
                            System.out.println("Division by 0 is an invalid operation, please try again!\n");
                        } else {
                            result = num1/num2;
                            System.out.println("Result of dividing " + num1 + " by " + num2 + " is: " + result + "\n");
                        }

                        break;

                    case "%":
                        result = num1 % num2;
                        System.out.println("Result of " + num1 + " modulo " + num2 + " is: " + result + "\n");
                        
                        break;

                    case "pow":
                        result = Math.pow(num1, num2);
                        System.out.println("Result of " + num1 + " raised to the power of  " + num2 + " is: " + result + "\n");

                        break;

                    case "floor":
                        result = (int) Math.floor(num1);
                        System.out.println("Result of the floor of " + num1 + " is: " + result);
                        
                        if (num2 != 0) {
                            result = (int) Math.floor(num2);
                            System.out.println("Result of the floor of " + num2 + " is: " + result);
                        }
                        System.out.println();

                        break;

                    case "ceil":
                        result = (int) Math.ceil(num1);
                        System.out.println("Result of the ceil of " + num1 + " is: " + result);
                        
                        if (num2 != 0) {
                            result = (int) Math.ceil(num2);
                            System.out.println("Result of the ceil of " + num2 + " is: " + result);
                        }
                        System.out.println();

                        break;

                    case "round":
                        result = Math.round(num1);
                        System.out.println("Result of the round of " + num1 + " is: " + result);
                        
                        if (num2 != 0) {
                            result = (int) Math.round(num2);
                            System.out.println("Result of the round of " + num2 + " is: " + result);
                        }
                        System.out.println();

                        break;

                    default:
                        System.out.println("Invalid command entered, please try again!\n");
                }
            } else {
                System.out.println("Sorry to see you go :(");
            }
        } while (!command.equals(QUIT_CMD));

        scan.close();
    }

    private static void displayMenu() {
        System.out.println("Displaying Menu:- \n");
        System.out.println("1. For Addition type: '+'");
        System.out.println("2. For Subtraction type: '-'");
        System.out.println("3. For Multiplication type: '*'");
        System.out.println("4. For Division type: '/'");
        System.out.println("5. For Modulo type: '%'");
        System.out.println("6. For Power type: 'pow'");
        System.out.println("7. For Floor type: 'floor'");
        System.out.println("8. For Ceil type: 'ceil'");
        System.out.println("9. For Round type: 'round'\n");
        System.out.println("If you want to quit: 'quit'\n");
    }
}