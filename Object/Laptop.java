package Object;

public class Laptop extends Computer{
    private String battery;
    private String screenSize;
    private Integer weight;
    private String operatingSystem;
    
    
    public Laptop(String cpu, String model, Integer ram, Integer year) {
        super(cpu, model, ram, year);
    }

    public Laptop() {
    }
    
    public Laptop(String cpu, String model, Integer ram, Integer year, String battery, String screenSize,
            Integer weight, String operatingSystem) {
        super(cpu, model, ram, year);
        this.battery = battery;
        this.screenSize = screenSize;
        this.weight = weight;
        this.operatingSystem= operatingSystem;
    }

    public String getBattery() {
        return battery;
    }
    public void setBattery(String battery) {
        this.battery = battery;
    }
    public String getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
    public Integer getWeight() {
        return weight;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }    

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void startUp() {

        System.out.println("Laptop is now Starting up...");
    }

    @Override
    public void shutDown () {
        System.out.println("Latop is now shutting down...");
    }

    @Override
    public void displaySpecs() {
        System.out.println("Below are the specs of this laptop");
        System.out.println("CPU: " + this.getCPU());
        System.out.println("Model: " + this.getModel());
        System.out.println("RAM: " + this.getRAM());
        System.out.println("Year: " + this.getYear());
        System.out.println("Screensize: " + this.getScreenSize());
        System.out.println("Battery: " + this.getBattery());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Operaing System: " + this.getOperatingSystem());
    }
}

