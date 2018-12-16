

import java.util.Scanner;

class Task_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite summu");
        int a = sc.nextInt();
        System.out.println("Summa"+" "+a+" "+"rublei");
        int b = a/5000;
        int c = (a%5000)/2000;
        int d = (a-b*5000-c*2000)/1000;
        int e = (a-b*5000-c*2000-d*1000)/100;
        System.out.println("5000 rublei"+" - "+b+" sht.");
        System.out.println("2000 rublei"+" - "+c+" sht.");
        System.out.println("1000 rublei"+" - "+d+" sht.");
        System.out.println("100 rublei"+" - "+e+" sht");

            if (b*5000+c*2000+d*1000+e*100!=a) {
                System.out.println("i kuchka melochi");

        }






    }
}
