public class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode previos = null;
        ListNode current = head;

        while(current != null){
        ListNode next = current.next; 
         current.next = previos;
            previos = current;
            current = next;
        }
       return previos;
    }    
}
