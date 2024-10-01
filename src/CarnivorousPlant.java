import javax.swing.*;

public class CarnivorousPlant extends Plants {
    private double waterPerDay = 0.2;
    private double waterAmountPerMeter;

    @Override
    public EWateringPlants getWater(){
        return EWateringPlants.carnivorouisPlant;
    }

    public CarnivorousPlant(String name, double height) {
        super(height, name);

        this.waterAmountPerMeter = 0.1 + (this.waterPerDay * height);
    }
    public void printPlants() {
        JOptionPane.showMessageDialog(null,"Den köttätande växten " + getName() + " behöver " + this.waterAmountPerMeter + " liter proteindryck per dag.");
    }

}
