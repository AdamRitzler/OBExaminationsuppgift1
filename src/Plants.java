public abstract class Plants implements IPlanter {
    private double height;
    private String Name;

    public Plants(double height, String name) {
        this.height = height;
        this.Name = name;
    }
public abstract EWateringPlants getWater();

    public double getHeight() {
        return height;
    }

    public String getName() {
        return Name;
    }

    public void printPlants() {

    }


}
