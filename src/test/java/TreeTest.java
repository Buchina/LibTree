import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {


    @Test
    void setValue() {
        Node root = new Node("root");
        Node node1 = root.addChild(new Node("node 1"));
        Node node11 = node1.addChild(new Node("node 11"));
        Tree testTree = new Tree(root);
        testTree.setValue(node11, "NODE 11");
        String actual = node11.getData();
        String expected = "NODE 11";
        assertEquals(expected, actual);
    }
}