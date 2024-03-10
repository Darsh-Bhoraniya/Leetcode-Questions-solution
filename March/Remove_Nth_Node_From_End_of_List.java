public class Remove_Nth_Node_From_End_of_List {
     public ListNode Removenth(ListNode head, int n){

     // Length for given List
     int len = 0;
     ListNode temp = head;
     while (temp != null) {
         temp = temp.next;
         len++;
     }
     // int len = lenght;

     //Remove nth node from the List
     ListNode node = head;
     int pos = 1;
     while (pos < len - n) {
         node = node.next;
         pos++;
     }

     if (len == n)
         head = head.next;

     else if (node.next == null)
         return null;

     else
         node.next = node.next.next;

     return head;
    }
}
