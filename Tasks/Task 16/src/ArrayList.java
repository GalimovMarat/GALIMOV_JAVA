import java.util.Scanner;

public class ArrayList {
    private final int maxSize = 20;
    private int lines[];
    private int counter;
    private int Element;
    private int index;



    public void setElement() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert the number - ");
        this.Element = scanner.nextInt();
    }

    public void setIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("index - ");
        this.index = scanner.nextInt();
    }

    public ArrayList() {
        this.lines = new int[maxSize];
        this.counter = 0;
        this.Element = 0;
        this.index = 0;
    }


    void AutoArray() {
        for (int counter = 0; counter < maxSize/2; counter++) {
            this.lines[counter] = (int) ((Math.random() * 100))+1;
           // System.out.println(counter + " " + lines[counter]);
            ;
        }
    }

    void print() {
        for (int i = 0; i < lines.length; i++) {
            System.out.print(lines[i] + "; ");

        }
        System.out.println(" ");
    }

    void InsertAtTheEndOfTheArray() {
        setElement();
        int index = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i] != 0) {
                index++;
            }
        }
        lines[index] = Element;
    }

     void InsertToTheBeginningOfTheArray (){
         setElement();
        for (int i  = 1; i < lines.length; i++){
            lines[lines.length - i] = lines[lines.length-(i+1)];
        }
        lines[0] = Element;
    }

    void insertByIndex () {
        setElement();
        setIndex();
        for ( int i = 1; i < lines.length - index; i++){
            lines[lines.length-i] = lines[lines.length-1-i];
           // System.out.println((a - i) + " " + "to" + " " + (a-1-i) + " " + i );
        }
        lines[index] = Element;
    }
     void getElementByIndex () {
        setIndex();
        System.out.println("Element with an index - " + lines[index]);
     }


     void sort() {
        getCounter();
         for (int a = 0; a < counter; a++) {
             for (int i = a + 1; i < counter; i++) {
                 if (lines[a] > lines[i]) {
                     int tmp = lines[a];
                     lines[a] = lines[i];
                     lines[i] = tmp;
                 }
             }
         }
     }

     int getCounter() {
        for (int i = 0; i <lines.length; i++){
            if (lines[i]>0){
                counter++;
            }
        }
         System.out.println("Array lenghts - " + lines.length);
         System.out.println(counter + " - items");
         return counter;
    }
              void contains () {
              setElement();
              int count = 0;
              for ( int i = 0; i < lines.length; i++ ){
                  if (lines[i] == Element ){
                     count++;
                  }
              }
              if (count > 0){
                  System.out.println("There are " + count + "  matches");
              }
              else {
                  System.out.println("No matches");
              }
              return;
          }

}


