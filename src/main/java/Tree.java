public class Tree {
    Node root;

    public Tree(Node root) { //создание дерева
        this.root = root;
    }

    public void print() {  //печать дерева
        root.printTree(root, " ");
    }

    public void searchNodeTree(String value){  //поиск узла
        if (root.searchData(value)) System.out.println("Нашелся!");
        else System.out.println("Не нашёлся...Такого узла нет");
    }

    public void deleteNodeTree(Node delete){  //удаление узла
        delete.deleteNode();
    }

    public void deleteAllNodeTree(){  //удаление всех дочерних узлов
        root.deleteAllNode();
    }

    public void setValue(Node change, String newValue){ //изменение значения узла
        change.setData(newValue);
    }

}
