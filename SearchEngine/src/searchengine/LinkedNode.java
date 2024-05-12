package searchengine;

public class LinkedNode<T extends Comparable<T>> {
    LinkedNode<T> next;
    T fileName;
    int frequency;
    
    public LinkedNode(T fileName){
        this.fileName = fileName;
        this.frequency = 1;
        this.next = null;
    }
}
