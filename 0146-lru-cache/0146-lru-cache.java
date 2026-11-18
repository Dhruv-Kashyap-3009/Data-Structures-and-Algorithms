
class ListNode {
    int key, val;
    ListNode prev, next;

    ListNode(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class LRUCache {
    ListNode head;
    ListNode tail;
    Map<Integer, ListNode> mp;
    int size;

    public LRUCache(int capacity) {
        head = null;
        tail = null;
        mp = new HashMap<>();
        size = capacity;
    }

    private void remove(ListNode node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }
    }

    private void addFirst(ListNode node) {
        node.prev = null;
        node.next = head;

        if (head != null) {
            head.prev = node;
        }

        head = node;

        if (tail == null) {
            tail = node;
        }
    }

    public int get(int key) {
        if (!mp.containsKey(key)) return -1;

        ListNode node = mp.get(key);

        remove(node);
        addFirst(node);

        return node.val;
    }

    public void put(int key, int value) {
        if (mp.containsKey(key)) {
            ListNode node = mp.get(key);
            node.val = value;

            remove(node);
            addFirst(node);
        } else {
            if (size == 0) return;

            ListNode node = new ListNode(key, value);

            mp.put(key, node);
            addFirst(node);

            if (mp.size() > size) {
                mp.remove(tail.key);
                remove(tail);
            }
        }
    }
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */