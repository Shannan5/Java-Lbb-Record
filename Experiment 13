import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    public int compareTo(Student s) {
        return rollNo - s.rollNo;
    }

    public String toString() {
        return rollNo + " " + name;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(3, "Ram"));
        list.add(new Student(1, "Sam"));
        list.add(new Student(2, "John"));

        Collections.sort(list);
        System.out.println("By roll number: " + list);

        Collections.sort(list, new NameComparator());
        System.out.println("By name: " + list);
    }
}
