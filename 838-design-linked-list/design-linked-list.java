class listNode {
    int value;
    listNode next;
    listNode(int value) {
        this.value = value;
    }
}

class MyLinkedList {
    int size;
    listNode head; 

    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        
        listNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }
    
    public void addAtHead(int val) {
        listNode newNode = new listNode(val);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        listNode newNode = new listNode(val);
        size++;
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        listNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        
        if (index == 0) {
            addAtHead(val);
            return;
        }
        
        listNode newNode = new listNode(val);
        listNode current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        
        listNode current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        
        current.next = current.next.next;
        size--;
    }
}
