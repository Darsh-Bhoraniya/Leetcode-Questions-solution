public class Merge_Nodes_in_Between_Zeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify list construction
        ListNode currentNew = dummy; // Pointer to construct new list
        ListNode currentOld = head.next; // Start from the node after the initial zero

        int sum = 0;

        while (currentOld != null) {
            if (currentOld.val == 0) {
                // When we hit a zero, we need to create a new node with the sum if sum is
                // non-zero
                if (sum != 0) {
                    currentNew.next = new ListNode(sum);
                    currentNew = currentNew.next;
                    sum = 0; // Reset sum for the next segment
                }
            } else {
                // Accumulate the sum of values between zeros
                sum += currentOld.val;
            }
            currentOld = currentOld.next;
        }

        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
