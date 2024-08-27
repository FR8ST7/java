import java.util.Scanner;
class Tollbooth {
    private int totalCars;
    private double totalCash;

    public Tollbooth() {
        totalCars = 0;
        totalCash = 0;
    }

    public void payingCar() {
        totalCars++;
        totalCash += 50;
    }

    public void noPayCar() {
        totalCars++;
    }

    public void display() {
        System.out.println("Total Cars: " + totalCars);
        System.out.println("Total Cash: " + totalCash);
    }
}

public class TollboothTest {
    public static void main(String[] args) {
        Tollbooth tollbooth = new Tollbooth();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.Enter 'p' for paying car,\n 2.'n' for non-paying car, \n 3.'q' to quit:");
            char input = scanner.next().charAt(0);

            switch (input) {
                case 'p':
                    tollbooth.payingCar();
                    break;
                case 'n':
                    tollbooth.noPayCar();
                    break;
                case 'q':
                    tollbooth.display();
                    return;  // Exits the main method and ends the program
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}


