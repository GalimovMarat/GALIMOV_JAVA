public class Task07 {
    public  static void main(String [] args){
         int lenght = (int) (Math.random()*50);
         int array[] = new int[lenght];
         System.out.print("{");

         for (int a = 0; a < lenght; a++){
             array [a] = (int) (Math.random()*lenght);
             System.out.print(array[a]+";");
         }
        System.out.println("}");

        System.out.print("Local maxima ");

        for (int i = 1; i<=lenght-2; i++){
            if (array[i-1]<array[i]&&array[i]<array[i+1]){
                System.out.print(array[i]+"; ");
            }
        }

    }
}
