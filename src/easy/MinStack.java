package easy;

public class MinStack {

	class Node {
		int val;
		Node next;

		Node(int val, Node next) {
			this.val = val;
			this.next=next;
		}
	}

	private int minValue = Integer.MAX_VALUE;
	private Node ptr;

	/** initialize your data structure here. */
	public MinStack() {
	}

	public void push(int x) {
		if (minValue > x)
			minValue = x;
		ptr=new Node(x,ptr);
	}

	public void pop() {
		if (ptr != null) {
			int oldValue = ptr.val;
			ptr = ptr.next;// remove the top Node
			if (minValue == oldValue) { // update the minValue;
				Node p = ptr;
				if (p != null) {
					minValue = ptr.val;
				} else {
					minValue = Integer.MAX_VALUE;
				}
				while (p != null) {
					if (minValue > p.val) {
						minValue = p.val;
					}
					p=p.next;
				}
			}

		}

	}

	public int top() {
		if (ptr != null) {
			return ptr.val;
		} else {
			throw new NullPointerException("stack empty...");
		}
	}

	public int getMin() {
		if (ptr != null) {
			return minValue;
		} else {
			throw new NullPointerException("stack empty...");
		}
	}

	public static void main(String[] args) {
//		["MinStack","push","push","push","getMin","pop","top","getMin"]
//				[[],[-2],[0],[-3],[],[],[],[]]
		  MinStack obj = new MinStack();
		  obj.push(-2);
		  obj.push(0);
		  obj.push(-3);
		  int min0 = obj.getMin();
		  obj.pop();
		  int top=obj.top();
		  int min=obj.getMin();
		  System.out.println(min0);
		  System.out.println(top);
		  System.out.println(min);
	}
	
}
