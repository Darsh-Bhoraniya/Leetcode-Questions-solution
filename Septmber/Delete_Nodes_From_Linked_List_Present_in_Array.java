import java.util.HashSet;
import java.util.Set;

public class Delete_Nodes_From_Linked_List_Present_in_Array {
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Create numSet to store numbers in nums for O(1) lookup - like a banned list, only the good ones get through!
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        ListNode emptyHead = new ListNode(0);
        ListNode current = emptyHead;

        while (head != null) {
            if (!numSet.contains(head.val)) {
                current.next = head;
                current = current.next;

            }
            head = head.next;
        }
        current.next = null;
        return emptyHead.next;

    }
}
