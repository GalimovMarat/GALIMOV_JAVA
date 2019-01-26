import java.util.Random;

public class Matrix {
    int n;
    int m;
    int [][] workMatrix;

    public Matrix(int n, int m){
        this.n = n;
        this.m = m;
        this.workMatrix = new int [this.m][this.n];
    }

    public int getElement (int a, int b){
        return this.workMatrix[a][b];
    }


    public  void FillRandom (int a[][]){
        Random rand = new Random();
        for (int i = 0; i < workMatrix.length; i++){
            for ( int j = 0; j < workMatrix[i].length; j++){
                workMatrix[i][j] = rand.nextInt(99);
            }
        }
    }


    public void print(int a[][]) {
        for (int i = 0; i < this.workMatrix.length; i++){
            for (int j = 0; j < this.workMatrix[i].length; j++){
                System.out.print(this.workMatrix[i][j] + "; ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public int [][] sum (int a[][], int b[][]){
        int sumMatrix [][] = new int [this.m][this.n];
        for (int i = 0; i < sumMatrix.length; i++){
            for (int j = 0; j < sumMatrix[i].length; j++){
                sumMatrix[i][j] = a[i][j] + b[i][j];
            }
        }


        return sumMatrix;
    }
}