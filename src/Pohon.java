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
