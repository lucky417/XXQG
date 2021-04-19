package day20200528;

public class Car {
    private String brand;
    private String color;

    Car(){

    }

    Car(String brand,String color){
        this.brand=brand;
        this.color=color;

    }

    public String getBrande() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
