import java.util.Scanner;

public class Task_28 {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Insert Numbers count - ");
        int numbersCount = scanner.nextInt();
        System.out.print(" Insert Threads count - ");
        int threadsCount = scanner.nextInt();
        System.out.println(" ");
        myArray myArray = new myArray(numbersCount);
        // TODO: генерируете массив чисел
        myArray.randomFilling();
//        myArray.arrayPrint();
        // TODO: выводите их сумму
        System.out.println("My array elements sum = " + myArray.elementsSum());
        // TODO: создаете массив потоков
        Counter[] counters = new Counter[threadsCount];
        // TODO: каждому потоку назначете свой участок
        int from = 0;
        int to;
//        System.out.println(numbersCount / threadsCount);
        for (int i = 0; i < threadsCount; i++) {
            to = from + (numbersCount / threadsCount);
            counters[i] = new Counter(from, to, myArray.getArray());
            from = to + 1;
        }

//        for (int i = 0; i < counters.length ; i++) {
//            counters[i].printFromTo();
//        }
        // TODO: запускаете каждый поток
        for (int i = 0; i < counters.length; i++) {
            counters[i].start();
            counters[i].join();
//            System.out.println("counters" + "[" + i + "]" + " " + "=" + " " + counters[i].getSumResult());
        }

        System.out.println("------------------");

        // TODO: здесь у каждого потока берете sumResult и складываете, смотрите результат.
        int sumResult = 0;
        for (int i = 0; i < counters.length; i++) {
            sumResult = sumResult + counters[i].getSumResult();
        }
        System.out.println("Threads sumResuslt's sum = " + sumResult);


    }
}
