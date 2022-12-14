package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Apple extends Phone {

    static String companyName = "Apple";
    static String os = "iOS";
    String model = "";
    int year;
    String color;
    double price;
//---------------------------
    public static ArrayList<Apple> appleList = new ArrayList<>();

    public Apple(int ram, int storage, int batterySize,
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
        appleList.add(this);
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

            Apple s = new Apple(ram, storage, batterySize, cpuSpeed, screenSize, glassType, model, year, color, price);
        }
        
    }

    public static void write(File file) throws FileNotFoundException {

        PrintWriter printer = new PrintWriter(file);
        for (Apple s1 : appleList) {
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

    public String getAppleInfo() {
        return "Company: " + companyName + "\nOperating System: " + os + "\nModel: " + model + "\nYear made: "
                + year + "\ncolor: " + color + "\nram" + ram + "\nstorage" + storage + "\nbatterySize " + batterySize
                + "\ncpuSpeed" + cpuSpeed + "\nscreenSize" + screenSize + "\nglassType" + glassType + "\nprice :" + price;

    }
}
