import java.util.ArrayList;

public class ArrayListRunner {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names);
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        String first = names.get(0);
        System.out.println(first);
        String last = names.get(names.size() - 1);
        System.out.println(last);
        System.out.println(names);
        int size = names.size();
        System.out.println(size);
        names.set(0, "Anna");
        System.out.println(names);
        names.add(4, "Doug");
        System.out.println(names);

        for (String element : names) {
            System.out.println(element);
        }

        ArrayList<String> names2 = new ArrayList<>(names);
        System.out.println(names2);

        names.remove(0);
        System.out.println(names);
        System.out.println(names2);
    }
}