import javax.swing.*;

//Cactus ärver av Classen Plants.
public class Cactus extends Plants{



    private double waterPerDay = 0.02;
    @Override
    public EWateringPlants getWater(){
        return EWateringPlants.cactus;
    }
    public Cactus(String name, double height) {
        super(height, name);

   }

    public void printPlants(){
        JOptionPane.showMessageDialog(null,"Kaktusen " + getName() + " behöver " + waterPerDay + " liter "+ getWater().getEnum() + " per dag.");
    }
}
