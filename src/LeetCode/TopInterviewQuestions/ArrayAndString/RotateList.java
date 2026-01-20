package LeetCode.TopInterviewQuestions.ArrayAndString;


public class RotateList {
    public class ListNode {
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

    public ListNode rotateList(ListNode head, int k) {

        //handling edge cases
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        //calculate length and tail
        ListNode current = head;
        int length = 1;
        while (current != null) {
            current = current.next;
            length++;
        }
        ListNode tail = current;

        k = k % length; //when k > length

        //connecting head to tail
        tail.next = head;

        //Setting new tail
        int stepsToNewTail = length - k;
        ListNode newTail = head;

        for (int i=0; i<stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        //Setting new head
        ListNode newHead = newTail.next;

        //breaking the cycle
        newTail.next = null;
        return newHead;
    }

    //Creating linked list and add main method for testing
    public void main(String[] args) {
         ListNode head = new ListNode(1);
         head.next = new ListNode(2);
         head.next.next = new ListNode(3);
         head.next.next.next = new ListNode(4);
         head.next.next.next.next = new ListNode(5);
         head.next.next.next.next.next = new ListNode(6);

         int k=3;

         RotateList rl = new RotateList();
         ListNode result = rl.rotateList(head, k);
         printList(result);
    }

    //helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;

        while(current != null) {
            System.out.print(current.val);
        }
        if (current.next != null) {
            System.out.print(" -> ");
        }
    }
}



