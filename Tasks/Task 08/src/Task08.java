
public class Task08 {
    public static void main(String[] args) {
        int array[] = {5, 9, 8, 3, 4, 6, 7, 2, 1};
        System.out.print("Array     {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ";");
        }
        System.out.println("}");
        System.out.print("Sortarray {");

        for (int a = 0; a < array.length; a++) {
            for (int i = a + 1; i < array.length; i++) {
                if (array[a] > array[i]) {
                    int tmp = array[a];
                    array[a] = array[i];
                    array[i] = tmp;
                    }
                }
            System.out.print(array[a] + ";");
            }
        System.out.println("}");
        }
    }


