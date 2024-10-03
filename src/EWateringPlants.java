public enum EWateringPlants {
    CACTUS(" liter mineralvatten per dag."),
    PALMTREE(" liter kranvatten per dag."),
    CARNIVOROUSPLANT(" liter proteindryck per dag");
    private final String planta;


    EWateringPlants(String planta) {
        this.planta = planta;
    }

    public String getWaterTyp() {
        return this.planta;
    }
}
