import java.util.Scanner;

    public class Task_03 {
        public static void  main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer");
            int number = scanner.nextInt();
            int position = 1;
            int compositions = 1;
            int digitsSum = 0;
            int currentDigit;

    while (number != -1){
        while (number != 0){
            currentDigit = number%10;
            digitsSum = digitsSum +currentDigit;
            number = number/10;
        }
        // System.out.println(digitsSum);

        if (digitsSum == 1){
            return;
        }

        if (digitsSum == 2 || digitsSum==3){
            compositions = compositions * position;
        }
        //System.out.println(compositions);

        int divider = 2;

        while (divider*divider<=digitsSum){
            if (digitsSum%divider==0){
                return;
            }
            else compositions = compositions*position;
            divider++;
        }
        System.out.println("Enter the following integer");
        number = scanner.nextInt();
    }
    position++;
            ;

            System.out.println(compositions);






}


    }

