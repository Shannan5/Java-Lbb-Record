import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sam");
        list.add("Ram");
        list.add("Sam");
        System.out.println("List: " + list);

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java");
        System.out.println("Set: " + set);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sam");
        map.put(2, "Ram");

        for (Map.Entry<Integer, String> e : map.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

        Queue<String> q = new LinkedList<>();
        q.offer("Sam");
        q.offer("Ram");

        System.out.println("Queue: " + q);
        System.out.println("Removed: " + q.poll());
        System.out.println("After removal: " + q);
    }
}
