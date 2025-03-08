
public class Main {
    public static void main(String[] args) {
    DynamicArray dynamicArray = new DynamicArray(5);

    dynamicArray.add("A");
    dynamicArray.add("B");
    dynamicArray.add("C");
    dynamicArray.add("D");
    dynamicArray.add("E");
    dynamicArray.add("F");

    dynamicArray.delete("D");
    dynamicArray.delete("E");
    dynamicArray.delete("F");



    System.out.println("size: " + dynamicArray.size);
    System.out.println("capacity: " + dynamicArray.capacity);

    System.out.println(dynamicArray);

    }
}