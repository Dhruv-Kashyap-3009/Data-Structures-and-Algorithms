class Node {
    String url;
    Node prev;
    Node next;

    Node(String url) {
        this.url = url;
    }
}

class BrowserHistory {

    Node curr;

    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }

    public void visit(String url) {
        Node newNode = new Node(url);

        curr.next = newNode;
        newNode.prev = curr;

        curr = newNode;
    }

    public String back(int steps) {
        while (steps > 0 && curr.prev != null) {
            curr = curr.prev;
            steps--;
        }

        return curr.url;
    }

    public String forward(int steps) {
        while (steps > 0 && curr.next != null) {
            curr = curr.next;
            steps--;
        }

        return curr.url;
    }
}