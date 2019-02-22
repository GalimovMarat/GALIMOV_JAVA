public class LinkedList implements List {
    private Node first;
    private  Node tail;
    private int count;

    public LinkedList() {
        this.first = null;
        this.count = 0;
    }


    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void addToBegin(int value){
        Node newNode = new Node(value);
        newNode.setNext(first);
        first = newNode;
        count++;
    }

    @Override
    public void addToAnd (int value){
        Node newNode = new Node (value);
        if (tail != null){
            tail.setNext(newNode);
            tail = newNode;
        }
        else {
            first = newNode;
            tail = newNode;
        }
        count++;
    }

    @Override
    public int getByIndex (int index){
        if (index >=0 && index <= getCount()){
           Node currentNode = first;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getNext();
            }
            return currentNode.getValue();
        }
        return -1;
    }

    @Override
    public void printList () {
       System.out.print("List {");
        Node curentNode = first;
        System.out.print( curentNode.getValue() + "; ");
        for (int i = 0; i <getCount() ; i++) {
            if (i>0 && i < getCount()){
                curentNode = curentNode.getNext();
                System.out.print( curentNode.getValue() + "; ");
            }
        }
        System.out.println("}");

    }

    @Override
    public void addByIndex (int index, int value){
       if (index >= 0 && index < getCount()){
           Node newNode = new Node (value);
           Node curentNode = first;
           if (index==0){
               addToBegin(value);
               return;
           }
           for (int i = 0; i < index-1 ; i++) {
               curentNode = curentNode.getNext();
           }
           newNode.setNext(curentNode.getNext());
           curentNode.setNext(newNode);
           count++;
       }
       else {
           System.out.println("Invalid index");
       }
    }

    @Override
    public boolean contains (int value){
        boolean result = false;
        Node currentNode = first;
        for (int i = 0; i <getCount() ; i++) {
            if ( value == currentNode.getValue()){
                result = true;
            }
            currentNode = currentNode.getNext();
        }
        return result;
    }

    @Override
    public void indexOf (int value) {
        Node currentNode = first;
        boolean result = false;
        for (int index = 0; index < this.getCount() ; index++) {
            if (currentNode.getValue() == value) {
                System.out.println("Match item no. - " + index);
                result = true;
            }
            currentNode = currentNode.getNext();
        }

        if ( result == false){
            System.out.println("No matches");
        }
    }

    public void sort () {
        for (int i = 0; i < this.getCount() ; i++) {
            

        }

    }



    }



