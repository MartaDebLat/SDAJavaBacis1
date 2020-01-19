package Lesson11;

public class superLinkedList {

    private MyNode startNode;

    public void add(Integer newValue) {
        if (startNode == null) {
            startNode = new MyNode(newValue, null);
        } else {
            MyNode currentNode = startNode;
            while (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = new MyNode(newValue, null);

        }
    }

    public void printAll() {
        MyNode currentNode = startNode;
        System.out.print(currentNode.value);
        while (currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
            System.out.print("-" + currentNode.value);
        }}

        public void reversePrintAll(){
            MyNode currentNode = startNode;
            System.out.print(currentNode.value);
            while (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
                System.out.print("-" + currentNode.value);
            }
    }
}

//    public static remove() {
//    }
//
//    public static size() {
//
//    }
//
//
//    public static reversePrintAll() {
//
//    }