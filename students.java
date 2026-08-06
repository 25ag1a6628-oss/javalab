
class students {
    int id;
    String name;

    students(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        students s1 = new students(101, "Alice");
        students s2 = new students(102, "Bob");

        s1.display();
        s2.display();
    }
}