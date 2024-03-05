package LinkedList.SingleLinkList;

public class LinkedList {
    Node head;

    void addValue(int newValue) {
        Node newNode = new Node();
        newNode.value = newValue;
        newNode.next = head;
        head = newNode;
    }
    
    void insertValue(int newValue, int positon) {
        Node insertNode = new Node();
        Node temp = head;

        if (positon == 0) {
            addValue(newValue);
        } else {
            int i = 1;
            while(temp != null) {
                if (i == positon) {
                    insertNode.value = newValue;
                    insertNode.next = temp; 
                    head.next = insertNode;
                    break;
                }
                temp = temp.next;
                i++;
            }
    
            if ( i < positon) {
                System.out.println("Index out of bound error");
            }
        }
    }

    void removeValue(int position) {
        Node temp = head;

        int index = 0;
        while (temp != null && index < position) {
            temp = temp.next;
            index++;
            temp.next = temp.next.next;
            break;
        }
    }

    public String toString() {
        Node tmp = head;

        String result = "[";

        while(tmp != null) {
            result = result + Integer.toString(tmp.value) + "-";
            tmp = tmp.next;
        }

        result = result + "]";
        return result;
    }
}
