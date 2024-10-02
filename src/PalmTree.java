import javax.swing.*;
//ärver höjd och name från klassen plants
public class PalmTree extends Plants {
    private final double waterPerDay = 0.5;

    public PalmTree(String name, double height) {
        super(height, name);

    }
    //returnar enumen värde PALMTREE som sedan används i printPlants
    @Override
    public EWateringPlants getWater() {
        return EWateringPlants.PALMTREE;
    }

    @Override
    public double calculatePlantsWater() {
        return waterPerDay * getHeight();
    }
//polymorfism den får metoden från superklassen och skriver över metoden.
    public void printPlants() {
        JOptionPane.showMessageDialog(null, "Palmen " + getName() + " behöver " + calculatePlantsWater() + getWater().getWaterTyp());
    }
}
