import java.util.ArrayList;


public class Node {
    public String data = null;
    public ArrayList<Node> children = new ArrayList<Node>();
    public Node parent = null;

    public Node(String data) {
        this.data = data;
    }

    public void setData(String newData) {//изменение значения узла
        this.data = newData;
    }

    public void printTree(Node node, String level) {//печать дерева
        System.out.println(level + node.getData());
        for (Node i : node.getChildren()) {
            printTree(i, level + level);
        }
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public String getData() {
        return data;
    }


    public Node addChild(Node child) {//добавление узла
        child.setParent(this);
        this.children.add(child);
        return child;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public boolean searchData(String searchQuery) {//поиск узла по имени
        if (this.getData().equals(searchQuery)) {
            return true;
        }
        for (Node each : this.getChildren()) {
            if (each.searchData(searchQuery))
                return true;
        }
        return false;
    }

    public void deleteNode() {//удаление узла
        if (parent != null) {
            int index = this.parent.getChildren().indexOf(this);
            this.parent.getChildren().remove(this);
            for (Node each : getChildren()) {
                each.setParent(this.parent);
            }
            this.parent.getChildren().addAll(index, this.getChildren());
        } else {
            deleteAllNode();
        }
        this.getChildren().clear();
    }

    public Node deleteAllNode() {//удаление всего дерева
        Node newParent = null;
        if (!getChildren().isEmpty()) {
            newParent = getChildren().get(0);
            newParent.setParent(null);
            getChildren().remove(0);
            for (Node each : getChildren()) {
                each.setParent(newParent);
            }
            newParent.getChildren().addAll(getChildren());
        }
        this.getChildren().clear();
        return newParent;
    }

}
