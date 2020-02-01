import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void setData() {
        Node test = new Node("test");
        test.setData("node");
        String actual = test.getData();
        String expected = "node";
        assertEquals(expected, actual);
    }

    @Test
    void setParent() {
        Node testRoot = new Node("root");
        Node testNode1 = testRoot.addChild(new Node("node 1"));
        Node testNode11 = testNode1.addChild(new Node("node 11"));
        testNode11.setParent(testNode1);
        Node actual = testNode1.parent;
        Node expected = testRoot;
        assertEquals(expected, actual);
    }


    @Test
    void searchData() {
        Node testRoot = new Node("root");
        Node testNode1 = testRoot.addChild(new Node("node 1"));
        boolean actual = testRoot.searchData("node");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void getChildren() {
        Node testRoot = new Node("root");
        Node testNode1 = testRoot.addChild(new Node("node 1"));
        Node testNode2 = testRoot.addChild(new Node("node 2"));
        ArrayList<Node> actual = testRoot.getChildren();
        ArrayList<Node> expected = new ArrayList<Node>();
        expected.add(testNode1);
        expected.add(testNode2);
        assertEquals(expected, actual);
    }
}