

import Object.Computer;

public class App {
    public static void main(String[] args){
        Computer computer1 = new Computer("5GHz 8 core", "Asus 8000", 32, 2024);
        computer1.startUp();
        computer1.shutDown();
        computer1.displaySpecs();

        Computer computer2 = new Computer();
        computer2.setCPU("5Ghz 8 core");
        computer2.setModel("Asus 8000");
        computer2.setRAM(32);
        computer2.setYear(2024);
        computer2.startUp();
        computer2.shutDown();
        computer2.displaySpecs();
        }
}
