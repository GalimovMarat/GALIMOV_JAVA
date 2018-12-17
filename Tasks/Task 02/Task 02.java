import java.util.Scanner;

import static java.lang.System.in;

public class Task 02 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(in);

        System.out.println("Vvedite celoe chislo ot 0 do 255");
        int a = sc.nextInt();
        StringBuilder Bin = new StringBuilder();


        while (a != 0) {
            int b = a%2;
            Bin.append(b);
            a=a/2;
        }
        Bin.reverse();
        System.out.println(Bin);
    }


}
