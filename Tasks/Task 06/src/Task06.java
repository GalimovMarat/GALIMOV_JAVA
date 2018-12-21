public class Task06 {

    public static void main(String[] args) {
        int arraylenght = 10;
        int array [] = new int[arraylenght];
        System.out.print("Array       ");
        System.out.print("{");
        for (int i = 0; i<=9; i++){
            array[i] = (int) (Math.random()*10);
            System.out.print(array[i]+";");
        }
        System.out.println("}");
        System.out.print("Reversarray ");
        System.out.print("{");

        int reversarray [] = new int[arraylenght];
        for (int i = 0; i<=9;i++){
            reversarray [i] = array [(array.length-1)-i];
            System.out.print(reversarray[i]+";");
        }
        System.out.println("}");
    }
}
