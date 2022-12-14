package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import static project.Apple.appleList;

class Samsung extends Phone {

    static String companyName = "Samsung";
    static String os = "Android";
    String model = "";
    int year;
    String color;
    double price;

    public static ArrayList<Samsung> samsungList = new ArrayList<>();

    public Samsung(int ram, int storage, int batterySize,
            double cpuSpeed, String screenSize,
            String glassType, String nmodel, int nyear, String nColor, double nPrice) {
        this.glassType = glassType;
        this.storage = storage;
        this.cpuSpeed = cpuSpeed;
        this.screenSize = screenSize;
        this.ram = ram;
        this.batterySize = batterySize;
        this.year = nyear;
        this.color = nColor;
        this.price = nPrice;
        this.model = nmodel;
        samsungList.add(this);
    }

    public static void scan(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String model = input.next();
            int ram = input.nextInt();
            int storage = input.nextInt();
            int batterySize = input.nextInt();
            double cpuSpeed = input.nextDouble();
            String screenSize = input.next();
            String glassType = input.next();
            int year = input.nextInt();
            String color = input.next();
            double price = input.nextDouble();

            Samsung s = new Samsung(ram, storage, batterySize, cpuSpeed, screenSize, glassType, model, year, color, price);
        }
        input.close();
    }

    public static void write(File file) throws FileNotFoundException {

        PrintWriter printer = new PrintWriter(file);
        for (Samsung s1 : samsungList) {
            printer.println(s1.model);
            printer.println(s1.ram);
            printer.println(s1.storage);
            printer.println(s1.batterySize);
            printer.println(s1.cpuSpeed);
            printer.println(s1.screenSize);
            printer.println(s1.glassType);
            printer.println(s1.year);
            printer.println(s1.color);
            printer.println(s1.price);
        }
        printer.close();
    }

    public String getSamsungInfo() {
        return "Company: " + companyName + "\nOperating System: " + os + "\nModel: " + model + "\nYear made: "
                + year + "\ncolor: " + color + "\nram" + ram + "\nstorage" + storage + "\nbatterySize " + batterySize
                + "\ncpuSpeed" + cpuSpeed + "\nscreenSize" + screenSize + "\nglassType" + glassType + "\nprice :" + price;
    }

}
