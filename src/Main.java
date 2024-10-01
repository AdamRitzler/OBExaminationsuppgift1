import javax.swing.*;

public class Main {

    public Main(){
        //Växterna som finns på hotellet.
        // hrj hrj
        Plants cacti = new Cactus("Igge", 0.2);
        Plants palm1 = new PalmTree("Laura", 5);
        Plants köttätandeväxt = new CarnivorousPlant("Meatloaf", 0.5);
        Plants palm2 = new PalmTree("Olof", 1);

        String name =  JOptionPane.showInputDialog(null, "Vilken växt ska du vattna?");

        if(name.equalsIgnoreCase(cacti.getName())){
            cacti.printPlants();
        } else if (name.equalsIgnoreCase(palm1.getName())) {
            palm1.printPlants();
        } else if (name.equalsIgnoreCase(köttätandeväxt.getName())) {
            köttätandeväxt.printPlants();
        } else if (name.equalsIgnoreCase(palm2.getName())) {
            palm2.printPlants();
        }else {
            JOptionPane.showMessageDialog(null, "Du behöver skriva in namnet på en växt som finns på hotellet");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}