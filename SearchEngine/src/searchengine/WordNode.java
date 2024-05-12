package searchengine;

public class WordNode<T extends Comparable<T>>{
    WordNode<T> left;
    WordNode<T> right;
    LinkedNode<T> head; // linked list for each word
    T data;
    
    public WordNode(T data){
        this.data = data;
        this.left = null;
        this.right = null;
        this.head = null;
    }   
}
