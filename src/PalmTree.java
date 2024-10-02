import javax.swing.*;

public class PalmTree extends Plants {
    private final double waterPerDay = 0.5;

    public PalmTree(String name, double height) {
        super(height, name);

    }

    @Override
    public EWateringPlants getWater() {
        return EWateringPlants.palmTree;
    }

    @Override
    public double calculatePlantsWater() {
        return waterPerDay * getHeight();
    }

    public void printPlants() {
        JOptionPane.showMessageDialog(null, "Palmen " + getName() + " behöver " + calculatePlantsWater() + getWater().getWaterTyp());
    }
}
