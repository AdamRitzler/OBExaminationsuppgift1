import javax.swing.*;

public class PalmTree extends Plants {
    private final double waterPerDay = 0.5;
    private final double waterAmountPerMeter;
//kolla om du vill ha kvar waterPerDay
@Override
public EWateringPlants getWater(){
    return EWateringPlants.palmTree;
}
    public PalmTree(String name, double height) {
        super(height, name);
        this.waterAmountPerMeter = this.waterPerDay * height;
    }


    public void printPlants() {
        JOptionPane.showMessageDialog(null,"Palmen " + getName() + " behöver " + this.waterAmountPerMeter + " liter kranvatten per dag.");
    }
}
