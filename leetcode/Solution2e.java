public class Solution2e {

	public Solution2e() {
		
	}
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    ListNode dummyHead = new ListNode(0);
	    ListNode p = l1, q = l2, curr = dummyHead;//这里pq不是必要的
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new ListNode(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;
	}
	/**
	 * 
之前写过的一版很不成功，可能就只是把new next和sum的工作做了，每次结果都只返回一个值（这跟背后的测试案例没有想清楚有关，说白了对这个单向链表不熟悉，返回的是链表tail）
看了参考答案之后，第一次改进主要有以下两点，1、要考虑保留初始的位置最后做结果返回，引出指针作为处理的焦点进行移动，2、要考虑进位，没有考虑位数不一的情况，需要置零处理。
结果：竟然多了一个node，原因是在移指针的时候，新增后一节点了
改进一（失败）
估计是 将新增移到sum之后 造成指针丢失
再次查看答案，然后更改最后的tail为null，不行（忧伤），因为已经到next了，没有办法再改next指向的了

答案是这么处理的，将计算结果作为tail，放入当前节点的next，这样虽然依旧有四个节点，但是第一个就可以直接通过记录后移直接忽略掉。

	 * 
	 */
}
