public class Pohon<T> {
     Node<T> root;

     public Pohon(Node<T> root) {
          this.root = root;
     }

     public Pohon(T data) {
          this.root = new Node<T>(data);
     }

     public void telusur(Node<T> node) {
          if (node != null) {
               System.out.print(node.data + " ");
               for (Node<T> child : node.childs) {
                    telusur(child);
               }
          }
     }

     public Node<T> createChild(Node<T> parent, Node<T> child) {
          parent.childs.add(child);
          return child;
     }

     public Node<T> cari(Node<T> parent, T data) {
          if (parent.data == data) {
               return parent;
          }
          for (Node<T> child : parent.childs) {
               Node<T> temp = cari(child, data);
               if(temp != null){
                    return temp;
               }
          }
          return null;
     }
}
