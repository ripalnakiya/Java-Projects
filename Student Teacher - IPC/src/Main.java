public class Main {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();

        Teacher t = new Teacher(wb);
        Student s1 = new Student("John",wb);
        Student s2 = new Student("Jack",wb);

        t.start();

        s1.start();
        s2.start();
    }
}