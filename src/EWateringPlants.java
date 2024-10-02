public enum EWateringPlants {
    cactus(" liter mineralvatten per dag."),
    palmTree(" liter kranvatten per dag."),
    carnivorouisPlant(" liter proteindryck per dag");
private String planta;

    EWateringPlants(String planta) {
        this.planta = planta;
    }
    public String getWaterTyp(){
        return this.planta;
    }
}
