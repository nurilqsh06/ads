import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Integer> table = new MyHashTable<>(50); // 50 buckets

        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            int id = rand.nextInt(1000000);
            String name = "Name" + rand.nextInt(10000);
            MyTestingClass key = new MyTestingClass(id, name);
            table.put(key, i);
        }

        table.printBucketSizes();
    }
}
