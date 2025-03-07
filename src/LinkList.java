import java.util.NoSuchElementException;

public class LinkList {
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;


//  addLast item method
    public void addLast(int item){
        Node node = new Node(item);
        if(isEmpty()){
            first = last = node;
        }else{
            last.next = node;
            last = node;
        }
    }

//    addFirst item method
    public void addFirst(int item){
        Node node = new Node(item);
        if(isEmpty()){
            first = last = node;
        }else{
            node.next = first;
            first = node;
        }
    }

    public boolean isEmpty(){
        return first == null;
    }

//    implement the index method
    public int indexOf(int item){
        int index = 0;
        var current = first;
        while(current != null){
            if(current.value == item) return index;
            current = current.next;
            index ++;
        }
        return -1;
    }

//    implement the contain method
    public boolean contains(int item){
        return indexOf(item) != -1;
    }

//    implement the remote method
    public void removeFirst(){
//        [10 -> 20 -> 30]
//        if the list is empty
        if(isEmpty())
            throw new NoSuchElementException();
//        if the list has only one node
        if(first == last){
            first = last = null;
            return;
        }
        //if the list has more than one node
        var second = first.next;
        first.next = null;
        first = second;
    }

    public void removeLast(){
//        [10->20->30]
//        if list is empty
        if(isEmpty())
            throw new NoSuchElementException();
//        if list has one node
        if(first == last){
            first = last = null;
            return;
        }


        var previous = getPrevious(last);
        last = previous;
        last.next = null;
    }
    public Node getPrevious(Node node){
        var current = first;
        while(current != null){
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }

}

