package cars;

import java.awt.*;
import java.time.LocalDate;

public class FamilyCar extends Car {

    private int gasCapacity;

    public FamilyCar(String plate, Color color, LocalDate date, int gasCapacity) {
        super(plate, color, date);
        this.gasCapacity = gasCapacity;
    }

    public FamilyCar() {
    }

    @Override
    public void start() {
        if (gasCapacity <= 0){

        } else {
            this.setRunning(true);
        }
    }

    public FamilyCar(String plate, LocalDate date, int gasCapacity) {
        super(plate, date);
        this.gasCapacity = gasCapacity;
    }

    public int getGasCapacity() {
        return gasCapacity;
    }

    public void setGasCapacity(int gasCapacity) {
        this.gasCapacity = gasCapacity;
    }
}
