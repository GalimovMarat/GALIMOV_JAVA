import java.util.Scanner;

public class Task_13 {
    public static StringBuilder Bin(int a) {
        StringBuilder Bin = new StringBuilder();
        while (a != 0) {
            int b = a % 2;
            Bin.append(b);
            a = a / 2;
            Bin.reverse();
        }
        return Bin;
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scanner.nextInt();
        System.out.println(Bin(a));

    }
}
