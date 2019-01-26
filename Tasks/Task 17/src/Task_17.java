
import java.util.Random;
public class Task_17 {

        public static void main(String[] args) {
            int array[][] = new int[4][];
            Random random = new Random();

            for (int i = 0; i < array.length; i++) {
                array[i] = new int[random.nextInt(10) + 1];
                for (int j = 0; j < array[i].length; j++){
                    array[i][j] = random.nextInt(99) + 1;
                }
            }

            for (int i = 0; i <array.length; i++){
                for (int j = 0; j < array[i].length; j++){
                    System.out.print(array[i][j] + "; ");
                }
                System.out.println(" ");
            }
        }
}
