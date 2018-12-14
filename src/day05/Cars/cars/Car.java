package cars;

import javafx.scene.Scene;

import java.awt.*;
import java.time.LocalDate;
import java.util.Scanner;

public abstract class Car {
    private int price;
    private String plate;
    private Color color;
    private LocalDate date;
    private boolean running;
    private double speed;

    public void insertSpeed(){
        Scanner scanner = new Scanner(System.in);
        speed = scanner.nextDouble();
    }

    public void setSpeed( double speed){
        this.speed = speed;
    }


    public Car(String plate, Color color, LocalDate date) {
        this.plate = plate;
        this.color = color;
        this.date = date;
    }

    public Car(String plate, LocalDate date) {
        this.plate = plate;
        this.date = date;
    }

    public Car() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public abstract void start();

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
