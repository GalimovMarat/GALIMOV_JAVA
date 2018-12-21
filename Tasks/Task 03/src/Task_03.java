import java.util.Scanner;

public class Task 03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = scanner.nextInt();
        int position = 1;
        int compositions = 1;
        int digitsSum = 0;
        int currentDigit;


        while (number != -1) {
            System.out.println("CurrentNumber "+number);
            System.out.println("Position "+position);
            while (number != 0) {
                currentDigit = number % 10;
                digitsSum = digitsSum + currentDigit;
                number = number / 10;
                System.out.println("digitSum " + digitsSum);
            }
            int prime = 1;

            if (digitsSum == 1) {
                prime = 0;
            }
            if (digitsSum == 2 || digitsSum == 3) {
                prime = 1;
            }
            int devider = 2;
            while (devider * devider <= digitsSum) {
                if (digitsSum % devider == 0) {
                    prime = 0;
                }
                devider++;
            }
            if (prime == 1) {
                compositions = compositions * position;
            }
            position++;
            System.out.println("Compositions " + compositions);
            System.out.println("Enter the next integer");
            number = scanner.nextInt();
            digitsSum = 0;
        }
    }
}





