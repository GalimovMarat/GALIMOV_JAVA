
public class Task_18 {

    public static void main (String [] args) {
  Matrix firstMatrix = new Matrix(5,5);
  firstMatrix.FillRandom(firstMatrix.workMatrix);
  firstMatrix.print(firstMatrix.workMatrix);

        Matrix secondMatrix = new Matrix(5,5);
        secondMatrix.FillRandom(secondMatrix.workMatrix);
        secondMatrix.print(secondMatrix.workMatrix);

        Matrix thirdMatrix = new Matrix(5,5);
        thirdMatrix.workMatrix = thirdMatrix.sum(firstMatrix.workMatrix,secondMatrix.workMatrix);
        thirdMatrix.print(thirdMatrix.workMatrix);




    }
}
