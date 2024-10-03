

import java.util.ArrayList;
import java.util.List;

import Object.Computer;
import Object.Desktop;
import Object.Laptop;

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

        computer2.startUp();
        computer2.shutDown();
        computer2.displaySpecs();


        Laptop laptop01 = new Laptop();
        laptop01.setCPU("10GHz 128 core");
        laptop01.setModel("Asus 12000");
        laptop01.setRAM(64);
        laptop01.setYear(2024);
        laptop01.setBattery("11.1V 3S LIPO");
        laptop01.setWeight(3);
        laptop01.setOperatingSystem("Windows 11 Professional");
        laptop01.setScreenSize("15.4 inch OLED");
        laptop01.startUp();
        laptop01.displaySpecs();
        laptop01.shutDown();

        Desktop desktop01 = new Desktop("4GHz 8 core", "Alibaba", 16, 2024, "Ubuntu 20.4 LTS", 5, true);
        desktop01.startUp();
        desktop01.displaySpecs();
        desktop01.shutDown();

        List<Computer> machines = new ArrayList<>();
        machines.add(desktop01);
        machines.add(computer1);
        machines.add(computer2);
        machines.add(laptop01);
       
        for (int i = 0; i < machines.size(); i++) {
            System.out.println("Machine" + i + ":");
            machines.get(i).displaySpecs();
        }



        for (int i = 0; i < machines.size(); i++) {
            System.out.println(machines.get(i));
        }


        for (Computer computer :machines) {
            System.out.println(computer);
        }

        }
}
