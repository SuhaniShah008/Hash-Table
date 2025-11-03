import java.io.FileReader; //needed to read the users file
import java.util.Scanner; //needed for file reading
public class HashTableDemo {
    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(new FileReader("hello.txt"));
            int n = Integer.parseInt(scanner.nextLine());
            HashTable hashTable = new HashTable();
            for (int i = 0; i < n; i++) {
                String line = scanner.nextLine();
                if (line != null && !line.isEmpty()) {
                    hashTable.add(new StringWrapper(line)); //Creates StringWrapper object added to hash table 
                }
            }
            System.out.print(hashTable);
        } catch (Exception e) {
            System.err.println("i cannot read your file");
        }
    }
}