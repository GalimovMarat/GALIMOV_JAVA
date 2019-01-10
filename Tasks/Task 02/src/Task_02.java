import java.util.Scanner;

public class Task_02 {

    public static void Binar (int a, StringBuilder c){
        while (a != 0) {
            int b = a%2;
            c.append(b);
            a=a/2;
        }
        c.reverse();

        return;
    }


public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vvedite celoe chislo ot 0 do 255");
        int a = sc.nextInt();
        StringBuilder Bin = new StringBuilder();
        Binar(a, Bin);


    //    while (a != 0) {
     //   int b = a%2;
      //  Bin.append(b);
      //  a=a/2;
      //  }
     //   Bin.reverse();
        System.out.println(Bin);
        }
}
