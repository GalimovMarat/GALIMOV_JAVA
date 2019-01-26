public class Task_19 {

    public static void main (String [] args){

        int [][] Matrix =  new int [5][5];

        for ( int i = 0; i < Matrix.length; i++){
            for ( int j = 0; j < Matrix[i].length; j++){
                Matrix[i][j] = 4;
            }
        }
        for ( int i = 0; i < Matrix.length; i++){
            for ( int j = 0; j < Matrix[i].length; j++){
                System.out.print(Matrix[i][j] + "; ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println(" ");



        for ( int i = 0; i < Matrix.length; i++){
            for ( int j = 0; j < Matrix[i].length; j++){
               if ( i < j){
                  Matrix[i][j] =  Matrix[i][j]*2;
               }
               if ( i > j){
                   Matrix[i][j] =  Matrix[i][j]/2;
               }
            }
        }
        for ( int i = 0; i < Matrix.length; i++){
            for ( int j = 0; j < Matrix[i].length; j++){
                System.out.print(Matrix[i][j] + "; ");
            }
            System.out.println(" ");
        }


    }
}
