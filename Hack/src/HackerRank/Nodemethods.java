package HackerRank;

public class Nodemethods {

	Node first;

	void insert(int val) {
		if (first == null) {
			Node node = new Node();
			node.data = val;
			node.next = null;
			first = node;
		} else {
			Node cur = first;
			Node node = new Node();

			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = node;
			cur.data = val;

		}
	}

	void reverse() {

		Node cur = first, prev = null;
		while (cur.next != null) {
			prev = cur;
			cur = cur.next;
			cur.next = prev.next;
			cur = cur.next;
		}

	}

	void dispaly() {
		Node cur = first;
		while (cur != null) {
			System.out.println(cur.data);
			cur = cur.next;
		}

	}

}
