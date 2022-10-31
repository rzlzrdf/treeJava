import java.util.List;

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
               if (temp != null) {
                    return temp;
               }
          }
          return null;
     }
     
     public Node<T> getParent(Node<T> child){
          
          //cek jika tidak punya child maka dia langusn mengembalikan parent          
          if(child.childs == null){
               return child;
          }
          return child;
          
     }
     

     public void berapaLevel(Node<T> parent){
          //cek jik todak memil
          if(parent.childs == null){
               System.out.println("0");
          }
          // menghitung turunan
          for (int i = 0 ; parent.childs.size(); i++) {
              Node<T> temp  = cari(child, parent);
              System.out.println(temp);
          }
              
     }
     

     /*
      * Berdasarkan kode program terkait Tree yang dibuat di kelas.
      * Lengkapi fungsi class Pohon yang dibuat untuk fungsi-fungsi berikut:
      * Getting a node's parent node
      * Calculating a node's height
      * Calculating a node's level
      * Finding all Leaf nodes
      * Finding all non-Leaf nodes
      * Finding all ancestors of a node
      * Finding all descendants of a node
      * Finding the siblings of a node
      * Kerjakan secara berkelompok, dengan satu kelompok maksimal 2 orang.
      * Kerjakan minimal 4 fungsi tambahan yang berbeda.
      */
}
