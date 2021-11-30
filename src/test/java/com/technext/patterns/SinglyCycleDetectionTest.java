package com.technext.patterns;

import com.technext.datastructure.Node;
import junit.framework.TestCase;

public class SinglyCycleDetectionTest extends TestCase {

    SinglyCycleDetection singlyCycleDetection;
    Node node;

    public void setUp() throws Exception {
        super.setUp();
        singlyCycleDetection = new SinglyCycleDetection();
        node = new Node();
    }

    public void testHasCycleWhenTrue() {

        // To populate linked list, create the new nodes (point to null)
        Node head = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(4);
        Node nodeE = new Node(5);

        // Point to the nodes to each other
        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = nodeC;

        assertTrue(singlyCycleDetection.hasCycle(head));
    }


    public void testHasCycleWhenFalse() {
        // To populate linked list, create the new nodes (point to null)
        Node head = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(4);
        Node nodeE = new Node(5);

        // Point to the nodes to each other
        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;

        assertFalse(singlyCycleDetection.hasCycle(head));
    }
}