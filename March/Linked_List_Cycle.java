  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 

public class Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        // Initialize fast pointer to head
        ListNode fast = head; 
         // Initialize slow pointer to head
         ListNode slow = head; 
         // Traverse the list until fast pointer reaches end or NULL
         while (fast != null && fast.next != null) { 
             // Move fast pointer two steps ahead
             fast = fast.next.next;
             // Move slow pointer one step ahead 
             slow = slow.next; 
              // If fast meets slow, there is a cycle
             if (fast == slow) {
                 return true;
             }
         }
          // If fast reaches NULL, there is no cycle
         return false; 
    }
}
