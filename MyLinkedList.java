
public class MyLinkedList {

    public static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }    

    public static void printMyLinkedList(Node head) {
        if (head == null) {
            System.out.println("Empty !!!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value);
        if(headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    public static Node addToTail(Node heaNode, int value) {
        Node newNode = new Node(value);
        if(heaNode == null) {
            return newNode;
        }
        else {
            Node lastNode = heaNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }

        return heaNode;
    }


    public static Node addToIndex(Node headNode, int value, int index) {
        if(index == 0) return addToHead(headNode, value);

        Node newNode = new Node(value);
        Node currentNode = headNode;
        int count = 0;
        while(currentNode != null) {
            count++;
            if(count == index) {
                currentNode.next = newNode;
                newNode.next = currentNode.next;
                break;
            }
            currentNode = currentNode.next;
        }
        return headNode;
    }

    public static Node removeAtHead(Node heaNode) {
        if(heaNode != null) {
            return heaNode.next;
        }
        return heaNode;
    }
 
    public static Node removeAtTail(Node headnoNode) {
        if(headnoNode == null) return null;
        
        Node lastNode = headnoNode;
        Node prevNode = null;

        while(lastNode.next != null) {

            prevNode = lastNode;
            lastNode = lastNode.next;
        }

        if(prevNode == null) {
            return null;
        } 
        prevNode.next = lastNode.next;
        return headnoNode;
    }

    public static Node removeAtIndex(Node headNode, int index) {
        if(headNode == null || index < 0) return null;
        if(index == 0) return removeAtHead(headNode);

        Node currentNode = headNode;
        Node prevNode = null;
        int count = 0;
        boolean isFound = false;

        while(currentNode != null) {
            if(count == index) {
                isFound = true;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
            count++;
        }
        if(isFound) {
            if(prevNode == null) {
                return null;
            } else {
                if(currentNode != null) {
                    prevNode.next = currentNode.next;
                }
            }
        }

        return headNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(0);
        Node n2 = new Node(1);
        Node n3 = new Node(2);

        n1.next = n2;
        n2.next = n3;

        printMyLinkedList(n1);

        n1 = removeAtIndex(n1, 0);


        printMyLinkedList(n1);

    }
}
