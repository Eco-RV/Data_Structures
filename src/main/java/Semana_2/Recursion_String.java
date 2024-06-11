package Semana_2;

public class Recursion_String {

    private Node root;

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(char x) {
        Node new_Node = new Node(x);
        new_Node.next = root;
        root = new_Node;
    }

    public void print_List_Vowel_Consonant(Node node) {
        if (node != null) {
            if (is_Vowel(node.data)) {
                System.out.println(node.data + " es una vocal.");
            } else {
                System.out.println(node.data + " es una consonante.");
            }
            print_List_Vowel_Consonant(node.next);
        }
    }

    public void print_List_Vowel_Consonant() {
        print_List_Vowel_Consonant(root);
    }

    private boolean is_Vowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    @Override
    public String toString() {
        StringBuilder data = new StringBuilder();
        Node current = root;
        while (current != null) {
            data.append(current.data).append(" | ");
            current = current.next;
        }
        return data.toString();
    }

}
