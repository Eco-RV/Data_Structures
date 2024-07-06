package Semana_7;

public class List {
    private Node head;

    public List() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Person person) {
        Node newNode = new Node(person);
        if (isEmpty()) {
            head = newNode;
            head.setNext(head);
        } else {
            Node temp = head;
            while (temp.getNext() != head) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
            newNode.setNext(head);
        }
    }

    public boolean exists(int id) {
        if (isEmpty()) {
            return false;
        }
        Node temp = head;
        do {
            if (temp.getPerson().getId() == id) {
                return true;
            }
            temp = temp.getNext();
        } while (temp != head);
        return false;
    }

    public void modify(Person p) {
        if (!isEmpty()) {
            Node temp = head;
            do {
                if (temp.getPerson().getId() == p.getId()) {
                    temp.setPerson(p);
                    return;
                }
                temp = temp.getNext();
            } while (temp != head);
        }
    }

    public void remove(int id) {
        if (!isEmpty()) {
            if (head.getPerson().getId() == id) {
                if (head.getNext() == head) {
                    head = null;
                } else {
                    Node temp = head;
                    while (temp.getNext() != head) {
                        temp = temp.getNext();
                    }
                    temp.setNext(head.getNext());
                    head = head.getNext();
                }
                return;
            }
            Node current = head;
            Node previous = null;
            do {
                previous = current;
                current = current.getNext();
                if (current.getPerson().getId() == id) {
                    previous.setNext(current.getNext());
                    return;
                }
            } while (current != head);
        }
    }

    public Person extract(int id) {
        if (!isEmpty()) {
            Node temp = head;
            do {
                if (temp.getPerson().getId() == id) {
                    return temp.getPerson();
                }
                temp = temp.getNext();
            } while (temp != head);
        }
        return null;
    }
}

