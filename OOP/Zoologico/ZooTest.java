public class ZooTest {
    public static void main(String[] args) {
        Zoo ofs = new Zoo("OFS", "81 Pasir Ris Heights");

        // add animals to zoo
        ofs.setAnimal(new Fish("Minmin", 2010, 'y'));
        ofs.setAnimal(new Zebra("Marty", 2012, "Savannah"));
        ofs.setAnimal(new Rabbit("Arnold", 2005, "Grey"));
        ofs.setAnimal(new Zebra("Fey", 2020, "Plains"));
        ofs.setAnimal(new Rabbit("Kooky", 2013, "White"));
        System.out.println(ofs);

        // output the first animal added to zoo
        System.out.println(ofs.getAnimal(0));

        // output the last animal added to zoo
        System.out.println(ofs.getAnimal(ofs.getPopulation() - 1));

        // output the first and last animals' names
        System.out.println(ofs.getAnimal(0).getName());
        System.out.println(ofs.getAnimal(ofs.getPopulation() - 1).getName());

        // youngest animal
        System.out.println(ofs.getYoungest());
    }
}
