import java.util.Scanner;

public class Task_15 {


    public static void deleteByIndex (int index, int  array[]) {
        for ( int i = index; i>= index && i < array.length - 1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = 0;
    }


    public static void insertByIndex (int num, int index, int  array[]) {
        for ( int i = 1; i <= array.length - index; i++){
            int a = array.length;
            array[a-i] = array[a-1-i];
            System.out.println((a - i) + " " + "to" + " " + (a-1-i) + " " + i );
        }
        array[index] = num;
    }


    public static void InsertAtTheEndOfTheArray(int n, int array[]){
        int index = 0;
        for ( int i = 0; i<array.length;i++){
            if(array[i]!= 0){
                index++;
              //  System.out.println(array[i]+" "+index);
            }
        }
        array[index] = n;
    }


    public static void InsertToTheBeginningOfTheArray (int n, int array []){
       int a = array.length;
        for (int i  = 1; i < a; i++){
            array[a - i] = array[a-(i+1)];
        }
        array[0] = n;
    }


    public static void print (int array[]){
        int n = array.length;
        for (int i = 0; i<n; i++){
            System.out.print(array[i] + ";");
        }
    }


    public  static  void main (String [] args){
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter array lenght....");
        int arrayLenght = scaner.nextInt();
        int workArray [] = new int[arrayLenght];
        for (int i = 0; i<arrayLenght/2; i++){
            workArray [i] = (int) (Math.random()*50);
        }
        print(workArray);
        System.out.println("");
   //     System.out.println("Insert the number....");
   //     int number = scaner.nextInt();

   //     InsertToTheBeginningOfTheArray(number,workArray);
   //     print(workArray);
   //     System.out.println("");

   //     InsertAtTheEndOfTheArray(number,workArray);
   //     print(workArray);
   //     System.out.println("");

   //     System.out.println("Insert the number....");
   //     int number2 = scaner.nextInt();
        System.out.println("Insert the index....");
        int index = scaner.nextInt();
   //     insertByIndex(number2, index,workArray);
   //     print(workArray);
   //     System.out.println("");

        deleteByIndex(index,workArray);
        print(workArray);

    }
}
