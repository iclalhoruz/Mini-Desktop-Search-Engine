package searchengine;

import java.io.File;
import javax.swing.JTextArea;

public class BST<T extends Comparable<T>>{
    WordNode<T> root;
    
    void insert(T newWord, T fileName){
        WordNode newWordNode = new WordNode(newWord);
        
        if(root == null){
            root = newWordNode;
            
            //A linked list is created for the new word
            FileFrequency(fileName, root);
        }
        
        else{
            WordNode<T> temp = root;
            WordNode<T> parent = null;
            
            while(temp != null){
               parent = temp;
                if(newWord.compareTo(temp.data) < 0){
                    temp = temp.left; 
                }
                else if(newWord.compareTo(temp.data) > 0){
                    temp = temp.right;
                }
                else{
                    //update frequency and fileName if word exists in bst
                    FileFrequency(fileName, temp); 
                    return;
                }
            }
        
            // Add new word to parent node's subtree
            if(newWord.compareTo(parent.data) < 0){
                parent.left = newWordNode;
            }
            else{
                parent.right = newWordNode;
            }
            
            //A linked list is created for the new word
            FileFrequency(fileName, newWordNode);
        }
        
    }
    
    void FileFrequency(T fileName, WordNode<T> node){
        LinkedNode<T> current = node.head;
        LinkedNode<T> previous = null;
        
        boolean found = false;

        // find filename
        while (current != null) {
            if (current.fileName.equals(fileName)) {
                // If the file name exists, increase the frequency
                current.frequency++;
                found = true;
                break;
            }
            
            previous = current;
            current = current.next;
        }

        // Adds a new node if the filename does not exist
        if (!found) {
            LinkedNode<T> newLinkNode = new LinkedNode<>(fileName);
            newLinkNode.frequency = 1;

            if (previous == null) {
                node.head = newLinkNode;
            } 
            else {
                previous.next = newLinkNode;
            }
        }   
    }
    
    String inorder() {
        StringBuilder sb = new StringBuilder();
        inorder(root, sb);
        return sb.toString();
}
   
    void inorder(WordNode<T> node, StringBuilder sb) {
        if (node != null) {
        inorder(node.left, sb);
        sb.append(node.data).append(" -> ");
        inorder(node.right, sb);
    }
}

    
    String preorder() {
        StringBuilder sb = new StringBuilder();
        preorder(root, sb);
        return sb.toString();
    }

    void preorder(WordNode<T> node, StringBuilder sb) {
        if (node != null) {
            sb.append(node.data).append(" -> ");
            preorder(node.left, sb);
            preorder(node.right, sb);
        }
    }
    
    String postorder() {
        StringBuilder sb = new StringBuilder();
        postorder(root, sb);
        return sb.toString();
    }

    void postorder(WordNode<T> node, StringBuilder sb) {
        if (node != null) {
            postorder(node.left, sb);
            postorder(node.right, sb);
            sb.append(node.data).append(" -> ");
        }
    }
    
    void print(WordNode<T> node, T searchWord, JTextArea textArea) {
        if (node != null) {
        print(node.left, searchWord, textArea);
        
        // When we find the node containing the search word, print its information
        if (node.data.equals(searchWord)) {
            //textArea.append("\nWord: " + node.data + "\n");
            LinkedNode<T> current = node.head;
            while (current != null) {
                String fileName = getFileName(toString(current.fileName));
                textArea.append(fileName + " [" + current.frequency + "]" + "\n");
                current = current.next;
            }
        }
        
        print(node.right, searchWord, textArea);
        }    
    }
    
    //Getting filename only
    public static String getFileName(String Path){ 
        int lastSlashIndex = Path.lastIndexOf(File.separator); 
        
        if(lastSlashIndex != -1){
            return Path.substring(lastSlashIndex + 1);
        }
        
        return Path;
    }

    //type T to String
    private String toString(T value) { 
        if (value instanceof String) {
            return (String) value;
        } 
        else if (value instanceof CharSequence) {
            return value.toString();
        } 
        else {
            throw new IllegalArgumentException("Unsupported type for conversion to String");
        }
    }

}
