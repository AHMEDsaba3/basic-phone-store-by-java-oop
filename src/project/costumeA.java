package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import static project.Apple.appleList;

public class costumeA extends Apple {

    private String new_color, new_glasstype, new_model, new_screenSize;
    private double new_cpuSpeed, new_price;
    private int new_ram, new_batterySize, new_storage;
    Date date = new Date();

   
    costumeA(int ram, int storage, int batterySize, double cpuSpeed, String screenSize,
            String glassType, String nmodel, int nyear, String nColor, double nPrice) {
        super(ram, storage, batterySize, cpuSpeed, screenSize,
                glassType, nmodel, nyear, nColor, nPrice);

    }

    public void setcostumeA(int ram, int storage, int batterySize, double cpuSpeed, String screenSize,
            String glassType, String nmodel, String nColor) {
        this.new_glasstype = glassType;
        this.new_storage = storage;
        this.new_cpuSpeed = cpuSpeed;
        this.new_screenSize = screenSize;
        this.new_ram = ram;
        this.new_batterySize = batterySize;
        this.new_color = nColor;
        this.new_model = nmodel;
        this.new_price = (new_ram * 1000);

    }

    public String costumeAInfo() {
        return "Company: " + companyName + "\nOperating System: " + os + "\nNew Model: " + new_model + "\nNew date made: "
                + date + "\nNew color: " + new_color + "\nNew ram" + new_ram + "\nNew storage" + new_storage + "\nNew batterySize " + new_batterySize
                + "\nNew cpuSpeed" + new_cpuSpeed + "\nNew screenSize" + new_screenSize + "\nNew glassType" + new_glasstype + "\nNew price" + new_price;
    }

}
