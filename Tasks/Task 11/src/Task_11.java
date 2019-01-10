import java.util.Scanner;
// Shift - сдвиг
public class Task_11 {
    public static int Midle (int a, int b){
        int c = a + (b-a)/2;
        return c;
    }
    public static void main(String[] args) {
        int Arraylenght = (int) (10 + Math.random()*23);
        int array[] = new int[Arraylenght];
        System.out.print("Unsort array {");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 999);
           //
            for (int a = 0; a < i; a++) {
                if (array[i] == array[a]) {
                    array[i] = (int) (Math.random() * 999);
                }
            }
            System.out.print(array[i] + "; ");
        }
        System.out.println("}");
        System.out.print("Sort   array {");

        for (int a = 0; a < array.length; a++) {
            for (int i = a + 1; i < array.length; i++) {
                if (array[a] > array[i]) {
                    int tmp = array[a];
                    array[a] = array[i];
                    array[i] = tmp;
                }
            }
            System.out.print(array[a] + "; ");
        }
        System.out.println("}");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sought number....");
        int search = scanner.nextInt();
        System.out.println("Sought number = " + search);
        int left = 0;
        int right = array.length - 1;
        int midle = Midle(left, right);
        //System.out.println(array.length + " " + left + " " + right + " " + midle + " " + array[midle]);

        while (midle != left || midle != right){
            if (array[midle] == search){
            System.out.print("There is a match with the item № " + midle);
            return;
        }
            if (array[midle] < search){
                left = midle;
                midle = Midle(left,right);
            }
           // System.out.println(left + " " + midle);
            if (array[midle]>search){
                right = midle;
                midle = Midle(left, right);
            }
            if (left == midle || right == midle) {
                System.out.println("No matches found");
                return;
            }

           }


    }
}





