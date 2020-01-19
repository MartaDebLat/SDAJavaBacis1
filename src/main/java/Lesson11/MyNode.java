package Lesson11;

public class MyNode {

    Integer value;
    MyNode nextNode;

    public MyNode(Integer value, MyNode nextNode) {
        this.value = value;
        this.nextNode = nextNode;
        System.out.println("New node value " + value);
    }
    public class TwoWayNode {
        MyNode previousNode;
        Integer value;
        MyNode nextNode;

        public TwoWayNode(MyNode previousNode, Integer value, MyNode nextNode) {
            this.previousNode = previousNode;
            this.value = value;
            this.nextNode = nextNode;
        }
    }
}

