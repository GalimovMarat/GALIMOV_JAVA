import java.util.Scanner;

public class Task_09 {
    public static long Tentothedegree ( int a){
        long result = 1;
        int i = 1;
        while (i<=a){
            result = result*10;
            i++;
        }
        return result;
    }
    public static long equivalentInt (int b, char numberRow []) {
        long equivalent = 0;
        int i = 0;
       while (i<b){
           equivalent = equivalent + ((numberRow[i] - '0') * Tentothedegree(b-1-i));
           System.out.println(numberRow[i] + " " + b + " " + i + " " + Tentothedegree(b-1-i) + " " + equivalent);
           i++;
        }
       return equivalent;
   }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out. print("Enter number row...");
        char numberRow[] = scanner.nextLine().toCharArray();
        int b = numberRow.length;
        System.out. print("Char array ");
        System.out. println(numberRow);
        System.out. println("Equivalent int " + equivalentInt(b, numberRow));
    }
}
