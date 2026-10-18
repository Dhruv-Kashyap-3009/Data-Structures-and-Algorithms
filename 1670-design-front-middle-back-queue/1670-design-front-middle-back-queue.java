class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class FrontMiddleBackQueue {
    Node head;
    int size;

    public FrontMiddleBackQueue() {
        head = null;
        size = 0;
    }

    public void pushFront(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    public void pushMiddle(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else if (head.next == null) {
            newNode.next = head;
            head = newNode;
        } else {
            int count = 0;
            Node temp = head;

            while (temp != null) {
                count++;

                if (count == size / 2) {
                    Node nextNode = temp.next;
                    temp.next = newNode;
                    newNode.next = nextNode;
                    break;
                }

                temp = temp.next;
            }
        }

        size++;
    }

    public void pushBack(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        size++;
    }

    public int popFront() {
        if (head == null) {
            return -1;
        }

        if (head.next == null) {
            int val = head.val;
            head = null;
            size--;
            return val;
        }

        int val = head.val;
        head = head.next;
        size--;

        return val;
    }

    public int popMiddle() {
        if (head == null) {
            return -1;
        }

        if (head.next == null) {
            int val = head.val;
            head = null;
            size--;
            return val;
        }

        if (size == 2) {
            int val = head.val;
            head = head.next;
            size--;
            return val;
        }

        int count = 0;
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            if (count == (size - 1) / 2) {
                int val = temp.val;
                prev.next = temp.next;
                temp = null;
                size--;
                return val;
            }

            count++;
            prev = temp;
            temp = temp.next;
        }

        size--;
        return -1;
    }

    public int popBack() {
        if (head == null) {
            return -1;
        }

        if (head.next == null) {
            int val = head.val;
            head = null;
            size--;
            return val;
        }

        Node prev = null;
        Node temp = head;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = null;
        size--;

        return temp.val;
    }
}