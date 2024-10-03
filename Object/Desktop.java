package Object;

public class Desktop extends Computer{

    private String operatingSystem;

    private Integer weight;

    private Boolean wateringCooling;

    public Desktop(String cpu, String model, Integer ram, Integer year, String operatingSystem, Integer weight,
            Boolean wateringCooling) {
        super(cpu, model, ram, year);
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.wateringCooling = wateringCooling;
    }

    public Desktop(String operatingSystem, Integer weight, Boolean wateringCooling) {
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.wateringCooling = wateringCooling;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Boolean getWateringCooling() {
        return wateringCooling;
    }

    public void setWateringCooling(Boolean wateringCooling) {
        this.wateringCooling = wateringCooling;
    }

    @Override
    public void displaySpecs() {
        System.out.println("Below are the specs of this desktop");
        System.out.println("CPU: " + this.getCPU());
        System.out.println("Model: " + this.getModel());
        System.out.println("RAM: " + this.getRAM());
        System.out.println("Year: " + this.getYear());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Operaing System: " + this.getOperatingSystem());
        System.out.println("Water cooling system: " + this.getWateringCooling());}

    
}
