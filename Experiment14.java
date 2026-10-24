import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedWriter w = new BufferedWriter(
                    new FileWriter("student.txt"));

            w.write("Student: Sam");
            w.newLine();
            w.write("Department: CSE");
            w.close();

            BufferedReader r = new BufferedReader(
                    new FileReader("student.txt"));

            String line;
            while ((line = r.readLine()) != null)
                System.out.println(line);

            r.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
