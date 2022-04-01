public class MyLinkListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList linkList1 = new MyLinkedList(10);
        linkList1.addFirst(11);
        linkList1.addFirst(12);
        linkList1.addFirst(13);
        linkList1.add(1,16);
        linkList1.add(2,0);
        linkList1.printList();
    }
}
