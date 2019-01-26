public class Matrix {

    private int horizontalLength;
    private int verticalLenght;
    int [][]Matrix;

    public Matrix(int horizontalLength, int verticalLenght) {
        this.horizontalLength = horizontalLength;
        this.verticalLenght = verticalLenght;
        Matrix = new int [horizontalLength][verticalLenght];
    }
    public void print (){
        for ( int i = 0; i < Matrix.length; i++){
            for (int j = 0; j < Matrix[i].length; j++){
                System.out.print(Matrix[i][j] + "; ");
            }
            System.out.println(" ");
        }
    }

    public void spiral(){
        int counter = 0;
        int horizontCounter = 0;
        int verticalCounter = 0;
        int verticalPosition = 0;
        int horisontalPosition = 0;
        int num = 1;
        for (int i = 0; i<horizontalLength - horizontCounter; i++){
            Matrix[verticalPosition][i] = num;
            num++;
            counter = i;
        }
        horisontalPosition = counter;
        horizontCounter++;
        verticalPosition++;
        System.out.println ("Num - " + num);
        System.out.println ("Posotion - v" + verticalPosition + ";h" + horisontalPosition);
        System.out.println(" ");



        for ( int i = 0; i <verticalLenght - verticalCounter; i++){
            Matrix[i][horisontalPosition]=num;
            num++;
            counter = i;
        }
        verticalPosition = counter;
        verticalCounter++;
        horisontalPosition--;
        System.out.println ("Num - " + num);
        System.out.println ("Posotion - v" + verticalPosition + ";h" + horisontalPosition);
        System.out.println(" ");

        for (int i = 0; i < horizontalLength - horizontCounter; i++){
            Matrix[verticalPosition][horisontalPosition - i] = num;
            num++;
            counter = i;
        }
        horisontalPosition = horisontalPosition - counter;
        verticalPosition--;
        horizontCounter++;
        System.out.println ("Num - " + num);
        System.out.println ("Posotion - v" + verticalPosition + ";h" + horisontalPosition);
        System.out.println(" ");

        for ( int i = 0; i < verticalLenght - horizontCounter; i++){
            Matrix[verticalPosition - i][horisontalPosition] = num;
            num++;
        }
    }

}



