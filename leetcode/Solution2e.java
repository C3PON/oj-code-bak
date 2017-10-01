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
	    ListNode p = l1, q = l2, curr = dummyHead;//����pq���Ǳ�Ҫ��
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
֮ǰд����һ��ܲ��ɹ������ܾ�ֻ�ǰ�new next��sum�Ĺ������ˣ�ÿ�ν����ֻ����һ��ֵ���������Ĳ��԰���û��������йأ�˵���˶��������������Ϥ�����ص�������tail��
���˲ο���֮�󣬵�һ�θĽ���Ҫ���������㣬1��Ҫ���Ǳ�����ʼ��λ�������������أ�����ָ����Ϊ����Ľ�������ƶ���2��Ҫ���ǽ�λ��û�п���λ����һ���������Ҫ���㴦��
�������Ȼ����һ��node��ԭ��������ָ���ʱ��������һ�ڵ���
�Ľ�һ��ʧ�ܣ�
������ �������Ƶ�sum֮�� ���ָ�붪ʧ
�ٴβ鿴�𰸣�Ȼ���������tailΪnull�����У����ˣ�����Ϊ�Ѿ���next�ˣ�û�а취�ٸ�nextָ�����

������ô����ģ�����������Ϊtail�����뵱ǰ�ڵ��next��������Ȼ�������ĸ��ڵ㣬���ǵ�һ���Ϳ���ֱ��ͨ����¼����ֱ�Ӻ��Ե���

	 * 
	 */
}
