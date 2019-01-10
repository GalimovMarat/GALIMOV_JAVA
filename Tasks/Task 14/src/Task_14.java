import java.util.Scanner;

public class Task_14 {

    public static double f(double x){
                return x*x;
    }
       public static double integralByRectangles (double a, double b,float n ){
        double integralValue = 0;
        while (a <= b){
            integralValue  = integralValue + f(a)*n;
            a = a + n;
        }
         return integralValue;
      }
    public static double integralBySimpson (double a, double b){
           double integralValue  = ((b-a)/6)*(f(a)+4*f((b+a)/2)+f(b));
        return integralValue;
   }
    public static double integralByTrapize (double a, double b,float n ){
        double integralValue = 0;
        while (a <= b){
            integralValue  = integralValue + ((f((a-n)) + f(a))/2)*((a-(a-n)));
            a = a + n;
        }
        return integralValue;
    }
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        float n = scanner.nextFloat();
        System.out.println("Integral by Rectangles = "+integralByRectangles(a,b,n));
        System.out.println("Integral by Simpson = "+integralBySimpson(a,b));
        System.out.println("Integral by Trapize = "+integralByTrapize(a,b,n));
    }
}

