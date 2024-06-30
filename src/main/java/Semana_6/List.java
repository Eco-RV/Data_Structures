package Semana_6;

public class List {

    private Node head;

    public void Insert(Person person) {
        if (head == null) {
            head = new Node(person);
        } else if (person.getId() < head.getData().getId()) {
            Node aux = new Node(person);
            aux.setNext(head);
            head = aux;
        } else if (head.getNext() == null) {
            head.setNext(new Node(person));
        } else {
            Node aux = head;
            while (aux.getNext().getNext() != null && aux.getNext().getData().getId() < person.getId()) {
                aux = aux.getNext();
            }
            Node temp = new Node(person);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
    }

    public void exist(int id) {
        Node aux = head;
        boolean exist = false;
        while (aux != null) {
            if (aux.getData().getId() == id) {
                exist = true;
            }
            aux = aux.getNext();
        }
        if(exist) {
            System.out.println("La persona con el ID: " + id + " si existe.");
        } else {
            System.out.println("La persona con el ID: " + id + " no existe.");
        }
    }

    public void edit(Person p) {
        Node aux = head;
        while (aux != null) {
            if (aux.getData().getId() == p.getId()) {
                aux.setData(p);
                return;
            }
            aux = aux.getNext();
        }
    }

    public void delete(int id) {
        if (head == null) return;

        if (head.getData().getId() == id) {
            head = head.getNext();
            return;
        }

        Node aux = head;
        while (aux.getNext() != null) {
            if (aux.getNext().getData().getId() == id) {
                aux.setNext(aux.getNext().getNext());
                return;
            }
            aux = aux.getNext();
        }
    }

    public Person get(int id) {
        Node aux = head;
        while (aux != null) {
            if (aux.getData().getId() == id) {
                return aux.getData();
            }
            aux = aux.getNext();
        }
        return null;
    }

    @Override
    public String toString() {
        Node aux = head;
        String s = "List: ";
        while (aux != null) {
            s+=aux + ", ";
            aux = aux.getNext();
        }
        return s;
    }
}
