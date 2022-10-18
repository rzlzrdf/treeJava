public class App {
    public static void main(String[] args) throws Exception {
        Pohon<String> p = new Pohon<String>("H");
        p.createChild(p.root, new Node<String>("D"));
        p.createChild(p.root, new Node<String>("K"));

        Node<String> nodeD = p.cari(p.root, "D");
        p.createChild(nodeD, new Node<String> ("F"));
        p.createChild(nodeD, new Node<String> ("B"));
        
        Node<String> nodeB = p.cari(p.root, "B");
        p.createChild(nodeB, new Node<String> ("A"));
        p.createChild(nodeB, new Node<String> ("C"));

        Node<String> nodeF = p.cari(p.root, "F");
        p.createChild(nodeF, new Node<String> ("E"));
        p.createChild(nodeF, new Node<String> ("G"));

        p.telusur(p.root);
    }
}
