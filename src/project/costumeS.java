package project;

import java.util.Date;
import static project.Apple.companyName;

class costumeS extends Samsung {

    private String new_color, new_glasstype, new_model, new_screenSize;
    private double new_cpuSpeed, new_price;
    private int new_ram, new_batterySize, new_storage;
    Date date = new Date();

    public costumeS(int ram, int storage, int batterySize, double cpuSpeed, String screenSize,
            String glassType, String nmodel, int nYear, String nColor, double nPrice) {
        super(ram, storage, batterySize, cpuSpeed, screenSize,
                glassType, nmodel, nYear, nColor, nPrice);
        this.new_price = (new_ram * 1000);
    }

    public void setcostumeS(int ram, int storage, int batterySize, double cpuSpeed, String screenSize,
            String glassType, String nmodel, String nColor) {
        this.new_glasstype = glassType;
        this.new_storage = storage;
        this.new_cpuSpeed = cpuSpeed;
        this.new_screenSize = screenSize;
        this.new_ram = ram;
        this.new_batterySize = batterySize;
        this.new_color = nColor;
        this.new_model = nmodel;

    }

    public String costumeSInfo() {
        return "Company: " + companyName + "\nOperating System: " + os + "\nNew Model: " 
                + new_model + "\nNew date made: "
                + date + "\nNew color: " + new_color + "\nNew ram" +
                new_ram + "\nNew storage" + new_storage + "\nNew batterySize " + new_batterySize
                + "\nNew cpuSpeed" + new_cpuSpeed + "\nNew screenSize" + new_screenSize +
                "\nNew glassType" + new_glasstype + "\nNew price" + new_price;
    }

}
