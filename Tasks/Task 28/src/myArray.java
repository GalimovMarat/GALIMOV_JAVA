public class myArray {
    static int array[];
    static int arraySizy;
    static int result;

    public myArray(int arraySizy) {
        this.arraySizy = arraySizy;
        this.array = new int[arraySizy];
    }

    public void randomFilling() {
        for (int i = 0; i < this.arraySizy; i++) {
            this.array[i] = (int) (Math.random() * 1000);
        }
    }

    public int elementsSum() {
        for (int i = 0; i < this.array.length; i++) {
            result = result + array[i];
        }
        return result;
    }

    void arrayPrint() {
        System.out.print("(");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
        System.out.println(")");
    }


    public static int[] getArray() {
        return array;
    }
}
