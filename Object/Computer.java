package Object;
public class Computer{
    private String CPU;
    private String model;
    private Integer RAM;
    private Integer year;

    public Computer (String cpu, String model, Integer ram, Integer year) {
        this.CPU= cpu;
        this.model = model;
        this.RAM = ram;
        this.year = year;

    }

    public Computer () {
        this.CPU = "2GHz dual core";
        this.model = "Gigabyte 1000";
        this.RAM = 8;
        this.year = 2020;
    }


    public String getCPU() {
        return CPU;
    }

    public void setCPU(String cPU) {
        CPU = cPU;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer rAM) {
        RAM = rAM;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void startUp() {

        System.out.println("Computer is now Starting up...");
    }

    public void shutDown () {
        System.out.println("Computer is now shutting down...");
    }

    public void displaySpecs() {
        System.out.println("Below are the specs of this computer");
        System.out.println("CPU: " + this.CPU);
        System.out.println("Model: " + this.model);
        System.out.println("RAM: " + this.RAM);
        System.out.println("Year: " + this.year);
    }

    

    }