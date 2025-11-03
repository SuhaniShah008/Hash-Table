import java.util.ArrayList;    // needed to create an arraylist 
import java.util.LinkedList;   // needed to create linked lists 
import java.util.List;         // needed for using List as the type of 'table'
class HashTable {
    private List<LinkedList<StringWrapper>> table;
    
    /* 
     * pre: 
     * post: Initializes the hash table with 10 empty linked lists
     */
     //Creates a hash table formed with linked lists
    public HashTable() {
        table = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            table.add(new LinkedList<>());
        }
    }
    
    /* 
     * pre: wrapper is not null.
     * post: Adds the given StringWrapper to the appropriate bucket based on its hash code if it is not already in there
     */
     //Checks if given StringWRapper is in appropriate bucket and adds it if it is not
    public void add(StringWrapper wrapper) {
        int index = wrapper.hashCode();
        LinkedList<StringWrapper> bucket = table.get(index);
        if (!bucket.contains(wrapper)) {
            bucket.add(wrapper);
        }
    }
    
    /* 
     * pre:
     * post: Returns a string representation of the hash table
     */
     //Displays the index and content of each bucket 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.size(); i++) {
            sb.append(i).append(":");
            for (StringWrapper wrapper : table.get(i)) {
                sb.append(" ").append(wrapper);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}