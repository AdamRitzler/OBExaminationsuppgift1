import javax.swing.*;

//Cactus ärver av klassen Plants.
public class Cactus extends Plants {
    // inkapsling av instansvariabler
    private double waterPerDay = 0.02;

    public Cactus(String name, double height) {
        super(height, name);

    }

    @Override
    public double calculatePlantsWater() {
        return waterPerDay;
    }

    //returnar enumen värde CACTUS som sedan används i printPlants
    @Override
    public EWateringPlants getWater() {
        return EWateringPlants.CACTUS;
    }

    //polymorfism den får metoden från superklassen och skriver över metoden.
    public void printPlants() {
        JOptionPane.showMessageDialog(null, "Kaktusen " + getName() + " behöver " + calculatePlantsWater() + getWater().getWaterTyp());
    }
}
