package Lesson9_10;

public class StackImpl implements StackInterface {

    private Object[] stackData = new Object[10];
    private int currentFreeIndex = 0;

    public void push(Object obj) {
        stackData[currentFreeIndex] = obj;
        currentFreeIndex++;
    }

    public Object pop() {
        Object obj = stackData[currentFreeIndex - 1];
        stackData[currentFreeIndex - 1] = null;
        currentFreeIndex--;
        return obj;
    }

    public Object peak() {
        return stackData[currentFreeIndex - 1];
    }
}


