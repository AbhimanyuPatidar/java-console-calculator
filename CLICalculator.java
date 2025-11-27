import java.util.Scanner;

public class CLICalculator {
    public static final String QUIT_CMD = "quit";
    public static void main(String[] args) {
        System.out.println("Welcome to Console based calculator!");

        Scanner scan = new Scanner(System.in);
        String command;

        do {
            command = scan.nextLine();

        } while (!command.equals(QUIT_CMD));

        scan.close();
    }
}