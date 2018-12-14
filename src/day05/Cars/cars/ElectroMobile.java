package cars;

import java.time.LocalDate;

public class ElectroMobile extends Car {

    private int batteryCapacity;

    public ElectroMobile() {
    }


    @Override
    public void start(){
        if (batteryCapacity <= 0){

        } else {
            this.setRunning(true);
        }
    }

    public ElectroMobile(String plate, LocalDate date, int batteryCapacity) {
        super(plate, date);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
