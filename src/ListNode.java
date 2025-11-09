class ListNode {

    int data;
    ListNode next;

    ListNode(int val) {
        data = val;
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);

        first.next = second;
        second.next = third;

        ListNode current = first;
        while (current != null) {
            System.out.println(current.data + "");
            current = current.next;
        }

    }
}