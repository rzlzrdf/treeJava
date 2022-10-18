import java.util.LinkedList;
import java.util.List;

public class Node<T> {
     T data;
     List<Node<T>> childs;

     public Node(T data){
          this.data = data;
          this.childs = new LinkedList<Node<T>>();
          
     }
}