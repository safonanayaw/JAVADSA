
public class Main {
    public static void main(String[] args) {
    LinkList node = new LinkList();
    node.addLast(1);
    node.addLast(2);
    node.addLast(3);
    node.addLast(4);
    node.addLast(5);
    node.removeLast();
    System.out.println(node.contains(3));
    }
}