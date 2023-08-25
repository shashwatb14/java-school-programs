public class Animal {

    // static class variable bound to Animal class (1 copy only)
    private static int currentYear = 2023;

    // private attributes that prevents other classes from accessing these fields
    private String name;
    private int birthYear;

    // constructor method
    public Animal(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    // overloading constructor if birthYear is not given (assuming it is currentYear)
    public Animal(String name) {
        this.name = name;
        this.birthYear = currentYear;
    }

    // accessor methods (getters)
    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public int getAge() {
        return currentYear - birthYear;
    }

    // modifier methods (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void talk() {
        System.out.println(this.name + " doesn't talk!");
    }

    public void eat() {
        System.out.println(this.name + " eats food.");
    }

    public String toString() {
        return "Name: " + this.name + " | " + "Age: " + this.getAge();
    }
}
