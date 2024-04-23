import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        list.MyList<Integer> arrayList = new MyArrayList<>();
        list.MyList<Integer> linkedList = new MyLinkedList<>();


        // Add elements
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);



        // Iterate over elements
        System.out.println("ArrayList:");
        Iterator<Integer> arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            System.out.print(arrayListIterator.next() + " ");
        }

        System.out.println("\n\nLinkedList:");
        Iterator<Integer> linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            System.out.print(linkedListIterator.next() + " ");
        }

    }
}