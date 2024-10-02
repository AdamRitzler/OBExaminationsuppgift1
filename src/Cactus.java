import javax.swing.*;

//Cactus ärver av Classen Plants.
public class Cactus extends Plants{
    // inkapsling av instansvariabler
    private double waterPerDay = 0.02;

    @Override
    public double calculatePlantsWater() {
        return waterPerDay;
    }

    @Override
    public EWateringPlants getWater(){
        return EWateringPlants.cactus;
    }
    public Cactus(String name, double height) {
        super(height, name);

   }

    public void printPlants(){
        JOptionPane.showMessageDialog(null,"Kaktusen " + getName() + " behöver " + calculatePlantsWater() + getWater().getWaterTyp());
    }
}
