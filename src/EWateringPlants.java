public enum EWateringPlants {
    cactus("mineralvatten"),
    palmTree("kranvatten"),
    carnivorouisPlant("proteindryck");
private String planta;

    EWateringPlants(String planta) {
        this.planta = planta;
    }
    public String getEnum(){
        return this.planta;
    }
}
