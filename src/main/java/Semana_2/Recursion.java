package Semana_2;

public class Recursion {

    private Node root;

    static class Node {
        int info;
        Node next;

    }

    public void insert_First(int x) {
        Node new_Node = new Node();
        new_Node.info = x;
        new_Node.next = root;
        root = new_Node;
    }


    public void print_Inverse(Node reco) {
        if(reco != null) {
            print_Inverse(reco.next);
            System.out.print(reco.info + " | ");
        }
    }

    public void print_Inverse() {
        print_Inverse(root);
    }

    @Override
    public String toString() {

        String data = "";
        Node aux    = root; //Auxiliar porque no queremos tocar root.

        while(aux!=null) {
            data += aux.info + " | ";
            aux = aux.next;
        }

        return data;
    }

    public void sort_ASC() {
        if (root == null || root.next == null) {
            return;
        }
        root = mergeSort(root, true);
    }

    public void sort_DSC() {
        if (root == null || root.next == null) {
            return;
        }
        root = mergeSort(root, false);
    }

    //Divide
    private Node mergeSort(Node head, boolean ascending) {
        if (head == null || head.next == null) {
            return head;
        }
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(head, ascending);
        Node right = mergeSort(nextOfMiddle, ascending);

        return sortedMerge(left, right, ascending);
    }

    //Obtiene la mitad
    private Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }

    //Mezcla
    private Node sortedMerge(Node left, Node right, boolean ascending) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        Node result;
        if (ascending) {
            if (left.info <= right.info) {
                result = left;
                result.next = sortedMerge(left.next, right, ascending);
            } else {
                result = right;
                result.next = sortedMerge(left, right.next, ascending);
            }
        } else {
            if (left.info >= right.info) {
                result = left;
                result.next = sortedMerge(left.next, right, ascending);
            } else {
                result = right;
                result.next = sortedMerge(left, right.next, ascending);
            }
        }
        return result;
    }
}
