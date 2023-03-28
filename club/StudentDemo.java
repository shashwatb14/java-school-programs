public class StudentDemo {
    public static void main(String[] args) {
        String[] subjects = {"Computer Science", "Maths", "Physics", "Digital Societies"};
        Student shashwat = new Student("Shashwat", 11, subjects);
        System.out.println(shashwat);
        System.out.println(shashwat.Check_Subject("Computer Science"));
        System.out.println(shashwat.Check_Subject("Chemistry"));
    }
}