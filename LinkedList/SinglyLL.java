public class SingleLL {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at beginning
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }
    //delete from start
    public void deleteAtStart(){
        if(head==null){
          System.out.print("List is Empty");
          return;
        }

        head=head.next;
    }

    //delete from end
    public void deleteAtEnd(){
        if(head==null){
            System.out.print("List is Empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }

        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

   //display
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SingleLL list = new SingleLL();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.insertAtStart(5);

        list.display();
    }
}