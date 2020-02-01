package Lesson12;

import java.util.ArrayList;
import java.util.List;

public class MyQueue<T> {

    List<T> underLyingList = new ArrayList<>();


    public void offer(T someObject) {
        underLyingList.add(someObject);
    }

    public T pool() {
        T result = underLyingList.get(0);
        underLyingList.remove(0);
        return result;
    }

    public void printAll() {
        for (T obj : underLyingList) {
            System.out.println(obj.toString());
        }
    }
}
