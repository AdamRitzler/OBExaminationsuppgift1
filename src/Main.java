import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public Main() {
        //Växterna som finns på hotellet.
        Plants cacti = new Cactus("Igge", 0.2);
        Plants palm1 = new PalmTree("Laura", 5);
        Plants köttätandeväxt = new CarnivorousPlant("Meatloaf", 0.5);
        Plants palm2 = new PalmTree("Olof", 1);

        String name = JOptionPane.showInputDialog(null, "Vilken växt ska du vattna?");

        List<Plants> plants = new ArrayList<>();
        plants.add(cacti);
        plants.add(palm1);
        plants.add(köttätandeväxt);
        plants.add(palm2);

        boolean plantInHotel = false;

        for (Plants plants1 : plants) {
            if (plants1.getName().equalsIgnoreCase(name)) {
                plants1.printPlants();
                plantInHotel = true;
                break;
            }
        }
        if (!plantInHotel) {
            JOptionPane.showMessageDialog(null, "Du behöver skriva in namnet på en växt som finns på hotellet");

        }
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}