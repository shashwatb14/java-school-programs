public class Fish extends Animal {
    
    private boolean seaWater;

    public Fish(String name, int birthYear, boolean seaWater) {
        super(name, birthYear);
        this.seaWater = seaWater;
    }

    public Fish(String name, int birthYear, char seaWater) {
        super(name, birthYear);
        this.setSeaWater(seaWater);
    }

    public boolean isSeaWater() {
        return this.seaWater;
    }

    public String getSeaWater() {
        if (this.seaWater) return "Sea water";
        else return "Fresh water";
    }

    public void setSeaWater(boolean seaWater) {
        this.seaWater = seaWater;
    }

    public void setSeaWater(char seaWater) {
        seaWater = Character.toUpperCase(seaWater);

        if (seaWater == 'Y') this.seaWater = true;
        else this.seaWater = false;
    }

    public void talk() {
        System.out.println("Glu glu");
    }

    public void eat() {
        System.out.println("Nom nom");
    }

    @Override
    public String toString() {
        return super.toString() + " | Thrives in " + getSeaWater(); 
    }
}
