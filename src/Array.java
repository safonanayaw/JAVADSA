public class Array {
//    private field to store array items
private int [] items;
private int count;
//    build a constructor
public Array(int length) {
//initialise the constructor to the size of the length
        items = new int[length];
    }
//    implement the insert method
    public void insert(int item){
//    if the array is full resize it
        if(items.length == count){
//    create new array (twice the array)
            int[] newItems = new int[count * 2];
//    copy all existing items
            for(int i = 0; i < count; i++){
                newItems[i] = items[i];
            }
//    set items to this new array
            items = newItems;
        }
//    add the new item at the end
    items[count] = item;
    count++;
    }

//    implement the delete operation
    public void removeAt(int index){
//          validate the index
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
//         shift the items to the left to fill the hole
        for(int i = index; i < count; i++){
            items[i] = items[i + 1];
        }
        count--;
    }

//    implement the search operation
//    O(n)
    public int indexOf(int item){
//    loop through the item array to find the item parameter passed
        for(int i = 0 ; i < count; i++){
            if(items[i] == item)
                return i;
        }
        return -1;
    }
//    implement the print method
    public void print(){
    for(int i = 0; i < count; i++){
        System.out.println(items[i]);
        }
    }


}
