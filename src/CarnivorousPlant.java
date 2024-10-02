import javax.swing.*;

//ärver höjd och name från klassen plants
public class CarnivorousPlant extends Plants {
    // inkapsling av instansvariabler
    private double waterPerDay = 0.2;
    private double basWater = 0.1;

    public CarnivorousPlant(String name, double height) {
        super(height, name);
    }

    //returnar enumen värde carnivorousPlant som sedan används i printPlants
    @Override
    public EWateringPlants getWater() {
        return EWateringPlants.CARNIVOROUSPLANT;
    }

    @Override
    public double calculatePlantsWater() {
        return basWater + (this.waterPerDay * getHeight());
    }

    public void printPlants() {
        JOptionPane.showMessageDialog(null, "Den köttätande växten " + getName() + " behöver " + calculatePlantsWater() + getWater().getWaterTyp());
    }

}
