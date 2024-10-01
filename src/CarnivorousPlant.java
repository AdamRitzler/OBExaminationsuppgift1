import javax.swing.*;

public class CarnivorousPlant extends Plants {
    private double waterPerDay = 0.2;


    @Override
    public EWateringPlants getWater(){
        return EWateringPlants.carnivorouisPlant;
    }

    @Override
    public double calculatePlantsWater() {
        return 0.1 +(this.waterPerDay * getHeight());
    }

    public CarnivorousPlant(String name, double height) {
        super(height, name);


    }
    public void printPlants() {
        JOptionPane.showMessageDialog(null,"Den köttätande växten " + getName() + " behöver " + calculatePlantsWater() + getWater().getEnum());
    }

}
