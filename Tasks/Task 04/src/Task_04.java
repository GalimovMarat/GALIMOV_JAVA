
import java.util.Scanner;

public class Chernovik {

    public static void main(String[] args) {
        Scanner scaner = new Scanner (System.in);
        int summ = 0;
        int Verificationamount = 0;
        int vm = 0;
        while (vm <=10){
            Verificationamount = Verificationamount + vm;
            System.out.println("Verificationamount - "+ Verificationamount);
            vm++;
            System.out.println("vm index - "+vm);
        }
        System.out.println("Total Verificationamount "+ Verificationamount);
        // System.out.println("Enter an integer");
        System.out.println("Enter an integer");
        int currentNumber = scaner.nextInt();
        int i=1;
        System.out.println("i - "+i);
        while (i <=9){
            summ = summ + currentNumber;
            System.out.println("Summ "+summ);
            System.out.println("Enter the next integer");
            currentNumber = scaner.nextInt();
            i++;
            System.out.println("i - "+i);
        }

        System.out.println("Total Summ "+summ);

        int Missingnumber = Verificationamount - summ;
        System.out.println("Missingnumber - "+ Missingnumber);
