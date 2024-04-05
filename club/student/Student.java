package student;
public class Student {
    String name;
    int grade;
    String[] subjects;

    public Student(String name, int grade, String[] subjects) {
        this.name = name;
        this.grade = grade;
        this.subjects = subjects;
    }

    public String toString() {
        String result = "Name: " + this.name + "\nGrade: " + this.grade + "\nSubjects: " + this.subjects[0];
        for (int i = 1; i < this.subjects.length; i++) {
            result = result + ", " + subjects[i];
        }
        return result;
    }

    public boolean Check_Subject(String inputSubject) {
        for (String subject : this.subjects) if (inputSubject.equals(subject)) return true;
        return false;
    }
}