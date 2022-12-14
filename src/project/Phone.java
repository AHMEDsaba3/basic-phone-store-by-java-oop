package project;

public abstract class Phone {

    int ram, storage, batterySize;
    double cpuSpeed;
    String glassType, screenSize;

    Phone() {
    }

    public void setPhone(int ram, int storage, int batterySize, double cpuSpeed, String screenSize, String glassType) {
        this.ram = ram;
        this.storage = storage;
        this.batterySize = batterySize;
        this.cpuSpeed = cpuSpeed;
        this.screenSize = screenSize;
        this.glassType = glassType;
    }

    public int getRam() {
        return ram;
    }

    public int getstorage() {
        return storage;
    }

    public int getbatterysize() {
        return batterySize;
    }

    public double getCouspeed() {

        return cpuSpeed;
    }

    public String getdcreensize() {
        return screenSize;
    }

    public String getglasstype() {
        return glassType;
    }
  


}
