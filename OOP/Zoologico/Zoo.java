public class Zoo {
    private static final int MAXCAPACITY = 1000;
    private String name;
    private String address;
    private Animal[] animals; // aggregation
    private int population;

    public Zoo(String name, String address) {
        this.name = name;
        this.address = address;
        this.animals = new Animal[MAXCAPACITY];
        this.population = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Animal[] getAnimals() {
        return this.animals;
    }

    public int getPopulation() {
        return this.population;
    }

    public Animal getAnimal(int index) {
        if (index < 0 || index >= MAXCAPACITY) {
            System.out.printf("ERROR - invalid index %d\n", index);
            return null;
        }
        return this.animals[index];
    }

    /* Unnecessary
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }*/

    // append
    public void setAnimal(Animal animal) {
        if (this.population >= MAXCAPACITY) {
            System.out.println("Full capacity");
            return;
        }
        this.animals[this.population] = animal;
        this.population++;
    }

    // add animal to specific empty position
    public void setAnimal(Animal animal, int index) {
        if (index < 0 || index >= MAXCAPACITY || this.animals[index] != null) {
            System.out.println("ERROR");
            return;
        }
        this.animals[index] = animal;
    }

    public boolean isEmpty() {
        return this.population == 0;
    }

    @Override
    public String toString() {

        String output =
                "Zoo name: " + this.name +
                "\nAddress: " + this.address +
                "\nPopulation" + this.population +
                "\nAnimals:\n";
        for (Animal animal : this.animals) {
            output += "\t" + animal.toString() + "\n";
        }

        return output;
    }

    public Animal getYoungest() {
        int minIndex = 0;

        if (this.population > 1) {
            int minAge = this.animals[0].getAge();
            for (int i = 1; i < this.population; i++) {
                int currentAge = this.animals[i].getAge();
                if (currentAge < minAge) {
                    minAge = currentAge;
                    minIndex = i;
                }
            }
        }

        return this.animals[minIndex];
    }
}
