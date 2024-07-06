package Semana_7;

public class Node {
    private Person person;
    private Node next;

    public Node(Person person) {
        this.person = person;
        this.next = null;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

