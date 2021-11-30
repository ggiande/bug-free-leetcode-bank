package com.technext.patterns;

import com.technext.datastructure.Node;
import java.util.HashSet;

public class SinglyCycleDetection {

    public boolean hasCycle(Node head) {
        Node curr = head;
        HashSet<Integer> set = new HashSet<>();

        // traverse through our linked list
        while(curr != null) {
            // search for the cycle
            if(set.contains(curr.data)) {
                return Boolean.TRUE;
            }
            // if not in cycle, then add it to the set
            set.add(curr.data);
            //advance the current node to the next
            curr = curr.next;
        }
        return false;
    }
}
