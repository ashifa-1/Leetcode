import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        BigInteger num1 = findnum(l1);
        BigInteger num2 = findnum(l2);

        BigInteger sum = num1.add(num2);

        // Convert sum to string
        String s = sum.toString();

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        // build in reverse (since list is reverse)
        for (int i = s.length() - 1; i >= 0; i--) {
            curr.next = new ListNode(s.charAt(i) - '0');
            curr = curr.next;
        }

        return dummy.next;
    }

    private BigInteger findnum(ListNode l) {
        StringBuilder sb = new StringBuilder();
        ListNode temp = l;

        while (temp != null) {
            sb.insert(0, temp.val);
            temp = temp.next;
        }

        return new BigInteger(sb.toString());
    }
}