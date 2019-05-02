class Node {
    public String name;
    public int age;
    public Node next;

    public Node() {
        this.name = "";
        this.age = 0;
        this.next = null;
    }

    public Node(String name, int age) {
        this.name = name;
        this.age = age;
        this.next = null;
    }
}

class LinkList {
    public Node head;
    public Node tail;
    public int length;

    public LinkList() {
        head = new Node();
        tail = new Node();
        length = 0;
    }

    public void addHead(String name, int age) {
        Node add = new Node(name, age);
        if (this.length == 0) {
            head.next = add;
            tail.next = add;
        } else {
            add.next = head.next;
            head.next = add;
        }
        this.length++;
    }

    public void addTail(String name, int age) {
        Node add = new Node(name, age);
        if (this.length == 0) {
            head.next = add;
            tail.next = add;
        } else {
            tail.next.next = add;
            tail.next = add;
        }
        this.length++;
    }

    public void addAt(String name, int age, int at) {
        Node add = new Node(name, age);
        if (this.length != 0 && at < this.length) {
            // List 不為空，且在 at 在 List 範圍內，插入 Node。
            Node location = head.next;
            for (int i = 0; i < at - 1 && location.next != null; i++) {
                location = location.next;
            }
            add.next = location.next;
            location.next = add;
            this.length++;
        } else if (at == this.length) {
            // 若 at 為 List 大小，則當作 addTail 處理。
            addTail(name, age);
        }
    }

    public void removeHead() {
        if (this.length == 1){
            head.next = null;
            tail.next = null;
            this.length = 0;
        } else if (this.length != 0) {
            head.next = head.next.next;
            this.length--;
        }
    }

    public void removeTail() {
        if (this.length == 1){
            head.next = null;
            tail.next = null;
            this.length = 0;
        } else if (this.length != 0) {
            Node location = head.next;
            while(location.next != tail.next) {
                location = location.next;
            }
            tail.next = location;
            location.next = null;
            this.length--;
        }
    }

    public void removeAt(int at) {
        if (this.length != 0 || this.length <= at) {
            if (at == 1) {
                removeHead();
            } else if (at == this.length) {
                removeTail();
            } else {

            }
        }
    }

    public void ShowList() {
        Node location = head.next;
        String formats = "Name: %7s , Age: %2d , Next: %s\n";

        System.out.println("Head: " + head.next);

        if (this.length != 0) {
            while( location.next != null ) {
                System.out.printf(formats, location.name, location.age, location.next);
                location = location.next;
            }
            System.out.printf(formats, location.name, location.age, location.next);
        }

        System.out.println("Tail: " + tail.next);
        System.out.println("Length: " + this.length);
        System.out.println("=============================");
    }
}

class LinkListMain {
    public static void main(String[] args) {
        LinkList LL = new LinkList();
        LL.ShowList();
        LL.addTail("Tail1", 22);
        LL.ShowList();
        LL.removeHead();
        LL.ShowList();
        LL.addTail("Tail2", 24);
        LL.ShowList();
        LL.addHead("Head1", 21);
        LL.ShowList();
        LL.addAt("At1", 30, 1);
        LL.ShowList();
        LL.removeHead();
        LL.ShowList();
    }
}
