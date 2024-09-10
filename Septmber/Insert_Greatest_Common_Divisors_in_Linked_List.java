public class Insert_Greatest_Common_Divisors_in_Linked_List {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current = head;
        while(current.next!=null){
            int gcd = gcd(current.val,current.next.val);
            ListNode node = new ListNode(gcd);
            node.next = current.next;
            current.next = node;
            current = current.next.next;
        }
        return head;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
