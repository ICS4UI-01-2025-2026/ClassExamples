/**
 * Represent a stack ADT created using an array.
 * Our stack stores integers only
 * @author Mr. Lamont
 */
public class Stack {
    private int[] items;
    private int numItems;

    /**
     * Creates an empty stack
     */
    public Stack(){
        this.numItems = 0;
        this.items = new int[5];
    }

    /**
     * Adds a single item to the top of the stack
     * @param item the number to be put on top
     */
    public void push(int item){
        // before adding an item, make sure there is room
        if(this.numItems < this.items.length){
            this.items[this.numItems] = item;
        } else {
            // if full, make a new bigger array
            // int general, double the old size
            int[] temp = new int[this.numItems * 2];
            // copy everything over
            for(int i = 0; i < this.numItems; i++)
            {
                temp[i] = this.items[i];
            }
            // items is now the new temp array
            this.items = temp;
            // add the item
            this.items[this.numItems] = item;
        }
        // increase the count by 1
        this.numItems++;
    }


    /**
     * Look at the top integer on the stack
     * @return the integer currently at the top
     */
    public int peek(){
        // the last item in the array
        return this.items[this.numItems-1];
    }

    /**
     * Removes and returns the top integer from the stack
     * @return the integer that was at the top of the stack
     */
    public int pop(){
        // get the top item
        int lastItem = this.peek();
        // decrease items by 1
        this.numItems--;
        // send the top item
        return lastItem;
    }

    /**
     * Gets the number of integers currently in the stack
     * @return the number of integers in the stack
     */
    public int size(){
        return this.numItems;
    }

    /**
     * Whether the stack has items or not
     * @return true if no items are on the stack, false otherwise
     */
    public boolean isEmpty(){
        /** longer way to do the return
        if(this.size() == 0){
            return true;
        }else{
            return false;
        }
        */
        return (this.size() == 0);
    }
}
