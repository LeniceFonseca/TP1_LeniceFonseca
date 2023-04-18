import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        Scanner scanner  = new Scanner(System.in);
        int option;

        do {
            System.out.println();
            System.out.println("""
                    1. Turn left
                    2. Turn right
                    3. Move
                    4. Get location
                    5. Get direction
                    6. Sair
                    """);

            System.out.print("Option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    robot.turnLeft();
                    break;
                case 2:
                    robot.turnRight();
                    break;
                case 3:
                    robot.move();
                    break;
                case 4:
                    System.out.println("Location: " + robot.getLocation());
                    break;
                case 5:
                    System.out.println("Direction: " + robot.getDirection());
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid!");
            }

        } while (option != 6);

    }
}