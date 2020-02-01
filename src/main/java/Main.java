public class Main {
    public static void main(String[] args) {
        Node root = new Node("root");
        Node node1 = root.addChild(new Node("node 1"));
        Node node11 = node1.addChild(new Node("node 11"));
        Node node111 = node11.addChild(new Node("node 111"));
        Node node112 = node11.addChild(new Node("node 112"));
        Node node113 = node11.addChild(new Node("node 113"));
        Node node1111 = node111.addChild(new Node("node 1111"));
        Node node12 = node1.addChild(new Node("node 12"));
        Node node2 = root.addChild(new Node("node 2"));
        Node node21 = node2.addChild(new Node("node 21"));
        Node node211 = node21.addChild(new Node("node 211"));

//        root.printTree(root, " ");
//        boolean is = root.findDataInTree("root");
//        if (!is) System.out.println("Не нашёл");
//        else System.out.println("Нашел");
//        node2.deleteNode();
//        node1.setData("node 1)");
//        root.printTree(root, " ");

        Tree tree1=new Tree(root);
        tree1.print();
        tree1.searchNodeTree("node1");
        tree1.deleteNodeTree(node1);
        tree1.setValue(node11,"node 11)))");
        tree1.print();

    }
}