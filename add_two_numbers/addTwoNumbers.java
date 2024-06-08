/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


 class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode ptr = result;

        int carry = 0;

        // Initialzing a while loop to traverse until both of the lists reaches it's end..

        while (l1 != null || l2 != null) {

            int sum = 0 + carry;

            /* If the first list (that is l1) contains value, we will add it to the sum, 
            after that l1 is set to the next node.*/

            if (l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }

            /* If the second list (that is l2) contains value, we will add it to the sum, 
            after that l2 is set to the next node.*/

            if (l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }

            /* We need to split the number if it contains two digits, so we perform division to get the carry 
            and modulo to get the sum. */

            carry = sum / 10;
            sum = sum % 10;

            /* Next we will append the sum to the result list that we already created at the beginning of the program. */

            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }

        if (carry == 1) {
            ptr.next = new ListNode(1);
        }

        return result.next;
        
    }
}