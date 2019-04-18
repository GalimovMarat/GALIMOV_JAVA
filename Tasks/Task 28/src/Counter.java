class Counter extends Thread {
    private int from;
    private int to;
    private int array[];

    private int sumResult;

    public Counter(int from, int to, int array[]) {
        this.from = from;
        this.to = to;
        this.array = array;
    }

    @Override
    public void run() {
        // TODO: считаете числа от from до to и кладете результат в sumResult.
        if (this.to > array.length) {
            this.to = array.length - 1;
        }
        for (int i = this.from; i <= this.to; i++) {
            sumResult = sumResult + this.array[i];
        }
    }


    public int getSumResult() {
        return sumResult;
    }

    public void printFromTo() {
        System.out.print(this.from + " " + this.to);
        System.out.println(" ");
    }
}